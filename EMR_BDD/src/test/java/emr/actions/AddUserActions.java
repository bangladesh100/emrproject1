package emr.actions;

import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import emr.elements.AddUserElements;
import emr.elements.AppoinmentElements;
import emr.utilities.SetupDriver;

public class AddUserActions {

	
	

	AddUserElements loginTest;

	public AddUserActions() {
		this.loginTest = new AddUserElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL

	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");

		String title = SetupDriver.driver.getTitle();
		return title;

	}

	

	//administration
	public void administration() {
		loginTest.administration.click();
	}
	
	
	
	//user and switch to frame
	public void userMenu() {
		loginTest.userMenu.click();
		
	}

	
	//add user

	public void addUser() {
		SetupDriver.driver.switchTo().frame(loginTest.frame);
		loginTest.addUser.click();
		
		
	}

	
	public void userInfo() {
		try {
		loginTest.userInfo.isDisplayed();
		}catch(Exception d) {
			System.out.println(d);
			System.out.println("Add user page displayed .");
		}
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
