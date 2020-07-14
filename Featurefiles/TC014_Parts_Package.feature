Feature: PMT Parts Package Add, Edit and Delete

Scenario: Adding Package in old parts page
Given User will go to parts page and search for a partno
When User will click on Package and select Package UOM dropdown
And User will Enter Quantity, height, width and Length
And User will click save and Accept the alert
Then User will verify the reocrd has shown in the below grid 

Scenario: Editing Package in old parts page
Given User will go to parts page and search for partno in Search box
When User will click on Package and Click Edit Button
And User will Edit Quantity and save accept alert
Then User will verify the Edit reocrd has shown in the below grid 

Scenario: Deleting  Package in old parts page
Given User will go to parts page and search for the partno
When User will click on Package and Click Delete Button Accept Alert
And User will verify the reocrd has not shown in the below grid


