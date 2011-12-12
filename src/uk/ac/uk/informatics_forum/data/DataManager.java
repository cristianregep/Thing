package uk.ac.uk.informatics_forum.data;

import java.util.ArrayList;

public class DataManager {
	private static DataManager currentInstance = null;
	private ArrayList<Hotel> hotels;
	private ArrayList<FoodLocation> foodLocations;
	
	public DataManager(){
		hotels = new ArrayList<Hotel>();
		foodLocations = new ArrayList<FoodLocation>();
		
		
		hotels.add(new Hotel("Hotel 1", "Hotel 1 Description", 5));
		hotels.add(new Hotel("Hotel 2", "Hotel 2 Description", 5));
		hotels.add(new Hotel("Hotel 3", "Hotel 3 Description", 5));
		
		foodLocations.add(new FoodLocation("Food 1", "Food 1 Description", 5));
		foodLocations.add(new FoodLocation("Food 2", "Food 2 Description", 5));
		foodLocations.add(new FoodLocation("Food 3", "Food 3 Description", 5));
	}
	
	public Hotel[] getHotels(){
		Hotel[] hotels = new Hotel[this.hotels.size()];
		for(int i=0; i<this.hotels.size(); i++){
			hotels[i] = this.hotels.get(i);
		}
		return hotels;
	}
	
	public static DataManager getCurrentInstance(){
		if(currentInstance == null){
			currentInstance = new DataManager();
		}
		return currentInstance;
	}
}
