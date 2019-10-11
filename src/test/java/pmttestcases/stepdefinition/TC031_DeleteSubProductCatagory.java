package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DeleteSubProductCatagory;
import utility.Baseclass;


public class TC031_DeleteSubProductCatagory extends Baseclass {

	DeleteSubProductCatagory spdpom;
	ExtentTest loginfo=null;
	@Given("^User will mousehover and choose the Sub product category page$")
	public void user_will_mousehover_and_choose_the_Sub_product_category_page() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT ProductRelated Delete");
			test=test.createNode(Scenario.class, "Delete SubProductCatagory");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mousehover and choose the Sub product category page");
			spdpom = new DeleteSubProductCatagory();
			    
			spdpom.clickonSubproductcategory();
			loginfo.pass("Sub product category page Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Sub product category page Not Clicked "+e.getMessage());
			loginfo.fail("Sub product category page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will select Category in drop down and Enter product catagory name in search box$")
	public void user_will_select_Category_in_drop_down_and_Enter_product_catagory_name_in_search_box() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will select Category in drop down and Enter product catagory name in search box");
			spdpom.SelectCategory(pro.getProperty("categoryname"));
			spdpom.SelectsearchTextbox(pro.getProperty("subcategoryname"));
			loginfo.pass("Category selected in drop down and product catagory name Entered Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category Not selected in drop down or product catagory name Not Entered in search box"+e.getMessage());
			loginfo.fail("Category Not selected in drop down or product catagory name Not Entered in search box");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}

	@When("^User will click Delete Sub product category and accept alert$")
	public void user_will_click_Delete_Sub_product_category_and_accept_alert() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click Delete Sub product category and accept alert");
			spdpom.ClickDelete();
			spdpom.acceptAlert();
			loginfo.pass("Sub product catagory Deleted and Alert Accepted Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Sub product catagory Not Deleted or Alert Not Accepted"+e.getMessage());
			loginfo.fail("Sub product catagory Not Deleted or Alert Not Accepted");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	    
	}
	@Then("^User will Verify Sub product category is deleted or not$")
	public void user_will_Verify_Sub_product_category_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Verify Sub product category is deleted or not");
			spdpom.verifytext1(pro.getProperty("categoryname"), pro.getProperty("subcategoryname"), pro.getProperty("DeleteProducttxt"));
			
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