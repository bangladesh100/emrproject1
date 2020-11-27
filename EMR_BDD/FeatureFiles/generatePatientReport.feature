
Feature: Emrs Patient Report Generate Feature

This feature is for generating a general report for specific patient


Scenario: Patient Report Generate Feature

 Given I navigated to emr login page						
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page 
      
    And Mouse over on patient
    And Click on Patients
    And I should be able to see Patient Demographics
    
    And Input name into search text box
    And Displayed specific patient
    
    And Click on patient
    And Click on report menu
    And Click on general report button
    Then Generate patient report

