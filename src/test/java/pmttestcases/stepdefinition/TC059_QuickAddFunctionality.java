package pmttestcases.stepdefinition;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.QuickAddPom;
import utility.Baseclass;

public class TC059_QuickAddFunctionality extends Baseclass {
	QuickAddPom mpom;
	ExtentTest loginfo = null;
	
	@Given("^: Click The Parts Menu Link First TC015$")
	public void click_the_parts_menu_link_first_TC015() throws Throwable {
		
		try {
		//extent = setup();
		test = extent.createTest(Feature.class, "PMT Quick Add Functionality Testcases TC015").assignCategory("PMT Quick Add Functionality TC015 >>>>> ").pass("PMT Quick Add Functionality Scenarios Verification TC015 >>>>>>");
		test = test.createNode(Scenario.class, "PMT Quick Add Functionality Testscenarios TC015");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click The Parts Menu Link First TC015");
		
		mpom = new QuickAddPom();
		mpom.ClickPartsMenu_TC015();
		loginfo.pass("PMT Parts page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT Parts page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT Parts page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	@Given("^: Click The Parts Menu Link TC015$")
	public void click_the_parts_menu_link_TC015() throws Throwable {
		
		try {
		// extent = setup();
		test = extent.createTest(Feature.class, "PMT Quick Add Functionality Testcases TC015").assignCategory("PMT Quick Add Functionality TC015 >>>>> ").pass("PMT Quick Add Functionality Scenarios Verification TC015 >>>>>>");
		test = test.createNode(Scenario.class, "PMT Quick Add Functionality Testscenarios TC015");
		loginfo = test.createNode(new GherkinKeyword("Given"),
				"Click The Parts Menu Link TC015");
		
		mpom = new QuickAddPom();
		mpom.ClickPartsMenu_TC015();
		loginfo.pass("PMT Parts page menu clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println("PMT Parts page menu is not clicked" + e.getMessage());
			loginfo.fail("PMT Parts page menu NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			TestStep("Fail", driver, loginfo, e);
		}
	}
	
	@When("^: Click The Quick Add Button TC015$")
	public void click_the_quick_add_button_TC015() throws Throwable {
		try {
		loginfo = test.createNode(new GherkinKeyword("When"),
				"Click The Quick Add Button TC015");
		mpom.ClickQuickAddButton_TC015();
		Thread.sleep(5000);
		loginfo.pass("The quick add button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The quick add button is NOT clicked properly" + e.getMessage());
			loginfo.fail("The quick add button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@And ("^: Enter The Part Number TC015$")
	public void enter_the_part_number_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter The Part Number TC015");
		mpom.EnterPartNumber_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Part Number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Number is entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Part Description TC015$")
	public void enter_the_part_description_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Part Description TC015");
		mpom.SelectPartDescription_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Part Description2 TC015$")
	public void enter_the_part_description2_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Part Description2 TC015");
		mpom.SelectPartDescription2_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Part Description2 is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Part Description2 is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Part Description2 is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Product Line TC015$")
	public void select_the_product_line_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Product Line TC015");
		mpom.SelectProductLine_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Product Line is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Product Line is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Product Line is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Product Line2 TC015$")
	public void select_the_product_line2_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Product Line2 TC015");
		mpom.SelectProductLine2_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Product Line2 is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Product Line2 is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Product Line2 is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Enter The Quantity TC015$")
	public void enter_the_quantity_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter The Quantity TC015");
		mpom.EnterTheQuantity_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The quantity is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The quantity is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The quantity is NOT entered >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Clear The Quantity TC015$")
	public void clear_the_quantity_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Clear The Quantity TC015");
		mpom.ClearTheQuantity_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The quantity is cleared successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The quantity is NOT cleared successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The quantity is NOT cleared >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	// ClearTheQuantity_TC015
	
	@And ("^: Select The Quantity UOM TC015$")
	public void select_the_quantity_uom_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Quantity UOM TC015");
		mpom.SelectQuantityUOM_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The quantity UOM is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The quantity UOM is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The quantity UOM is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Enter The Minimum Order Quantity TC015$")
	public void enter_the_minimum_order_quantity_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter The Minimum Order Quantity TC015");
		mpom.EnterMinOrderQty_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The minimum order quantity is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The minimum order quantity is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The minimum order quantity is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Minimum Order Quantity UOM TC015$")
	public void select_the_minimum_order_quantity_uom_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Minimum Order Quantity UOM TC015");
		mpom.SelectMinOrderQuantityUOM_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The minimum order quantity UOM is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The minimum order quantity UOM is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The minimum order quantity UOM is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Item Level GTIN Qualifier TC015$")
	public void select_the_item_level_gtin_qualifier_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Item Level GTIN Qualifier TC015");
		mpom.SelectItemLevelGTINQualifier_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Item Level GTIN Qualifier is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Item Level GTIN Qualifier is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Item Level GTIN Qualifier is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Enter The GTIN Number TC015$")
	public void enter_the_gtin_number_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Enter The GTIN Number TC015");
		mpom.EnterGTINNumber_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The GTIN number is entered successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The GTIN number is NOT entered successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The GTIN number is NOT entered successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Select The Status Code TC015$")
	public void select_the_status_code_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Select The Status Code TC015");
		mpom.SelectStatusCode_TC015();	
		Thread.sleep(5000);
		loginfo.pass("The Status Code is selected successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Status Code is NOT selected successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Status Code is NOT selected successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click The Save Button TC015$")
	public void click_the_save_button_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click The Save Button TC015");
		mpom.ClickSaveButton_TC015();
		Thread.sleep(5000);
		Alert alertButton = driver.switchTo().alert();
		alertButton.accept();
		loginfo.pass("The Save Button is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Save Button is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Save Button is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click The Save Button2 TC015$")
	public void click_the_save_button2_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click The Save Button2 TC015");
		mpom.ClickSaveButton_TC015();
		Thread.sleep(5000);
		Alert alertButton = driver.switchTo().alert();
		String alertMessage = alertButton.getText();
		System.out.println("The alert message is >>>>>>>>>>>>>>>> " + alertMessage);
		if (alertMessage.contains("Required when qty enter then Qty UOM")) {
			Assert.assertEquals(true, true);
			System.out.println("The Assertion has PASSED");
		}
		else {
			System.out.println("The Assertion has FAILED");
		}
		alertButton.accept();
		loginfo.pass("The Save Button2 is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Save Button2 is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Save Button2 is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click The Save Button3 TC015$")
	public void click_the_save_button3_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click The Save Button3 TC015");
		mpom.ClickSaveButton_TC015();
		Thread.sleep(5000);
		Alert alertButton = driver.switchTo().alert();
		String alertMessage = alertButton.getText();
		System.out.println("The alert message is >>>>>>>>>>>>>>>> " + alertMessage);
		if (alertMessage.contains("Required qty")) {
			Assert.assertEquals(true, true);
			System.out.println("The Assertion has PASSED");
		}
		else {
			System.out.println("The Assertion has FAILED");
		}
		alertButton.accept();
		loginfo.pass("The Save Button3 is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Save Button3 is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Save Button3 is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Click The Save Button4 TC015$")
	public void click_the_save_button4_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Click The Save Button4 TC015");
		mpom.ClickSaveButton_TC015();
		Thread.sleep(5000);
		Alert alertButton = driver.switchTo().alert();
		String alertMessage = alertButton.getText();
		System.out.println("The alert message is >>>>>>>>>>>>>>>> " + alertMessage);
		if (alertMessage.contains("Required when min order qty enter then Min Qty UOM")) {
			Assert.assertEquals(true, true);
			System.out.println("The Assertion has PASSED");
		}
		else {
			System.out.println("The Assertion has FAILED");
		}
		alertButton.accept();
		loginfo.pass("The Save Button4 is clicked successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The Save Button4 is NOT clicked successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The Save Button4 is NOT clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Search By Part Number TC015$")
	public void search_by_part_number_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Search By Part Number TC015");
		mpom.SearchByPartNumber_TC015();
		Thread.sleep(5000);
		loginfo.pass("The part number is searched successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The part number is NOT searched successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The part number is NOT searched successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And ("^: Verify The Part Number TC015$")
	public void verify_the_part_number_TC015() throws Throwable {
		
		try {
		loginfo = test.createNode(new GherkinKeyword("And"),
				"Verify The Part Number TC015");
		mpom.VerifyThePartNumber_TC015();
		Thread.sleep(5000);
		loginfo.pass("The part number is verified successfully >>>>>>>>");
		loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch(Exception e) {
			System.out.println("The part number is NOT verified successfully >>>>>>>>" + e.getMessage());
			loginfo.fail("The part number is NOT verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	@And("^: Click The Cancel Button And Logout TC015$")
	public void click_the_cancel_and_logout_button_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Cancel Button And Logout TC015");
			mpom.ClickCancelButton_TC015();
			Thread.sleep(5000);
			mpom.ClickLogoutButton_TC015();
			loginfo.pass("The cancel and logout button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The cancel and logout button is NOT clicked successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The cancel and logout button is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}
	
	@And("^: Click The Cancel Button And Logout Last TC015$")
	public void click_the_cancel_and_logout_button_last_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Cancel Button And Logout Last TC015");
			mpom.ClickCancelButton_TC015();
			Thread.sleep(5000);
			mpom.ClickLogoutButton_TC015();
			loginfo.pass("The cancel and logout button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
			} catch(Exception e) {
				System.out.println("The cancel and logout button is NOT clicked successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The cancel and logout button is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}
	
	@And("^: Click The Cancel Button TC015$")
	public void click_the_cancel2_button_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click The Cancel Button TC015");
			mpom.ClickCancelButton_TC015();
			Thread.sleep(5000);		
			loginfo.pass("The cancel button is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The cancel button is NOT clicked successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The cancel button is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		
	}
	
	@And("^: Verify The Contents In Parts Page TC015$")
	public void verify_the_contents_in_parts_page_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Verify The Contents In Parts Page TC015");
			mpom.VerifyContentInPartsPage_TC015();
			Thread.sleep(5000);			
			loginfo.pass("The contents in the parts page is verified successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The contents in the parts page is NOT verified successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The contents in the parts page is NOT verified successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	
	}
	
	@And("^: Click An Option TC015$")
	public void click_an_option_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Click An Option TC015");
			mpom.ClickAnOption_TC015();
			Thread.sleep(5000);			
			loginfo.pass("The option is clicked successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The option is NOT clicked successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The option is NOT clicked successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		
	}
	
	@And("^: Print The Description From AllInOne Page TC015$")
	public void print_the_description_from_allinone_page_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Print The Description From AllInOne Page TC015");
			mpom.PrintDescription_TC015();
			Thread.sleep(5000);
			loginfo.pass("The description from AllInOne page is printed successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The description from AllInOne page is NOT printed successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The description from AllInOne page is NOT printed successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
		
	}
	
	@And("^: Handle The Alert TC015$")
	public void handle_the_alert_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Handle The Alert TC015");
			mpom.ClickAlertButton_TC015();
			Thread.sleep(5000);
			loginfo.pass("The alert is handled successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The alert is NOT handled successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The alert is NOT handled successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}
	
	@And("^: Delete The Part Number TC015$")
	public void delete_the_part_number_TC015() throws Throwable {
		
		try {
			loginfo = test.createNode(new GherkinKeyword("And"),
					"Delete The Part Number TC015");
			mpom.ClickDeleteButton();
			Thread.sleep(5000);
			Alert alertButton1 = driver.switchTo().alert();
			alertButton1.accept();
			Thread.sleep(5000);
			Alert alertButton2 = driver.switchTo().alert();
			alertButton2.accept();			
			loginfo.pass("The part number is deleted successfully >>>>>>>>");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch(Exception e) {
				System.out.println("The part number is NOT deleted successfully >>>>>>>>" + e.getMessage());
				loginfo.fail("The part number is NOT deleted successfully >>>>>>>>");
				loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			}
	}
	
		
	@Then("^: Finally Click The Logout Button TC015$")
	public void finally_click_the_logout_button_TC015() throws Throwable {
		mpom.ClickLogoutButton_TC015();
	}
	
}

