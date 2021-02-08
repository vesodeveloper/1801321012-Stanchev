package com.vesodeveloper.services;
import com.vesodeveloper.main1.*;
import java.util.ArrayList;
import java.util.List;


public class DBService {

	public static String add(String placeTitle, String placeDesc) {
		List<com.vesodeveloper.main1.FavPlaces> places=getPlaces();
		final boolean isTherePlace=places.stream()
				.anyMatch(place->placeTitle.equals(place.getPlace_name())&& (place.equals(place.getPlace_description())));
		return isTherePlace  ? "places" : "";
	}
	private static List<FavPlaces> getPlaces(){
		
		FavPlaces pl1=new FavPlaces();
		pl1.setPlace_name("Ancient Theater Plovdiv");
		pl1.setPlace_description("Ancient Roman Theater Plovdiv");
	final List<FavPlaces> FavList= new ArrayList<FavPlaces>();
	FavList.add(pl1);
	return FavList;
	}
	public static String isPlaceNull( String isnpl) {
			List<FavPlaces> places=getPlaces();
		final boolean isNullPlace=places.stream()
				.anyMatch(place->isnpl.equals(null));
	
		return isNullPlace ? "Вижда съобщение за липсващо място":"";
	}
	public static String isDescriptionNull(String isNullDesc) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
}

