package pmttestcases.stepdefinition;




import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.AddintchagPartno_POM;
import utility.Baseclass;

public class TC012_AddIntchgPartno extends Baseclass {

	AddintchagPartno_POM ippom;
	ExtentTest loginfo=null;
	
	
	@Given("^User will mouse over master and click Interchange Part#$")
	public void user_will_mouse_over_master_and_click_Interchange_Part() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Interchange Related").assignCategory("Interchange Part#").pass("Interchange Part# added");
			test=test.createNode(Scenario.class, "Adding Interchange Part#");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mouse over master and click Interchange Part#");
			ippom = new AddintchagPartno_POM();
			ippom.clickonInterchangePart();
			loginfo.pass(" Interchange Name Button Clicked  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Part# Button Not Clicked "+e.getMessage());
			loginfo.fail(" Interchange Name Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will click Add Button and Select Interchange name$")
	public void user_will_click_Add_Button_and_Select_Interchange_name() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click Add Button and Select Interchange name");
			ippom.clickAdd();
			
			ippom.EnterIntName(pro.getProperty("IntchgNameValue4DBox"));
			loginfo.pass(" Add button & Interchange Name Selected  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Add button or Interchange Name Not Selected "+e.getMessage());
			loginfo.fail(" Add button or Interchange Name Not Selected ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will Enter the Interchange Part# and Select grade level$")
	public void user_will_Enter_the_Interchange_Part_and_Select_grade_level() throws Throwable {
		
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Enter the Interchange Part# and Select grade level");
			ippom.EnterIntchgpartValue(pro.getProperty("interchangepartno"));
			
			ippom.SelectGradeLevel(pro.getProperty("GradeLevelValue"));
			loginfo.pass(" Interchange Part# Entered & grade level Selected  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Entered or grade level Not Selected "+e.getMessage());
			loginfo.fail(" Interchange Part# Not Entered or grade level Not Selected ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will select Type code and enter internal & interchange notes$")
	public void user_will_select_Type_code_and_enter_internal_interchange_notes() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will select Type code and enter internal & interchange notes");
			ippom.SelectTypeCode(pro.getProperty("TypeCodeValue"));
			
			ippom.EnterInternalNotes(pro.getProperty("InternalNotesValue"));
			ippom.EnterInterchangeNotes(pro.getProperty("InterchangeNotesValue"));
			loginfo.pass(" Type code Selected and internal & interchange Entered  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Type code Not Selected or internal & interchange Not Entered "+e.getMessage());
			loginfo.fail(" Type code Not Selected or internal & interchange Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@Then("^User will click save button and accept the alert$")
	public void user_will_click_save_button_and_accept_the_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click save button and accept the alert");
			ippom.Clicksave();
			
			ippom.acceptAlert();
			loginfo.pass(" Interchange Part# Added  successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Interchange Part# Not Added"+e.getMessage());
			loginfo.fail(" Interchange Part# Not Added ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}
	@Then("^User will verify Interchange Part# is added or not$")
	public void user_will_verify_Interchange_Part_is_added_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will verify Interchange Part# is added or not");
			ippom.verifytext1(pro.getProperty("IntchgNameValue4DBox"), pro.getProperty("interchangepartno"));
			
			loginfo.pass("Added IntchgPartno verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Added IntchgPartno Not verify "+e.getMessage());
			loginfo.fail("Added IntchgPartno Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	}
	


}
