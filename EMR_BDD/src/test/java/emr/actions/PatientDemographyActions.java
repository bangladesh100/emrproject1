package emr.actions;

import org.openqa.selenium.support.PageFactory;

import emr.elements.PatientDemographyElements;
import emr.utilities.SetupDriver;

public class PatientDemographyActions {

	
	
	PatientDemographyElements loginTest;

	public PatientDemographyActions() {
		this.loginTest = new PatientDemographyElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}
	
	
	
	

	// patient demography -----------------------------------------

	public void patientMenu() {
		loginTest.patientMenu.click();

		/*
		 * System.out.println(">> Navigating to the EMR menu"); Actions action = new
		 * Actions(SetupDriver.driver); action.moveToElement(loginTest.patientMenu);
		 * //action.build(); action.perform(); Thread.sleep(7000);
		 */

	}

	public void patientSubmenu() {
		loginTest.subMenu.click();

		/*
		 * System.out.println(">> Navigating to the Patient submenu"); Actions action =
		 * new Actions(SetupDriver.driver); action.moveToElement(loginTest.subMenu);
		 * action.click(); action.perform();
		 */

	}

	public void patientFinderTab() {
		loginTest.patientFinderTab.isDisplayed();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
