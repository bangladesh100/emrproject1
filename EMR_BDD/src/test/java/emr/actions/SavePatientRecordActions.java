package emr.actions;

import org.openqa.selenium.support.PageFactory;


import emr.elements.SavePatientRecordElements;
import emr.utilities.SetupDriver;

public class SavePatientRecordActions {

	
	
	
	SavePatientRecordElements loginTest;

	public SavePatientRecordActions() {
		this.loginTest = new SavePatientRecordElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}
	
	

	 
	 // patient record.................................................
	 
	public void patientMenuR() {
		try {
			SetupDriver.driver.switchTo().parentFrame();
		loginTest.patientMenuR.click();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	 
	 public void recordSubMenu() {
		 try {
		 loginTest.recordSubMenu.click();
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 
	 public void recordSubSubMenu() {
		 try {
			 loginTest.recordSubSubMenu.click();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
		 
		 
		 //SetupDriver.driver.switchTo().frame(loginTest.recordiFrame);
		 System.out.println("record page open");
	 }
	 
	 public void patientRecordiFramePage() {

		 try {
			 SetupDriver.driver.switchTo().frame(loginTest.recordiFrame);
			 }catch(Exception e) {
				 System.out.println(e);
			 }
			

		}

	 public void patientRecordBtn() {
		 try {
			 loginTest.patientRecordButton.click();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
		
	 }
	 
	 public void patientRecordMsg() {
		 try {
			 loginTest.patientRecordMsg.isDisplayed();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
		
		 
	 }
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
