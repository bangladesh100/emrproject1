

Feature: Emrs Logout Feature

  This  feature is for logout functionality in EMR website
   
   
 
   Scenario: logout feature	

			Given I navigated to emr login page
      When 	I entered correct "admin" and "pass"
      And 	I click on login
      And   I am on EMR home page  
       
      And   Click on user
      And   Click on logout
      Then  It should be back emr login page


   