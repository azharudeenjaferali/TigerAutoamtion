Feature: This feature is to test the form functionalitites

Scenario: This scenario is to fill in form flow
	Given launch browser and open url
	When provide all valid details to fill the form
	|Address|City|Zipcode|
	|112 NW AVE|Florida|33178|
	|978 HARRY LANE|California|94043|
	
	And submit the form and create account
	Then Validate if the account created