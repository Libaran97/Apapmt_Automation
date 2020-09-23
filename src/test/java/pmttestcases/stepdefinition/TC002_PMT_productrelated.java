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

import utility.Baseclass;

public class TC002_PMT_productrelated extends Baseclass {

	ExtentTest loginfo = null;
	Masterproductrelated_POM mpom;

	@Given("^User will mouse hover and choose the product category page$")
	public void user_will_mouse_hover_and_choose_the_product_category_page() throws Throwable {

		try {
			extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
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

	@When("^User will click on the add button and add a new category$")
	public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category");
			mpom.addcategory();
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

	@And("^User will enter the category name and choose the equivalent PIES category$")
	public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the category name and choose the equivalent PIES category");
			mpom.entrycategory(pro.getProperty("Categoryprevious"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savebtn2();
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

	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			mpom.acceptAlert();
			System.out.println("category successfully added");
			mpom.verifyingtext(pro.getProperty("Categoryprevious"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			// Baseclass.updateTestLinkResult("PMT-3", null,
			// TestLinkAPIResults.TEST_PASSED);
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// loginfo.fail("Already exists");
			// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
			// TestLinkAPIResults.TEST_FAILED);
			//extent.flush();
		}
	}

	// 2nd product category edit
	@Given("^User will mouse hover and choose the product category again page$")
	public void user_will_mouse_hover_and_choose_the_product_category_again_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Edit Category").assignCategory("Cateory")
					.pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding product category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product category page");
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

	@When("^User will click on the Edit button with already added of product category$")
	public void user_will_click_on_the_Edit_button_with_already_added_of_product_category() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category");
			mpom.Edirtaddcategory("Categoryprevious");
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

	@When("^User will doesnot change the category name and change the equivalent PIES category$")
	public void user_will_doesnot_change_the_category_name_and_change_the_equivalent_PIES_category() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will enter the category name and choose the equivalent PIES category");
			// mpom.entrycategory(pro.getProperty("categoryname"));
			mpom.editequalcase(pro.getProperty("categoryname"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savebtnedit();
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

	@Then("^User will successfully edited and verify that the record has come$")
	public void user_will_successfully_edited_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			mpom.acceptAlert();
			System.out.println("category successfully added");
			mpom.verifyingtextedit(pro.getProperty("categoryname"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			// Baseclass.updateTestLinkResult("PMT-3", null,
			// TestLinkAPIResults.TEST_PASSED);
			//extent.flush();

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// loginfo.fail("Already exists");
			// Baseclass.updateTestLinkResult("PMT-3", e.getMessage(),
			// TestLinkAPIResults.TEST_FAILED);
			//extent.flush();
		}
	}

	// 3rd program sub category
	@Given("^User will go to master and choose product sub category$")
	public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {

		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add SubCategory")
					.assignCategory("Sub Category").pass("sub category added thanks");
			test = test.createNode(Scenario.class, "Adding product sub category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose product sub category");
			mpom = new Masterproductrelated_POM();
			mpom.clicksubcategory();
			loginfo.pass("Product sub category add landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the add button and choose the category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category drop down list");
			mpom.addcategory();
			mpom.addsubcategory();
			loginfo.pass("Product sub category create landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@And("^User will enter the sub category name and choose the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the sub category name  and choose the equivalent and save button is clicked");
			mpom.entrysubcategory(pro.getProperty("subcategorynameprevious"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savingcategory1();
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product sub category entered success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will successfully added and verify the record has come in the sub category grid$")
	public void user_will_successfully_added_and_verify_the_record_has_come_in_the_sub_category_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the record has come in the sub category grid");
			// mpom.acceptAlertsub();
			mpom.acceptAlert();
			System.out.println("sub category successfully added");
			// mpom.addsubcategoryveri();
			mpom.verifysubcategory(pro.getProperty("subcategorynameprevious"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product sub category verified");
			//extent.flush();
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
			//extent.flush();
		}
	}

	// Edit the product sub category
	@Given("^User will go to master and choose product sub category again page$")
	public void user_will_go_to_master_and_choose_product_sub_category_again_page() throws Throwable {
		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add SubCategory")
					.assignCategory("Sub Category").pass("sub category added thanks");
			test = test.createNode(Scenario.class, "Adding product sub category");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose product sub category");
			mpom = new Masterproductrelated_POM();
			mpom.clicksubcategory();
			loginfo.pass("Product sub category add landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the Edit button and choose the category drop down list$")
	public void user_will_click_on_the_Edit_button_and_choose_the_category_drop_down_list() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category drop down list");
			// mpom.addcategory();
			mpom.addsubcategoryedit();
			loginfo.pass("Product sub category create landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will enter the sub category name and change the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_change_the_equivalent_and_save_button_is_clicked()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will enter the sub category name  and choose the equivalent and save button is clicked");
			// mpom.entrysubcategory(pro.getProperty("subcategorynameprevious"));
			mpom.entrysubcategoryedit(pro.getProperty("subcategoryname"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savingcategory1();
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product sub category entered success");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will successfully edited and verify the record has come in the sub category grid$")
	public void user_will_successfully_edited_and_verify_the_record_has_come_in_the_sub_category_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the record has come in the sub category grid");
			// mpom.acceptAlertsub();
			mpom.acceptAlert();
			System.out.println("sub category successfully added");
			// mpom.addsubcategoryveri();
			// mpom.verifysubcategory(pro.getProperty("subcategorynameprevious"));
			mpom.verifysubcategoryedit(pro.getProperty("subcategoryname"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product sub category verified");
			//extent.flush();
		} catch (Exception e) {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor)driver; String text = js.
			 * executeScript("return document.getElementById('MainContent_lblError').innerHTML"
			 * ).toString(); System.out.println(text); WebElement element =
			 * driver.findElement(By.xpath("//*[@id='MainContent_Image1']"));
			 * //loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
			 */
			System.out.println("Failed to insert");
			// loginfo.fail("Insert Failed");
			TestStep("Fail", driver, loginfo, e);
			// loginfo.fail("Already exists");
			//extent.flush();
		}
	}

	// 5th program part description
	@Given("^User will go to master and choose part description$")
	public void user_will_go_to_master_and_choose_part_description() throws Throwable {

		try {
			 //extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "Adding part description");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose part description");
			mpom = new Masterproductrelated_POM();
			mpom.partdesc1();
			loginfo.pass("Product part description landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the add button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and choose the category & sub category drop down list");
			mpom.addcategory2();
			// mpom.addsubcategory(); //category choose
			mpom.categoryselect(); // subcategory select
			mpom.entrypartdesc(pro.getProperty("partdesc"));
			mpom.equivalentpartdesc();
			loginfo.pass("Product part description choosing the given data");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@And("^User will enter the part description name and save button is clicked$")
	public void user_will_enter_the_part_description_name_and_save_button_is_clicked() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"User will enter the part description name  and save button is clicked");
			mpom.savingpartdesc();
			mpom.acceptAlertline();
			loginfo.pass("Product part description submit button clicked success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully added and verify the record has come in the description grid$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come_in_the_description_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully added and verify the record has come");

			// mpom.verifycategory1();
			mpom.verifypartdesc(pro.getProperty("partdesc"));
			System.out.println("Part Description Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// 6th part description edit
	@Given("^User will go to master and choose part description again$")
	public void user_will_go_to_master_and_choose_part_description_again() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-edit Description")
					.assignCategory("Part Description Tag");
			test = test.createNode(Scenario.class, "editing part description");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to master and choose part description again");
			mpom = new Masterproductrelated_POM();
			mpom.partdesc1();
			loginfo.pass("Product part description landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on the edit button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_edit_button_and_choose_the_category_sub_category_drop_down_list()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the edit button and choose the category & sub category drop down list");
			mpom.editcategory(pro.getProperty("Editequivalent"));

			loginfo.pass("Product part description choosing the given data");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will change the part description name,equivalent aces and save button is clicked$")
	public void user_will_change_the_part_description_name_equivalent_aces_and_save_button_is_clicked()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will change the part description name,equivalent aces and save button is clicked");
			// mpom.categoryselect(); //subcategory select
			mpom.entrypartdescedit(pro.getProperty("subcategoryname"));
			mpom.equivalentpartdescedit();
			mpom.savingpartdesc();
			mpom.acceptAlertline();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully edited and verify the record has come in the description grid$")
	public void user_will_see_successfully_edited_and_verify_the_record_has_come_in_the_description_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully edited and verify the record has come in the description grid");
			// mpom.verifycategory1();
			mpom.verifypartdescedit(pro.getProperty("subcategoryname"));
			System.out.println("Part Description Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Productline 7th prgram
	@Given("^User will go to master and choose product line$")
	public void user_will_go_to_master_and_choose_product_line() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add prodLine")
					.assignCategory("Product Line Tag");
			test = test.createNode(Scenario.class, "Adding product Line");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line");
			mpom = new Masterproductrelated_POM();
			mpom.clickonproductlinecode();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on add button and enter the line code and line name$")
	public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the line code and line name");
			mpom.addcategory();
			mpom.addproductline(pro.getProperty("linecode1"), pro.getProperty("textbox"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.savebtn();
			mpom.acceptAlert();
			loginfo.pass("Product line trying to add & entering the value");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully alert and verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully alert and verify the record has come in the grid");
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

	// 8th program product line edit
	@Given("^User will go to master and choose product line again$")
	public void user_will_go_to_master_and_choose_product_line_again() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add prodLine")
					.assignCategory("Product Line Tag");
			test = test.createNode(Scenario.class, "Adding product Line");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will go to master and choose product line");
			mpom = new Masterproductrelated_POM();
			mpom.clickonproductlinecode();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^User will click on edit button and enter the line code and line name$")
	public void user_will_click_on_edit_button_and_enter_the_line_code_and_line_name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add button and enter the line code and line name");
			mpom.editproduct(pro.getProperty("linecode1"), pro.getProperty("linecode"), pro.getProperty("linename"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// mpom.savebtn();
			mpom.acceptAlert();
			loginfo.pass("Product line trying to add & entering the value");

		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@Then("^User will see successfully alert and edit verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_edit_verify_the_record_has_come_in_the_grid() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will see successfully alert and verify the record has come in the grid");
			mpom.verifyproductlineedit(pro.getProperty("linecode"));
			System.out.println("Product Line  Added in the grid");
			loginfo.pass("Product line added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

	// check the custom attribute
	@Given("^User will goto master and choose Custom Attributes$")
	public void user_will_goto_master_and_choose_Custom_Attributes() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related-Add Attribute").assignCategory("Cateory")
					.pass("Custom Attributes added");
			test = test.createNode(Scenario.class, "Adding Custom Attributes");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will goto master and choose Custom Attributes");
			mpom = new Masterproductrelated_POM();
			mpom.clickonCustomAttributes();
			loginfo.pass("Custom Attributes landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
		}
	}

	@When("^User will click on add and enter Custom Attribute Name$")
	public void user_will_click_on_add_and_enter_Custom_Attribute_Name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on add and enter Custom Attribute Name");
			mpom.AddbtnEnterCustomAtbName(pro.getProperty("AttributeName"));
			loginfo.pass("Attribute Name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will select Data Type, enter Min & MaxLength and select Parts Description$")
	public void user_will_select_Data_Type_enter_Min_MaxLength_and_select_Parts_Description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select Data Type, enter Min & MaxLength and select Parts Description");
			mpom.AttributeDetails();
			mpom.SelectPartDescription();
			loginfo.pass("Attribute Value Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will Click save Accept Alert and Verify the record has come in the grid$")
	public void user_will_Click_save_Accept_Alert_and_Verify_the_record_has_come_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Click save Accept Alert and Verify the record has come in the grid");
			mpom.savebtn();
			// mpom.acceptAlertAttribute();
			mpom.acceptAlert();

			mpom.VerufyAttribute(pro.getProperty("AttributeName"));

			loginfo.pass("Product line added successfully & shown in grid");
			System.out.println("Product Line  Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// check the edit custom attribute
	@Given("^User will goto master and choose Custom Attributes agin$")
	public void user_will_goto_master_and_choose_Custom_Attributes_agin() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related-edited Attribute").assignCategory("Cateory")
					.pass("Custom Attributes edited");
			test = test.createNode(Scenario.class, "editing Custom Attributes");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will goto master and choose Custom Attributes agin");
			mpom = new Masterproductrelated_POM();
			mpom.clickonCustomAttributes();
			loginfo.pass("Custom Attributes landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
		}
	}

	@When("^User will click on edit and enter Custom Attribute Name$")
	public void user_will_click_on_edit_and_enter_Custom_Attribute_Name() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on edit and enter Custom Attribute Name");
			mpom.editcustom(pro.getProperty("AttributeName"), pro.getProperty("editattrvalue"));
			loginfo.pass("Attribute Name changed Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will change Data Type, enter Min & MaxLength and Parts Description$")
	public void user_will_change_Data_Type_enter_Min_MaxLength_and_Parts_Description() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will change Data Type, enter Min & MaxLength and Parts Description");
			mpom.editdataandpartdesc();
			loginfo.pass("datatype and partdesc Name changes Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will check edit save Accept Alert and Verify the record has come in the grid$")
	public void user_will_check_edit_save_Accept_Alert_and_Verify_the_record_has_come_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check edit save Accept Alert and Verify the record has come in the grid");
			mpom.acceptAlert();
			mpom.VerifycusteditAttribute(pro.getProperty("editattrvalue"));
			loginfo.pass("custom edited successfully & shown in grid");
			System.out.println("custom edited Added in the grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 //extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			//extent.flush();
		}
	}

}
