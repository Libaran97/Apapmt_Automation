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

public class TC034_MultiaddNonAces extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will create the application pages$")
	public void user_will_create_the_application_pages() throws Throwable {

		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test = test.createNode(Scenario.class, "Multiadd Non-aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"), "user will create the application pages");
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

	@When("^: user will check the all$")
	public void user_will_check_the_all() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all");
			mpom1.Vehicledata(pro.getProperty("EnterVehicleName1"));
			mpom1.Makedata(pro.getProperty("EnterMakeName1"));
			mpom1.Modeldata(pro.getProperty("EnterModelName1"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all part types$")
	public void user_will_check_the_all_part_types() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all part types");
			mpom1.Checkbox1();
			mpom1.scrolldown();
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
			loginfo.fail("Save or Pop up aleat was not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will successfully saved particular non aces product line and verify that the record has come$")
	public void user_will_successfully_saved_particular_non_aces_product_line_and_verify_that_the_record_has_come()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
			
					"User will successfully saved particular non aces product line and verify that the record has come");			
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.NonACesverify("acesexpectedtext2", "engine2");			
			loginfo.pass("Save or Pop up aleat was working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("Save or Pop up alert was not working..." + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Save or Pop up alert was not working");
		}
	}

	@Then("^Finally Non Aces matched successfully$")
	public void finally_Non_Aces_matched_successfully() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Non Aces matched successfully");
			//extent.flush();
			loginfo.pass("Non Aces is successfully working");
			System.out.println("**Non Aces is successfully working**");
		} catch (Exception e) {
			loginfo.fail("Finally Non Aces matched not success");
			System.out.println("**Non Aces is not working**");
			//extent.flush();
		}
	}

}
