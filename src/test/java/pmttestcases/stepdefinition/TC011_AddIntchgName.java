package pmttestcases.stepdefinition;



import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.AddIntchgName_POM;

import utility.Baseclass;

public class TC011_AddIntchgName extends Baseclass {

	AddIntchgName_POM ipom;
	ExtentTest loginfo=null;
	
	
	
	@Given("^User will mouse over master and click Interchange Name$")
	public void user_will_mouse_over_master_and_click_Interchange_Name() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Interchange Related").assignCategory("Interchange Name").pass("Interchange Name added");
			test=test.createNode(Scenario.class, "Adding InterchangeName");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mouse over master and click Interchange Name");
			ipom = new AddIntchgName_POM();
			ipom.clickonInterchangeName();
			loginfo.pass("Interchange Name Button clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Interchange Name Button Not Clicked "+e.getMessage());
			loginfo.fail(" Interchange Name Button Not Clicked ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will click Add Button and Enter Interchange name$")
	public void user_will_click_Add_Button_and_Enter_Interchange_name() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click Add Button and Enter Interchange name");
			ipom.clickAdd();
			
			ipom.EnterIntName(pro.getProperty("InterchangeNameValue"));
			loginfo.pass("Add button and Interchange Name Entereded Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Add button or Interchange Name Not Entereded "+e.getMessage());
			loginfo.fail(" Add button or Interchange Name Not Entereded ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	   
	}

	@When("^User will select checkbox Interchange Type Name and enter Brand AAIA Name$")
	public void user_will_select_checkbox_Interchange_Type_Name_and_enter_Brand_AAIA_Name() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will select checkbox Interchange Type Name and enter Brand AAIA Name");
						
			ipom.EnterBrandAAIA(pro.getProperty("BrandAAIAvalue"));
			
			loginfo.pass(" checkbox Interchange Type Selected & Brand AAIA Name Entered  Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" checkbox Interchange Type Not Selected or Brand AAIA Name Not Entered "+e.getMessage());
			loginfo.fail(" checkbox Interchange Type Not Selected or Brand AAIA Name Not Entered ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@Then("^User will click save and accept the alert$")
	public void user_will_click_save_and_accept_the_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click save and accept the alert");
			ipom.Clicksave();
			
			ipom.acceptAlert();
			
			loginfo.pass(" Interchange Name Added  Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Interchange Name Not Added"+e.getMessage());
			loginfo.fail(" Interchange Name Not Added ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}
	@Then("^User will verify InterchangeName is add or not$")
	public void user_will_verify_InterchangeName_is_add_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will verify InterchangeName is add or not");
			ipom.SearchInterchangeName(pro.getProperty("InterchangeNameValue"));
			ipom.verifytext1(pro.getProperty("DeleteProducttxt"));
			loginfo.pass(" InterchangeName verify  Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("InterchangeName Not verify "+e.getMessage());
			loginfo.fail(" InterchangeName Not verify ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	    
	}
	

}