package emr.stepDef;

import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.AddUserActions;
import emr.utilities.SetupDriver;

public class AddUserStepDef {

	AddUserActions loginActions = new AddUserActions();

	@When("^Mouse over on administration$")
	public void mouse_over_on_administration() {
		loginActions.administration();
	}

	@When("^Click on user manu$")
	public void click_on_user_menu() {
		loginActions.userMenu();
		
	}

	@When("^Click on add user$")
	public void click_on_add_user(){
		loginActions.addUser();
	}

	@Then("^It displayed user info page$")
	public void it_displayed_user_info_page()  {
		loginActions.userInfo();
		
		
	}

	

}
