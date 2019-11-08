Feature: PMT [Quick Add] functionality testcases

@sanitytest23
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(1)]
	Given : Click The Parts Menu Link First TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description TC015
	And : Select The Product Line TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Click The Save Button TC015
	And : Click The Parts Menu Link TC015
	And : Search By Part Number TC015
	And : Verify The Part Number TC015
	And : Delete The Part Number TC015
	Then : Finally Click The Logout Button TC015

@sanitytest24
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(2)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description TC015
	And : Select The Product Line TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Enter The Minimum Order Quantity TC015
	And : Select The Minimum Order Quantity UOM TC015
	And : Select The Item Level GTIN Qualifier TC015
	And : Enter The GTIN Number TC015
	And : Select The Status Code TC015
	And : Click The Save Button TC015
	And : Click The Parts Menu Link TC015
	And : Search By Part Number TC015
	And : Verify The Part Number TC015
	Then : Finally Click The Logout Button TC015	

	
@sanitytest25
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(3)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description TC015
	And : Select The Product Line TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Click The Save Button TC015
	And : Click The Cancel Button And Logout TC015
	
@sanitytest26
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(4)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description2 TC015
	And : Select The Product Line2 TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Click The Save Button TC015
	And : Click An Option TC015
	And : Print The Description From AllInOne Page TC015
	Then : Finally Click The Logout Button TC015
	
@sanitytest27
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(5)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description2 TC015
	And : Select The Product Line2 TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Enter The Minimum Order Quantity TC015
	And : Select The Minimum Order Quantity UOM TC015
	And : Select The Item Level GTIN Qualifier TC015
	And : Enter The GTIN Number TC015
	And : Select The Status Code TC015
	And : Click The Cancel Button TC015
	And : Verify The Contents In Parts Page TC015
	Then : Finally Click The Logout Button TC015	
	
@sanitytest28
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(6)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Click The Save Button2 TC015
	And : Click The Cancel Button And Logout TC015
	
@sanitytest29
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(7)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description TC015
	And : Select The Product Line TC015
	And : Clear The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Click The Save Button3 TC015
	And : Click The Cancel Button And Logout TC015
	
@sanitytest30
Scenario: Check the [Quick Add Functionality] [TC015] [PMT : 01-24(7)]
	Given : Click The Parts Menu Link TC015
	When : Click The Quick Add Button TC015
	And : Enter The Part Number TC015
	And : Select The Part Description TC015
	And : Select The Product Line TC015
	And : Enter The Quantity TC015
	And : Select The Quantity UOM TC015
	And : Select The Minimum Order Quantity UOM TC015
	And : Click The Save Button4 TC015
	And : Click The Cancel Button And Logout Last TC015
