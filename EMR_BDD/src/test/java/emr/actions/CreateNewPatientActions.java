package emr.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import emr.elements.CreateNewPatientElements;

import emr.utilities.SetupDriver;

public class CreateNewPatientActions {

	CreateNewPatientElements loginTest;

	public CreateNewPatientActions() {
		this.loginTest = new CreateNewPatientElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL

	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");

		String title = SetupDriver.driver.getTitle();
		return title;

	}

	// create new patient-------------------------------------------------

	public void patientMenu() {

		loginTest.patientMenu.click();
	}

	public void newP() {
		loginTest.newSubMenu.click();
	}

	// iFrame URL

	public void emriFramePage() {

		SetupDriver.driver.switchTo().frame(loginTest.iFrameDisplay);

	}

	public Select getInitialSelect() {
		Select iniSelect = new Select(loginTest.iniName);
		iniSelect.selectByVisibleText("Mr.");
		return iniSelect;

	}

	public void firstName() {
		loginTest.firstName.sendKeys("Abrar");
	}

	public void lastName() {
		loginTest.lastName.sendKeys("Ahmed");
	}

	public void dob() {
		loginTest.dateOfBirth.sendKeys("2000-01-07");
	}

	public void gender() {

		Select genDrop = new Select(loginTest.gender);
		genDrop.selectByIndex(1);
	}

	public void addCreatePatient() {

		loginTest.createPatientBtn.click();
	}

		
		
	  public void pCreateMsg() throws Exception{
	  
	  try{
	  
	  loginTest.patientCreateMsg.getText();
	  
	  }catch (Exception e){
	  
	  System.out.println("not found");
	  
	  }
	  
	  }
	  
	 

}
