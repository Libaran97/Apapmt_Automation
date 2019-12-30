package pmttestcases.stepdefinition;

import org.openqa.selenium.Alert;
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

import pageobjectmodel.MyCatalogAttributesPom;

import utility.Baseclass;

public class TC044_PMTMyCatalogAttributes extends Baseclass {
	MyCatalogAttributesPom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the MyCatalog menu link SP AS$")
	public void click_the_my_catalog_menu_link_SP_AS() throws Throwable {
		
		try {
		// extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Attributes Related Testcases TC_SP_014").assignCategory("PMT MyCatalog Attributes TC_SP_014 >>>>> ").pass("PMT MyCatalog Attributes Scenarios Verification TC_SP_014 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Attributes Related Testscenarios TC_SP_014");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the MyCatalog menu link SP AS");
		
		mpom = new MyCatalogAttributesPom();
		mpom.MyCatalogsAttClick();
		loginfo.pass("PMT My Catalog page menu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("My Catalog page menu is NOT clicked successfully " + e.getMessage());
			loginfo.fail("My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	
	@When("^: Click the Attribute Search submenu link SP AS$")
	public void click_the_attribute_search_submenu_link_SP_AS() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Attribute Search submenu link SP AS");
		mpom.MyCatalogAttributesClick();
		Thread.sleep(5000);
		loginfo.pass("The Attributes search submenu link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attributes search submenu link is NOT clicked successfully" + e.getMessage());
			loginfo.fail("The Attributes search submenu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And ("^: Select the Part Description SP AS$")
	public void select_the_part_description_SP_AS() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Part Description SP AS");
		mpom.ChoosePartDescription();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
		
	@And ("^: Click the Attribute Checkbox SP AS$")
	public void click_the_attribute_checkbox_SP_AS() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Attribute Checkbox SP AS");
		mpom.ClickAttributeCheckbox();	
		Thread.sleep(5000);
		loginfo.pass("The Attribute checkbox is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attribute checkbox is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Attribute checkbox is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click the Submit Button SP AS$")
	public void click_the_submit_button_SP_AS() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Submit Button SP AS");
		mpom.ClickSubmitButton();
		Thread.sleep(5000);
		loginfo.pass("The Submit Button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Submit Button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Submit Button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Displayed Attribute SP AS$")
	public void verify_the_displayed_attribute_SP_AS() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Displayed Attribute SP AS");
		mpom.VerifyDisplayedAttribute();
		Thread.sleep(5000);
		loginfo.pass("The displayed Attribute is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The displayed Attribute is NOT verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The displayed Attribute is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click the Part Number SP AS$")
	public void click_the_part_number_SP_AS() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Part Number SP AS");
		mpom.ClickPartNumber();
		Thread.sleep(5000);
		loginfo.pass("The Part Number is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And("^: Verify the Title Text in AllInOne Page SP AS$")
	public void verify_the_title_text_in_allinonepage_SP_AS() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Title Text in AllInOne Page SP AS");
		mpom.VerifyTitleTextInAllInOnePage();
		Thread.sleep(5000);
		loginfo.pass("The Title text In AllInOnePage is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Title text In AllInOne Page is NOT verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Title text In AllInOne Page is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	@And("^: Click the Generate Excel Button SP AS$")
	public void click_the_generate_excel_button_SP_AS() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Generate Excel Button SP AS");
		mpom.ClickGenerateExcelButton();
		Thread.sleep(5000);
		loginfo.pass("The generate excel button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The generate excel button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The generate excel button NOT is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back Navigation Button SP AS$")
	public void click_the_back_navigation_button_SP_AS() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back Navigation Button SP AS");
		mpom.ClickBackNavigationButton();
		Thread.sleep(5000);
		loginfo.pass("The navigation Back button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The navigation Back button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The navigation Back button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
		
	@Then("^: Finally Click The Logout button SP AS$")
	public void finally_click_the_logout_button_SP_AS() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"Finally Click The Logout button SP AS");
		mpom.ClickLogoutButton();
		Thread.sleep(5000);
		loginfo.pass("The Logout button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Logout button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The logout button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
		// extent.flush();
	}
	
}