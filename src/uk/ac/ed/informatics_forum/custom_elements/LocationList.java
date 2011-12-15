package uk.ac.ed.informatics_forum.custom_elements;

import uk.ac.ed.informatics_forum.R;
import uk.ac.uk.informatics_forum.data.Location;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public abstract class LocationList extends ListActivity {

	protected static ArrayList<Location> locations;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.locations);
		setListAdapter(new RatingAdapter(locations));
	}

	private Location getModel(int position) {
		return (((RatingAdapter) getListAdapter()).getItem(position));
	}

	class RatingAdapter extends ArrayAdapter<Location> {

		RatingAdapter(ArrayList<Location> list) {
			super(LocationList.this, R.layout.location, R.id.label, list);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View row = super.getView(position, convertView, parent);
			RatingBar rater = (RatingBar) row.findViewById(R.id.rate);
			TextView label = (TextView) row.findViewById(R.id.label);

			// Listener for when rating bar is pressed
			RatingBar.OnRatingBarChangeListener l = new RatingBar.OnRatingBarChangeListener() {
				public void onRatingChanged(RatingBar ratingBar, float rating,
						boolean fromTouch) {
					Integer myPosition = (Integer) ratingBar.getTag();
					Location location = getModel(myPosition);
					// update rating on location
					location.setRating(rating);
				}
			};

			rater.setOnRatingBarChangeListener(l);

			// get location for position
			Location location = getModel(position);

			label.setText(location.toHtml());
			rater.setTag(new Integer(position));
			// set rating according to location for value
			rater.setRating(location.getRating());
			return (row);
		}
	}

}
