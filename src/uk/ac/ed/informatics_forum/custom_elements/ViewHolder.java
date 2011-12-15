package uk.ac.ed.informatics_forum.custom_elements;

import android.view.View;
import android.widget.RatingBar;
import uk.ac.ed.informatics_forum.R;

class ViewHolder {
	RatingBar rate = null;

	ViewHolder(View base) {
		this.rate = (RatingBar) base.findViewById(R.id.rate);
	}
}