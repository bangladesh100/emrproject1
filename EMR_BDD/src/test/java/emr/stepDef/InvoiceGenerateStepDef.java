package emr.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import emr.actions.InvoiceGenerateActions;

public class InvoiceGenerateStepDef {
	
	
	InvoiceGenerateActions loginActions = new InvoiceGenerateActions();

	// generate invoice

	
	@When("^Click on fees menu$")
	public void click_on_fees_menu() {
		loginActions.feesMenu();
	}

	@When("^Click on payment$")
	public void click_on_payment() {
		try {
			loginActions.paymentMenu();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

	@When("^Select payment method$")
	public void select_payment_method() {
		loginActions.paymentMethodSelect();
	}

	

	@When("^Input first amount$")
	public void input_first_amount() {
		loginActions.firstPayment();
	}

	@When("^Input second amount$")
	public void input_second_amount() {
		loginActions.secondPayment();
	}

	@When("^Click generate invoice$")
	public void click_generate_invoice() {
		loginActions.invoiceGenerateBtn();
	}

	@Then("^Displayed invoice$")
	public void displayed_invoice() {

	}

}
