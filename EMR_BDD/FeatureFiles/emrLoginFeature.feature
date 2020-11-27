Feature: Emrs Login Feature
  This login feature is for login functionality in EMR website  
   

  Scenario: Login feature
  
   Give	I navigated to emr login page
   When I entered correct "admin" and "pass"
   And 	I click on login
   Then I am on EMR home page   
   
  

