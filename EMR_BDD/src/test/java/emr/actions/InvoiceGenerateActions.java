package emr.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import emr.elements.InvoiceGenerateElements;
import emr.utilities.SetupDriver;

public class InvoiceGenerateActions {

	InvoiceGenerateElements loginTest;
	
	public InvoiceGenerateActions() {
		this.loginTest = new InvoiceGenerateElements();
		PageFactory.initElements(SetupDriver.driver, loginTest);

	}

	// application URL
	public String emrLoginPage() {
		SetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		String title = SetupDriver.driver.getTitle();
		return title;

	}

	
	//fees menu
	public void feesMenu() {
		SetupDriver.driver.switchTo().parentFrame();
		loginTest.feesMenu.click();
	}
	
	
	//payment menu
		public void paymentMenu() {
			
			loginTest.paymentMenu.click();
			SetupDriver.driver.switchTo().frame(loginTest.paymentiFrame);
		}
		
	//payment method
		
		public Select paymentMethodSelect() {
			Select methodSelect = new Select(loginTest.paymentiMethod);
			methodSelect.selectByVisibleText("Cash");
			return methodSelect;

		}
		
	// input first payment
		public void firstPayment() {			
			loginTest.firstPayment.sendKeys("10");
		}
	
	
		// input second payment
		public void secondPayment() {			
			loginTest.secondPayment.sendKeys("20");
				}
			
	 // Generate Invoice btn
		public void invoiceGenerateBtn() {			
			loginTest.invoiceGenBtn.click();
				}	
	
	
	
	
	
}
