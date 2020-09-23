@sanity
Feature: PMT PIES Interchange
Description: User will add Interchange



Scenario: Adding Inetrchange for a part#
Given User will go to parts page and search for a part#
When User will click on the interchange frame, choose interchange name dropdown, enter interchange part# and click save
Then User will see successfull alert and verify the record to be shown in the grid below


Scenario: Editing inetrchange Test case
Given User will go to parts page and search for the part# to edit data
When User will click on interchange frame and will edit the notes & saved
Then User will see successfull alert and verify the record should be edited successfully


Scenario: Deleting Interchange for a part#
Given User will go to parts page and search for a part# to delete that data
When User will click on interchange frame and will delete the added or available record 
Then User will see successfull alert and verify the record has been deleted or not
