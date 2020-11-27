package emr.actions;

import org.openqa.selenium.support.PageFactory;

import emr.elements.AppoinmentElements;
import emr.elements.CreateNewPatientElements;
import emr.utilities.SetupDriver;

public class AppoinmentActions {

	
	
		AppoinmentElements loginTest;


	public AppoinmentActions() {
		this.loginTest = new AppoinmentElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL

	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");

		String title = SetupDriver.driver.getTitle();
		return title;

	}

	
	public void reportMenu() {
		loginTest.reportMenu.click();
	}
	
	
	public void visitsMenu() {
		loginTest.visitMenu.click();
	}
	
	public void appoinmentMenu() {
		loginTest.appoinmenttMenu.click();
	}
	
	
	
	
	
	
	
	
	
	
}
