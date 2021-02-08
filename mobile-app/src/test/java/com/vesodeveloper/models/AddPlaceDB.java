package com.vesodeveloper.models;


import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddPlaceDB {
	AddPlaceModel addplacemodel= new AddPlaceModel();
	private String peoplelist;
	private String placeDesc;
	private String placeTitle;
	@Given("^Потребителя от началния екран навигира до екрана с любими места$")
	public void goFavPlaceScreen() throws Throwable {
	 addplacemodel.navtoFavPageScreen();
	 
	}

	@When("^Въвежда заглавие на любимото място \"([^\"]*)\"$")
public   void addPlaceTitle( String placeTitle) throws Throwable {
	addplacemodel.setPlaceTitle(placeTitle);
	}
	@When("^Въвежда описание на любимото място \"([^\"]*)\"$")
	public void addPlaceDescription(String placeDesc) throws Throwable {
addplacemodel.SetPlaceDescription(placeDesc);	
	}

	@When("^Натиска бутона за добавяне на мястото към базата данни$")
	public void pushAddDBButton() throws Throwable {
addplacemodel.pushAddDBButton();
	}

	@Then("^Вижда във записите в базата данни добавеното ново място$")
	public void ViewAllPlaces(  ) throws Throwable {
assertEquals("places", addplacemodel.addPlaceMessage());
	}
}
