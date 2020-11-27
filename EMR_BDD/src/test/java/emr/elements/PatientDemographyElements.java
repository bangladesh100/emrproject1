package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientDemographyElements {

	
	
	
	

	// Patient Demography ---------------------

	// Patient Menu

	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/div")
	public WebElement patientMenu;

	// Patient SubMenu

	@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[1]/div")
	public WebElement subMenu;

	// Patient Finder Tab

	@FindBy(xpath = "//*[@id=\"tabs_div\"]/div/div[4]/span[1]")
	public WebElement patientFinderTab;

	
	
	
	
	
	
	
	
	
	
	
}
