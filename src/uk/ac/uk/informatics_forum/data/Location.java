package uk.ac.uk.informatics_forum.data;

public abstract class Location {
	private String name;
	private String description;
	private int stars;
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
	
	public int getStars(){
		return stars;
	}
	
	
}
