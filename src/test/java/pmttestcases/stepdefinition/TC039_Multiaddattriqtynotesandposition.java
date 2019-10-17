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

public class TC039_Multiaddattriqtynotesandposition extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will click the application pages and multiadd pages$")
	public void user_will_click_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("PIES MultiAdd ").pass("Attributes details all verified");
			test = test.createNode(Scenario.class, "Multiadd attributes values check and reflected to buyersguide");
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

	@When("^: user will check the all Vehicle,make model and click the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_click_the_search() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make model and click the search");
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

	@When("^: user will check the checkbox in the grid$")
	public void user_will_check_the_checkbox_in_the_grid() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the grid");
			mpom1.Checkbox1();
			loginfo.pass("Check box is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Check box is not working" + e.getMessage());
			loginfo.fail("Check box is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^:  user will select the product, description, part number as well$")
	public void user_will_select_the_product_description_part_number_as_well() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number as well");

			//mpom1.Checkboxall();
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

	@When("^: user will click the Qty,Position and Notes and click the add option$")
	public void user_will_click_the_Qty_Position_and_Notes_and_click_the_add_option() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty,Position and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			loginfo.pass("Qty,notes..values getting properly");
		} catch (Exception e) {
			System.out.println("Qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("Qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,position and notes in the tabular column$")
	public void user_will_verify_the_qty_position_and_notes_in_the_tabular_column() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the qty,position and notes in the tabular column");
			mpom1.scrolldown();
			mpom1.verifyattr();
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.fail("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@When("^: user will click the save option and popup close$")
	public void user_will_click_the_save_option_and_popup_close() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will click the save option and popup close");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("multi add value saved");
		} catch (Exception e) {
			System.out.println("multi add value not saved.." + e.getMessage());
			loginfo.fail("multi add value not saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally Show attributes details is finished$")
	public void finally_Show_attributes_details_is_finished() throws Throwable {
		try {
			//extent.flush();
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Show attributes details is finished");
			loginfo.pass("Attributes qty,position and notes details verified");
			System.out.println("Attributes qty,position and notes details verified..");
		} catch (Exception e) {
			//extent.flush();
			loginfo.fail("Attributes qty,position and notes details not verified");
			System.out.println("Attributes qty,position and notes details not verified..");
		}
	}

}
