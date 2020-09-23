@sanity
Feature: PMT Non ACES option TestCases 

Scenario: Check the Non Aces files in multi add [TC034] 
	Given : user will create the application pages 
	When : user will check the all 
	And : user will check the all part types 
	And  User will successfully saved particular non aces product line and verify that the record has come 
	Then Finally Non Aces matched successfully 

Scenario: Check the Show attributes non ACES[TC034] 
	Given : user will create the application pages and multiadd pages 
	When : user will check the all Vehicle,make and model and click the search 
	And : user will check the checkbox and use nonaces attributes 
	And :  user will select the product, description, part number 
	And : user will do save option and alert popup to accept or not 
	Then : Finally Show non aces attributes is finished 
	