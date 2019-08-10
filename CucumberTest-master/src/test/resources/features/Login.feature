Feature: This feature is used to verify login funcationality


	Background: 
	Given User open browser


	@taggedHookes
	 Scenario: login with valid username and password
	 
	 	Given User open application
    When User enters Username
    And User enters Password
    And User clicks on Login button
    Then User is successfully logged in
    
 
    @sanity
  Scenario: login with In valid username and password
	 
	 	Given User open application
    When User enters Username
    And User enters Password
    And User clicks on Login button
    Then User is successfully logged in
    
    @smoke @sanity
  Scenario: login with email Id and password
	 
	 	Given User open application
    When User enters Username
    And User enters Password
    And User clicks on Login button
    Then User is successfully logged in
    
    @outline
  Scenario Outline: login with username and password with scenario outline
  
  	Given User open application
    And User enters Username "<UserName>"
    And User enters Password "<Password>"
    And User clicks on Login button
    Then User is successfully logged in
    
    Examples:
    | UserName      | Password    |
    | test_username | test_Password |
    |user1					| pass1|
    |user2					|Pass2|