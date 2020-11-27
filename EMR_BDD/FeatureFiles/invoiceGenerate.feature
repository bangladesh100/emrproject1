
Feature: Emrs Invoice Generate Feature

This feature generate invoice for specific patient


Scenario: Generate Invoice	


	Given I navigated to emr login page
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page  
     
    And Mouse over on patient
    And Click on Patients
    And I should be able to see Patient Demographics
    
    And Input name into search text box
    Then Displayed specific patient
  
	And     Click on fees menu
	And     Click on payment
	And     Select payment method
	And     Input first amount
	And     Input second amount
	And     Click generate invoice
	Then    Displayed invoice
