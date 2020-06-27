package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Applicationrelated_vehicle_make_model;
import pageobjectmodel.Applicationrelated_vehicle_make_model2;
import utility.Baseclass;

public class TC003_PMT_Master_Applicationrelated2 extends Baseclass {

	// Pageobjectclass pom;
	Applicationrelated_vehicle_make_model2 master;
	ExtentTest loginfo = null;

	@Given("^User will mouse hover on Master and choose the Equipment vehicle type page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_Equipment_vehicle_type_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Add Equipment related-Add Vehicle")
					.assignCategory("Master-Equipment Related vehicle").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Equipment Related vehicle type, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the Equipment vehicle type page");
			master = new Applicationrelated_vehicle_make_model2();
			master.clickonvehicletype();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipment type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the new Equipment vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_Equipment_vehicle_type_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the new Equipment vehicle type and choose the equivalent ACES & save");
			master.vehicletypename(pro.getProperty("vehicletypenameeq"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("vehicle type Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in Equipment vehicle grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_Equipment_vehicle_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in Equipment vehicle grid");
			master.VerifyEquipment(pro.getProperty("vehicletypenameeq"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// equipment vehicle type group
	@Given("^User will mouse hover on Master and choose the Equipment vehicle type group page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_Equipment_vehicle_type_group_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Vehicle")
					.assignCategory("Master-Application Related vehicle").pass("category added thanks");
			test = test.createNode(Scenario.class,
					"Adding Application Related vehicle type group, Make & Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on Master and choose the Equipment vehicle type group page");
			master = new Applicationrelated_vehicle_make_model2();
			master.clickonvehicletypgroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipement type group page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will enter the Equipment vehicle type group and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_Equipment_vehicle_type_group_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will enter the Equipment vehicle type group and choose the equivalent ACES & save");
			master.vehicletypegroups(pro.getProperty("vehicletypenameeq"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipement type group Added successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added record should be shown in Equipment vehicle type group grid$")
	public void user_will_verify_the_added_record_should_be_shown_in_Equipment_vehicle_type_group_grid()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added record should be shown in Equipment vehicle type group grid");
			master.VerifyequVehicletypegroup(pro.getProperty("vehicletypenameeq"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Equipment add make
	@Given("^User will mouse hover on master and choose the make for equipment$")
	public void user_will_mouse_hover_on_master_and_choose_the_make_for_equipment() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "PMT Add equipment related-Add Make")
					.assignCategory("Master-equipment Related Make").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding equipment Related Make");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the make for equipment");
			master = new Applicationrelated_vehicle_make_model2();
			master.clickonmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will click on the add button and will choose the added Equipment vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_Equipment_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will click on the add button and will choose the added Equipment vehicle type, enter the new make name and choose the equivalent ACES & save");
			master.addmakename();
			master.newmakename(pro.getProperty("makenameeq"));
			master.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will verify the added Equipment record should be shown in make grid$")
	public void user_will_verify_the_added_Equipment_record_should_be_shown_in_make_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the added Equipment record should be shown in make grid");
			master.VerifyMake(pro.getProperty("makenameeq"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	@Given("^User will mouse hover on master and choose the model for equipment$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_for_equipment() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT Add Application related-Add Model")
					.assignCategory("Master-Application Related Model").pass("category added thanks");
			test = test.createNode(Scenario.class, "Adding Application Related Model");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mouse hover on master and choose the model for equipment");
			master = new Applicationrelated_vehicle_make_model2();
			master.clickonmodel();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will mouse hover on master and choose the model click on the add button and will choose the added for equipment type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_click_on_the_add_button_and_will_choose_the_added_for_equipment_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save()
			throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save");
			master.addmodelname();
			master.addmodeldrp2();
			master.modelnameadd(pro.getProperty("modelnameeq"));
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will successfully Equipment added and verify that the record has come$")
	public void user_will_successfully_Equipment_added_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will successfully Equipment added and verify that the record has come");
			master.acceptAlert();
			master.Verifymodeleq(pro.getProperty("modelnameeq"));
			// extent.flush();
		} catch (Exception e) {
			TestStep("Fail", driver, loginfo, e);
			System.out.println(e);
			// extent.flush();

		}
	}

}
