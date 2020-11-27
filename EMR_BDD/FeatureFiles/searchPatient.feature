
Feature: Emrs Patient Search  Feature

This Patient Search feature is for displayed specific patient 



Scenario: Patient Search	

 Given I navigated to emr login page
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page  
     
    And Mouse over on patient
    And Click on Patients
    And I should be able to see Patient Demographics
    
    And Input name into search text box
    Then Displayed specific patient
    
