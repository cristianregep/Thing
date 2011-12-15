package uk.ac.uk.informatics_forum.data;

import android.text.Html;

public class Hotel extends Location{
	public Hotel(String name, String description, int stars){
		super(name, description, stars);
	}
	
	public String toString(){
		return Html.fromHtml(name+"<b>KKt</b>"+description).toString();
	}
}
