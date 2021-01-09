@sanity
Feature: PMT Parts ListAll and Dropped Part#
@Philips
Scenario: Create part no for copy appparts
Given User will click on parts page and it will redirect to parts page1
When User will click on the add buton and choose product category, sub category,part desc, product line1
And User will enter the part# and click on save1
Then User will see successfull alert and verify the part# thorugh part# search1
@Philips
Scenario: Dropped PartNo With NoApplicarion
Given User will click Reports and click Dropped Part#
When User will select Description, Reason NoApplicarion and click search
And User will Verify the parts number
@Philips
Scenario: Edit Parts in List all
Given User will click parts page and click listall button
When User will Select Category, sub category, part description, Product line and Click search
And User will Search for part number and click edit
Then User will Verify page redirect to Allinone page or not

#Scenario: Delete parts in List all page
#Given User will click parts button and click listall button
#When User will Select Category, sub category, part description, Product line and Click search for Delete
#And User will Search for part number and click delete
#Then User will Verify the part is deleted or not
@Philips
Scenario: Duplicate the parts in List all page
Given User will Click parts and list all page
When User will Select Dropdown Category, sub category, part description, Product line and Click search
And User will Search for part number and Duplicate the part
Then User will Verify duplicate part no is added or not

@Philips
Scenario: Duplicate the Appparts in List all page
Given User will Click parts page and list all page for Copy Appparts
When User will Select Dropdown Category, sub category, part description, Product line and Click search for Copy Appparts
And User will Search for part number and Copy Appparts to other partno
Then User will Verify Copy Appparts to other partno is added or not
@Philips
Scenario: Dropped PartNo With ACES Unmapped
Given User will click Reports and click Dropped Partno
When User will select Description, Reason ACES Unmapped and click search
And User will Verify ACES Unmapped parts number

