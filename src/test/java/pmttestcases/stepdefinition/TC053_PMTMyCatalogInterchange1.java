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
import pageobjectmodel.MyCatalogInterchangePom;
import utility.Baseclass;

public class TC053_PMTMyCatalogInterchange1 extends Baseclass {
	MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog3 menu link$")
	public void click_the_My_Catalog3_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange1 Related Testcases TC009").assignCategory("PMT MyCatalog Interchange1 TC009 >>>>> ").pass("PMT MyCatalog Interchange1 Scenarios Verification TC009 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange1 Related Testscenarios TC009");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog3 menu link");
		
		mpom = new MyCatalogInterchangePom();
		mpom.MyCatalogsClick();
		loginfo.pass("PMT My Catalog page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT My Catalog page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the Interchange submenu link$")
	public void click_the_interchange_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange submenu link");
		mpom.MyCatalogInterchangeClick();
		Thread.sleep(5000);
		loginfo.pass("The Interchange submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange submenu is not clicked properly" + e.getMessage());
			loginfo.fail("The Interchange submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And ("^: Enter the Interchange Name$")
	public void enter_the_interchange_name() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name");
		mpom.EnterInterchangePartNumber();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	
	@And("^: Click the Interchange Search button$")
	public void click_the_interchange_search_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Search button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Part Number in the grid$")
	public void click_the_part_number_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Part Number in the grid");
		mpom.ClickPartNumberLink();
		Thread.sleep(5000);
		loginfo.pass("The Part Number in the grid is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number in the grid is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number in the grid is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Check whether the application is redirected to AllInOne page$")
	public void check_whether_the_application_is_redirected_to_AllInOne_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Check whether the application is redirected to AllInOne page");
		mpom.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The Application is redirected to the AllInOne page successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Application is NOT redirected to the AllInOne page successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Application is NOT redirected to the AllInOne page successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	
	@And("^: Click the Back navigation3 button$")
	public void click_the_back_navigation3_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back navigation3 button");
		mpom.ClickBackNavigationButton();
		Thread.sleep(5000);
		
		loginfo.pass("The Back Navigation button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back Navigation button is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The Back Navigation button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
		
	@Then("^: Finally Click The Logout3 button$")
	public void finally_click_the_logout_button() throws Throwable {
		mpom.ClickLogoutButton();
		//extent.flush();
	}		
	
}

