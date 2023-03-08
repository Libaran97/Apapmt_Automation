@sanity
Feature: PMT Non ACES option TestCases 
Description: User will check the Non Aces and with attributes

@Philips5001
Scenario: Check the Non Aces files in vehicle_Mul [TC034] 
	Given : user will create the application pages 
	When : user will check the all 
	And : user will check the all part types 
	And  User will successfully saved particular non aces product line and verify that the record has come 
	
@Philips
Scenario: Check the Show attributes non ACES in vehicle_Mul[TC034] 
	Given : user will create the application pages and multiadd pages 
	When : user will check the all Vehicle,make and model and click the search 
	And : user will check the checkbox and use nonaces attributes 
	And :  user will select the product, description, part number 
	And : user will do save option and alert popup to accept or not 
	
	