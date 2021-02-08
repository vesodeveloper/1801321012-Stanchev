package com.vesodeveloper.models;

import com.vesodeveloper.main1.*;
import com.vesodeveloper.services.DBService;
public class AddPlaceModel {

	public static void navtoFavPageScreen() {
	System.out.println("Екрана за въвеждане на любими места е отворен");	
	}

	private String placeTitle;
	private String placeDesc;
	private String Message;
	public Object SetPlaceDescription;
	private String isNullDesc;
	private String isnpl;
	private String isNullPlace;
	private String isNullDescr;

	public   void setPlaceTitle(String placeTitle) {
	this.placeTitle	= placeTitle;
	}

	public void SetPlaceDescription(String placeDesc) {
	this.placeDesc=placeDesc;	
	}

	public void pushAddDBButton() {
		Message=DBService.add(placeTitle,placeDesc);
	}

	public String addPlaceMessage() {
	return Message;
	}

	public void isNullPlace() {
		isNullPlace=DBService.isPlaceNull(  isnpl);
	}
	public void isNullDescription() {
		isNullDescr=DBService.isDescriptionNull(  isNullDesc);
	}
}