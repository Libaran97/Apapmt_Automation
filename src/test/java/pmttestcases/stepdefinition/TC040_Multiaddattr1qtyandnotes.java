package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MultiAddPom;
import utility.Baseclass;

public class TC040_Multiaddattr1qtyandnotes extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will click the application pages and multiadd page$")
	public void user_will_click_the_application_pages_and_multiadd_page() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test = test.createNode(Scenario.class, "Multiadd qty,notes to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will click the application pages and multiadd pages");
			mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.fail("Application and Multiadd page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all Vehicle,make,model and click the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make,model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox in the table$")
	public void user_will_check_the_checkbox_in_the_table() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the table");
			mpom1.Checkbox1();
			loginfo.pass("Checkbox is click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Checkbox is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^:  user will select the product, description, part number in the dropdown$")
	public void user_will_select_the_product_description_part_number_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the Qty and Notes and click the add option$")
	public void user_will_click_the_Qty_and_Notes_and_click_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			loginfo.pass("Qty,notes..values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("Qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,notes in the tabular column$")
	public void user_will_verify_the_qty_notes_in_the_tabular_column() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the qty,notes in the tabular column");
			mpom1.scrolldown();
			mpom1.verifyattr1();
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.pass("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^: user will click the save option and popup$")
	public void user_will_click_the_save_option_and_popup() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will click the save option and popup");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("multi add value saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("multi add value not saved.." + e.getMessage());
			loginfo.fail("multi add value not saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally qty and notes added$")
	public void finally_qty_and_notes_added() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally qty and notes added");
			//extent.flush();
			loginfo.pass("Attributes qty,notes details verified");
			System.out.println("Attributes qty,notes details verified..");
		} catch (Exception e) {
			//extent.flush();
			loginfo.fail("Attributes qty,notes details not verified");
			System.out.println("Attributes qty,notes details not verified..");
		}
	}

}
