Feature: This feature is to test the homepage funcionalities

Background: 
	Given Launch browser and load amazon Url
	
Scenario: This is to test mobile test
#	Given Launch browser and load amazon Url
	When Enter the product and search
	Then Validate the results
	
Scenario: This is to test laptop test
#	Given Launch browser and load amazon Url
	When Enter the laptop and search
	Then Validate the results
