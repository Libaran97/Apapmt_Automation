@sanity,@Automation
Feature: My catalog Interchange
  

@Philips5001
Scenario: Adding Interchange in part page
Given User go to the parts page and Search part#
When User will click the interchange sub module and choose Interchange name,Enter Interchange part# and save part
Then User will see successfull alert and verify the record 

@Philips5001
Scenario: Search Interchange part in My catalog
Given User go to the my catalog interchange and search Interchange part#
#When Click part number check All in one page
#Then Back to Interchnage page

@Philips5001
Scenario: Deleting Interchange in part page
Given User will go to the parts page and Search part#
When User will go to interchange sub module and click delete
Then User will handle the deleted alert and verify the record

@Philips5001
Scenario: Search Deleted part search
Given User will go to my catalog interchange and Interchange part#
When  user will not see the deleted part# search
Then handle the alert and print the alert text