@sanity
Feature: PMT Add and Edit Product List
Description: User will add product category,sub category & part description
@Philips
Scenario: Adding product category
Given User will mouse hover and choose the product category page
When User will click on the add button and add a new category
And User will enter the category name and choose the equivalent PIES category
Then User will successfully added and verify that the record has come
@Philips
Scenario: Adding product Edit category
Given User will mouse hover and choose the product category again page
When User will click on the Edit button with already added of product category
And User will doesnot change the category name and change the equivalent PIES category
Then User will successfully edited and verify that the record has come

@Philips
Scenario: Adding product sub category
Given User will go to master and choose product sub category
When User will click on the add button and choose the category drop down list 
And User will enter the sub category name and choose the equivalent and save button is clicked
Then User will successfully added and verify the record has come in the sub category grid
@Philips
Scenario: Adding product Edit sub category
Given User will go to master and choose product sub category again page
When User will click on the Edit button and choose the category drop down list 
And User will enter the sub category name and change the equivalent and save button is clicked
Then User will successfully edited and verify the record has come in the sub category grid
@Philips
Scenario: Adding part description 
Given User will go to master and choose part description
When User will click on the add button and choose the category & sub category drop down list 
And User will enter the part description name and save button is clicked
Then User will see successfully added and verify the record has come in the description grid

@Philips
Scenario: Adding product Line
Given User will go to master and choose product line
When User will click on add button and enter the line code and line name
Then User will see successfully alert and verify the record has come in the grid
@Philips
Scenario: Adding Edit product Line
Given User will go to master and choose product line again
When User will click on edit button and enter the line code and line name
Then User will see successfully alert and edit verify the record has come in the grid 
@Philips
Scenario: Adding Custom Attributes
Given User will goto master and choose Custom Attributes
When User will click on add and enter Custom Attribute Name
And User will select Data Type, enter Min & MaxLength and select Parts Description
Then User will Click save Accept Alert and Verify the record has come in the grid
@Philips
Scenario: Editing part description 
Given User will go to master and choose part description again
When User will click on the edit button and choose the category & sub category drop down list 
And User will change the part description name,equivalent aces and save button is clicked
Then User will see successfully edited and verify the record has come in the description grid
@Philips
Scenario: Editing Custom Attributes
Given User will goto master and choose Custom Attributes agin
When User will click on edit and enter Custom Attribute Name
And User will change Data Type, enter Min & MaxLength and Parts Description
Then User will check edit save Accept Alert and Verify the record has come in the grid





