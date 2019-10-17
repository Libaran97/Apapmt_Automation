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

public class TC037_MultiaddacesAttributes extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1;

	@Given("^: user will create the application pages and multiadd links pages$")
	public void user_will_create_the_application_pages_and_multiadd_links_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test = test.createNode(Scenario.class, "Multiadd Aces attributes values reflected to buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links pages");
			mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
			loginfo.fail("Application and Multiadd page is not click");
		}

	}

	@When("^: user will check the all Vehicle and make and model and click the search$")
	public void user_will_check_the_all_Vehicle_and_make_and_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle and make and model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
			mpom1.searchbt();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
		}
	}

	@When("^: user will click the checkbox and use show attributes option$")
	public void user_will_click_the_checkbox_and_use_show_attributes_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the checkbox and use show attributes option");
			mpom1.Checkbox1();
			mpom1.attributepage();
			mpom1.attributepagebt();
			mpom1.scrolldown();
			loginfo.pass("Show attributes pages Aces check is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Show attributes pages Aces check is not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Show attributes pages Aces check is not working.");
		}
	}

	@When("^: user will select the product, description, part number$")
	public void user_will_select_the_product_description_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.pass("Product,desc,part...is working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out.println("**Product,desc,part...is not working**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product,desc,part...is not working..");
		}
	}

	@When("^: user will click the save options and alert popup to accept it$")
	public void user_will_click_the_save_options_and_alert_popup_to_accept_it() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the save options and alert popup to accept it");
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.Acesattverify("acesexpectedtext1","engine1");
			loginfo.pass("Product add and saves working..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Product add and saves not working...**" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Product add and saves not working....");
		}
	}

	@Then("^: Finally Show attributes is finished$")
	public void finally_Show_attributes_is_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "Finally Show attributes is finished");
			System.out.println("**Show Aces attributes succussfully added**");
			loginfo.pass("Show Aces attributes succussfully added..");
			//extent.flush();
		} catch (Exception e) {
			//extent.flush();
			loginfo.fail("Show Aces attributes succussfully not added....");
			System.out.println("**Show Aces attributes succussfully not added**");
		}
	}

}
