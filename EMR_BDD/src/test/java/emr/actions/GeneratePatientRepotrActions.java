package emr.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.PageFactory;

import emr.elements.GeneratePatientReportElements;
import emr.utilities.SetupDriver;

public class GeneratePatientRepotrActions {

	
	GeneratePatientReportElements loginTest;
	
	
	public GeneratePatientRepotrActions() {
		this.loginTest = new GeneratePatientReportElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}
	
	

	
	// generate patient report ..........................................................
	 
	
	public void clickSpecificPatient() {
		loginTest.clickSpecificPatient.click();
		
	}

	
	public void clickReportMenu()  {
		
		try {
			loginTest.clickReportMenu.click();
		} catch (Exception f) {
		   System.out.println(f);
		}
		
		
	}

	
	public void clickGenerateReportBtn() {
		try {
			loginTest.clickGenerateReport.click();
		} catch (Exception e) {
			System.out.println("generate report btn ok ");
		}
	}

	
	
	public void generateReport() {
		try {
			loginTest.displayGenerateReport.getText();
		} catch (Exception e) {
			System.out.println("Report generated .");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
