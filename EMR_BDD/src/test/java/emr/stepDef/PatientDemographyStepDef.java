package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.PatientDemographyActions;

public class PatientDemographyStepDef {

	
	PatientDemographyActions loginActions = new PatientDemographyActions();
	
	
	

	// patient demography......................................................................

	
	  @When("^Mouse over on patient$") public void mouse_over_on_patient() {
	  loginActions.patientMenu(); }
	  
	  @When("^Click on Patients$") public void click_on_Patients() {
	  loginActions.patientSubmenu(); }
	  
	  @Then("^I should be able to see Patient Demographics$")
	  public void	  i_should_be_able_to_see_Patient_Demographics() {
	  loginActions.patientFinderTab(); 
	  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
