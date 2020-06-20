Feature: PMT Delete,Cancel and attributes option TestCases 


Scenario: Check the Cancel button[TC035] 
	Given : user will create the application pages and multiadd links 
	When : user will check all project value from the multiadd page 
	And : user will check the checkbox product desc part number 
	And : user will check Cancel button 
	Then : Finally Cancel button finished 

Scenario: Check the Delete button[TC035] 
	Given : user will create the application pages and multiadd links on same page 
	When : user will check the all Vehicle,make and model 
	And : user will check the checkbox product desc part number also 
	And : user will check add button 
	Then : Finally delete button finished 

Scenario: Check the qty,Position and notes[TC035] 
	Given : user will click the application pages and multiadd pages 
	When : user will check the all Vehicle,make model and clicks the search 
	And : user will check the checkbox in the grid 
	And : user will select the product, description,part number on the table 
	And : user will click the Qty,Position and Notes and click the add option 
	And : user will verify the qty,position and notes in the buyersguide 
	Then : Finally Show attributes details is finished 

Scenario: Check the Qty,notes[TC035] 
	Given : user will click the application pages and multiadd page 
	When : user will check the all Vehicle,make,model and click the search 
	And : user will check the checkbox in the table 
	And :  user will select the product, description, part number in drop field 
	And : user will click the Qty and Notes and click the add option 
	And : user will verify the qty,notes in the buyersguide 
	Then : Finally qty and notes added 

Scenario: Check the qty,Position[TC035] 
	Given : user will select the application pages and multiadd pages 
	When : user will check the all chose Vehicle,make,model along with click the search 
	And : user will check the checkbox in the tables 
	And : user will choose the product, description, part no in the dropdown 
	And : user will click the Qty and position and click the add option 
	And : user will verify the position in the buyersguide 
	Then : Finally qty and position added 

Scenario: Check the Notes,Position[TC035] 
	Given : user will select the application paged and multiadd pages 
	When : user will check the all chosen Vehicle,make,model along with click the search 
	And : user will check the checkboxs in the tables 
	And : user will select the product, description, part nos in the dropdown 
	And : user will click the notes and position and select the add option 
	And : user will verify the position and note in the buyersguide 
	Then : Finally notes and position added success 
	
	
	
    