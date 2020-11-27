package emr.actions;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import emr.elements.EmrLoginElementsTest;
import emr.utilities.SetupDriver;

public class EmrLoginActionsTest {
	
	EmrLoginElementsTest loginTest;

	public EmrLoginActionsTest() {
		this.loginTest = new EmrLoginElementsTest();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}

	// Login ------------------------------------
	public void setUserID(String admin) {
		loginTest.admin.sendKeys(admin);

	}

	public void setPassword(String pass) {
		loginTest.pass.sendKeys(pass);

	}

	public void loginClick() {
		loginTest.loginButton.click();
	}

	public boolean patientText() {
		return loginTest.patientText.isDisplayed();
	}

	
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
