package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserElements {

	
	
	
	//administration
	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[9]/div/div")
	public WebElement administration;
	
	//user
	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[9]/div/ul/li[3]/div")
	public WebElement userMenu;
	
	
	//frame
	//*[@id="framesDisplay"]/div[9]/iframe
	//iframe[@name='adm']
	
	@FindBy(xpath = "//iframe[@name='adm']")
	public WebElement frame;
	
	
	
	
	
	
	
	//add user
	@FindBy(xpath = "//a[@class='medium_modal btn btn-default btn-add']")
	public WebElement addUser;
	
	
	//modal/popup
	@FindBy(xpath = "//*[@id=\"container_div\"]")
	public WebElement userInfo;
	
	
	
	
	
	
}
