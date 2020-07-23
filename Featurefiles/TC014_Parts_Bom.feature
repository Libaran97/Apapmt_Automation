Feature: PMT Parts Package Add, Edit and Delete

Scenario: Adding Bom in old parts page
Given User will go to parts page and search for a partno bom
When User will click on Bom
And User will Enter partno and Qty
Then User will verify the reocrd has shown in the bom 

Scenario: Editing Bom in old parts page
Given User will go to parts page and search for partno bom edit
When User will click on Bom Edit Button
And User will Enter partno and Qty for Edit 
Then User will verify the reocrd has shown in the bom for edit

Scenario: Deleting Bom in old parts page
Given User will go to parts page and search for the partno bom del
When User will click on bom and Click Delete Button Accept Alert
Then User will verify the record del has not shown in the below grid


