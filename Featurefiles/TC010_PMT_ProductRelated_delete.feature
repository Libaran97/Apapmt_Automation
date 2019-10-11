Feature: PMT delete Product Related

@ProductRelatedDelete
Scenario: deleting product Line
Given User will mousehover and choose the product Line page
When User will Enter product Line name in search box
And User will click Delete product Line and accept alert
Then User will Verify product Line is deleted or not
@ProductRelatedDelete
Scenario: deleting Parts Description
Given User will mousehover and choose the Parts Description page
When User will select Category and Sub Category in dropdown
And User will Enter Parts Description name in search box
Then User will click Delete Parts Description and accept alert
Then User will Verify Parts Description is deleted or not
@ProductRelatedDelete
Scenario: deleting Sub product category
Given User will mousehover and choose the Sub product category page
When User will select Category in drop down and Enter product catagory name in search box
And User will click Delete Sub product category and accept alert
Then User will Verify Sub product category is deleted or not
@ProductRelatedDelete
Scenario: deleting product category
Given User will mousehover and choose the product category page
When User will Enter product catagory name in search box
And User will click Delete product category and accept alert
Then User will Verify product category is deleted or not

