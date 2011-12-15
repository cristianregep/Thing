package uk.ac.ed.informatics_forum.custom_elements;

import uk.ac.ed.informatics_forum.R;
import uk.ac.uk.informatics_forum.data.DataManager;
import uk.ac.uk.informatics_forum.data.Location;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class RateListDemo extends ListActivity {

	private static final ArrayList<Location> locations = DataManager.getCurrentInstance().getHotels();

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);	
		setListAdapter(new RatingAdapter(locations));
	}

	private Location getModel(int position) {
		return (((RatingAdapter) getListAdapter()).getItem(position));
	}

	class RatingAdapter extends ArrayAdapter<Location> {

		RatingAdapter(ArrayList<Location> list) {
			super(RateListDemo.this, R.layout.row, R.id.label, list);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View row = super.getView(position, convertView, parent);
			ViewHolder holder = (ViewHolder) row.getTag();

			if (holder == null) {
				holder = new ViewHolder(row);
				row.setTag(holder);
				
				RatingBar.OnRatingBarChangeListener l = new RatingBar.OnRatingBarChangeListener() {
					public void onRatingChanged(RatingBar ratingBar,
							float rating, boolean fromTouch) {
						Integer myPosition = (Integer) ratingBar.getTag();
						Location location = getModel(myPosition);
						location.setRating(rating);		
					}
				};
				
				
				holder.rate.setOnRatingBarChangeListener(l);
			}
			Location location = getModel(position);
			holder.rate.setTag(new Integer(position));
			holder.rate.setRating(location.getRating());
			return (row);
		}
	}

	class RowModel {
		String label;
		private float rating = 2.0f;

		RowModel(Location location) {
			this.label = location.getName();			
		}
		
		public float getRating(){
			return rating;
		}
		
		public void setRating(float rating){
			this.rating = rating;
		}

		public String toString() {
			return label;
		}
	}
}
