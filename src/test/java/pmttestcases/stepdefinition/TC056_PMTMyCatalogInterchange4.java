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

public class TC056_PMTMyCatalogInterchange4 extends Baseclass {
	MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog6 menu link$")
	public void click_the_My_Catalog6_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange Related Testcases TC012").assignCategory("PMT MyCatalog Interchange TC012 >>>>> ").pass("PMT MyCatalog Interchange Scenarios Verification TC012 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange Related Testscenarios TC012");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog6 menu link");
		
		mpom = new MyCatalogInterchangePom();
		mpom.MyCatalogsClick();
		loginfo.pass("PMT My Catalog6 page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT My Catalog6 page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT My Catalog6 page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	@Given("^: Click the My Catalog6a menu link$")
	public void click_the_My_Catalog6a_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange TC012 Related TestcasesSS").assignCategory("PMT MyCatalog InterchangeSS TC012 >>>>> ").pass("PMT MyCatalog InterchangeSS TC012 Scenarios Verification >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange TC012 Related TestscenariosSS");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog6a menu link");
		
		mpom = new MyCatalogInterchangePom();
		mpom.MyCatalogsClick();
		loginfo.pass("PMT My Catalog6a page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT My Catalog6a page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT My Catalog6a page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}

	@When("^: Click the Interchange4 submenu link$")
	public void click_the_interchange4_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange4 submenu link");
		mpom.MyCatalogInterchangeClick();
		Thread.sleep(5000);
		loginfo.pass("The Interchange4 submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange4 submenu is not clicked properly" + e.getMessage());
			loginfo.fail("The Interchange4 submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	/* Starts here */
	
	@When("^: Click the Interchange4a submenu link$")
	public void click_the_interchange4a_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange4a submenu link");
		mpom.MyCatalogInterchangeClick();
		Thread.sleep(5000);
		loginfo.pass("The Interchange4a submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange4a submenu is not clicked properly" + e.getMessage());
			loginfo.fail("The Interchange4a submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	/* Ends here */

	@And ("^: Enter the Interchange Name2$")
	public void enter_the_interchange_name2() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name2");
		mpom.EnterInterchangePartNumber();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number2 is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number2 is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number2 is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	/* Starts here */
	
	@And ("^: Enter the Interchange Name2a$")
	public void enter_the_interchange_name2a() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name2a");
		mpom.EnterInterchangePartNumber();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number2a is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number2a is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number2a is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	/* Ends here */
	
	@And("^: Select the BeginsWith option$")
	public void select_the_beginswith_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select the BeginsWith option");
			mpom.SelectBeginWithOption();
		Thread.sleep(5000);
		loginfo.pass("The BeginsWith option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The BeginsWith option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The BeginsWith option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Select the Contains option$")
	public void select_the_contains_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select the Contains option");
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
	
	@And("^: Select the Equals option$")
	public void select_the_equals_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select the Equals option");
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
	
	@And("^: Select the EndsWith option$")
	public void select_the_ends_with_option() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select the EndsWith option");
			mpom.EndsWithOption();
		Thread.sleep(5000);
		loginfo.pass("The EndsWith option is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The EndsWith option is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The EndsWith option is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Interchange Search3 button$")
	public void click_the_interchange_search3_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search3 button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search3 button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Search3 button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search3 button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	/* Starts here */
	
	@And("^: Click the Interchange Search3a button$")
	public void click_the_interchange_search3a_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search3a button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search3a button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Search3a button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search3a button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	/* Ends here */
	
	@And("^: Verify the fields in the grid$")
	public void verify_the_fields_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the fields in the grid");
		mpom.VerifyGridFields();
		Thread.sleep(5000);
		loginfo.pass("The Grid fields are verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			loginfo.fail("The Grid fields are NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	/* Starts here */
	@And("^: Verify the fields in the grid2a$")
	public void verify_the_fields_in_the_grid2a() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the fields in the grid2a");
		mpom.VerifyGridFields();
		Thread.sleep(5000);
		loginfo.pass("The Grid fields2a are verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			loginfo.fail("The Grid fields2a are NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	/* Ends here */
	
	@And("^: Click the Part Number2 in the grid$")
	public void click_the_part_number2_in_the_grid() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Part Number2 in the grid");
		mpom.ClickPartNumberLink();
		Thread.sleep(5000);
		loginfo.pass("The Part Number2 in the grid is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number2 in the grid is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number2 in the grid is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify InterchangePart In AllInOne Screen$")
	public void verify_interchange_part_in_allinone_screen() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify InterchangePart In AllInOne Screen");
		mpom.VerifyInterchangePart();
		Thread.sleep(5000);
		loginfo.pass("The InterchangePart is verified in the AllInOne screen successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The InterchangePart is NOT verified in the AllInOne screen successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The InterchangePart is NOT verified in the AllInOne screen successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	
	@Then("^: Finally Click The Logout6 button$")
	public void finally_click_the_logout6_button() throws Throwable {
		mpom.ClickLogoutButton();
		// extent.flush();
	}		
	
	@Then("^: Finally Click The Logout7 button$")
	public void finally_click_the_logout7_button() throws Throwable {
		mpom.ClickLogoutButton();
		//extent.flush();
	}
	
}

