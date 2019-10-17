package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteProductLine;
import utility.Baseclass;


public class TC029_DeleteProductLine extends Baseclass {

	DeleteProductLine dplpom;
	ExtentTest loginfo=null;
	
	@Given("^User will mousehover and choose the product Line page$")
	public void user_will_mousehover_and_choose_the_product_Line_page() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete").assignCategory("Delete ProductLine").pass("ProductLine Deleted");
			test=test.createNode(Scenario.class, "Deleting ProductLine");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mousehover and choose the product Line pag");
			dplpom = new DeleteProductLine();
			    
			dplpom.clickonproductLine();
			
			loginfo.pass("ProductLine clicked successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product Line page Not Clicked "+e.getMessage());
			loginfo.fail("Product Line page is not click");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}


	}

	@When("^User will Enter product Line name in search box$")
	public void user_will_Enter_product_Line_name_in_search_box() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Enter product Line name in search box");
			dplpom.SelectsearchTextbox(pro.getProperty("linecode"));
			loginfo.pass("Product Line name Entered in search box Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Product Line name Not Entered in search box"+e.getMessage());
			loginfo.fail("Product Line name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}


	}

	@When("^User will click Delete product Line and accept alert$")
	public void user_will_click_Delete_product_Line_and_accept_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click Delete product Line and accept alert");
			dplpom.ClickDelete();
			dplpom.acceptAlert();
			loginfo.pass("Product Line Deleted Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Product Line Not Deleted or Alert Not Accepted"+e.getMessage());
			loginfo.fail("Product Line Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}


	}
	@Then("^User will Verify product Line is deleted or not$")
	public void user_will_Verify_product_Line_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Verify product Line is deleted or not");
			dplpom.SelectsearchTextbox(pro.getProperty("linecode"));
			dplpom.verifytext1(pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded product Line verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Deleteded product Line Not verify "+e.getMessage());
			loginfo.fail("Deleteded product Line Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

}
