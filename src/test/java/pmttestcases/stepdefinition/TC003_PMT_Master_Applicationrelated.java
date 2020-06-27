package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Applicationrelated_vehicle_make_model;
import utility.Baseclass;

public class TC003_PMT_Master_Applicationrelated extends Baseclass {

	// Pageobjectclass pom;
	Applicationrelated_vehicle_make_model master;
	ExtentTest loginfo = null;

	@Given("^User will mouse hover on Master and choose the vehicle type page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_vehicle_type_page() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Vehicle")
					.assignCategory("Master-Application Related vehicle").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related vehicle type, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the vehicle type page");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletype();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_vehicle_type_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save");
			master.vehicletypename(pro.getProperty("vehicletypename"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in vehicle grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_vehicle_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the added record should be shown in vehicle grid");
			master.VerifyVehicle(pro.getProperty("vehicletypename"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}

	}

	@Given("^User will mouse hover on Master and choose the vehicle type group page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_vehicle_type_group_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Vehicle")
					.assignCategory("Master-Application Related vehicle").pass("category added thanks");
			test = test.createNode(Scenario.class,
					"Adding Application Related vehicle type group, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the vehicle type group page");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_vehicle_type_group_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new vehicle type group,group and choose the equivalent ACES & save");
			master.vehicletypegroups(pro.getProperty("vehicletypename"), pro.getProperty("Equchose"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type group Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in vehicle type group grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_vehicle_type_group_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in vehicle type group grid");
			master.VerifyVehicletypegroup(pro.getProperty("vehicletypename"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse hover on master and choose the make$")
	public void user_will_mouse_hover_on_master_and_choose_the_make() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Make")
					.assignCategory("Master-Application Related Make").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the make");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakename();
			master.newmakename(pro.getProperty("makename"));
			// master.acceptAlertformake();
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}

	}

	@Then("^User will verify the added record should be shown in make grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_make_grid()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify the added record should be shown in make grid");
			/*
			 * master.VerifyMake(pro.getProperty("vehiclename"),
			 * pro.getProperty("makename"));
			 * loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 */

			master.VerifyMake("makename");
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse hover on master and choose the model$")
	public void user_will_mouse_hover_on_master_and_choose_the_model() throws Throwable {

		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Model")
					.assignCategory("Master-Application Related Model").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the part#");
			master = new Applicationrelated_vehicle_make_model();
			master.clickonmodel();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_click_on_the_add_button_and_will_choose_the_added_vehicle_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelname();
			master.addmodeldrp2();
			master.modelnameadd(pro.getProperty("modelname"));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will successfully added and verify that the record has come\\.$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully added and verify that the record has come");
			master.acceptAlert();
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			// extent.flush();

		}

	}

}
