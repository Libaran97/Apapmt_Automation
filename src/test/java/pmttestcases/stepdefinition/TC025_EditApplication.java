package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.EditApplication;
import utility.Baseclass;

public class TC025_EditApplication extends Baseclass {

	EditApplication eapom;
	ExtentTest loginfo=null;
	
	@Given("^User will click on Application page$")
	public void user_will_click_on_Application_page() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Application Page").assignCategory("Edit NonAces Applicarion").pass("NonAces Applicarion Edited");
			test=test.createNode(Scenario.class, "Editing Applicarion");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on Application page");
			eapom = new EditApplication();
			eapom.ClickApplication();
			loginfo.pass("Application Page clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println("Application page is not click"+e.getMessage());
			loginfo.fail("Application page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	   
	}

	@When("^User will select dropdown to Choose Vehicle, Make & Model and Click search$")
	public void user_will_select_dropdown_to_Choose_Vehicle_Make_Model_and_Click_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will select dropdown to Choose Vehicle, Make & Model and Click search");
			//eapom.ChooseVehicle(pro.getProperty("vehicletypename0"));
			
			eapom.ChooseMake(pro.getProperty("makename"));
			
			eapom.ChooseModel(pro.getProperty("modelname"));
			
			eapom.Clicksearch();
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected"+e.getMessage());
			loginfo.fail("Vehicle, Make & Model dropdown not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	}

	@When("^User will selectfilter Engine Base and enter search value and search$")
	public void user_will_selectfilter_Engine_Base_and_enter_search_value_and_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will selectfilter Engine Base and enter search value and search");
			eapom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			
			eapom.SelectsearchTextbox1(pro.getProperty("SearchText1"));
			eapom.Clicksearch2();
			loginfo.pass("Choose Engine Base, search value entered and search button clicked successfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Engine Base or search value not passed"+e.getMessage());
			loginfo.fail("Engine Base or search value not passed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	   
	}

	@Then("^User will Click edit and change CC$")
	public void user_will_Click_edit_and_change_CC() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Click edit and change CC");
			eapom.ClickEdit();
			
			eapom.EditCc(pro.getProperty("EditCcvalue"));
			loginfo.pass("Edit Button Clicked and text Edit Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" edit Not Clicked or Edit text not passed"+e.getMessage());
			loginfo.fail("Edit Not Clicked or Edit text not passed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
		
	    
	}

	@Then("^User will click Update Edited successfully$")
	public void user_will_click_Update_successfully_and_verify_that_the_record_has_come() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will click Update Edited successfully");
			eapom.ClickUpdate();
			
			eapom.acceptAlert();
			loginfo.pass("Edited Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println("Not Edited Successfully"+e.getMessage());
			loginfo.fail("Not Edited Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	   
	}
	
	@Then("^User will verify that Edited record has come$")
	public void user_will_verify_that_Edited_record_has_come() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will verify that Edited record has come");
			eapom.ClickApplication2();
			//eapom.ChooseVehicle(pro.getProperty("vehicletypename0"));
			eapom.ChooseMake(pro.getProperty("makename"));
			eapom.ChooseModel(pro.getProperty("modelname"));
			eapom.Clicksearch();
			eapom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			eapom.SelectsearchTextbox2(pro.getProperty("SearchText2"));
			eapom.Clicksearch2();
			eapom.verifytext1(pro.getProperty("SearchText2"));
			loginfo.pass("Edited Application verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Edited Application Not verify "+e.getMessage());
			loginfo.fail("Edited Application Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}

}
