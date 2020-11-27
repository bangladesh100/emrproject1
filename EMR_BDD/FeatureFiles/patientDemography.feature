
Feature: Emrs Patient Demographics Feature

This feature is for displaying all patients



Scenario: Patient Demographics feature


   Given I navigated to emr login page
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page 
      
    And Mouse over on patient
    And Click on Patients
    Then I should be able to see Patient Demographics
