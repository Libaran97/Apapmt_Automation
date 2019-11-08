@Sanitycheck
Feature: PMT Reports Aces Invalid check

Scenario: Adding AcesInvalid application through buyers guide
Given User will go to parts page and search for a partno and will tie-up the application
When User will click on buyersguide and choose the vehicle, make, model & search
And User will choose an enginebase, Select Attributes Invalid data and click on save
Then User will verify the reocrd has shown in the below grid is Invalid

Scenario: Check AcesInvalid and Change to Valid
Given User will click Reports and select Aces Invalid
When User will choose version date, vehicle, make, model & search
And User will click Get Aces Value and capture the Value
Then User will Edit Application and change to Valid Application
Then User will goto parts page and validate application to verify application is changed to valid