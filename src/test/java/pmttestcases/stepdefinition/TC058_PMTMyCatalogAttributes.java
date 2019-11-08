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

public class TC058_PMTMyCatalogAttributes extends Baseclass {
	MyCatalogAttributesPom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click The My Catalog Menu Link TC014$")
	public void click_the_My_Catalog_menu_link_TC014() throws Throwable {
		
		try {
		extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Attributes Related Testcases TC014").assignCategory("PMT MyCatalog Attributes TC014 >>>>> ").pass("PMT MyCatalog Attributes Scenarios Verification TC014 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Attributes Related Testscenarios TC014");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click The My Catalog Menu Link TC014");
		
		mpom = new MyCatalogAttributesPom();
		mpom.MyCatalogsAttClick_TC014();
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
	
	@Given("^: Click The My Catalog Menu Link2 TC014$")
	public void click_the_My_Catalog_menu_link2_TC014() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT My Catalog Attributes Related Testcases TC014").assignCategory("PMT MyCatalog Attributes TC014 >>>>> ").pass("PMT MyCatalog Attributes Scenarios Verification TC014 >>>>>>");
		test = test.createNode(Scenario.class, "PMT My Catalog Attributes Related Testscenarios TC014");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click The My Catalog Menu Link2 TC014");
		
		mpom = new MyCatalogAttributesPom();
		mpom.MyCatalogsAttClick_TC014();
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
	
	

	@When("^: Click The Attributes Submenu Link TC014$")
	public void click_the_attributes_submenu_link_TC014() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click The Attributes Submenu Link TC014");
		mpom.MyCatalogAttributesClick_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Attributes submenu is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attributes submenu is NOT clicked properly" + e.getMessage());
			loginfo.fail("The Attributes submenu is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And ("^: Choose The Part Description TC014$")
	public void choose_the_part_description_TC014() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Choose The Part Description TC014");
		mpom.ChoosePartDescription_TC014();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Choose The Part Description2 TC014$")
	public void choose_the_part_description2_TC014() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Choose The Part Description2 TC014");
		mpom.ChoosePartDescription2_TC014();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description2 is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description2 is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description2 is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Choose The Attribute TC014$")
	public void choose_the_attribute_TC014() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Choose The Attribute TC014");
		mpom.ChooseAttribute_TC014();	
		Thread.sleep(5000);
		loginfo.pass("The Attribute is chosen successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attribute is NOT chosen successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Attribute is NOT chosen successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click The Submit Button TC014$")
	public void click_the_submit_button_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click The Submit Button TC014");
		mpom.ClickSubmitButton_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Submit Button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Submit Button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Submit Button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click The Part Number TC014$")
	public void click_the_part_number_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Part Number TC014");
		mpom.ClickPartNumber_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Part Number is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And("^: Check The Attributes In AllInOnePage TC014$")
	public void check_the_attributes_in_allinonepage_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Check The Attributes In AllInOnePage TC014");
		mpom.CheckAttributesInAllInOnePage_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Attributes In AllInOnePage is checked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attributes In AllInOnePage is NOT checked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Attributes In AllInOnePage is NOT checked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}	
	
	@And("^: Click The Generate Excel Button TC014$")
	public void click_the_generate_excel_button_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Generate Excel Button TC014");
		mpom.ClickGenerateExcelButton_TC014();
		Thread.sleep(5000);
		loginfo.pass("The generate excel button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The generate excel button is clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The generate excel button NOT is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click The Select All Checkbox TC014$")
	public void click_the_select_all_checkbox_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Select All Checkbox TC014");
		mpom.ClickSelectAllCheckbox_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Select All checkbox is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Select All checkbox is clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Select All checkbox is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify The Attribute Name And Value TC014$")
	public void verify_the_attribute_name_and_value_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify The Attribute Name And Value TC014");
		mpom.VerifyAttributeNameAndValue_TC014();
		Thread.sleep(5000);
		loginfo.pass("The Attribute name and value has been verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Attribute name and value has NOT been verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Attribute name and value has NOT been verified successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Select All The Checkboxes TC014$")
	public void select_all_the_checkboxes_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Select All The Checkboxes TC014");
		mpom.SelectAllCheckboxes_TC014();
		Thread.sleep(5000);
		loginfo.pass("All the checkboxes have been selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("All the checkboxes have NOT been selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("All the checkboxes have NOT been selected successfully >>>>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Verify All The Attributes And Their Values TC014$")
	public void verify_all_the_attributes_and_their_values_TC014() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify All The Attributes And Their Values TC014");
		mpom.VerifyAllAttributesAndValues_TC014();
		Thread.sleep(5000);
		loginfo.pass("All the attributes and their values have been verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("All the attributes and their values have NOT been verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("All the attributes and their values have NOT been verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
		
	@Then("^: Finally Click The Logout Button2 TC014$")
	public void finally_click_the_logout_button2_TC014() throws Throwable {
		mpom.ClickLogoutButton_TC014();
		extent.flush();
	}
	
	@Then("^: Finally Click The Logout Button TC014$")
	public void finally_click_the_logout_button_TC014() throws Throwable {
		mpom.ClickLogoutButton_TC014();
		//extent.flush();
	}
	
}
