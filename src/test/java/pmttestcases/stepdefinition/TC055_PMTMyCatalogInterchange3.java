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

public class TC055_PMTMyCatalogInterchange3 extends Baseclass {
	
	pageobjectmodel.MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog5 menu link$")
	public void click_the_My_Catalog5_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange3 Related Testcases TC011").assignCategory("PMT MyCatalog Interchange3 TC011 >>>>> ").pass("PMT MyCatalog Interchange3 Scenarios Verification TC011 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange3 Related Testscenarios TC011");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog5 menu link");
		
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

	@When("^: Click the Interchange3 submenu link$")
	public void click_the_interchange3_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange3 submenu link");
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

	@And("^: Click the Interchange Search2 button$")
	public void click_the_interchange_search_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search2 button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange search button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the error message$")
	public void verify_the_error_message() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the error message");
		mpom.VerifyErrorMessage();
		Thread.sleep(5000);
		loginfo.pass("The Parts Number link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Parts Number link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Parts Number link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@Then("^: Finally Click The Logout5 button$")
	public void finally_click_the_logout_button() throws Throwable {
		mpom.ClickLogoutButton();
		//extent.flush();
	}		
	
}

