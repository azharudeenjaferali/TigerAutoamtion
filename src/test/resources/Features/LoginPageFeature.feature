# This is a sample Feature file
Feature: This feature is to test the login page scenarios

#Scenario: This scenario is to test login functionality with valid credential
#	Given Launch browser and load Url
#	When Provide valid username and password then login
#	Then Validate the user logged in and close browser
#	
#Scenario: This scenario is to test login functionality with invalid credential
#	Given Launch browser and load Url
#	When Provide invalid username and password then login
#	Then Validate the user logged in and close browser
	
Scenario Outline: This scenario is to test login functionality with valid credential
	Given Launch browser and load Url
	When Provide valid "<UserName>" and "<PassWord>" then login
	Then Validate the user logged in and close browser
Examples: 
		|UserName|PassWord|
		|standard_user|secret_sauce|
		|problem_user|secret_sauce|
	
