package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.EmrLogoutActions;

public class EmrLogoutStepDef {

	EmrLogoutActions loginActions = new EmrLogoutActions();
	
	
	
	
	

	// logout...........................................................................

	@When("^Click on user$")
	public void click_on_user() {

		loginActions.user();
	}

	@When("^Click on logout$")
	public void click_on_logout() {
		loginActions.logout();
	}

	
	@Then("^It should be back emr login page$")
	public void it_should_be_back_emr_login_page() {
		try {
			loginActions.emrLoginPage();
			System.out.println("successfully logout");
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}

}
