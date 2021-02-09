package com.vesodeveloper.models;

import java.util.ArrayList;
import java.util.List;

import com.vesodeveloper.main1.FavPlaces;

public class MapIntegrationModel {

	public void navtoMapScreen() {
	System.out.println("Екрана с картата е отворен");	
	}

	public void showPlaces() {
		ArrayList<String> pList=new ArrayList<String>();
		pList.add("Ploshtad H.Dimitar");
		pList.add("Tekstilna Fabrika");
		for(int i=0;i<pList.size();i++) {
			
			System.out.println(pList.get(i));
		}
	}

	public String walk( String from, String to) {
		from="Sliven"; to="Plovdiv";
		return from+to;
	}
}