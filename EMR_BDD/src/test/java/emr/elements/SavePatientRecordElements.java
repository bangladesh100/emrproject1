package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavePatientRecordElements {

	
	
	
	

	
	//save patient record.........................................................
	
	//patient menu
	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/div")
	public WebElement patientMenuR;
	
	
	//record submenu
	

	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[5]/div/div")
	public WebElement recordSubMenu;
	
	
	//record sub sub menu
	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[5]/div/ul/li/div")
	public WebElement recordSubSubMenu;
	
	//record iFrame
	 @FindBy(xpath = "//*[@id=\"framesDisplay\"]/div[5]/iframe") 
	  public WebElement  recordiFrame;
	 
	
	
	//record btn
	 @FindBy(xpath = "//*[@id=\"req_button\"]")
		public WebElement patientRecordButton;
	 
	 
	//record msg
	 @FindBy(xpath = "//*[@id=\"openreq\"]")
		public WebElement patientRecordMsg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
