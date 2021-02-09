
import com.vesodeveloper.models.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DBErrorPlace {
AddPlaceModel addplm = new AddPlaceModel();
@Then("^Вижда съобщение за липсващо място$")
	public void isNullPlace() throws Throwable {
addplm.isNullPlace();
	}
}
