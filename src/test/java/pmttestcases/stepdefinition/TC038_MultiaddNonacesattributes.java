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

public class TC038_MultiaddNonacesattributes extends Baseclass {
	MultiAddPom mpom1;
	ExtentTest loginfo = null;

	@Given("^: user will create the application pages and multiadd pages$")
	public void user_will_create_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases2").assignCategory("PIES MultiAdd ").pass("Non Aces Attributes File verified");
			test = test.createNode(Scenario.class, "Multiadd Non-aces attributes values reflected to buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd pages");
			mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.fail("Application and Multiadd page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the all Vehicle,make and model and click the search$")
	public void user_will_check_the_all_Vehicle_make_and_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make and model and click the search");
			mpom1.Vehicledata(pro.getProperty("EnterVehicleName1"));
			mpom1.Makedata(pro.getProperty("EnterMakeName1"));
			mpom1.Modeldata(pro.getProperty("EnterModelName1"));
			mpom1.searchbt();
			loginfo.pass("Multi add landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle,Make,Model drop down values not getting properly" + e.getMessage());
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check the checkbox and use nonaces attributes$")
	public void user_will_check_the_checkbox_and_use_nonaces_attributes() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the checkbox and use nonaces attributes");
			mpom1.Checkbox1();
			mpom1.attributepage10();
			mpom1.Attrvalues(pro.getProperty("Region"));
			mpom1.scrolldown();
			loginfo.pass("Show non aces attributes pages is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("**Show non aces attributes pages is not working...**" + e.getMessage());
			loginfo.fail("Show non aces attributes pages is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^:  user will select the product, description, part number$")
	public void user_will_select_the_product_description_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			mpom1.Addbutton();
			mpom1.scrolldown();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product,desc,part...is working");
		} catch (Exception e) {
			System.out.println("**Product,desc,part...is not working**" + e.getMessage());
			loginfo.fail("Product,desc,part...is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will do save option and alert popup to accept or not$")
	public void user_will_do_save_option_and_alert_popup_to_accept_or_not() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will do save option and alert popup to accept or not");
			
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();			
			mpom1.NonAcesattverify("acesexpectedtext2","engine2");
			loginfo.pass("Product,desc,part...is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));			
		} catch (Exception e) {
			System.out.println("**Product add and saves not working...**" + e.getMessage());
			loginfo.fail("Product,desc,part...is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally Show non aces attributes is finished$")
	public void finally_Show_non_aces_attributes_is_finished() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"Finally Show non aces attributes is finished");
			//extent.flush();
			System.out.println("**Show non-aces attributes succussfully added**");
			loginfo.pass("Show non-aces attributes succussfully added");
		} catch (Exception e) {
			//extent.flush();
			loginfo.fail("Show non-aces attributes succussfully not added");
			System.out.println("**Show non-aces attributes succussfully not added**");
		}
	}

}
