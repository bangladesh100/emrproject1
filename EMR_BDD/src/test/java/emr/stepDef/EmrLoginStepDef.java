package emr.stepDef;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.EmrLoginActionsTest;
import emr.utilities.SetupDriver;

public class EmrLoginStepDef {

	EmrLoginActionsTest loginActions = new EmrLoginActionsTest();

	// login..............................................................

	@Given("^I navigated to emr login page$")
	public void i_navigated_to_emr_login_page() {

		String actualTitle = loginActions.emrLoginPage();
		// Assert.assertEquals(acttualTitle, expected);
		 //Assert.assertEquals(loginActions,loginActions);
		System.out.println(actualTitle);

	}

	@When("^I entered correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_correct_and(String admin, String pass) {

		loginActions.setUserID(admin);
		loginActions.setPassword(pass);
	}

	@When("^I click on login$")
	public void i_click_on_login() {
		loginActions.loginClick();

	}

	@Then("^I am on EMR home page$")
	public void i_am_on_EMR_home_page() {
		loginActions.patientText();
	}
  
	  

	
	
	
	
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
