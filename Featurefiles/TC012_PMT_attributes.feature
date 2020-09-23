@sanity
Feature: PMT Product attribute
Description: User will add and delete the part size for the partno

Scenario: Adding the Product attribute data
Given User will go to parts page and search for partno to add product attribute
When User will go to product attribute page and check the attibute data for that partno and save
Then User will check the product attribute is checked and verify

Scenario: editing the Product attribute data
Given User will go to parts page and search for partno to edit product attribute
When User will go to product attribute page and check the attibute data for edit that partno and save
Then User will check the product attribute edit is checked and verify

Scenario: Delete the Product attribute data
Given User will go to parts page and search for partno to unchecking the product attribute
When User will goto product attribute page and delete the product attribute data for that part and save
Then User will verify the changes done in product attribute

 