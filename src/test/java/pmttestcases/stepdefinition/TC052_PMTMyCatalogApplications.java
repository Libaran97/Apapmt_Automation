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
import utility.Baseclass;

public class TC052_PMTMyCatalogApplications extends Baseclass {
	pageobjectmodel.MyCatalogApplicationsPom mpom2;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog2 menu link$")
	public void click_the_My_Catalog2_menulink() throws Throwable {
		
		try {
		// extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Application Related Testcases TC008").assignCategory("PMT MyCatalog Application TC008 >>>>> ").pass("PMT MyCatalog Application Scenarios Verification TC008 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Application Related Testscenarios TC008");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog2 menu link");
		
		mpom2 = new pageobjectmodel.MyCatalogApplicationsPom();
		mpom2.MyCatalogsClick();
		loginfo.pass("PMT My Catalog page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT My Catalog Application Related page is not clicked" + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the Application2 submenu link$")
	public void click_the_application2_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Application2 submenu link");
		mpom2.MyCatalogApplicationsClick();
		Thread.sleep(10000);
		loginfo.pass("The Application submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("Application submenu not clicking properly" + e.getMessage());
			loginfo.fail("The Application submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And ("^: Select the Make2 name from the dropdown$")
	public void select_the_make2_name_from_the_dropdown() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Make2 name from the dropdown");
		mpom2.SelectMakeModelYearStatus();	
		Thread.sleep(5000);
		loginfo.pass("The Make name from the dropdown is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Make name from the dropdown is not selected properly" + e.getMessage());
			loginfo.fail("The Make name from the dropdown is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Click the Search2 button$")
	public void click_the_Search_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Search2 button");
		mpom2.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Search button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Search button is not clicked properly" + e.getMessage());
			loginfo.fail("The Search button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Application Data2 button$")
	public void click_the_view_application_data2_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Application Data2 button");
		mpom2.ClickViewApplicationDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Application Data button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Application Data button is not clicked properly" + e.getMessage());
			loginfo.fail("The View Application Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Highlighted2 record$")
	public void verify_the_highlighted2_record() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Highlighted2 record");
		mpom2.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The Highlighted Record is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Highlighted record is not verified properly" + e.getMessage());
			loginfo.fail("The Highlighted Record is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back2 button$")
	public void click_the_back2_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back2 button");
		mpom2.ClickBackButton();
		Thread.sleep(5000);
		loginfo.pass("The Back button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back button is not clicked properly" + e.getMessage());
			loginfo.fail("The Back button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the View Part Data2 button$")
	public void click_the_view_part_data2_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the View Part Data2 button");
		mpom2.ClickViewPartDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Parts Data button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Parts Data button is not clicked properly" + e.getMessage());
			loginfo.fail("The View Parts Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Part Data Details2 screen$")
	public void verify_the_part_data2_details_screen() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Part Data Details2 screen");
		mpom2.VerifyPartDataDetails();
		Thread.sleep(5000);
		loginfo.pass("The Part Data Details button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Parts Data Details button is not clicked properly" + e.getMessage());
			loginfo.fail("The View Parts Data button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And("^: Click the Back navigation2 button$")
	public void click_the_back_navigation_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back navigation2 button");
		mpom2.ClickBackNavigationButton();
		Thread.sleep(5000);
		
		loginfo.pass("The Back Navigation button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back Navigation button is not clicked properly" + e.getMessage());
			loginfo.fail("The Back Navigation button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
		
	@Then("^: Finally Click The Logout2 button$")
	public void finally_click_the_logout2_button() throws Throwable {
		mpom2.ClickLogoutButton();
		//extent.flush();
	}		
	
}
 
