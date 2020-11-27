package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewPatientElements {

	
	
	// New patient create ................................................................

	
	//patient menu
	@FindBy(xpath="//*[@id=\"menu_logo\"]/div/div/span[5]/div/div")
	public 	WebElement patientMenu;

	// New / Search SubMenu
	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")
	public WebElement newSubMenu;
			
	
	// displayed iFrame
	@FindBy(xpath ="//*[@id=\"framesDisplay\"]/div[3]/iframe")
	public WebElement iFrameDisplay;

	// Name Initials
	@FindBy(xpath = "//*[@id=\"form_title\"]")
	public WebElement iniName;

	// First name
	@FindBy(xpath = "//*[@id=\"form_fname\"]")
	public WebElement firstName;

	// Last name
	@FindBy(xpath = "//*[@id=\"form_lname\"]")
	public WebElement lastName;

	// Date of birth
	@FindBy(xpath = "//*[@id=\"form_DOB\"]")
	public WebElement dateOfBirth;

	// Sex / gender
	@FindBy(xpath = "//*[@id=\"form_sex\"]")
	public WebElement gender;

	// Create new patient button
	@FindBy(xpath = "//*[@id=\"create\"]")
	public WebElement createPatientBtn;

	
		
	// new patient create successfully
	@FindBy(xpath = "//td[contains(text(),'1 - 2 of 2')]")		
	 public WebElement patientCreateMsg;

	
	
	
	
	
}
