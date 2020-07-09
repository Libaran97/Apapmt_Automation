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

public class TC035_MultaddCancelandDeleteattributes extends Baseclass {
	ExtentTest loginfo = null;
	MultiAddPom mpom1 = new MultiAddPom();

	@Given("^: user will create the application pages and multiadd links$")
	public void user_will_create_the_application_pages_and_multiadd_links() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Check the Cancel button in MULTIADD-TC035")
					.assignCategory("PIES MultiAdd ").pass("Cancel button verified");
			test = test.createNode(Scenario.class, "Multiadd Cancel case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links");
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
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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
			// mpom1.Checkboxall();
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
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will check Cancel button$")
	public void user_will_check_Cancel_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check Cancel button");
			mpom1.Cancel();
			mpom1.cancelverify();
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

			loginfo.pass("Cancel button was succussfully working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Cancel button was succussfully working**");
			// extent.flush();
		} catch (Exception e) {
			loginfo.fail("Cancel button is not click");
			// extent.flush();
			System.out.println("**Cancel button was not succussfully working**");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			e.printStackTrace();
		}
	}

	// 2nd program-delete
	@Given("^: user will create the application pages and multiadd links on same page$")
	public void user_will_create_the_application_pages_and_multiadd_links_on_same_page() throws Throwable {
		try {
			// extent=setup();
			test = extent.createTest(Feature.class, "Check the Delete button in multiadd-TC035")
					.assignCategory("PIES MultiAdd ").pass("Delete button verified");
			test = test.createNode(Scenario.class, "Multiadd Delete case in the Multi add page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will create the application pages and multiadd links on same page");
			// mpom1 = new MultiAddPom();
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
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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
			// mpom1.Checkboxall();
			mpom1.Checkbox2("EnterYear", "Acesvalue");
			mpom1.scrolldown();
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
			// extent.flush();
			loginfo.pass("*Delete button succussfully added...");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("**Delete button succussfully added**");
		} catch (Exception e) {
			// extent.flush();
			System.out.println("Failed Delete functionality..");
			loginfo.fail("Failed Delete functionality..");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	// 3rd program
	@Given("^: user will click the application pages and multiadd pages$")
	public void user_will_click_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent
					.createTest(Feature.class,
							"Check the qty,Position and notes in multiadd and verify the buyerguide-TC035")
					.assignCategory("PIES MultiAdd ").pass("Attributes values all verified");
			test = test.createNode(Scenario.class, "Multiadd attributes values check and reflected to buyersguide");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will click the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
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

	@When("^: user will check the all Vehicle,make model and clicks the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_clicks_the_search() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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

	@When("^: user will check the checkbox in the grid$")
	public void user_will_check_the_checkbox_in_the_grid() throws Throwable {
		try {

			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the grid");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Check box is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Check box is not working" + e.getMessage());
			loginfo.fail("Check box is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description,part number on the table$")
	public void user_will_select_the_product_description_part_number_on_the_table() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number as well");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the Qty,Position and Notes and click the add option$")
	public void user_will_click_the_Qty_Position_and_Notes_and_click_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty,Position and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Qty,notes..values getting properly");
		} catch (Exception e) {
			System.out.println("Qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("Qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,position and notes in the buyersguide$")
	public void user_will_verify_the_qty_position_and_notes_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),

					"user will verify the qty,position and notes in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.fail("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally Show attributes details is finished$")
	public void finally_Show_attributes_details_is_finished() throws Throwable {
		try {
			// extent.flush();
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally Show attributes details is finished");
			loginfo.pass("Attributes qty,position and notes details verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Attributes qty,position and notes details verified..");
		} catch (Exception e) {
			// extent.flush();
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Attributes qty,position and notes details not verified");
			System.out.println("Attributes qty,position and notes details not verified..");
		}
	}

	// 4th feature
	@Given("^: user will click the application pages and multiadd page$")
	public void user_will_click_the_application_pages_and_multiadd_page() throws Throwable {
		try {
			// extent = setup();
			test = extent.createTest(Feature.class, "Check the Qty,notesin multiadd and verify the buyerguide-TC035")
					.assignCategory("PIES MultiAdd ").pass("Attribues Qty,notes values verified");
			test = test.createNode(Scenario.class, "Multiadd qty,notes to check add or not");

			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will click the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
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

	@When("^: user will check the all Vehicle,make,model and click the search$")
	public void user_will_check_the_all_Vehicle_make_model_and_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all Vehicle,make,model and click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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

	@When("^: user will check the checkbox in the table$")
	public void user_will_check_the_checkbox_in_the_table() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the table");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Checkbox is click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Checkbox is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^:  user will select the product, description, part number in drop field$")
	public void user_will_select_the_product_description_part_number_in_drop_field() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part number in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the Qty and Notes and click the add option$")
	public void user_will_click_the_Qty_and_Notes_and_click_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty and Notes and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Notes(pro.getProperty("notesdata"));
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("Qty,notes..values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("Qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the qty,notes in the buyersguide$")
	public void user_will_verify_the_qty_notes_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the qty,notes in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			// mpom1.Qtyverify1("acesexpectedtext2", "SearchTextAcesallEngine", "qtydata");
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.pass("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^: Finally qty and notes added$")
	public void finally_qty_and_notes_added() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally qty and notes added");
			loginfo.pass("Attributes qty,notes details verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Attributes qty,notes details verified..");
			// extent.flush();
		} catch (Exception e) {
			// extent.flush();
			loginfo.fail("Attributes qty,notes details not verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Attributes qty,notes details not verified..");
		}
	}

	// 5th feature
	@Given("^: user will select the application pages and multiadd pages$")
	public void user_will_select_the_application_pages_and_multiadd_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent
					.createTest(Feature.class, "Check the qty,Position in multiadd and verify the buyerguide-TC035")
					.assignCategory("PIES MultiAdd ").pass("Attribues Qty,position values verified");
			test = test.createNode(Scenario.class, "Multiadd qty,Position to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the application pages and multiadd pages");
			// mpom1 = new MultiAddPom();
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

	@When("^: user will check the all chose Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chose_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chose Vehicle,make,model  with click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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

	@When("^: user will check the checkbox in the tables$")
	public void user_will_check_the_checkbox_in_the_tables() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tables");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Vehicle,Make,Model drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Vehicle,Make,Model drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will choose the product, description, part no in the dropdown$")
	public void user_will_choose_the_product_description_part_no_in_the_dropdown() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part no in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will click the Qty and position and click the add option$")
	public void user_will_click_the_Qty_and_position_and_click_the_add_option() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the Qty and position and click the add option");
			mpom1.qty(pro.getProperty("qtydata"));
			mpom1.Position();
			mpom1.scrolldown();
			mpom1.Addbutton();
			mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			loginfo.pass("Qty and poition is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Qty,position..values not getting properly" + e.getMessage());
			loginfo.fail("Qty and poition is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}

	}

	@When("^: user will verify the position in the buyersguide$")
	public void user_will_verify_the_position_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the position in the tabular column");
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.fail("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally qty and position added$")
	public void finally_qty_and_position_added() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally qty and position added");
			// extent.flush();
			loginfo.pass("Attributes qty,position details verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Attributes qty,position details verified..");
		} catch (Exception e) {
			// extent.flush();
			loginfo.fail("Attributes qty,position details not verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Attributes qty,position details not verified..");
		}
	}

	@Given("^: user will select the application paged and multiadd pages$")
	public void user_will_select_the_application_paged_and_multiadd_pages() throws Throwable {
		try {
			// extent = setup();
			test = extent
					.createTest(Feature.class, "Check the Notes,Position in multiadd and verify the buyerguide-TC035")
					.assignCategory("PIES MultiAdd ").pass("Attribues Position,notes values verified");
			test = test.createNode(Scenario.class, "Multiadd position,notes to check add or not");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"user will select the application page and multiadd pages");
			// mpom1 = new MultiAddPom();
			mpom1.Application();
			mpom1.Multiaddbt();
			loginfo.pass("Application and Multiadd page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Application and Multiadd page is not click" + e.getMessage());
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			loginfo.fail("Application and Multiadd page is not click");
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: user will check the all chosen Vehicle,make,model along with click the search$")
	public void user_will_check_the_all_chosen_Vehicle_make_model_along_with_click_the_search() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will check the all chose Vehicle,make,model  with click the search");
			mpom1.Vehicledata(pro.getProperty("vehicletypename0"));
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

	@When("^: user will check the checkboxs in the tables$")
	public void user_will_check_the_checkboxs_in_the_tables() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "user will check the checkbox in the tables column");
			// mpom1.Checkbox1();
			mpom1.Checkbox3("EnterInvalidYear", "NonAcesvalue");
			mpom1.scrolldown();
			loginfo.pass("Checkbox is click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Checkbox is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will select the product, description, part nos in the dropdown$")
	public void user_will_select_the_product_description_part_nos_in_the_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will select the product, description, part num in the dropdown");
			mpom1.Productline(pro.getProperty("linecode"));
			mpom1.Partdesc(pro.getProperty("partdesc"));
			mpom1.Partnum(pro.getProperty("partno"));
			loginfo.pass("Product line,Partdesc,Partnum.. drop down values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		} catch (Exception e) {
			System.out
					.println("Product line,Partdesc,Partnum.. drop down values not getting properly" + e.getMessage());
			loginfo.fail("Product line,Partdesc,Partnum.. drop down values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will click the notes and position and select the add option$")
	public void user_will_click_the_notes_and_position_and_select_the_add_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will click the notes and position and click the add option");
			mpom1.scrolldown();
			mpom1.Position();
			mpom1.Notes(pro.getProperty("notesdata"));
			// mpom1.qtyclear();
			// mpom1.scrolldown();
			mpom1.Addbutton();
			// mpom1.scrolldown();
			mpom1.Savebutton();
			mpom1.acceptAlert();
			mpom1.Part();
			mpom1.partsearch();
			mpom1.buyerguide();
			mpom1.scrolldown();
			// mpom1.verifyalert3();
			loginfo.pass("postion,qty,notes..values getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("postion,qty,notes..values not getting properly" + e.getMessage());
			loginfo.fail("postion,qty,notes..values not getting properly");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^: user will verify the position and note in the buyersguide$")
	public void user_will_verify_the_position_and_note_in_the_buyersguide() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"user will verify the position and notes in the tabular column");

			mpom1.Qtyverify("EnterInvalidYear", "SearchTextAcesallEngine", "postion");
			loginfo.pass("Verify attributes values is working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Verify attributes values is not working.." + e.getMessage());
			loginfo.fail("Verify attributes values is not working");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));

		}
	}

	@Then("^: Finally notes and position added success$")
	public void finally_notes_and_position_added_success() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"), "Finally notes and position added success");
			loginfo.pass("Notes and POStion is success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Notes and Postion is success");
			// extent.flush();
		} catch (Exception e) {
			loginfo.fail("Notes and POStion is not success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			System.out.println("Notes and POStion is not success");
			// extent.flush();

		}
	}
}
