package uk.ac.ed.informatics_forum.custom_elements;

import uk.ac.uk.informatics_forum.data.DataManager;

public class HotelList extends LocationList{
	public HotelList(){
		locations = DataManager.getCurrentInstance().getHotels();
	}
}
