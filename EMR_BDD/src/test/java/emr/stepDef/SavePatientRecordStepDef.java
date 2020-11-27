package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.SavePatientRecordActions;


public class SavePatientRecordStepDef {

	
	
	SavePatientRecordActions loginActions = new SavePatientRecordActions();
	
	

	
	// saving patient record
	
	 @When("^Mouse over on patient record$")
	 public void mouse_over_on_patient_record() {
		  loginActions.patientMenuR(); 
		  }
	
	
	
	@When("^Click on record submenu$")
	public void click_on_record_submenu()  {
		loginActions.recordSubMenu();
	}

	@When("^Click on patient record request sub sub menu$")
	public void click_on_patient_record_request_sub_sub_menu() {
		loginActions.recordSubSubMenu();
	}

	
	  @When("^Display record iFrame page$") 
	  public void
	  display_record_iFrame_page() { 
	  loginActions.patientRecordiFramePage();
	  }
	 

	@When("^Click on patient record request button$")
	public void click_on_patient_record_request_button()  {
		loginActions.patientRecordBtn();
	}

	@Then("^Displayed record save msg \\.$")
	public void displayed_record_save_msg()  {
		loginActions.patientRecordMsg();
		System.out.println(" The patient record request has been recorded.");
	}	
	
	
	
}
