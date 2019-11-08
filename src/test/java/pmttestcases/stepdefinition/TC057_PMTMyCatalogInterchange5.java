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
import pageobjectmodel.MyCatalogInterchangePom;
import utility.Baseclass;

public class TC057_PMTMyCatalogInterchange5 extends Baseclass {
	MyCatalogInterchangePom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click the My Catalog7 menu link$")
	public void click_the_My_Catalog7_menulink() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Interchange Related Testcases TC013").assignCategory("PMT MyCatalog InterchangeS TC013 >>>>> ").pass("PMT MyCatalog InterchangeS Scenarios Verification TC013 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Interchange Related Testscenarios TC013");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click the My Catalog7 menu link");
		
		mpom = new MyCatalogInterchangePom();
		mpom.MyCatalogsClick();
		loginfo.pass("PMT My Catalog7 page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT My Catalog7 page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT My Catalog7 page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	

	@When("^: Click the Interchange5 submenu link$")
	public void click_the_interchange5_submenu_link() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click the Interchange5 submenu link");
		mpom.MyCatalogInterchangeClick();
		Thread.sleep(5000);
		loginfo.pass("The Interchange5 submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange5 submenu is not clicked properly" + e.getMessage());
			loginfo.fail("The Interchange5 submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And ("^: Enter the Interchange Name22$")
	public void enter_the_interchange_name22() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name22");
		mpom.EnterInterchangePartNumber2();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Enter the Interchange Name3$")
	public void enter_the_interchange_name3() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name3");
		mpom.EnterInterchangePartNumber3();	
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Enter the Interchange Name4$")
	public void enter_the_interchange_name4() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter the Interchange Name4");
		mpom.EnterInterchangePartNumber4();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Part Number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Part Number is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the Interchange Search4 button$")
	public void click_the_interchange_search4_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search4 button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search4 button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Search4 button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search4 button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And("^: Click the Interchange Search5 button$")
	public void click_the_interchange_search5_button() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the Interchange Search5 button");
		mpom.ClickSearchButton();
		Thread.sleep(5000);
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
		Thread.sleep(5000);
		loginfo.pass("The Interchange Search5 button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Interchange Search5 button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Interchange Search5 button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	
	@And("^: Verify the error message2$")
	public void verify_interchange_part_in_allinone_screen() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the error message2");
		mpom.VerifyErrorMessage();
		Thread.sleep(5000);
		loginfo.pass("The InterchangePart is verified in the AllInOne screen successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The InterchangePart is NOT verified in the AllInOne screen successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The InterchangePart is NOT verified in the AllInOne screen successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Sort and compare Part Description details$")
	public void sort_and_compare_part_description_details() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Sort and compare Part Description details");
			
		mpom.SortPartDescription();
		Thread.sleep(5000);
		System.out.println("The Part Description is sorted and verified successfully >>>>>>>>");
		loginfo.pass("The Part Description is sorted and verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description is NOT sorted and verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description is NOT sorted and verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	
	@Then("^: Finally Click The Logout8 button$")
	public void finally_click_the_logout6_button() throws Throwable {
		mpom.ClickLogoutButton();
		// extent.flush();
	}		
	
	@Then("^: Finally Click The Logout9 button$")
	public void finally_click_the_logout7_button() throws Throwable {
		mpom.ClickLogoutButton();
		extent.flush();
	}
	
}

