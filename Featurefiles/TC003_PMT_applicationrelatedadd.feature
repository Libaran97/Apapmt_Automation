Feature: PMT MasterApplication related List
Description: User will add Application related like vehicle, make & model

Scenario: Adding Application Related vehicle
Given User will mouse hover on Master and choose the vehicle type page
When User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save
Then User will verify the added record should be shown in vehicle grid

Scenario: Adding Application Related vehicle group
Given User will mouse hover on Master and choose the vehicle type group page
When User will click on the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save
Then User will verify the added record should be shown in vehicle type group grid

Scenario: Adding Application Related Make
Given User will mouse hover on master and choose the make 
When User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save   
Then User will verify the added record should be shown in make grid


Scenario: Adding Application Related Model
Given  User will mouse hover on master and choose the model 
When User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save
Then User will successfully added and verify that the record has come.


Scenario: Editing Application Related Model
Given User Will Mouse over on master and choose model
When User will search Model and click edit
And User will edit model name and click save and accept alert
Then User will Verify the Model is edited


Scenario: Editing Application Related Make
Given User will mouse over on master and choose the make 
When User will select make, Edit make name & save   
Then User will verify the Edited record should be shown in make grid


Scenario: Delete Application Related Model
Given User Will Mouse over on master and choose Model for delete
When User will search Model, click delete and accept alert
Then User will Verify the Model is deleted or not

Scenario: DeleteApplication Related Make
Given User will mouse over on master and choose the make for delete
When User will select make, delete make name & save   
Then User will verify the make is deleted or not
