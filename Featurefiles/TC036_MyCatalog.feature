Feature: PMT [My Catalog - Interchange] functionality testcases

@sanitytest1
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Click the view application data button
	And : Verify the highlighted record
	And : Click the back button
	And : Click the view part data button
	And : Verify the part data details screen
	And : Click the back navigation button
	And : Generate and download the excel
	Then : Finally click the logout button
	
@sanitytest2
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link1a
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Click the view application data button
	And : Verify the highlighted record
	And : Click the back button
	Then : Finally click the logout button
	
@sanitytest3		
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link1b
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Click the view part data button
	And : Verify the part data details screen
	And : Click the back navigation button
	Then : Finally click the logout button
	
@sanitytest4	
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link1c
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Generate and download the excel
	Then : Finally click the logout button
	
@sanitytest5
Scenario: Check the [My Catalogs - Applications] Functionality [TC008]
	Given : Click the My Catalog2 menu link
	When : Click the Application2 submenu link 
	And : Select the Make2 name from the dropdown
	And : Click the Search2 button
	And : Click the View Application Data2 button
	And : Verify the Highlighted2 record
	And : Click the Back2 button
	Then : Finally Click The Logout2 button
	
@sanitytest6
Scenario: Check the [My Catalogs - Applications] Functionality [TC008]
	Given : Click the My Catalog2 menu link
	When : Click the Application2 submenu link 
	And : Select the Make2 name from the dropdown
	And : Click the Search2 button
	And : Click the View Part Data2 button
	And : Verify the Part Data Details2 screen
	And : Click the Back navigation2 button
	Then : Finally Click The Logout2 button

@sanitytest7
Scenario: Check the [My Catalogs - Interchange] Functionality [TC009]
	Given : Click the My Catalog3 menu link
	When : Click the Interchange submenu link 
	And : Enter the Interchange Name
	And : Click the Interchange Search button
	And : Click the Part Number in the grid
	And : Check whether the application is redirected to AllInOne page
	And : Click the Back navigation3 button
	Then : Finally Click The Logout3 button	
	
@sanitytest8
Scenario: Check the [My Catalogs - Interchange] Functionality [TC010]
	Given : Click the My Catalog4 menu link
	When : Click the Interchange2 submenu link 
	And : Click the Part Description link
	And : Click the Interchange OE link
	And : Click the Parts Number link
	And : Check whether the application is redirected to AllInOne page2
	And : Click the Back navigation4 button
	Then : Finally Click The Logout4 button
	
@sanitytest9
Scenario: Check the [My Catalogs - Interchange] Functionality [TC011]
	Given : Click the My Catalog5 menu link
	When : Click the Interchange3 submenu link 
	And : Click the Interchange Search2 button
	And : Verify the error message
	Then : Finally Click The Logout5 button
	
@sanitytest10
Scenario: Check the [My Catalogs - Interchange] Functionality [TC012]
	Given : Click the My Catalog6 menu link
	When : Click the Interchange4 submenu link 
	And : Enter the Interchange Name2
	And : Select the BeginsWith option
	And : Click the Interchange Search3 button
	And : Verify the fields in the grid
	Then : Finally Click The Logout6 button
	
@sanitytest11
Scenario: Check the [My Catalogs - Interchange] Functionality [TC012]
	Given : Click the My Catalog6a menu link
	When : Click the Interchange4 submenu link 
	And : Enter the Interchange Name2
	And : Select the Contains option
	And : Click the Interchange Search3 button
	And : Verify the fields in the grid
	Then : Finally Click The Logout6 button
	
@sanitytest12
Scenario: Check the [My Catalogs - Interchange] Functionality [TC012]
	Given : Click the My Catalog6a menu link
	When : Click the Interchange4 submenu link 
	And : Enter the Interchange Name2
	And : Select the EndsWith option
	And : Click the Interchange Search3 button
	And : Verify the fields in the grid
	Then : Finally Click The Logout6 button
	
@sanitytest13
Scenario: Check the [My Catalogs - Interchange] Functionality [TC012]
	Given : Click the My Catalog6a menu link
	When : Click the Interchange4 submenu link 
	And : Enter the Interchange Name2
	And : Select the Equals option
	And : Click the Interchange Search3 button
	And : Verify the fields in the grid
	Then : Finally Click The Logout7 button
	
@sanitytest14
Scenario: Check the [My Catalogs - Interchange] Functionality [TC012]
	Given : Click the My Catalog6a menu link
	When : Click the Interchange4 submenu link 
	And : Enter the Interchange Name2
	And : Click the Interchange Search3 button
	And : Click the Part Number2 in the grid
	And : Verify InterchangePart In AllInOne Screen
	Then : Finally Click The Logout7 button
	
@sanitytest15
Scenario: Check the [My Catalogs - Interchange] Functionality [TC013]
	Given : Click the My Catalog7 menu link
	When : Click the Interchange5 submenu link
	And : Enter the Interchange Name22
	And : Click the Interchange Search4 button
	And : Verify the error message2
	Then : Finally Click The Logout8 button
	
@sanitytest16
Scenario: Check the [My Catalogs - Interchange] Functionality [TC013]
	Given : Click the My Catalog7 menu link
	When : Click the Interchange5 submenu link
	And : Enter the Interchange Name3
	And : Click the Interchange Search4 button
	Then : Finally Click The Logout8 button
	
@sanitytest17
Scenario: Check the [My Catalogs - Interchange] Functionality [TC013]
	Given : Click the My Catalog7 menu link
	When : Click the Interchange5 submenu link
	And : Enter the Interchange Name4
	And : Click the Interchange Search5 button
	Then : Finally Click The Logout8 button
	
@sanitytest18
Scenario: Check the [My Catalogs - Interchange] Functionality [TC013]
	Given : Click the My Catalog7 menu link
	When : Click the Interchange5 submenu link
	And : Sort and compare Part Description details
	Then : Finally Click The Logout9 button
