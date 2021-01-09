@sanity
Feature: PMT Part substitute and brand
Description: User will add and del the substitute for the partno
@Philips
Scenario: Checking on the substitue add
Given User will go to parts page and search for partno to add subs
When User will go to substitute page and check the subs for that partno and save
Then User will check the subs is checked and verify
@Philips
Scenario: Checking on the substitue del
Given User will go to parts page and search for partno to del subs
When User will go to substitute page and check the subsdel for that partno and save
Then User will check the subsdel is checked and verify
@Philips
Scenario: Checking on the brand add
Given User will go to parts page and search for partno to add brand
When User will go to brand page and check the brand for that partno and save
Then User will check the brand is checked and verify
@Philips
Scenario: Checking on the brand del
Given User will go to parts page and search for partno to del brand
When User will go to brand page and check the branddel for that partno and save
Then User will check the branddel is checked and verify
@Philips
Scenario: Checking on the brand notdel
Given User will go to parts page and search for partno to notdel brand
When User will go to brand page and check the brandnotdelfor that partno and save
Then User will check the brandnotdel is checked and verify
@Philips
Scenario: Checking on the Hazardous Material add
Given User will go to parts page and search for partno to Hazardous Material
When User will go to Hazardous Material page and check the Hazardous Material that partno and save
Then User will check the Hazardous Material is checked and verify


 