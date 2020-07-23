package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsBom;
import pageobjectmodel.PartsPackage;
import utility.Baseclass;

public class TC016_Bom extends Baseclass {

	ExtentTest loginfo = null;
	PartsBom ppbom = new PartsBom();

	@Given("^User will go to parts page and search for a partno bom$")
	public void user_will_go_to_parts_page_and_search_for_a_partno_bom() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom add");
			test = test.createNode(Scenario.class, "Adding Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for a partno bom");
			ppbom.partslanding();
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Bom$")
	public void user_will_click_on_Bom_and_select_Package_UOM_dropdown() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on Bom and select Package UOM dropdown");
			ppbom.bomclick();			
			loginfo.pass("Bom click successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Bom click not successfully" + e.getMessage());
			loginfo.fail("Bom click not successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter partno and Qty$")
	public void user_will_Enter_partno_and_Qty() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter partno and Qty");	
			ppbom.bompartandqty(pro.getProperty("partnoenter"),pro.getProperty("bompart"));
			ppbom.SaveAcceptAlert();
			loginfo.pass("partno and Qty Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("partno and Qty Not Entered" + e.getMessage());
			loginfo.fail("partno and Qtyh Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has shown in the bom$")
	public void user_will_verify_the_reocrd_has_shown_in_the_bom() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the bom");
			ppbom.Verify();
			loginfo.pass("Bom Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Bom Not Verified" + e.getMessage());
			loginfo.fail("Bom Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
	
	 //BOM edit operation
	@Given("^User will go to parts page and search for partno bom edit$")
	public void user_will_go_to_parts_page_and_search_for_partno_bom_edit() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom edit");
			test = test.createNode(Scenario.class, "editing Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno bom edit");
			ppbom.partslanding();
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on Bom Edit Button$")
	public void user_will_click_on_Bom_Edit_Button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on Bom Edit Button");
			ppbom.bomclick();		
			ppbom.BOMEditbt();
			loginfo.pass("Bom edit click successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Bom edit click not successfully" + e.getMessage());
			loginfo.fail("Bom edit click not successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Enter partno and Qty for Edit$")
	public void user_will_Enter_partno_and_Qty_for_Edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will Enter partno and Qty for Edit");	
			ppbom.bompartandqtyedit();
			ppbom.SaveAcceptAlert();
			
			loginfo.pass("change Qty Entered Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("change Qty Not Entered" + e.getMessage());
			loginfo.fail("change Qty Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the reocrd has shown in the bom for edit$")
	public void user_will_verify_the_reocrd_has_shown_in_the_bom_for_edit() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the reocrd has shown in the bom for edit");
			ppbom.Verifyedit();
			loginfo.pass("Bom edit Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Bom edit Not Verified" + e.getMessage());
			loginfo.fail("Bom edit Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
	
	//BOM delete option
	@Given("^User will go to parts page and search for the partno bom del$")
	public void user_will_go_to_parts_page_and_search_for_the_partno_bom_del() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts Bom Add, Edit and Delete")
					.assignCategory("Parts bom").pass("Bom del");
			test = test.createNode(Scenario.class, "del Bom in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for the partno bom del");
			ppbom.partslanding();
			ppbom.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click on bom and Click Delete Button Accept Alert$")
	public void user_will_click_on_bom_and_Click_Delete_Button_Accept_Alert() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"), "User will click on bom and Click Delete Button Accept Alert");	
			ppbom.bomclick();
			ppbom.bomdelbt();
			ppbom.SaveAcceptAlertdel();
			loginfo.pass("deleted Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("change Qty Not Entered" + e.getMessage());
			loginfo.fail("change Qty Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will verify the record del has not shown in the below grid$")
	public void user_will_verify_the_record_del_has_not_shown_in_the_below_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will verify the record del has not shown in the below grid");
			ppbom.DeleteVerifybom();
			loginfo.pass("Bom deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Bom deleted Not Verified" + e.getMessage());
			loginfo.fail("Bom deleted Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}

}
