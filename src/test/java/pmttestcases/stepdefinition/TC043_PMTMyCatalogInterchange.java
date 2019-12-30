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

public class TC043_PMTMyCatalogInterchange extends Baseclass {
	MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog menu link SP INT$")
	public void click_the_my_catalog_menu_link_SP_INT() throws Throwable {
		
		try {
		// extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange Related Testcases TC_SP_009").assignCategory("PMT MyCatalog Interchange TC_SP_009 >>>>> ").pass("PMT MyCatalog Interchange Scenarios Verification TC_SP_009 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange Related Testscenarios TC_SP_009");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog menu link SP INT");
		
		mpom = new MyCatalogInterchangePom();
		mpom.MyCatalogsClick();
		loginfo.pass("My Catalog page menu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("My Catalog page menu is NOT clicked successfully" + e.getMessage());
			loginfo.fail("My Catalog page menu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the Interchange submenu link SP INT$")
	public void click_the_interchange_submenu_link_SP_INT() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange submenu link SP INT");
		mpom.MyCatalogInterchangeClick();
		Thread.sleep(5000);
		loginfo.pass("The Interchange submenu link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange submenu link is not clicked successfully" + e.getMessage());
			loginfo.fail("The Interchange submenu link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Part Description Link SP INT$")
	public void click_the_part_description_link_SP_INT() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Part Description Link SP INT");
		mpom.ClickPartDescriptionLink();
		Thread.sleep(5000);
		loginfo.pass("The Part description link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The part description link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The part description link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And ("^: Click the Interchange Link SP INT$")
	public void click_the_interchange_link_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Interchange Link SP INT");
		mpom.ClickInterchangeOELink();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	
	@And("^: Click the Part Number Link SP INT$")
	public void click_the_part_number_link_SP_INT() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Part Number Link SP INT");
		mpom.ClickPartNumberLink();
		Thread.sleep(5000);
		loginfo.pass("The Part Number Link is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number Link is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number Link is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Fetch the Interchange Part Number SP INT$")
	public void fetch_the_interchange_part_number_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Fetch the Interchange Part Number SP INT");
		mpom.FetchInterchangePartNumber();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number is fetched successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number is NOT fetched successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number is NOT fetched successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	} 
	
	@And ("^: Enter the Interchange Part Number SP INT$")
	public void enter_the_interchange_part_number_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Part Number SP INT");
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
	
	@And ("^: Select the Begins With Option SP INT$")
	public void select_the_begins_with_option_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Begins With Option SP INT");
		mpom.SelectBeginWithOption();
		Thread.sleep(5000);
		loginfo.pass("The Begins With option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Begins With option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Begins With option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select the Contains Option SP INT$")
	public void select_the_contains_option_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Contains Option SP INT");
		mpom.ContainsOption();
		Thread.sleep(5000);
		loginfo.pass("The Contains option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Contains option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Contains option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select the Ends With Option SP INT$")
	public void select_the_ends_with_option_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Ends With Option SP INT");
		mpom.EndsWithOption();
		Thread.sleep(5000);
		loginfo.pass("The Ends With option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Ends With option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Ends With option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select the Equals Option SP INT$")
	public void select_the_equals_option_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select the Equals Option SP INT");
		mpom.EqualsOption();
		Thread.sleep(5000);
		loginfo.pass("The Equals option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Equals option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Equals option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	
	@And ("^: Click the Search Button SP INT$")
	public void click_the_search_button_SP_INT() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the Search Button SP INT");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Search button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Search button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Search button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	
	@And("^: Verify Contents In AllInOne Screen SP INT$")
	public void verify_contents_in_allinone_screen_SP_INT() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify Contents In AllInOne Screen SP INT");
		mpom.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The contents in the AllInOne page is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The contents in the AllInOne page is NOT verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The contents in the AllInOne page NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the Interchange Number SP INT$")
	public void verify_the_interchange_number_SP_INT() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the Interchange Number SP INT");
		mpom.VerifyInterchangeNumber();
		Thread.sleep(5000);
		loginfo.pass("The Interchange number is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange number is NOT verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange number is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Back Navigation button SP INT$")
	public void click_the_back_navigation_button_SP_INT() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Back Navigation button SP INT");
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
	
		
	@Then("^: Finally Click The Logout button SP INT$")
	public void finally_click_the_logout_button_SP_INT() throws Throwable {
		mpom.ClickLogoutButton();
		//extent.flush();
	}		
	
}