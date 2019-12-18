Feature: Validate all internal links on the web page 

Scenario Outline:
For given URL validate all internal links on the page if accessible 
	Given User should be able to launch the browser 
	When  User should be able to navigate to the required URL "<Url>" 
	Then  Get all the Links on the web page 
	Then  Close the browser 
	
	Examples: 
		|Url|
		|https://developer.here.com/documentation|