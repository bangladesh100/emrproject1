

Feature: Add user Feature

 

  @regression @functiona
  Scenario: Add user Feature
 
  Given I navigated to emr login page
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page  
    
     And Mouse over on administration
     And Click on user manu
     
     And Click on add user 
     Then It displayed user info page 
     
     