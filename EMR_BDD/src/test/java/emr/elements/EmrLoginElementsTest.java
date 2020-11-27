package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmrLoginElementsTest {

	
	
	// Login ---------------------
	// UserID
	@FindBy(xpath = "//*[@id=\"authUser\"]")
	public WebElement admin;

	// Password
	@FindBy(xpath = "//*[@id=\"clearPass\"]")
	public WebElement pass;

	// Login Button
	@FindBy(xpath = "//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")
	public WebElement loginButton;

	// Login Text
	@FindBy(xpath = "//*[@id=\"attendantData\"]/div/span[1]/div[2]")
	public WebElement patientText;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//patient appoinment.................................................
	
	//appoinment link
	@FindBy(xpath = "//div//div//div//div//div[3]//table[1]//tbody[1]//tr[1]//td[2]//a[1]//span[1]//b[1]")
	public WebElement appoinmentLink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}