@sanity,@Automation
Feature: PMT Parts Price Add, Edit and Delete

@Regression
Scenario: Adding Parts Price
Given User will click parts page and search part#
When User will click on Price page and select price type
And User will select Price UOM, Enter price and price sheet number
Then User will save, Accept alert and verify

@Regression
Scenario: Editing Parts Price
Given User will click parts and search partno
When User will click on Price page and Click Edit
And User will Edit Price value
Then User will save, Accept alert and Edit verify

@Regression
Scenario: Delete Parts Price
Given User will click on parts and search part# 
When User will click on Pricepage and Click Delete Button
And User will Accept alert and verify Delete Price
