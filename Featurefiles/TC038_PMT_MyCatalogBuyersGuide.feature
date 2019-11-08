Feature: PMT [My Catalog - Buyers Guide] functionality testcases

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
	Given : Click the My Catalog menu link 
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Click the view application data button
	And : Verify the highlighted record
	And : Click the back button
	Then : Finally click the logout button
	
@sanitytest3		
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link 
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Click the view part data button
	And : Verify the part data details screen
	And : Click the back navigation button
	Then : Finally click the logout button
	
@sanitytest4	
Scenario: Check the [My Catalogs - Buyers Guide] Functionality [TC007]
	Given : Click the My Catalog menu link 
	When : Click the Buyers Guide submenu link 
	And : Enter the Part Number 
	And : Finally Click the Search button
	And : Generate and download the excel
	Then : Finally click the logout button