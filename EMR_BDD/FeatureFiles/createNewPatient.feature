
Feature: Emrs New Patient Create Feature

This feature is for creating a new patient feature


 Scenario: New Patient Create Feature
 
    Given I navigated to emr login page
    When 	I entered correct "admin" and "pass"
    And 	I click on login
    And 	I am on EMR home page 
      
    And 	Mouse over on patient 
    And 	Click on new
    And 	Displayed iFrame
   	And   Select initials
		And   Input  first and last name
		And   Select date of birth and sex
		And   Click on create new patient	
		Then  I should be able to create new patient
