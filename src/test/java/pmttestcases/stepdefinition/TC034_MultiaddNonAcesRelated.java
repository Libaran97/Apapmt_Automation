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

public class TC034_MultiaddNonAcesRelated extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1 = new MultiAddPom();

	@Given("^: user will create the application pages$")
	public void user_will_create_the_application_pages() throws Throwable {

		try {
		//	extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases MULTIADD non aces-TC034").assignCategory("PIES MultiAdd ").pass("Non Aces values verified");
			test = test.createNode(Scenario.class, "Multiadd Non-aces save and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"), "user will create the application pages");			
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

	@When("^: user will check the all part types$")
	public void user_will_check_the_all_part_types() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the all part types");
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
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
			mpom1.NonACesverify("EnterInvalidYear", "SearchTextAcesallEngine");			
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
	
	
	@Given("^: user will create the application pages and multiadd pages$")
	public void user_will_create_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
		   // extent = setup();
			test = extent.createTest(Feature.class, "PMT Product Related Testcases MULTIADD non aces-TC034").assignCategory("PIES MultiAdd ").pass("Non Aces attributes values verified");
			test = test.createNode(Scenario.class, "Multiadd Non-aces attributes values reflected to buyers guide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd pages");			
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
			mpom1.Vehicledata(pro.getProperty("vehicletypename"));
			mpom1.Makedata(pro.getProperty("makename"));
			mpom1.Modeldata(pro.getProperty("modelname"));
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
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			mpom1.attributepage10();
			mpom1.scrolldown();
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
			mpom1.scrolldown();
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
			mpom1.NonAcesattverify("EnterInvalidYear","SearchTextAcesallEngine");
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
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Finally Show non aces attributes is finished");			
			System.out.println("**Show non-aces attributes succussfully added**");
			loginfo.pass("Show non-aces attributes succussfully added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Show non-aces attributes succussfully not added");
			System.out.println("**Show non-aces attributes succussfully not added**");
			//extent.flush();
		}
	}
}
