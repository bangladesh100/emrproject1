package emr.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoiceGenerateElements {

	
	
	
	
	
		// Fees Menu (back parent menu)

		@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[6]/div/div")
		public WebElement feesMenu;

	
	
		// Payment Menu

		@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[6]/div/ul/li[2]/div")
		public WebElement paymentMenu;

	
		//iFrame
		
		@FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[6]/div/ul/li[2]/div")
		public WebElement paymentiFrame;

	
	
		// Payment Method 
		@FindBy(xpath = "//select[@id='form_method']")
		public WebElement paymentiMethod;

		//Input first payment
		@FindBy(xpath = "//input[@id='paying_1']")
		public WebElement firstPayment;
		
		
	
		//Input second payment
		@FindBy(xpath = "//input[@id='paying_2']")
		public WebElement secondPayment;
	
	
	
		// Generate Invoice
		@FindBy(xpath = "//button[@name='form_save']")
		public WebElement invoiceGenBtn;
	
		
	
	
	
}
