package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmrLogoutElements {

	
	

	
	//log out................................................................
	
	//user
	@FindBy(xpath = "//div[@class='menuSection userSection']//div[@id='username']")
	public WebElement loginUser;
	
	//logout
	@FindBy(xpath = "//li[contains(text(),'Logout')]")
	public WebElement logout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
