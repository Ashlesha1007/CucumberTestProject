Feature: Verifying the registration page


	Background: 
	Given Connect with database
	
	@smoke  
  Scenario: Register with correct email id and password for application
   
    Given user open the application
    When User enters email id
    And User enters password
    And User clicks on register button
    Then User is successfully signed up
    
    
  @regression
  Scenario: Register with email id and password for application 
  
    Given user open the application
    When User enters invalid email id
    And User enters valid password
    And User clicks on register button
    Then User is not signed up
    
   @sanity 
   Scenario Outline: Registering with correct email id and password in application for multiple users
   
    Given user open the application
    When User enters email id "<EmailId>"
    And User enters password "<Password>"
    And User clicks on register button
    Then User is successfully signed up
    
    
    Examples:
    | EmailId     |  Password  |
		|	ashlesha@123 | Test1    	|
		|	pran@1234 	 | Test2    	|