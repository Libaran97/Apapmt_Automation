@sanity,@Automation
Feature: PMT Extended Info
Description: User will add the part extended info details

@Regression
Scenario: Adding Extended information
Given User will go to parts page and search for partno 
When User will go to extended info and add a record 
Then User will added successfully the info and verify

@Regression
Scenario: Deleting eended information
Given User will go to part page and search for partno to delete extended info record
When User will landed in extended info page and will delete a record
Then User will delete successfully and verify whether the record is deleted


