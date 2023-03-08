@sanity,@Automation
Feature: PMT Add Product List_MUL
Description: User will add product category,sub category & part description_MUL
@Regression
Scenario: Adding product category_MUL [PMT-3:Product category-Add]
Given User will mouse hover and choose the product category page_MUL
When User will click on the add button and add a new category_MUL
And User will enter the category name and choose the equivalent PIES category_MUL
Then User will successfully added and verify that the record has come_MUL

@Regression
Scenario: Adding product sub category_MUL [PMT-4:Product sub category-Add]
Given User will go to master and choose product sub category_MUL
When User will click on the add button and choose the category drop down list_MUL
And User will enter the sub category name and choose the equivalent and save button is clicked_MUL
Then User will successfully added and verify the record has come in the sub category grid_MUL
#@Philips
#Scenario: Adding part description_MUL [PMT-5:Product description -Add]
#Given User will go to master and choose part description_MUL
#When User will click on the add button and choose the category & sub category drop down list_MUL
#And User will enter the part description name and save button is clicked_MUL
#Then User will see successfully added and verify the record has come in the description grid_MUL

@Regression
Scenario: Adding New Parts description engine oil[PMT-5:Product description -Add]
Given User will go to master and choose parts descriptions 
When User will click on the add button and choose the category and sub category part descriptions engine oil
And User will select equivalent aces name and save button is clicks engine oil
#Then User will see successfully added and verify the record has come descriptions grid engine oil


@Regression
Scenario: Adding product Line_MUL[PMT-6:Product line-Add]
Given User will go to master and choose product line_MUL
When User will click on add button and enter the line code and line name_MUL
Then User will see successfully alert and verify the record has come in the grid_MUL
#@Philips
#Scenario: Adding Custom Attributes_MUL
#Given User will goto master and choose Custom Attributes_MUL
#When User will click on add and enter Custom Attribute Name_MUL
#And User will select Data Type, enter Min & MaxLength and select Parts Description_MUL
#Then User will Click save Accept Alert and Verify the record has come in the grid_MUL

@Regression
Scenario: Adding part# with created product category_MUL 
Given User will click on parts page and it will redirect to parts page_MUL
When User will click on the add buton and choose product category, sub category,part desc, product line_MUL
And User will enter the part# and click on save_MUL
Then User will see successfull alert and verify the part# thorugh part# search_MUL

