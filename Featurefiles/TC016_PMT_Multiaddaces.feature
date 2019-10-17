@Sanitycheck
Feature: PMT ACES option TestCases 

Scenario: Check the ACES in multi add [TC033] 
	Given User will Click the Application page and multiadd page 
	When User will select vehicle,make,model and will click the search option 
	And User will check the checkbox button and product line,part description,part number will chose 
	And User will successfully saved particular product line and verify that the record has come 
	Then Finally macthed successfully 

Scenario: Check the Show attributes ACES[TC037] 
	Given : user will create the application pages and multiadd links pages 
	When : user will check the all Vehicle and make and model and click the search 
	And : user will click the checkbox and use show attributes option 
	And : user will select the product, description, part number 
	And : user will click the save options and alert popup to accept it 
	Then : Finally Show attributes is finished 
	
	
