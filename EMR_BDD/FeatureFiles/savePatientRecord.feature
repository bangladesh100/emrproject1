
Feature: Emrs Save Patient Record Feature

This feature is for saving a patient record.


Scenario: Record patient records 	

		Given I navigated to emr login page
    When I entered correct "admin" and "pass"
    And I click on login
    And I am on EMR home page  
     
    And Mouse over on patient
    And Click on Patients
    And I should be able to see Patient Demographics
    
    And Input name into search text box
    Then Displayed specific patient
    
    	 And Mouse over on patient record 
    	   	
    	And   Click on record submenu
			And   Click on patient record request sub sub menu	
			And   Click on patient record request button
		 Then   Displayed record save msg . 
 
