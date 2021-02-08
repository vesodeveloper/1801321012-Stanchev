
import com.vesodeveloper.models.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DBErrorDescription {
	AddPlaceModel ad=new AddPlaceModel();
	@Then("^Вижда съобщение за липсващо описание$")
	public void isNullPlace() throws Throwable {
ad.isNullDescription();
	}

}
