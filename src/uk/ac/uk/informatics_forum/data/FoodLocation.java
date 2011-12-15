package uk.ac.uk.informatics_forum.data;

public class FoodLocation extends Location{
	public FoodLocation(String name, String description, int stars){
		super(name, description, stars);		
	}
	
	public String toString(){
		return name+"<b>KKt</b>"+description;
	}
}
