package pmttestcases.stepdefinition;




import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ApplicationAddNonAces;
import utility.Baseclass;

public class TC024_AddNonAcesApplication extends Baseclass {
	ApplicationAddNonAces anpom;
	ExtentTest loginfo=null;
	
	
	@Given("^User will click on Application and Click add button$")
	public void user_will_click_on_Application_and_Click_add_button() throws Throwable {
		 try {
			// extent=setup();	
				test = extent.createTest(Feature.class, "PMT Application Page");
				test=test.createNode(Scenario.class, "Adding NonAces Applicarion");
				loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on Application and Click add button");
			 		 
			anpom = new ApplicationAddNonAces();
			 anpom.ClickApplication();
			 anpom.ClickAddApplication();
			 loginfo.pass("Application and Application Add is clicked successfully");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 
		} catch (Exception e) {
			System.out.println("Application or Application Add is not click"+e.getMessage());
			loginfo.fail("Application or Application Add is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will select dropdown and Choose Vehicle, Make & Model$")
	public void user_will_select_dropdown_and_Choose_Vehicle_Make_Model() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will select dropdown and Choose Vehicle, Make & Model");
					
			anpom.ChooseVehicle(pro.getProperty("vehicletypename"));
			
			anpom.ChooseMake(pro.getProperty("makename"));
			
			anpom.ChooseModel(pro.getProperty("modelname"));
			loginfo.pass("Vehicle, Make & Model dropdown selected Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected"+e.getMessage());
			loginfo.fail("Vehicle, Make & Model dropdown not selected");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will Enter year$")
	public void user_will_Enter_year() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Enter year");
			anpom.ApplicationYear(pro.getProperty("EnterYear"));
			loginfo.pass("Year Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Year Not Entered"+e.getMessage());
			loginfo.fail("Year Not Entered in Text box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@Then("^User will click non Aces Engine Radio Button$")
	public void user_will_click_non_Aces_Engine_Radio_Button() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will click non Aces Engine Radio Button");
			anpom.checkNonAces();
			loginfo.pass("Non Aces Engine Radio Button Selected successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Non Aces Engine Radio Button Not checked"+e.getMessage());
			loginfo.fail("Non Aces Engine Radio Button Not checked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Enter NonAces Engine Base details$")
	public void user_will_Enter_Engine_Base_details() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Enter NonAces Engine Base details");
			anpom.EngineDetails(pro.getProperty("Cylindervalue"), pro.getProperty("Ccvalue"), pro.getProperty("litervalue"));
			loginfo.pass("Engine Base details Entered successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println("Engine Base details Not Entered"+e.getMessage());
			loginfo.fail("Engine Base details Not Entered");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	   
	}

	@Then("^User will successfully add$")
	public void user_will_successfully_added_and_verify_that_record_has_come() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will successfully add");
			anpom.Clicksave();
			
			anpom.acceptAlert();
			loginfo.pass("Non Aces Application Saved successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
						
		} catch (Exception e) {
			System.out.println("Non Aces Application Not Saved"+e.getMessage());
			loginfo.fail("Non Aces Application Not Saved");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	   
	}
	@Then("^User will verify that NonAces record has come$")
	public void user_will_verify_that_NonAces_record_has_come() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will verify that NonAces record has come");
			anpom.ClickApplication2();
			anpom.ChooseVehiclevry(pro.getProperty("vehicletypename"));
			anpom.ChooseMakevry(pro.getProperty("makename"));
			anpom.ChooseModelvry(pro.getProperty("modelname"));
			anpom.Clicksearch();
			anpom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			anpom.SelectsearchTextbox(pro.getProperty("SearchText1"));
			anpom.Clicksearch2();
			anpom.verifytext1(pro.getProperty("SearchText1"));
			loginfo.pass("Non Aces Application added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println("Non Aces Application Not verify "+e.getMessage());
			loginfo.fail("Non Aces Application Not added");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	    
	}

}
