@sanity
Feature: PMT Parts Package Add, Edit and Delete
@Philips
Scenario: Adding Bom in old parts page
Given User will go to parts page and search for a partno bom
When User will click on Bom
And User will Enter partno and Qty
Then User will verify the reocrd has shown in the bom 
@Philips
Scenario: Editing Bom in old parts page
Given User will go to parts page and search for partno bom edit
When User will click on Bom Edit Button
And User will Enter partno and Qty for Edit 
Then User will verify the reocrd has shown in the bom for edit
@Philips
Scenario: Deleting Bom in old parts page
Given User will go to parts page and search for the partno bom del
When User will click on bom and Click Delete Button Accept Alert
Then User will verify the record del has not shown in the below grid
@Philips
Scenario: Adding unit in parts page
Given User will go to parts page and search for a partno unit
When User will click on unit
And User will Enter Comp qty and units parts
Then User will verify the reocrd has shown in the unit 
@Philips
Scenario: Editing unit in parts page
Given User will go to parts page and search for partno unit edit
When User will click on unit Edit Button
And User will Enter Comp qty and units parts for Edit 
Then User will verify the reocrd has shown in the unit for edit
@Philips
Scenario: Deleting unit in parts page
Given User will go to parts page and search for the partno unit del
When User will click on unit and Click Delete Button Accept Alert
Then User will verify the record del unit has not shown in the below grid
