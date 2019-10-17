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

public class TC035_MultaddCancel extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will create the application pages and multiadd links$")
	public void user_will_create_the_application_pages_and_multiadd_links() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("PIES MultiAdd ").pass("Cancel File verified");
			test = test.createNode(Scenario.class, "Multiadd Cancel case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links");
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

	@When("^: user will check all project value from the multiadd page$")
	public void user_will_check_all_project_value_from_the_multiadd_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will create the application pages and multiadd links");
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

	@When("^: user will check the checkbox product desc part number$")
	public void user_will_check_the_checkbox_product_desc_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox product desc part number");
			mpom1.Checkboxall();
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check Cancel button$")
	public void user_will_check_Cancel_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check Cancel button");
			mpom1.Cancel();
			mpom1.cancelverify(pro.getProperty("canvalue"));
			loginfo.pass("Cancel button is  click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Cancel button is not click" + e.getMessage());
			loginfo.fail("Cancel button is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally Cancel button finished$")
	public void finally_Cancel_button_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Cancel button finished");
			//extent.flush();
			loginfo.pass("Cancel button was succussfully working");
			System.out.println("**Cancel button was succussfully working**");

		} catch (Exception e) {
			loginfo.fail("Cancel button is not click");
			//extent.flush();
			System.out.println("**Cancel button was not succussfully working**");
			e.printStackTrace();
		}
	}

}
