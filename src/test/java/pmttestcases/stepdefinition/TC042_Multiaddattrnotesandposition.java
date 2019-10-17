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

public class TC042_Multiaddattrnotesandposition extends Baseclass {
	MultiAddPom mpom1;
	ExtentTest loginfo = null;
	@Given("^: user will select the application paged and multiadd pages$")
	public void user_will_select_the_application_paged_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("PIES MultiAdd ").pass("Attributes Position and notes File verified");
			test = test.createNode(Scenario.class, "Multiadd position,notes to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the application page and multiadd pages");
			mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Application and Multiadd page is not click");
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosen Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chosen_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chose Vehicle,make,model  with click the search");
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

	@When("^: user will check the checkboxs in the tables$")
	public void user_will_check_the_checkboxs_in_the_tables() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tables column");
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

	@When("^: user will select the product, description, part nos in the dropdown$")
	public void user_will_select_the_product_description_part_nos_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part num in the dropdown");
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

	@When("^: user will click the notes and position and select the add option$")
	public void user_will_click_the_notes_and_position_and_select_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the notes and position and click the add option");
			mpom1.scrolldown();
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.qtyclear();
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.verifyalert3();
			loginfo.pass("postion,qty,notes..values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("postion,qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("postion,qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the position and note in the tabular column$")
	public void user_will_verify_the_position_and_note_in_the_tabular_column() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the position and notes in the tabular column");			
			//mpom1.verifyattr3();
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.fail("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally notes and position added success$")
	public void finally_notes_and_position_added_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Finally notes and position added success");			
			loginfo.pass("Notes and POStion is success");
			System.out.println("Notes and Postion is success");
			extent.flush();
		} catch (Exception e) {
			loginfo.fail("Notes and POStion is not success");
			System.out.println("Notes and POStion is not success");
			extent.flush();
		}
	}
}
