@sanity,@Automation
Feature: PMT Interchange Related
Description: User will add Application related like vehicle, make & model

@Regression
Scenario: Adding InterchangeName [PMT-10:Interchange name-Add]
Given User will mouse over master and click Interchange Name
When User will click Add Button and Enter Interchange name
And User will select checkbox Interchange Type Name and enter Brand AAIA Name
Then User will click save and accept the alert 
Then User will verify InterchangeName is add or not	

@Regression
Scenario: Edit InterchangeName [PMT-159:Interchange name- Edit]
Given User will select master and click Interchange Name
When User will select interchange, Click edit and edit name and code
And User will save and conform
Then User will verify edit intchancename

@Regression
Scenario: Adding Interchange Part#  [PMT-11:Interchange Part#-Add]
Given User will mouse over master and click Interchange Part#
When User will click Add Button and Select Interchange name
And User will Enter the Interchange Part# and Select grade level
#And User will select Type code and enter internal & interchange notes
Then User will click save button and accept the alert
Then User will verify Interchange Part# is added or not

@Regression
Scenario: Edit InterchangePart# [PMT-160:Interchange Part#-Edit]
Given User will select master and click Interchange Part#
When User will select&search interchange, Click edit and edit Intpart
And User will save and conform edit intpart
Then User will verify edit intchancepart


