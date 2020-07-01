package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteApplicationRelated;
import utility.Baseclass;

public class TC022_PMT_Delete_Master_Applicationrelated2 extends Baseclass {

	// Pageobjectclass pom;
	DeleteApplicationRelated mode = new DeleteApplicationRelated();
	ExtentTest loginfo = null;

	
	@Given("^User will mousehover and choose the partno page$")
	public void user_will_mousehover_and_choose_the_partno_page() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT del related-del partno")
					.assignCategory("Master-deleted Related part-1").pass("partno deleted thanks");
			test = test.createNode(Scenario.class, "deleting Related partno Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehover and choose the partno page");
			mode.Clickpartspage();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipment model type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will search the partno in search box and delete with accept alert$")
	public void user_will_search_the_partno_in_search_box_and_delete_with_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will search the partno in search box and delete with accept alert");
			 mode.partsearch();	
			 mode.acceptAlertbrowser();
			 mode.acceptAlertbrowser();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("model deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will Verify partno is deleted$")
	public void user_will_Verify_partno_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify partno is deleted");
			mode.Verifypartdel();
			//extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Equipment Model del
	@Given("^User will mousehover and choose the model page$")
	public void user_will_mousehover_and_choose_the_model_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT del Equipment related-del model")
					.assignCategory("Master-Equipment Related model").pass("model deleted thanks");
			test = test.createNode(Scenario.class, "deleting Equipment Related Model Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehover and choose the model page");
			mode.Clickmodel();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipment model type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will Enter modelname in search box and accept alert$")
	public void user_will_Enter_modelname_in_search_box_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter modelname in search box and accept alert");
			mode.eDeletemodel(pro.getProperty("modelnameeqedit"));
			mode.acceptAlert();
			mode.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("model deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will Verify model is deleted$")
	public void user_will_Verify_model_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify model is deleted");
			mode.Verifymodeldel(pro.getProperty("modelnameeqedit"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Euipment Make del
	@Given("^User will mousehover and choose the Make page$")
	public void user_will_mousehover_and_choose_the_Make_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT del Equipment related-del make")
					.assignCategory("Master-Equipment Related make").pass("make deleted thanks");
			test = test.createNode(Scenario.class, "deleting Equipment Related make Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"), "User will mousehover and choose the Make page");
			mode.Clickmake();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equipment make type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will Enter Makename in search box and accept alert$")
	public void user_will_Enter_Makename_in_search_box_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter Makename in search box and accept alert");
			mode.eDeletemake(pro.getProperty("makenameeqedit"));
			mode.acceptAlert();
			mode.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("make deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will Verify Make is deleted$")
	public void user_will_Verify_Make_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify make is deleted");
			mode.Verifymakedel(pro.getProperty("makenameeqedit"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Equipment Vehicle Type Group Del
	@Given("^User will mousehover and choose the equipment vehicle type group$")
	public void user_will_mousehover_and_choose_the_equipment_vehicle_type_group() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT del Equipment related-del  equipment vehicle type group")
					.assignCategory("Master-Equipment Related vehicle")
					.pass("equipment vehicle type group deleted thanks");
			test = test.createNode(Scenario.class, "deleting Equipment Related vehicle type group Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the equipment vehicle type group");
			mode.Clickeqvehciletypegroup();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equpiment vehicle type group type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will Enter equipment vehicle type group in search box and accept alert$")
	public void user_will_Enter_equipment_vehicle_type_group_in_search_box_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter equipment vehicle type group in search box and accept alert");
			mode.eDeleteeqvehicletypegroup(pro.getProperty("vehicletypenameeq"));
			mode.acceptAlert();
			mode.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equpiment vehicle type group deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will Verify equipment vehicle type group is deleted$")
	public void user_will_Verify_equipment_vehicle_type_group_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will Verify equipment vehicle type group is deleted");
			mode.Verifyvehicletypegroup(pro.getProperty("vehicletypenameeq"), pro.getProperty("DeleteProducttxt"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

	// Equipment Vehicle Del
	@Given("^User will mousehover and choose the equipment vehicle$")
	public void user_will_mousehover_and_choose_the_equipment_vehicle() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT del Equipment related-del  equipment vehicle")
					.assignCategory("Master-Equipment Related vehilce").pass("equipment vehicle deleted thanks");
			test = test.createNode(Scenario.class, "deleting Equipment Related vehicle Test Cases");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will mousehover and choose the equipment vehicle");
			mode.Clickeqvehcile();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equpiment vehicle type page landed successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@When("^User will Enter equipment vehicle in search box and accept alert$")
	public void user_will_Enter_equipment_vehicle_in_search_box_and_accept_alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will Enter equipment vehicle in search box and accept alert");
			mode.eDeleteeqvehicle(pro.getProperty("vehicletypenameeqedit"));
			mode.acceptAlert();
			mode.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Equpiment vehicle deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);

		}
	}

	@Then("^User will Verify equipment vehicle is deleted$")
	public void user_will_Verify_equipment_vehicle_is_deleted() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "User will Verify equipment vehicle is deleted");
			mode.Verifyvehicle(pro.getProperty("vehicletypenameeqedit"), pro.getProperty("DeleteProducttxt"));
			// extent.flush();
		} catch (Exception e) {
			System.out.println(e);
			TestStep("Fail", driver, loginfo, e);
			// extent.flush();
		}
	}

}
