package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.SearchPatientActions;


public class SearchPatientStepDef {

	
	SearchPatientActions loginActions = new SearchPatientActions();
	

	// patient search.......................................................................

	
	
	  @When("^Input name into search text box$")
	  public void  input_name_into_search_text_box() {
		  loginActions.patientSearchTextBox();
		  }
	  
	  @Then("^Displayed specific patient$") 
	  public void  displayed_specific_patient() throws Exception {
		  loginActions.displayPatientMsg();
		  }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
