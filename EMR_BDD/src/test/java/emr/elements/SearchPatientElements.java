package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPatientElements {

	
	
	
	

	
	// search patient....................................................

	
		// iFrame
		@FindBy(xpath = "//*[@id=\"framesDisplay\"]/div[3]/iframe")
		public WebElement patientSearchiFrame;

		//search text box
		@FindBy(xpath = "//*[@id=\"pt_table_filter\"]/label/input")
		public WebElement patientSearch;

		//display
		@FindBy(xpath = "//*[@id=\"pt_table_info\"]")
		public WebElement displayedPatientInfo;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
