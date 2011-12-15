package uk.ac.uk.informatics_forum.data;

import java.util.ArrayList;

public class DataManager {
	private static DataManager currentInstance = null;
	private ArrayList<Location> hotels;
	private ArrayList<Location> foodLocations;
	
	private DataManager(){
		hotels = new ArrayList<Location>();
		foodLocations = new ArrayList<Location>();
		
		
		hotels.add(new Hotel("Hotel 1", "Hotel 1 Description", 5));
		hotels.add(new Hotel("Hotel 2", "Hotel 2 Description", 5));
		hotels.add(new Hotel("Hotel 3", "Hotel 3 Description", 5));
		
		foodLocations.add(new FoodLocation("Food 1", "Food 1 Description", 5));
		foodLocations.add(new FoodLocation("Food 2", "Food 2 Description", 5));
		foodLocations.add(new FoodLocation("Food 3", "Food 3 Description", 5));
	}
	
	public ArrayList<Location> getHotels(){	
		return hotels;
	}
	
	public ArrayList<Location> getFoodLocations(){
		return foodLocations;
	}
	
	public static DataManager getCurrentInstance(){
		if(currentInstance == null){
			currentInstance = new DataManager();
		}
		return currentInstance;
	}
}
