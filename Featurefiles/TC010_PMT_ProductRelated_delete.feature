Feature: PMT delete Product Related

Scenario: deleting Related partno[Engine oil oriented]
Given User will mousehover and choose the partno page
When User will search the partno in search box and delete with accept alert
Then User will Verify partno is deleted

Scenario: Deleting Interchange Partno
Given User will mouse over master and click Interchange Partno
When User will Select Interchange Name and search Interchange Partno
And User will click delete and accept the alert 
Then User will verify Interchange Partno is deleted or not

Scenario: Deleting InterchangeName
Given User will mouse over emaster and click Interchange Name
When User search InterchangeName in searchBox
And User will click delete and accept alert 
Then User will verify InterchangeName is deleted or not

Scenario: Delete Application Related Model
Given User Will Mouse over on master and choose Model for delete
When User will search Model, click delete and accept alert
Then User will Verify the Model is deleted or not

Scenario: DeleteApplication Related Make
Given User will mouse over on master and choose the make for delete
When User will select make, delete make name & save   
Then User will verify the make is deleted or not

Scenario: Delete Application Related vehicle group
Given User will mouse over on Master and choose the vehicle type group for delete
When User will select vehicle group, click Delete and accept alert
Then User will verify the vehicle type group deleted or not

Scenario: Delete Application Related vehicle
Given User will mouse over on Master and choose the vehicle type page for delete
When User will Select vehicle type, Click Delete and Accept Alert
Then User will verify the vehicle type deleted or not

Scenario: deleting Equipment Related Model 
Given User will mousehover and choose the model page
When User will Enter modelname in search box and accept alert
Then User will Verify model is deleted

Scenario: deleting Equipment Related Make 
Given User will mousehover and choose the Make page
When User will Enter Makename in search box and accept alert
Then User will Verify Make is deleted

Scenario: deleting Equipment Related vehicle type group 
Given User will mousehover and choose the equipment vehicle type group
When User will Enter equipment vehicle type group in search box and accept alert
Then User will Verify equipment vehicle type group is deleted

Scenario: deleting Equipment Related vehicle
Given User will mousehover and choose the equipment vehicle
When User will Enter equipment vehicle in search box and accept alert
Then User will Verify equipment vehicle is deleted

Scenario: deleting product Line
Given User will mousehover and choose the product Line page
When User will Enter product Line name in search box
And User will click Delete product Line and accept alert
And User will another delet product line and accept alert
Then User will Verify product Line is deleted or not

Scenario: deleting custom attribute
Given User will mousehover and choose the custome attribute page
When User will Enter cust attribute name in search box and delete the attibute with part desc
And User will click accept alert in custom attribute page twice
Then User will Verify custom attribute is deleted

Scenario: deleting Parts Description
Given User will mousehover and choose the Parts Description page
When User will select Category and Sub Category in dropdown
And User will Enter Parts Description name in search box
And User will click Delete Parts Description and accept alert
Then User will Verify Parts Description is deleted or not

Scenario: deleting Parts Description
Given User will mousehover and choose the Parts Description page
When User will select Category and Sub Category in dropdown
And User will Enter Parts Description name in search box
And User will click Delete Parts Description and accept alert
Then User will Verify Parts Description is deleted or not

Scenario: deleting Sub product category
Given User will mousehover and choose the Sub product category page
When User will select Category in drop down and Enter product catagory name in search box
And User will click Delete Sub product category and accept alert
Then User will Verify Sub product category is deleted or not

Scenario: deleting product category
Given User will mousehover and choose the product category page
When User will Enter product catagory name in search box
And User will click Delete product category and accept alert
Then User will Verify product category is deleted or not

Scenario: deleting product group master
Given User will mousehover and choose the product group master page
When User will Enter product group master name in search box
Then User will Verify product group master is deleted or not

Scenario: deleting Sub product line master
Given User will mousehover and choose the Sub product line master page
When User will Enter Sub product line master name in search box
Then User will Verify Sub product line master is deleted or not

Scenario: Uncheck the parttype Component
Given User will mousehover and choose the Component page
When User will uncheck the Component parttype in search box
Then User will Verify Component parttype 






