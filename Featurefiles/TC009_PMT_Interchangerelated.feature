@Sanitycheck
Feature: PMT Interchange Related
Description: User will add Application related like vehicle, make & model



Scenario: Adding InterchangeName
Given User will mouse over master and click Interchange Name
When User will click Add Button and Enter Interchange name
And User will select checkbox Interchange Type Name and enter Brand AAIA Name
Then User will click save and accept the alert 
Then User will verify InterchangeName is add or not	

Scenario: Adding Interchange Part#
Given User will mouse over master and click Interchange Part#
When User will click Add Button and Select Interchange name
And User will Enter the Interchange Part# and Select grade level
And User will select Type code and enter internal & interchange notes
Then User will click save button and accept the alert
Then User will verify Interchange Part# is added or not

Scenario: Deleting Interchange Partno
Given User will mouse over master and click Interchange Partno
When User will Select Interchange Name and search Interchange Partno
And User will click delete and accept the alert 
Then User will verify Interchange Partno is deleted or not

Scenario: Deleting InterchangeName
Given User will mouse over emaster and click Interchange Name
When User search InterchangeName in searchBox
And User will click delete and accept alert 
Then User will verify InterchangeName is deleted or not