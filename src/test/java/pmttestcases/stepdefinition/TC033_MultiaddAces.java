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

public class TC033_MultiaddAces extends Baseclass {

	 ExtentTest loginfo=null;
	 MultiAddPom mpom1;

	@Given("^User will Click the Application page and multiadd page$")
	public void user_will_Click_the_Application_page_and_multiadd_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases").assignCategory("PIES MultiAdd ").pass("Aces File verified");
			test = test.createNode(Scenario.class, "Multiadd aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will Click the Application page and multiadd page");
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

	@When("^User will select vehicle,make,model and will click the search option$")
	public void user_will_select_vehicle_make_model_and_will_click_the_search_option() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test = test.createNode(Scenario.class, "Multiadd aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will select vehicle,make,model and will click the search option");
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

	@When("^User will check the checkbox button and product line,part description,part number will chose$")
	public void user_will_check_the_checkbox_button_and_product_line_part_description_part_number_will_chose()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will check the checkbox button and product line,part description,part number will chose");
			mpom1.Checkbox1();
			
			mpom1.Productline(pro.getProperty("linecode"));
			
			mpom1.Partdesc(pro.getProperty("partdesc"));
			
			mpom1.Partnum(pro.getProperty("partno"));
			
			mpom1.Addbutton();
			// mpom1.scrolldown();
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");

			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will successfully saved particular product line and verify that the record has come$")
	public void user_will_successfully_saved_particular_product_line_and_verify_that_the_record_has_come()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will successfully saved particular product line and verify that the record has come");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.ACesverify("acesexpectedtext1", "engine1");
			loginfo.pass("Save or Pop up aleat was working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Save or Pop up aleat was not working" + e.getMessage());
			loginfo.fail("Save or Pop up aleat was not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^Finally macthed successfully$")
	public void finally_macthed_successfully() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally macthed successfully");
			//extent.flush();
			loginfo.pass("Aces is successfully working");
			System.out.println("**Aces is successfully working**");
		} catch (Exception e) {
			loginfo.fail("Aces is not working");
			System.out.println("**Aces is not working**");
			//extent.flush();
		}
	}

}
