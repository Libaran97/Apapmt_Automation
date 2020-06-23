package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteProductCatagory;
import utility.Baseclass;


public class TC032_DeleteProductCatagory extends Baseclass {

	DeleteProductCatagory pdpom;
	
	ExtentTest loginfo=null;
	@Given("^User will mousehover and choose the product category page$")
	public void user_will_mousehover_and_choose_the_product_category_page() throws Throwable {
		
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete").assignCategory(" Delete ProductCatagory ").pass(" ProductCatagory Deleted ");
			test=test.createNode(Scenario.class, "Delete ProductCatagory");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mousehover and choose the product category page");
			pdpom = new DeleteProductCatagory();			    
			pdpom.clickonproductcategory();
			loginfo.pass("Product category page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Product category page Not Clicked "+e.getMessage());
			loginfo.fail("Product category page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@When("^User will Enter product catagory name in search box$")
	public void user_will_Enter_product_catagory_name_in_search_box() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Enter product catagory name in search box");
			pdpom.SelectsearchTextbox(pro.getProperty("categoryname"));
			pdpom.ClickDelete();
			pdpom.acceptAlert();
			pdpom.acceptAlert();
			pdpom.verifytext1(pro.getProperty("categoryname"),pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Product catagory name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product catagory name Not Entered in search box"+e.getMessage());
			loginfo.fail("Product catagory name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@When("^User will click Delete product category and accept alert$")
	public void user_will_click_Delete_product_category_and_accept_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click Delete product category and accept alert");
			pdpom.SelectsearchTextbox1(pro.getProperty("categoryname1"));
			pdpom.ClickDelete();
			pdpom.acceptAlert();
			pdpom.acceptAlert();
			loginfo.pass("Product catagory Deleted and Alert Accepted Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Product catagory Not Deleted or Alert Not Accepted"+e.getMessage());
			loginfo.fail("Product catagory Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}
	@Then("^User will Verify product category is deleted or not$")
	public void user_will_Verify_Sub_product_category_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Verify product category is deleted or not");
			//pdpom.SelectsearchTextbox(pro.getProperty("categoryname"));			
			pdpom.verifytext2(pro.getProperty("categoryname1"),pro.getProperty("DeleteProducttxt"));
			loginfo.pass("Deleteded Sub product category verify Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();

		} catch (Exception e) {
			System.out.println("Deleteded Sub product category Not verify "+e.getMessage());
			loginfo.fail("Deleteded Sub product category Not verify");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
		
	    
	}

}
