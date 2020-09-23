@sanity
Feature: PMT Application Page

Scenario: Adding Aces Applicarion
Given User will click on the Application and Click add button
When User will select the dropdown and Choose Vehicle, Make & Model
And User will Enter the year
Then User will click Aces Engine Radio Button
And User will Select Engine Base in dropdown
Then User will successfully added
Then User will verify that the record has come


Scenario: Adding NonAces Applicarion
Given User will click on Application and Click add button
When User will select dropdown and Choose Vehicle, Make & Model
And User will Enter year
Then User will click non Aces Engine Radio Button
And User will Enter NonAces Engine Base details
Then User will successfully add
Then User will verify that NonAces record has come

Scenario: Editing Applicarion
Given User will click on Application page
When User will select dropdown to Choose Vehicle, Make & Model and Click search
And User will selectfilter Engine Base and enter search value and search
Then User will Click edit and change CC
And User will click Update Edited successfully
Then User will verify that Edited record has come
@ApplicationRelated
Scenario: Deleting Applicarion
Given User will click on ApplicationPage
When User will Choose Vehicle, Make & Model in dropdown and Click search
And User will selectfilter Engine Base and enter search value and search Button
And User will Click Delete and Accept alert
Then User will verify that NonAces record has Deleted or Not


Scenario: Adding Aces All engine Applicarion
Given User will click on Application and Click add
When User will select dropdown and Choose Vehicle, Make and Model
And User will Enter year in text box
Then User will select Aces Engine Radio Button
Then User will successfully added the Adding Aces All engine
Then User will verify that Aces All engine record has come

Scenario: Adding NonAces All year Application
Given User will click on Application and Click add Application
When User will select dropdown & Choose Vehicle, Make and Model
And User will Enter year in textbox
Then User will select AcesEngine Radio Button
Then User will successfully add the Adding NonAces All year
Then User will verify that NonAces All year record has come

Scenario: Adding NonAces Invalid year Application
Given User will click on Application and add Application
When User will Choose Vehicle, Make and Model in dropdown
And User will Enter invalid year in textbox
Then User will select Acesengine Radio Button
Then User will successfully add the Adding NonAces invalid year
Then User will verify that NonAces invalid year record has come

	
	
	
	