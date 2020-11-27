package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.actions.GeneratePatientRepotrActions;


public class GeneratePatientReportStepDef {

	
	GeneratePatientRepotrActions loginActions = new GeneratePatientRepotrActions();
	
	
	
	
	 
	  // displayed patient general report.............................................................

	@When("^Click on patient$")
	public void click_on_patient()  {
		loginActions.clickSpecificPatient();	
		
	}

	@When("^Click on report menu$")
	public void click_on_report_menu()   {
		
		loginActions.clickReportMenu();	
		
		
	}

	@When("^Click on general report button$")
	public void click_on_general_report_button()  {
		loginActions.clickGenerateReportBtn();
	}

	@Then("^Generate patient report$")
	public void generate_patient_report()  {
		loginActions.generateReport();
	}
	 
	
	
	
	
	
	
	
	
	
}
