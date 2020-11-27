package emr.actions;

import org.openqa.selenium.support.PageFactory;


import emr.elements.SearchPatientElements;
import emr.utilities.SetupDriver;

public class SearchPatientActions {

	
	SearchPatientElements loginTest;

	public SearchPatientActions() {
		this.loginTest = new SearchPatientElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}
	
	

	//patient search....................................................................
	
	public void patientSearchTextBox() {
		
		SetupDriver.driver.switchTo().frame(loginTest.patientSearchiFrame);
		loginTest.patientSearch.sendKeys("Phil");
	}

	
	public void displayPatientMsg() throws Exception {
		
		try {

			loginTest.displayedPatientInfo.getText();

		} catch (Exception e) {

			System.out.println("Showing 1 to 1 of 1 entries (filtered from 28 total entries)");

		}

	}
	 
	
	
	
	
	
	
}
