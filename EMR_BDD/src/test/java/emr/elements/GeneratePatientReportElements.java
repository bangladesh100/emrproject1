package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneratePatientReportElements {

	
	
	

	// Generate patient report.........................................................
	
	
	// click patient 
	@FindBy(xpath = "//*[@id=\"pid_1\"]/td[1]")
	public WebElement clickSpecificPatient;
	
	
	
	//report menu
	
	
	 @FindBy(xpath = "//a[contains(text(),'Report')]")
		public WebElement clickReportMenu;
	
	
	
	//generate report btn
	
	@FindBy(xpath = "//*[@id=\"ccr_form\"]/fieldset[1]/div/span[3]/button[1]")	
	public WebElement clickGenerateReport;
	
	
	//display generate report
	
	@FindBy(xpath = "//h1[contains(text(),'Continuity of Care Record')]")	
	public WebElement displayGenerateReport;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
