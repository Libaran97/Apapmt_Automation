@sanity
Feature: PMT [My Catalog - Applications] functionality scenarios


#Scenario: Adding part# with created product category
#Given User will click on parts page and it should redirect to parts page08
#When User will click on the add buton and choose product category and sub category and part des and product line08
#And User will enter the partNo btu click save08
#Then User will successfully alert and verify the partNO08


#Scenario: Adding application through buyers guide
#Given User will go to parts page then search for a part# and will tie-up the application
#When User will click on buyersguide and choose the vehicle, make, model & click search 
#And User will choose an enginebase , click on save
#Then User will see successfull alert and verify the record has shown in the below grid

@Philips5001
Scenario:  Check the [My Catalogs - Applications] Functionality [TC041]
	Given : Click the My Catalog menu link SP
	When : Click the Application submenu link SP
	And : Select the Make Model Year Status from the dropdown SP
	And : Click the Search button SP
	And : Click the View Part Data button SP
	And : Verify the Highlighted record SP
	And : Click the Back navigation button SP
	Then : Finally Click The Logout button SP
	

#Scenario: deleting partno
#Given User will mousehover, choose the partno page
#When User will search partno in search box and delete with accept alert
#Then User will Verify partnu is deleted