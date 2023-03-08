@sanity,@Automation
Feature: PMT [My Catalog - Attribute Search functionality] testcases

@Philips5001
Scenario: Adding the Product mycatalog attribute data
Given User will go to the parts page and search for partno to add product attribute
When User will go to the product attribute page and check the attibute data for that partno and save
#Then User will check the product attribute is checked then verify

@Philips5001
Scenario: Search Description and Select the my catalog attribute data
Given User will go to My catalog click Attibute page
When Select part Description and Click Attribute data check box
And Click submit button and Click part# in new grid
Then Check the navigated page and verify the data

@Philips5001
Scenario: Delete the Product mycatalog attribute data
Given User will go to the parts page and search for partno to unchecking the product attribute
When User will go to product attribute page and delete the product attribute data for that part and save
And User will verify the changes done product attribute
#Then Check the deleted attribute data in My Catalog







