package pmttestcases.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/*import pageobjectmodel.MyCatalogBuyersGuidePom;
import pmt.pageobjectmodel.MultiAddPom;*/
import pageobjectmodel.MyCatalogApplicationsPom;
import utility.Baseclass;

public class TC041_PMTMyCatalogApplications extends Baseclass {
	MyCatalogApplicationsPom mpom2;
	ExtentTest loginfo = null;
	
	
	@Given("^: Click the My Catalog menu link SP$")
	public void click_the_My_Catalog_menulink_SP() throws Throwable {
		
		try {
		// extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Application Related Testcases TC_SP_008").assignCategory("PMT MyCatalog Application TC_SP_008 >>>>> ").pass("PMT MyCatalog Application Test Scenarios Verification TC_SP_008 >>>>>>");
		test = test.createNode(Scenario.class, "Check the [My Catalogs - Applications] Functionality [TC_SP_008]");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog menu link SP");
		
		mpom2 = new MyCatalogApplicationsPom();
		mpom2.MyCatalogsClick();
		loginfo.pass("My Catalog page menu link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("My Catalog page menu link is NOT clicked successfully" + e.getMessage());
			loginfo.fail("My Catalog page menu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	@Given("^: Click the My Catalog menu link2 SP$")
		public void click_the_My_Catalog_menu_link2_SP() throws Throwable {
		
		try {
		/*extent = setup(); */
		test = extent.createTest(Feature.class, "PMT My Catalog Application Related Testcases TC_SP_008").assignCategory("PMT MyCatalog Application TC_SP_008 >>>>> ").pass("PMT MyCatalog Application Test Scenarios Verification TC_SP_008 >>>>>>");
		test = test.createNode(Scenario.class, "Check the [My Catalogs - Applications] Functionality [TC_SP_008]");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog menu link2 SP");
		
		mpom2 = new MyCatalogApplicationsPom();
		mpom2.MyCatalogsClick();
		loginfo.pass("My Catalog page menu link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("My Catalog page menu link is NOT clicked successfully" + e.getMessage());
			loginfo.fail("My Catalog page menu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the Application submenu link SP$")
	public void click_the_application_submenu_link_SP() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Application submenu link SP");
		mpom2.MyCatalogApplicationsClick();
		Thread.sleep(10000);
		loginfo.pass("The Application submenu link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("Application submenu link is not clicked properly" + e.getMessage());
			loginfo.fail("The Application submenu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And ("^: Select the Make Model Year Status from the dropdown SP$")
	public void select_the_make_model_year_status_from_the_dropdown_SP() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Make Model Year Status from the dropdown SP");
		mpom2.SelectMakeModelYearStatus();	
		Thread.sleep(5000);
		loginfo.pass("The Make Model Year Status values from the dropdown are selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Make Model Year Status values from the dropdown are NOT selected successfully" + e.getMessage());
			loginfo.fail("The Make Model Year Status values from the dropdown are NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the Search button SP$")
	public void click_the_search_button_SP() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Search button SP");
		mpom2.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Search button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Search button is NOT clicked properly" + e.getMessage());
			loginfo.fail("The Search button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Application Data button SP$")
	public void click_the_view_application_data_button_SP() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Application Data button SP");
		mpom2.ClickViewApplicationDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Application Data button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Application Data button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The View Application Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Highlighted record SP$")
	public void verify_the_highlighted_record_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Highlighted record SP");
		mpom2.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The Highlighted Record is verified successfully >>>>>>>>");
		// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		loginfo.addScreenCaptureFromPath("C:\\Users\\pradeep.s\\git\\apapmt_automation\\Reports\\screenshots");
		} catch(Exception e) {
			System.out.println("The Highlighted record is NOT verified successfully" + e.getMessage());
			loginfo.fail("The Highlighted Record is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back button SP$")
	public void click_the_back_button_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back button SP");
		mpom2.ClickBackButton();
		Thread.sleep(5000);
		loginfo.pass("The Back button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back button is NOT clicked properly" + e.getMessage());
			loginfo.fail("The Back button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Part Data button SP$")
	public void click_the_view_part_data_button_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Part Data button SP");
		mpom2.ClickViewPartDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Parts Data button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Parts Data button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The View Parts Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Part Data Details screen SP$")
	public void verify_the_part_data_details_screen_SP() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Part Data Details screen SP");
		mpom2.VerifyPartDataDetails();
		Thread.sleep(5000);
		loginfo.pass("The Part Data Details screen is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Parts Data Details screen is NOT verified successfully" + e.getMessage());
			loginfo.fail("The Parts Data Details screen is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back navigation button SP$")
	public void click_the_back_navigation_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back navigation button SP");
		mpom2.ClickBackNavigationButton();
		Thread.sleep(5000);		
		loginfo.pass("The Back Navigation button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back Navigation button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The Back Navigation button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
		
			
	@Then("^: Finally Click The Logout button SP$")
	public void finally_click_the_logout_button_SP() throws Throwable {
		mpom2.ClickLogoutButton();
		// extent.flush();
	}		
	
}
