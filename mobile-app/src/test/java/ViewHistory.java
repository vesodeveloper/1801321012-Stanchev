
import com.vesodeveloper.models.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewHistory {
	HistoryModel hismodel= new com.vesodeveloper.models.HistoryModel();
	@Given("^Потребителя навигира от началния екран до екрана с историята$")
	public void navtoHistoryScreen() throws Throwable {
	hismodel.navtoHistry();
	
	}

	
	@When("^Може да прочете за историята на сливен$")
	public void readHistory() throws Throwable {
	    hismodel.isread();
	}

	@When("^Когато потребителя отиде в долната част на екрана$")
	public void когато_потребителя_отиде_в_долната_част_на_екрана() throws Throwable {
hismodel.scrolldown();
	}

	@Then("^може да възпроизведе клипче за Сливен$")
	public void може_да_възпроизведе_клипче_за_Сливен() throws Throwable {
	  hismodel.watch();
	}



}
