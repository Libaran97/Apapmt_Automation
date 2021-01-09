@sanity
Feature: PMT parts kit info add, edit and delete
@Philips
Scenario: Adding Parts Kit Info
Given User will go to parts page and search partno
When User will click on KitInfo and Enter partno
And User will select des code & Language and Enter maintanence type & Qty
Then Use will Select Sold Separately & Qty Uom and Enter Description
And User will save data and Accept the alert
Then User will verify reocrd has shown in the below grid
@Philips
Scenario: Editing Parts Kit Info
Given User will click parts page and search partno
When User will click on KitInfo and click edit
And User will Change the Qty
Then User will save data and Accept alert
Then User will verify Changes shown in the below grid
@Philips
Scenario: Delete Parts Kit Info
Given User will click parts page and search for partno
When User will click on KitInfo and click Delete & Accept the alert
And User will Verify that record not shown in the below grid