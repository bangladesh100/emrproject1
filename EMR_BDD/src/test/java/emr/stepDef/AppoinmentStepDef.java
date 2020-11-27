package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.AppoinmentActions;

public class AppoinmentStepDef {

	
	AppoinmentActions loginActions =new AppoinmentActions();
	
	
	@When("^Mouse over on reports$")
	public void mouse_over_on_reports()  {
		loginActions.reportMenu();
	}

	@When("^Click on visit and appoinment$")
	public void click_on_visit_and_appoinment()  {
		loginActions.visitsMenu();
	}

	@Then("^It should displayed appoinment$")
	public void it_should_displayed_appoinment()  {
		loginActions.appoinmentMenu();
		
		System.out.println("Report - Appointments");
		
	}
	
	
	
	
	
	
	
	
	
	
}
