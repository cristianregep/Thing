package uk.ac.uk.informatics_forum.data;

import android.text.Html;
import android.text.Spanned;

public abstract class Location {
	protected String name;
	protected String description;
	protected int stars;
	public Location(String name, String description, int stars){
		this.name = name;
		this.description = description;
		this.stars = stars;
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	
	public float getRating(){
		return (float)stars;
	}
	
	public void setRating(float rating){
		stars = (int)rating;
	}
	
	public abstract String toString();
	
	public Spanned toHtml(){
		return Html.fromHtml("<u>"+name+"</u>"+"<br/><br/>"+description);
	}
	
}
