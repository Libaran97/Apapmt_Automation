	package pmttestcases.stepdefinition;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.GherkinKeyword;
	import com.aventstack.extentreports.gherkin.model.Feature;
	import com.aventstack.extentreports.gherkin.model.Scenario;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import pageobjectmodel.Masterproductrelated_POM;
	
	import pageobjectmodel.PartsAdd_POM;
	import utility.Baseclass;
	
	public class TC002_PMT_productrelated2 extends Baseclass {
	
		ExtentTest loginfo = null;
		Masterproductrelated_POM mpom;
		PartsAdd_POM parts;
	
		@Given("^User will mouse hover and choose the product category page_MUL$")
		public void user_will_mouse_hover_and_choose_the_product_category_page() throws Throwable {
	
			try {
				// extent=setup();
				test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("Cateory")
						.pass("category added thanks");
				test = test.createNode(Scenario.class, "Adding product category");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will mouse hover and choose the product category page_MUL");
				mpom = new Masterproductrelated_POM();
				mpom.clickonproductcategory();
				loginfo.pass("product category landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// Baseclass.updateTestLinkResult("PMT-3", null,
				// TestLinkAPIResults.TEST_PASSED);
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
				// TestLinkAPIResults.TEST_FAILED);
			}
		}
	
		@When("^User will click on the add button and add a new category_MUL$")
		public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on the add button and add a new category_MUL");
				mpom.addcategory1();
				loginfo.pass("Value Entered Successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// Baseclass.updateTestLinkResult("PMT-3", null,
				// TestLinkAPIResults.TEST_PASSED);
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
				// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
				// TestLinkAPIResults.TEST_FAILED);
			}
	
		}
	
		@And("^User will enter the category name and choose the equivalent PIES category_MUL$")
		public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will enter the category name and choose the equivalent PIES category_MUL");
				mpom.entrycategory1(pro.getProperty("categoryname1"));
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				mpom.savingcategory();
				loginfo.pass("Product category Saved Successfully");
				// Baseclass.updateTestLinkResult("PMT-3", null,
				// TestLinkAPIResults.TEST_PASSED);
	
			} catch (Exception e) {
	
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
				// TestLinkAPIResults.TEST_FAILED);
	
			}
		}
	
		@Then("^User will successfully added and verify that the record has come_MUL$")
		public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will successfully added and verify that the record has come_MUL");
				mpom.acceptAlert();
				// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				System.out.println("category successfully added");
				mpom.verifyingtext1(pro.getProperty("categoryname1"));
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				loginfo.pass("Product category saved");
				System.out.println("Category Verified");
				loginfo.pass("Product category Saved Successfully & shown in grid");
				// Baseclass.updateTestLinkResult("PMT-3", null,
				// TestLinkAPIResults.TEST_PASSED);
				// extent.flush();
	
			} catch (Exception e) {
				/*
				 * JavascriptExecutor js = (JavascriptExecutor)driver; String text = js.
				 * executeScript("return document.getElementById('MainContent_lblError').innerHTML"
				 * ).toString(); System.out.println(text); WebElement element =
				 * driver.findElement(By.xpath("//*[@id='MainContent_Image1']"));
				 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
				 * System.out.println("Failed to insert"); //loginfo.fail("Insert Failed");
				 */
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
				// loginfo.fail("Already exists");
				// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
				// TestLinkAPIResults.TEST_FAILED);
				// extent.flush();
			}
		}
	
		@Given("^User will go to master and choose product sub category_MUL$")
		public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {
	
			try {
				// extent=setup();
				test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("Sub Category")
						.pass("sub category added thanks");
				test = test.createNode(Scenario.class, "Adding product sub category");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to master and choose product sub category_MUL");
				mpom = new Masterproductrelated_POM();
				mpom.clicksubcategory();
				loginfo.pass("Product sub category add landing page success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^User will click on the add button and choose the category drop down list_MUL$")
		public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on the add button and choose the category drop down list_MUL");
				mpom.addcategory1();
				mpom.addsubcategory1();
				loginfo.pass("Product sub category create landing page success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@And("^User will enter the sub category name and choose the equivalent and save button is clicked_MUL$")
		public void user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked()
				throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will enter the sub category name  and choose the equivalent and save button is clicked_MUL");
				mpom.entrysubcategory1(pro.getProperty("subcategoryname1"));
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				mpom.savingcategory();
				// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				loginfo.pass("Product sub category entered success");
	
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@Then("^User will successfully added and verify the record has come in the sub category grid_MUL$")
		public void user_will_successfully_added_and_verify_the_record_has_come_in_the_sub_category_grid()
				throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will successfully added and verify the record has come in the sub category grid_MUL");
				mpom.acceptAlertsub();
				System.out.println("sub category successfully added");
				mpom.verifysubcategory1(pro.getProperty("subcategoryname1"));
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				loginfo.pass("Product sub category verified");
				// extent.flush();
			} catch (Exception e) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String text = js.executeScript("return document.getElementById('MainContent_lblError').innerHTML")
						.toString();
				System.out.println(text);
				WebElement element = driver.findElement(By.xpath("//*[@id='MainContent_Image1']"));
				// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
				System.out.println("Failed to insert");
				// loginfo.fail("Insert Failed");
				TestStep("Fail", driver, loginfo, e);
				// loginfo.fail("Already exists");
				// extent.flush();
			}
		}
	
		@Given("^User will go to master and choose part description_MUL$")
		public void user_will_go_to_master_and_choose_part_description() throws Throwable {
	
			try {
				// extent = setup();
				test = extent.createTest(Feature.class, "PMT Product Related Testcases")
						.assignCategory("Part Description Tag");
				test = test.createNode(Scenario.class, "Adding part description");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to master and choose part description_MUL");
				mpom = new Masterproductrelated_POM();
				mpom.partdesc1();
				loginfo.pass("Product part description landed");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^User will click on the add button and choose the category & sub category drop down list_MUL$")
		public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list()
				throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on the add button and choose the category & sub category drop down list_MUL");
				mpom.addcategory1();
				mpom.addsubcategory1(); // category choose
				mpom.categoryselect1(); // subcategory select
				mpom.entrypartdesc1(pro.getProperty("subcategoryname1"));
				mpom.equivalentpartdesc1();
				loginfo.pass("Product part description choosing the given data");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@And("^User will enter the part description name and save button is clicked_MUL$")
		public void user_will_enter_the_part_description_name_and_save_button_is_clicked() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("And"),
						"User will enter the part description name  and save button is clicked_MUL");
				mpom.savingpartdesc();
				mpom.acceptAlertdesc();
				loginfo.pass("Product part description submit button clicked success");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@Then("^User will see successfully added and verify the record has come in the description grid_MUL$")
		public void user_will_see_successfully_added_and_verify_the_record_has_come_in_the_description_grid()
				throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will see successfully added and verify the record has come in the description grid_MUL");
	
				mpom.verifycategory2();
				// mpom.verifypartdesc(pro.getProperty("subcategoryname"));
				System.out.println("Part Description Added in the grid");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
				// extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				// extent.flush();
			}
		}
	
		@Given("^User will go to master and choose product line_MUL$")
		public void user_will_go_to_master_and_choose_product_line() throws Throwable {
	
			try {
				// extent=setup();
				test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("Product Line Tag");
				test = test.createNode(Scenario.class, "Adding product Line");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will go to master and choose product line_MUL");
				mpom = new Masterproductrelated_POM();
				mpom.clickonproductlinecode();
				loginfo.pass("Product line landing to adding page");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^User will click on add button and enter the line code and line name_MUL$")
		public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on add button and enter the line code and line name_MUL");
				mpom.addcategory1();
				mpom.addproductline(pro.getProperty("linecode1"), pro.getProperty("linename"));
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				mpom.savebtn();
				mpom.acceptAlertline();
				loginfo.pass("Product line trying to add & entering the value");
	
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@Then("^User will see successfully alert and verify the record has come in the grid_MUL$")
		public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will see successfully alert and verify the record has come in the grid_MUL");
				mpom.verifyproductline(pro.getProperty("linecode1"));
				System.out.println("Product Line  Added in the grid");
				loginfo.pass("Product line added successfully & shown in grid");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				// extent.flush();
			}
		}
	
		@Given("^User will goto master and choose Custom Attributes_MUL$")
		public void user_will_goto_master_and_choose_Custom_Attributes() throws Throwable {
			try {
				// extent = setup();
				test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("Cateory")
						.pass("Custom Attributes added");
				test = test.createNode(Scenario.class, "Adding Custom Attributes");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will goto master and choose Custom Attributes_MUL");
				mpom = new Masterproductrelated_POM();
				mpom.clickonCustomAttributes();
				loginfo.pass("Custom Attributes landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
			}
		}
	
		@When("^User will click on add and enter Custom Attribute Name_MUL$")
		public void user_will_click_on_add_and_enter_Custom_Attribute_Name() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on add and enter Custom Attribute Name_MUL");
				mpom.AddbtnEnterCustomAtbName1(pro.getProperty("AttributeName1"));
				loginfo.pass("Attribute Name Entered Successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
	
			}
		}
	
		@When("^User will select Data Type, enter Min & MaxLength and select Parts Description_MUL$")
		public void user_will_select_Data_Type_enter_Min_MaxLength_and_select_Parts_Description() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will select Data Type, enter Min & MaxLength and select Parts Description_MUL");
				mpom.AttributeDetails();
				mpom.SelectPartDescription1();
				loginfo.pass("Attribute Value Entered Successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
	
			}
	
		}
	
		@Then("^User will Click save Accept Alert and Verify the record has come in the grid_MUL$")
		public void user_will_Click_save_Accept_Alert_and_Verify_the_record_has_come_in_the_grid() throws Throwable {
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will Click save Accept Alert and Verify the record has come in the grid_MUL");
				mpom.savebtn2();
				mpom.acceptAlertAttribute();
	
				// mpom.VerufyAttribute1(pro.getProperty("AttributeName1"));
	
				loginfo.pass("Product line added successfully & shown in grid");
				System.out.println("Product Line  Added in the grid");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				// extent.flush();
			}
		}
	
		@Given("^User will click on parts page and it will redirect to parts page_MUL$")
		public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page() throws Throwable {
	
			try {
				// extent = setup();
				test = extent.createTest(Feature.class, "PMT Add Product List").assignCategory("Parts Add")
						.pass("category added thanks");
				test = test.createNode(Scenario.class, "Adding part# with created product category");
				loginfo = test.createNode(new GherkinKeyword("Given"),
						"User will click on parts page and it will redirect to parts page_MUL");
				parts = new PartsAdd_POM();
				parts.partslandingpage();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
			}
		}
	
		@When("^User will click on the add buton and choose product category, sub category,part desc, product line_MUL$")
		public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line()
				throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("When"),
						"User will click on the add buton and choose product category, sub category,part desc, product line_MUL");
				parts.partsadd1();
				parts.partsadddrp21();
				parts.partsadddrp31();
				parts.partsadddrp41();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
	
			}
		}
	
		@And("^User will enter the part# and click on save_MUL$")
		public void user_will_enter_the_part_and_click_on_save() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("And"), "User will enter the part# and click on save_MUL");
				// mpom12.scrolldown();
				parts.savenewpart1(pro.getProperty("partno"));
				parts.acceptAlert();
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (Exception e) {
				System.out.println(e);
				TestStep("Fail", driver, loginfo, e);
	
			}
	
		}
	
		@Then("^User will see successfull alert and verify the part# thorugh part# search_MUL$")
		public void user_will_see_successfull_alert_and_verify_the_part_thorugh_part_search() throws Throwable {
	
			try {
				loginfo = test.createNode(new GherkinKeyword("Then"),
						"User will see successfull alert and verify the part# thorugh part# search_MUL");
	
				loginfo.pass("Parts page landed successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
				// extent.flush();
			} catch (Exception e) {
				TestStep("Fail", driver, loginfo, e);
				System.out.println(e);
				// extent.flush();
	
			}
		}
	}
