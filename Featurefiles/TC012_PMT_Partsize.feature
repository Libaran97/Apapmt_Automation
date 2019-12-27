@Sanitycheck
Feature: PMT Part Size
Description: User will add the part size for the partno



Scenario: Checking on the part size
Given User will go to parts page and search for partno to add partsize
When User will go to partsize page and check the size for that partno and save
Then User will check the size is checked and verify


Scenario: Unchecking the given part size
Given User will go to parts page and search for partno to unchecking the partsize
When User will goto partsize page and unceck the size for that part and save
Then User will verify the changes done in partsize

 