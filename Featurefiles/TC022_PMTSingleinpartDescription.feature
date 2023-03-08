@sanity
Feature: PMT Description Single in all page TestCases 

@Philips5001
Scenario: Check the Description add[TC038] 
	Given : user will Click the Search button
	When : user will add the Description add application
	And : user will verify the Add product line,Notes and description 
	Then : Finally click the Description added success
@Philips
Scenario: Check the Description Edit[TC038] 
	Given : user will Click the Search box and partnum
	When : user will edit the Description 
	And : user will verify the edited description value
	Then : Finally click theDescription edit success  
@Philips
Scenario: Check the Description Delete[TC038] 
	Given : user will Click the Search boxes and partnumber
	When : user will click the delete options 	
	Then : Finally click the verification of delete success
	
		