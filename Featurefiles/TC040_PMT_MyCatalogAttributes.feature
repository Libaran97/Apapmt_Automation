Feature: PMT [My Catalog - Interchange] functionality testcases

@sanitytest19
Scenario: Check the [My Catalogs - Attributes Functionality] [TC014] [PMT : 01-19(2)]
	Given : Click The My Catalog Menu Link TC014
	When : Click The Attributes Submenu Link TC014
	And : Choose The Part Description TC014
	And : Choose The Attribute TC014
	And : Click The Submit Button TC014
	And : Click The Part Number TC014
	And : Check The Attributes In AllInOnePage TC014
	Then : Finally Click The Logout Button TC014
	
@sanitytest20
Scenario: Check the [My Catalogs - Attributes Functionality] [TC014] [PMT : 01-19(3)]
	Given : Click The My Catalog Menu Link2 TC014
	When : Click The Attributes Submenu Link TC014
	And : Choose The Part Description TC014
	And : Choose The Attribute TC014
	And : Click The Submit Button TC014
	And : Click The Generate Excel Button TC014
	Then : Finally Click The Logout Button TC014
	
@sanitytest21
Scenario: Check the [My Catalogs - Attributes Functionality] [TC014] [PMT : 01-19(4)]
	Given : Click The My Catalog Menu Link2 TC014
	When : Click The Attributes Submenu Link TC014
	And : Choose The Part Description2 TC014
	And : Click The Select All Checkbox TC014
	And : Click The Submit Button TC014
	And : Verify The Attribute Name And Value TC014
	Then : Finally Click The Logout Button TC014
	
@sanitytest22
Scenario: Check the [My Catalogs - Attributes Functionality] [TC014] [PMT : 01-19(5)]
	Given : Click The My Catalog Menu Link2 TC014
	When : Click The Attributes Submenu Link TC014
	And : Choose The Part Description TC014
	And : Select All The Checkboxes TC014
	And : Click The Submit Button TC014
	And : Verify All The Attributes And Their Values TC014
	Then : Finally Click The Logout Button2 TC014