Feature: PMT Application Page

@productrelated1
Scenario: Adding Aces Applicarion
Given User will click on the Application and Click add button
When User will select the dropdown and Choose Vehicle, Make & Model
And User will Enter the year
Then User will click Aces Engine Radio Button
And User will Select Engine Base in dropdown
Then User will successfully added
Then User will verify that the record has come

@productrelated1
Scenario: Adding NonAces Applicarion
Given User will click on Application and Click add button
When User will select dropdown and Choose Vehicle, Make & Model
And User will Enter year
Then User will click non Aces Engine Radio Button
And User will Enter NonAces Engine Base details
Then User will successfully add
Then User will verify that NonAces record has come
@productrelated1
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
	
	
	