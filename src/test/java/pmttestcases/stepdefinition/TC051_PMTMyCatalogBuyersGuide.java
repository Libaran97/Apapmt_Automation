package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.MyCatalogBuyersGuidePom;
import utility.Baseclass;

public class TC051_PMTMyCatalogBuyersGuide extends Baseclass {
	pageobjectmodel.MyCatalogBuyersGuidePom mpom1;
	ExtentTest loginfo = null;

	@Given("^: Click the My Catalog menu link$")
	public void click_the_mycatalog_menulink() throws Throwable {
		try {
			
			extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC007").assignCategory("PMT MyCatalog Buyers Guide TC007 >>>>> ").pass("PMT MyCatalog Buyers Guide Scenarios Verification TC007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC007");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the My Catalog menu link");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.MyCatalogsClick();
			loginfo.pass("PMT My Catalog page menu clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog menu cannot be clicked " + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Click the My Catalog menu link1a$")
	public void click_the_mycatalog_menulink1a() throws Throwable {
		try {
			
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC007").assignCategory("PMT MyCatalog Buyers Guide TC007 >>>>> ").pass("PMT MyCatalog Buyers Guide Scenarios Verification TC007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC007");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the My Catalog menu link1a");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.MyCatalogsClick();
			loginfo.pass("PMT My Catalog page menu clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog menu cannot be clicked " + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Click the My Catalog menu link1b$")
	public void click_the_mycatalog_menulink1b() throws Throwable {
		try {
			
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC007").assignCategory("PMT MyCatalog Buyers Guide TC007 >>>>> ").pass("PMT MyCatalog Buyers Guide Scenarios Verification TC007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC007");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the My Catalog menu link1b");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.MyCatalogsClick();
			loginfo.pass("PMT My Catalog page menu clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog menu cannot be clicked " + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}
	
	@Given("^: Click the My Catalog menu link1c$")
	public void click_the_mycatalog_menulink1c() throws Throwable {
		try {
			
			// extent = setup();
			test = extent.createTest(Feature.class, "PMT My Catalog Buyers Guide Related Testcases TC007").assignCategory("PMT MyCatalog Buyers Guide TC007 >>>>> ").pass("PMT MyCatalog Buyers Guide Scenarios Verification TC007 >>>>>>");
			test = test.createNode(Scenario.class, "PMT My Catalog Buyers Guide Related Testscenarios TC007");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"Click the My Catalog menu link1c");
			
			mpom1 = new MyCatalogBuyersGuidePom();
			mpom1.MyCatalogsClick();
			loginfo.pass("PMT My Catalog page menu clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("My Catalog menu cannot be clicked " + e.getMessage());
			loginfo.fail("PMT My Catalog page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
		
	}

	@When("^: Click the Buyers Guide submenu link$")
	public void click_the_buyersguide_submenu_link() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"Click the Buyers Guide submenu link");
			mpom1.BuyersGuideClick();
			Thread.sleep(5000);
			loginfo.pass("The Buyers Guide submenu is clicked successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Buyers Guide submenu cannot be clicked" + e.getMessage());
			loginfo.fail("The Buyers Guide submenu is NOT clicked successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And ("^: Enter the Part Number$")
	public void enter_the_part_number() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Enter the Part Number");
			mpom1.EnterPartNumber();
			Thread.sleep(5000);
			loginfo.pass("The Part Number is entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Part number cannot be entered" + e.getMessage());
			loginfo.fail("The Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@And("^: Finally Click the Search button$")
	public void finally_click_the_search_button() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Finally Click the Search button");
			mpom1.ClickSearchButton();
			Thread.sleep(5000);
			loginfo.pass("The Search Button is clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Search button cannot be clicked" + e.getMessage());
			loginfo.fail("The Search Button is NOT clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the view application data button$")
	public void click_the_view_application_data_button() throws Throwable {

		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the view application data button");
			mpom1.ClickViewApplicationDataButton();
			Thread.sleep(5000);
			loginfo.pass("The View Application Data Button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("View application data button cannot be clicked" + e.getMessage());
			loginfo.fail("The View Application Data Button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the highlighted record$")
	public void verify_the_highlighted_record() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the highlighted record");
		mpom1.VerifyHighlightedRecord();
		Thread.sleep(5000);
		loginfo.pass("The Highlighted record is verified successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("Highlighted record cannot be verified" + e.getMessage());
			loginfo.fail("The Highlighted record is NOT verified successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	      }
	}
	
	@And("^: Click the back button$")
	public void click_the_back_button() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click the back button");
		mpom1.ClickBackButton();
		driver.navigate().refresh();
		Thread.sleep(5000);
		loginfo.pass("The Back button is clicked successfully >>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back button cannot be clicked" + e.getMessage());
			loginfo.fail("The Back button is NOT clicked successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the view part data button$")
	public void click_the_view_part_data_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the view part data button");
		mpom1.ClickViewPartDataButton();
		Thread.sleep(5000);
		loginfo.pass("The View Part Data button is clicked successfully >>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The View Parts Data button cannot be clicked" + e.getMessage());
			loginfo.fail("The View Part Data button NOT is clicked successfully >>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify the part data details screen$")
	public void verify_the_part_data_details_screen() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify the part data details screen");
		mpom1.VerifyPartDataDetails();	
		Thread.sleep(5000);
		loginfo.pass("The Part Data details screen is verified successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Data details cannot be verified" + e.getMessage());
			loginfo.fail("The Part Data details screen is NOT verified successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click the back navigation button$")
	public void click_the_back_navigation_button() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click the back navigation button");
		mpom1.ClickBackNavigationButton();
		Thread.sleep(5000);
		loginfo.pass("The Back navigation button is clicked successfully >>>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Back navigation button cannot be clicked" + e.getMessage());
			loginfo.fail("The Back navigation button is NOT clicked successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Generate and download the excel$")
	public void generate_and_download_excel() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Generate and download the excel");
		mpom1.GenerateExcelReport();
		Thread.sleep(5000);
		loginfo.pass("The excel report is generated and downloaded successfully >>>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Generate and download excel button cannot be clicked" + e.getMessage());
			loginfo.fail("The excel report is NOT generated and downloaded successfully >>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@Then("^: Finally click the logout button$")
	public void finally_click_the_logout_button() throws Throwable {
		mpom1.ClickLogoutButton();
		//extent.flush();
	}
	
	
}
