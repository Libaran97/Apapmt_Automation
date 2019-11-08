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

public class TC054_PMTMyCatalogInterchange2 extends Baseclass {
	pageobjectmodel.MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog4 menu link$")
	public void click_the_My_Catalog4_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange2 Related Testcases TC010").assignCategory("PMT MyCatalog Interchange2 TC010 >>>>> ").pass("PMT MyCatalog Interchange2 Scenarios Verification TC010 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange2 Related Testscenarios TC010");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog4 menu link");
		
		mpom = new pageobjectmodel.MyCatalogInterchangePom();
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

	@When("^: Click the Interchange2 submenu link$")
	public void click_the_interchange2_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange2 submenu link");
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

	@And ("^: Click the Part Description link$")
	public void select_the_make2_name_from_the_dropdown() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Part Description link");
		mpom.ClickPartDescriptionLink();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	
	@And("^: Click the Interchange OE link$")
	public void click_the_interchange_search_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange OE link");
		mpom.ClickInterchangeOELink();
		Thread.sleep(5000);
		loginfo.pass("The Interchange OE link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange OE link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange OE link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Parts Number link$")
	public void click_the_part_number_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Parts Number link");
		mpom.ClickPartsNumberLink();
		Thread.sleep(5000);
		loginfo.pass("The Parts Number link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Parts Number link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Parts Number link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Check whether the application is redirected to AllInOne page2$")
	public void check_whether_the_application_is_redirected_to_AllInOne_page() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Check whether the application is redirected to AllInOne page2");
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
	
	
	
	@And("^: Click the Back navigation4 button$")
	public void click_the_back_navigation3_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back navigation4 button");
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
	
		
	@Then("^: Finally Click The Logout4 button$")
	public void finally_click_the_logout_button() throws Throwable {
		mpom.ClickLogoutButton();
		//extent.flush();
	}		
	
}

