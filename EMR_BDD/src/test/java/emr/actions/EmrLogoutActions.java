package emr.actions;


import org.openqa.selenium.support.PageFactory;

import emr.elements.EmrLoginElementsTest;
import emr.elements.EmrLogoutElements;
import emr.utilities.SetupDriver;

public class EmrLogoutActions {

	
	
	
	
	EmrLogoutElements loginTest;
	
	public EmrLogoutActions() {
		this.loginTest = new EmrLogoutElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	
	
	 
		//logout.....................................................................
			
			public void user() {
				loginTest.loginUser.click();
			}
			
			public void logout() {
				loginTest.logout.click();
			}
			

			public String emrLoginPage() {
				SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
				String title = SetupDriver.driver.getTitle();
				return title;

			}
	
	
}
