
import com.vesodeveloper.main1.FavPlaces;
import com.vesodeveloper.models.*;
import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MapIntegration {
	com.vesodeveloper.models.MapIntegrationModel mapintModel= new MapIntegrationModel();
	@Given("^Потребителя навигира от началния екран до екрана с картата$")
	public void gotoMapScreen() throws Throwable {
	mapintModel.navtoMapScreen();   
	
	}


	@When("^Може да види интересни места$")
	public void interestingPlaces (List<FavPlaces>FL) throws Throwable {
	 mapintModel.showPlaces();
	}

	@Then("^Да направи виртуална разходка в града$")
	public void да_направи_виртуална_разходка_в_града() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
