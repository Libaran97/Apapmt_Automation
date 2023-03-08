@sanity,@Automation
Feature: PMT Part,Product and part description with part linked option TestCases 

@Regression
Scenario: Adding Application Related vehicle
Given User will mouse hover on Master and choose the vehicle type page
When User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save
Then User will verify the added record should be shown in vehicle grid

@Regression
Scenario: Adding Application Related vehicle group
Given User will mouse hover Master and choose vehicle type group pages
When User will click the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save 
Then User will verify the added record should be shown in vehicle type group in the grid

@Regression
Scenario: Adding Application Related Make
Given User will mouse hover on master and choose the make multiaddmake  
When User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save multiaddmake  
Then User will verify the added record should be shown in make grid multiaddmake

@Regression
Scenario: Adding Application Related Model
Given  User will mouse hover on master , choose the model 
When User will click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save
Then User will successfully added , verify that the record has come.

@Regression
Scenario: Adding Vehicle page
Given User will click on vehicle page and Click add button
When User will select dropdown and Choose Vehicle, Make & Model vehicle page
And User will Enter year vehicle page
Then User will click non Aces Engine Radio Button vehicle page
Then User will Enter NonAces Engine Base details vehicle page
Then User will successfully add vehicle page
Then User will verify that NonAces record has come vehicle page

@Regression
Scenario: Check the multiplepart part linked verfication in the grid [TC036] 
	Given : user will select the Multiadd page with application 
	When : user will chose the all chosed Vehicle,make,model along with click the 
	And : user will chose checkbox in the grid 
	And : user will select the product, description, part numbers in the dropdown 
	And : user will click the qty,position and Notes and click the add button 
	
	
	#And : user will again click the Vehicle,make,model in the drop down 
	#And : user will check the parts linked the partnumber present or not 
	#Then : Finally multiple parts Linked verified success 
#@Philips
#Scenario: Check the multiple part description and partno[TC036] 
	#Given : user will chosed the application paged and multiadd pages 
	#When : user will check the all chosed Vehicle,make,model along with click the search 
	#And : user will check the checkboxs in the tables col 
	#And : user will select the product, descriptions, part numbers in the dropdown 
	#And : user will click the qty and click the add button 
	#Then : Finally multiple added part description and part number added success 

#Scenario: Check the multiple Productline description and part[TC036] 
	#Given : user will chosed the application paged and multiadd page 
	#When : user will check the all chosed Vehicle,make,model 
	#And : user will check the checkbox in the tab 
	#And : user will select the product, description, part numbers in the drop 
	#And : user will Re select the product, description, part numbers in the dropdown 
	#And : user will verify the both product lines 
	#Then : Finally multiple added Product description 

#Scenario: Check the multiplepartdesc product line and part[TC036] 
#	Given : user will chosed the application pag and multiadd page 
#	When : user will check the all chosed Vehicle,make,models 
#	And : user will check the checkbox in the tabs 
#	And : user will select the product, description, part numbers in the drops 
#	And : user will Re select the product, description, part number in the dropdown 
#	And : user will verify the both part description lines 
#	Then : Finally multiple added partdescription 
	
	
	
	
	
	
	
	
	
    