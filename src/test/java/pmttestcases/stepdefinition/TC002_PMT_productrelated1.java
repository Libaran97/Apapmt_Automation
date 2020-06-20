package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Masterproductrelated_POM;
import pageobjectmodel.Masterproductrelated_POM2;
import utility.Baseclass;

public class TC002_PMT_productrelated1 extends Baseclass {

	ExtentTest loginfo = null;
	Masterproductrelated_POM2 mpom2 = new Masterproductrelated_POM2();

	// Product group master
	@Given("^User will mouse hover and choose the product group master page$")
	public void user_will_mouse_hover_and_choose_the_product_group_master_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product group Related-Add master").assignCategory("master")
					.pass("master added thanks");
			test = test.createNode(Scenario.class, "Adding product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product group master page");
			mpom2.clickonproductcategory();
			loginfo.pass("product group master landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^User will click on the add button and add a new category and order$")
	public void user_will_click_on_the_add_button_and_add_a_new_category_and_order() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category and order");
			mpom2.addproductgroup(pro.getProperty("Productcategory"), pro.getProperty("qtydata"));
			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully added and verify that the record has come in group$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come_in_group() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come in group");
			mpom2.acceptAlert();
			System.out.println("Product groupmaster category added successfully");
			mpom2.verifyingtext(pro.getProperty("Productcategory"));
			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Product group master Edit
	@Given("^User will mouse hover and choose the product group master page again$")
	public void user_will_mouse_hover_and_choose_the_product_group_master_page_again() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product group Related-edit master").assignCategory("master")
					.pass("master edited thanks");
			test = test.createNode(Scenario.class, "editing product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product group master page again");
			mpom2.clickonproductcategory();
			loginfo.pass("product group master landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the add button and add a new category and order with edit$")
	public void user_will_click_on_the_add_button_and_add_a_new_category_and_order_with_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and add a new category and order with edit");
			mpom2.editproductgroup(pro.getProperty("Productcategory"), pro.getProperty("Equchose"),
					pro.getProperty("Length"));
			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully added and verify that the record has come in group edit$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come_in_group_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come in group edit");
			mpom2.acceptAlert();
			System.out.println("Product groupmaster category edited successfully");
			mpom2.verifyingtextedit(pro.getProperty("Equchose"));
			loginfo.pass("Product category saved");
			System.out.println("Category Verified");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// 3rd program Brand master
	@Given("^User will mouse hover and choose the Brand Master page$")
	public void user_will_mouse_hover_and_choose_the_Brand_Master_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Brand master Related-edit master").assignCategory("master")
					.pass("Brand master thanks");
			test = test.createNode(Scenario.class, "search Brand master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the Brand Master page");
			mpom2.clickonBrandmaster();
			loginfo.pass("Brand master landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on the Search button and check the valid invalid empty search$")
	public void user_will_click_on_the_Search_button_and_check_the_valid_invalid_empty_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the Search button and check the valid invalid empty search");
			mpom2.invalidbrandsearchmaster(pro.getProperty("linename"));
			mpom2.emptybrandsearchmaster();
			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully verify that the record has come$")
	public void user_will_successfully_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully verify that the record has come");
			mpom2.validbrandsearchmaster(pro.getProperty("brandvalue"), pro.getProperty("Brandid"));
			System.out.println("Brand master valid successfully");
			loginfo.pass("Brand master valid");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// System ck31
	@Given("^User will mouse hover and choose the system \\(CK(\\d+)\\) page$")
	public void user_will_mouse_hover_and_choose_the_system_CK_page(int arg1) throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product group Related-edit master").assignCategory("master")
					.pass("master edited thanks");
			test = test.createNode(Scenario.class, "editing product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the product group master page again");
			mpom2.clickonsystemck31();
			loginfo.pass("product group master landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will search CK(\\d+) name and description$")
	public void user_will_search_CK_name_and_description(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will search CK(\\\\d+) name and description");
			mpom2.clicksystemck31search(pro.getProperty("ck31"), pro.getProperty("ck31description"));
			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully verified CK(\\d+)$")
	public void user_will_successfully_verified_CK(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come in group edit");
			System.out.println("Product CK31 successfully");
			mpom2.verifyingck31("ck31");
			loginfo.pass("Product category search");
			System.out.println("CK31 Verified");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Assembly Ck 32
	@Given("^User will mouse hover and choose the Assembly \\(CK(\\d+)\\) page$")
	public void user_will_mouse_hover_and_choose_the_Assembly_CK_page(int arg1) throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product group Related-assembly master")
					.assignCategory("master").pass("master assembly thanks");
			test = test.createNode(Scenario.class, "editing product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the Assembly (CK32) page");
			mpom2.clickonassembly32();
			loginfo.pass("product assembly ck32 landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will choose CK(\\d+)and search ck(\\d+) name and description$")
	public void user_will_choose_CK_and_search_ck_name_and_description(int arg1, int arg2) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose CK(\\\\d+)and search ck(\\\\d+) name and description");
			mpom2.clickassemblyck32search(pro.getProperty("systemvalue"), pro.getProperty("ck31"));
			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully verified assembly CK(\\d+)$")
	public void user_will_successfully_verified_assembly_CK(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully verified assembly CK(\\\\d+)$");
			System.out.println("Product CK32 successfully");
			mpom2.verifyingck32("systemvalue");
			loginfo.pass("Product Assembly search");
			System.out.println("CK32 Verified");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

	// Component Ck33
	@Given("^User will mouse hover and choose the component \\(CK(\\d+)\\) page$")
	public void user_will_mouse_hover_and_choose_the_component_CK_page(int arg1) throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Product group Related-component master")
					.assignCategory("master").pass("master component thanks");
			test = test.createNode(Scenario.class, "editing product group master");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover and choose the Component (CK33) page");
			mpom2.clickonassembly33();
			loginfo.pass("product assembly ck33 landed successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will choose CK(\\d+) ck(\\d+) and search ck(\\d+) name and description$")
	public void user_will_choose_CK_ck_and_search_ck_name_and_description(int arg1, int arg2, int arg3)
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will choose CK(\\\\d+)and search ck(\\\\d+) name and description");
			mpom2.clickcomponentck33search(pro.getProperty("Compnenentvalue"));
			mpom2.acceptAlert();
			mpom2.verifyingck33(pro.getProperty("Partype"));

			loginfo.pass("Value Entered Successfully");
			// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will successfully verified Component CK(\\d+)$")
	public void user_will_successfully_verified_Component_CK(int arg1) throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully verified component CK(\\\\d+)$");
			System.out.println("Product CK33 again successfully");
			mpom2.Editagain();
			mpom2.acceptAlert();
			mpom2.verifyEditagain(pro.getProperty("subcategoryname1"));
			loginfo.pass("Product component search");
			System.out.println("CK33 Verified");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}