@sanity,@Automation
Feature: PMT Equipment related List in Application master
Description: User will add Equipment related like equipment vehicl Tyep and group make & model

@Regression
Scenario: Adding Equipment Related vehicle type
Given User will mouse hover on Master and choose the Equipment vehicle type page
When User will click on the add button and will enter the new Equipment vehicle type and choose the equivalent ACES & save
Then User will verify the added record should be shown in Equipment vehicle grid

@Regression
Scenario: Editing Equipment Related vehicle type [PMT-145:Vehicle/Equipment type-Edit]
Given User will mouse hover on Master page and edit the Equipment vehicle type page
When User will click on the Edit button and will enter the new Equipment vehicle type and choose the equivalent ACES & save
Then User will verify the edited record should be shown in Equipment vehicle grid

@Regression
Scenario: Adding Equipment Related vehicle type group 
Given User will mouse hover on Master and choose the Equipment vehicle type group page
When User will click on the add button and will enter the Equipment vehicle type group and choose the equivalent ACES & save
Then User will verify the added record should be shown in Equipment vehicle type group grid

@Regression
Scenario: Editing Equipment Related vehicle type group
Given User will mouse hover on Master and edit the Equipment vehicle type group page
When User will click on the edit button and will enter the Equipment vehicle type group and choose the equivalent ACES & save
Then User will verify the edited record should be shown in Equipment vehicle type group grid

@Regression
Scenario: Adding Equipment Related Make
Given User will mouse hover on master and choose the make for equipment
When User will click on the add button and will choose the added Equipment vehicle type, enter the new make name and choose the equivalent ACES & save   
Then User will verify the added Equipment record should be shown in make grid 

@Regression
Scenario: Editing Equipment Related Make
Given User will mouse hover on master and edit the make for equipment
When User will click on the edit button and will enter Equipment vehicle type, enter the new make name and choose the equivalent ACES & save   
Then User will verify the edited Equipment record should be shown in make grid 

@Regression
Scenario: Adding Equipment Related Model
Given  User will mouse hover on master and choose the model for equipment 
When User will mouse hover on master and choose the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save
Then User will successfully Equipment added and verify that the record has come

@Regression
Scenario: Editing Equipment Related Model
Given  User will mouse hover on master and edit the model for equipment 
When User will mouse hover on master and edit the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save
Then User will successfully Equipment edited and verify that the record has come


