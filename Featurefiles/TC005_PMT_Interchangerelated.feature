@sanity
Feature: PMT Interchange Related
Description: User will add Application related like vehicle, make & model
@Philips
Scenario: Adding InterchangeName
Given User will mouse over master and click Interchange Name
When User will click Add Button and Enter Interchange name
And User will select checkbox Interchange Type Name and enter Brand AAIA Name
Then User will click save and accept the alert 
Then User will verify InterchangeName is add or not	
@Philips
Scenario: Edit InterchangeName
Given User will select master and click Interchange Name
When User will select interchange, Click edit and edit name and code
And User will save and conform
Then User will verify edit intchancename
@Philips
Scenario: Adding Interchange Part#
Given User will mouse over master and click Interchange Part#
When User will click Add Button and Select Interchange name
And User will Enter the Interchange Part# and Select grade level
And User will select Type code and enter internal & interchange notes
Then User will click save button and accept the alert
Then User will verify Interchange Part# is added or not
@Philips
Scenario: Edit InterchangePart#
Given User will select master and click Interchange Part#
When User will select&search interchange, Click edit and edit Intpart
And User will save and conform edit intpart
Then User will verify edit intchancepart

