package emr.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.CreateNewPatientActions;

public class CreateNewPatientStepDef {
	
	CreateNewPatientActions loginActions = new CreateNewPatientActions();
	
	// new patient create...................................................
	
		  @When("^Mouse over on patient $")
		  public void  mouse_over_on_patient() {
			  loginActions.patientMenu(); 
			  }
		 
		@When("^Click on new$")
		public void click_on_new() {
			loginActions.newP();
		}

		@When("^Displayed iFrame$")
		public void displayed_iFrame() {
			loginActions.emriFramePage();
		}

		@When("^Select initials$")
		public void select_initials() {
			loginActions.getInitialSelect();
		}

		@When("^Input  first and last name$")
		public void input_first_and_last_name() {
			loginActions.firstName();
			loginActions.lastName();
		}

		@When("^Select date of birth and sex$")
		public void select_date_of_birth_and_sex() {
			loginActions.dob();
			loginActions.gender();
		}

		@When("^Click on create new patient$")
		public void click_on_create_new_patient() {			
			loginActions.addCreatePatient();
		}
	
		@Then("^I should be able to create new patient$")
		public void i_should_be_able_to_create_new_patient() throws Exception  {		
			loginActions.pCreateMsg();	
		}
			
}
