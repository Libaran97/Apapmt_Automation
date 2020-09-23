@sanity
Feature: PMT Part,Product and part description with part linked option TestCases 

Scenario: Check the multiplepart part linked verfication in the grid [TC036] 
	Given : user will select the Multiadd page with application 
	When : user will chose the all chosed Vehicle,make,model along with click the 
	And : user will chose checkbox in the grid 
	And : user will select the product, description, part numbers in the dropdown 
	And : user will click the qty,position and Notes and click the add button 
	And : user will again click the Vehicle,make,model in the drop down 
	And : user will check the parts linked the partnumber present or not 
	Then : Finally multiple parts Linked verified success 

Scenario: Check the multiple part description and partno[TC036] 
	Given : user will chosed the application paged and multiadd pages 
	When : user will check the all chosed Vehicle,make,model along with click the search 
	And : user will check the checkboxs in the tables col 
	And : user will select the product, descriptions, part numbers in the dropdown 
	And : user will click the qty and click the add button 
	Then : Finally multiple added part description and part number added success 

Scenario: Check the multiple Productline description and part[TC036] 
	Given : user will chosed the application paged and multiadd page 
	When : user will check the all chosed Vehicle,make,model 
	And : user will check the checkbox in the tab 
	And : user will select the product, description, part numbers in the drop 
	And : user will Re select the product, description, part numbers in the dropdown 
	And : user will verify the both product lines 
	Then : Finally multiple added Product description 

Scenario: Check the multiplepartdesc product line and part[TC036] 
	Given : user will chosed the application pag and multiadd page 
	When : user will check the all chosed Vehicle,make,models 
	And : user will check the checkbox in the tabs 
	And : user will select the product, description, part numbers in the drops 
	And : user will Re select the product, description, part number in the dropdown 
	And : user will verify the both part description lines 
	Then : Finally multiple added partdescription 
	
	
	
	
	
	
	
	
	
    