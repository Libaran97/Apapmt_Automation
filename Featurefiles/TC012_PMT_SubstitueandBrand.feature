Feature: PMT Part substitute
Description: User will add and del the substitute for the partno


Scenario: Checking on the substitue add
Given User will go to parts page and search for partno to add subs
When User will go to substitute page and check the subs for that partno and save
Then User will check the subs is checked and verify

Scenario: Checking on the substitue del
Given User will go to parts page and search for partno to del subs
When User will go to substitute page and check the subsdel for that partno and save
Then User will check the subsdel is checked and verify


 