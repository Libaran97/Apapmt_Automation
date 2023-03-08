@sanity,@Automation
Feature: PMT Parts BOM Add, Edit and Delete

@Regression
Scenario: Adding part# with created product category
Given User will click on parts page and it should redirect to parts page
When User will click on the add buton and choose product category and sub category and part des and product line
And User will enter the partNo btu click save
Then User will successfully alert and verify the partNO

@Regression
Scenario: Adding Bom in old parts page
Given User will go to parts page and search for a partno bom
When User will click on Bom
And User will Enter partno and Qty
Then User will verify the reocrd has shown in the bom 

@Regression
Scenario: Editing Bom in old parts page
Given User will go to parts page and search for partno bom edit
When User will click on Bom Edit Button
And User will Enter partno and Qty for Edit 
Then User will verify the reocrd has shown in the bom for edit

@Regression
Scenario: Deleting Bom in old parts page
Given User will go to parts page and search for the partno bom del
When User will click on bom and Click Delete Button Accept Alert
Then User will verify the record del has not shown in the below grid

@Regression
Scenario: Adding unit in parts page
Given User will go to parts page and search for a partno unit
When User will click on unit
And User will Enter Comp qty and units parts
Then User will verify the reocrd has shown in the unit 

@Regression
Scenario: Editing unit in parts page
Given User will go to parts page and search for partno unit edit
When User will click on unit Edit Button
And User will Enter Comp qty and units parts for Edit 
Then User will verify the reocrd has shown in the unit for edit

@Regression
Scenario: Deleting unit in parts page
Given User will go to parts page and search for the partno unit del
When User will click on unit and Click Delete Button Accept Alert
Then User will verify the record del unit has not shown in the below grid
