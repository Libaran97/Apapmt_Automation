@sanity,@Automation
Feature: PMT Add and Edit Product group List
Description: User will add product groupmaster category & Ck one two three
@Regression
Scenario: Adding product Web Category 
Given User will mouse hover and choose the product group master page
When User will click on the add button and add a new category and order
Then User will successfully added and verify that the record has come in group

@Regression
Scenario: Editing product Web Category
Given User will mouse hover and choose the product group master page again
When User will click on the add button and add a new category and order with edit
Then User will successfully added and verify that the record has come in group edit

@Regression
Scenario: search Brand Master [PMT-139:Brand-search]
Given User will mouse hover and choose the Brand Master page
When User will click on the Search button and check the valid invalid empty search
Then User will successfully verify that the record has come 

#Scenario: Adding Sub product line master 
#Given User will mouse hover and choose the Sub product line master page again
#When User will click on the add Sub product line master given code and value
#Then User will successfully added and verify that the record has come in sub product line master

#Scenario: Editing Sub product line master 
#Given User will mouse hover and choose the Sub product line master page reagain
#When User will click on the edit Sub product line master change code and value with option
#Then User will successfully edited and verify that the record has come in sub product line master

@Regression
Scenario: search system (CK31) [PMT-130:Ck31 name search ]
Given User will mouse hover and choose the system (CK31) page
When User will search CK31 name and description
Then User will successfully verified CK31

@Regression
Scenario: search Assembly (CK32) [PMT-132:Assembly ck32-search dropdown]
Given User will mouse hover and choose the Assembly (CK32) page
When User will choose CK31and search ck32 name and description
Then User will successfully verified assembly CK32

@Regression
Scenario: Adding part# with created product category_MUL [PMT-133:Assembly ck32 name]
Given User will click on parts page and it should redirect to parts page_MUL
When User will click on the add buton and choose VMRS Code product category, sub category,part desc, product line_MUL
And User will enter the partNo and click save
Then User will successfully alert and verify the partNO thorugh partNO search_MUL

@Regression
Scenario: PMT Check parts Search 
Given User will the part page 
When User will Enter the partsnumber 
And User will click the search button 
Then User will verify the part# 

@Regression
Scenario: search Component (CK33)
Given User will mouse hover master then choose the component CK33 page
When User will choose compound ck33 name and description
Then User will successfully verified the Component CK33

#Scenario: search Component (CK33)
#Given User will mouse hover and choose the component (CK33) page
#When User will choose CK31 ck32 and search ck33 name and description
#Then User will successfully verified Component CK33





