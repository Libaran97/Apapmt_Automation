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

public class TC036_MultiaddDelete extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will create the application pages and multiadd links on same page$")
	public void user_will_create_the_application_pages_and_multiadd_links_on_same_page() throws Throwable {
		try {
			//extent=setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("PIES MultiAdd ").pass("Delete File verified");
			test = test.createNode(Scenario.class, "Multiadd Delete case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links on same page");
			mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Application and Multiadd page is not click");
		}
	}

	@When("^: user will check the all Vehicle,make and model$")
	public void user_will_check_the_all_Vehicle_make_and_model() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all Vehicle,make and model");
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

	@When("^: user will check the checkbox product desc part number also$")
	public void user_will_check_the_checkbox_product_desc_part_number_also() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox product desc part number also");
			mpom1.Checkboxall();
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Product,desc,part...not working**" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check add button$")
	public void user_will_check_add_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check add button");
			mpom1.Delete();
			loginfo.pass("Delete button is click...");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Delete button not working**" + e.getMessage());
			loginfo.fail("Delete button not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@Then("^: Finally delete button finished$")
	public void finally_delete_button_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally delete button finished");
			mpom1.Deleteverify(pro.getProperty("Delete"));
			//extent.flush();
			loginfo.pass("*Delete button succussfully added...");
			System.out.println("**Delete button succussfully added**");
		} catch (Exception e) {
			//extent.flush();
			System.out.println("Failed Delete functionality..");
			loginfo.fail("Failed Delete functionality..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
}
