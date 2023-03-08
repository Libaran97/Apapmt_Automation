@sanity,@Automation
Feature: PMT Digital Asset
Description: User will add the part image in digital asset tab

@Regression
Scenario: Adding Image
Given User will click on parts page and enter the part# and click on the digital asset tab
When User will add the image enter the sort by value and save
Then User will add succesfully and verify 

@Regression
Scenario: Editing Image
Given User will click on parts page and enter the part# and click on the digital asset Segment
When User will click the edit and add orientation view and click save button 
Then User will add succesfully and verify the updated Asset

@Regression
Scenario: Deleting Image
Given User will go to parts page and choose digital asset tab to delete an image
When User will click on delete icon
Then User will delete successfully and verify

