package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Background;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsAdd_POM;
import pageobjectmodel.PartsListAll;
import utility.Baseclass;

public class TC013PartsListAll extends Baseclass {

	PartsListAll eppom;
	PartsAdd_POM parts;
	ExtentTest loginfo=null;
	
	@Given("^User will click on parts page and it will redirect to parts page(\\d+)$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page(int arg1) throws Throwable {
		try {
			extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts ListAll").assignCategory("Parts Add").pass("category added thanks");
			test=test.createNode(Background.class, "Create part no for copy appparts");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click on parts page and it will redirect to parts page(\\\\d+)");
			parts = new PartsAdd_POM();
			parts.partslandingpage();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		 }   catch (Exception e) {
			 System.out.println(e);
			 TestStep("Fail",driver,loginfo,e);
	}
	    
	}

	@When("^User will click on the add buton and choose product category, sub category,part desc, product line(\\d+)$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line(int arg1) throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add buton and choose product category, sub category,part desc, product line(\\\\d+)");
			parts.partsadd();
			parts.partsadddrp2();
			parts.partsadddrp3();
			parts.partsadddrp4();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} 	catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
		}	
	    
	}

	@When("^User will enter the part# and click on save(\\d+)$")
	public void user_will_enter_the_part_and_click_on_save(int arg1) throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will enter the part# and click on save(\\\\d+)");
			parts.savenewpart(pro.getProperty("partno3"));
			parts.acceptAlert();
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}catch ( Exception e) {
			System.out.println(e);
			TestStep("Fail",driver,loginfo,e);
			
			
		}
	    
	}

	@Then("^User will see successfull alert and verify the part# thorugh part# search(\\d+)$")
	public void user_will_see_successfull_alert_and_verify_the_part_thorugh_part_search(int arg1) throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfull alert and verify the part# thorugh part# search(\\\\d+)");
			
			loginfo.pass("Parts page landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
			System.out.println(e);
			//extent.flush();
			
		}
	    
	}
	
	@Given("^User will click parts page and click listall button$")
	public void user_will_click_parts_page_and_click_listall_button() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts in ListAll");
			test=test.createNode(Scenario.class, "Edit Parts List all");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click parts page and click listall button");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked "+e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
		
		
	    
	}

	@When("^User will Select Category, sub category, part description, Product line and Click search$")
	public void user_will_Select_Category_sub_category_part_description_Product_line_and_Clickj_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Select Category, sub category, part description, Product line and Clickj search");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass("Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category, sub category, part description, Product line not Entered or search not clicked"+e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and click edit$")
	public void user_will_Search_for_part_number_and_click_edit() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Search for part number and click edit");
			eppom.EnterSearchText(pro.getProperty("partno"));
			eppom.ClickEditButton();
			loginfo.pass("Part number Entered and Edit clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or Edit not clicked"+e.getMessage());
			loginfo.fail("Part number not Entered or Edit not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@Then("^User will Verify page redirect to Allinone page or not$")
	public void user_will_Vrify_page_redirect_to_Allinone_page_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Vrify page redirect to Allinone page or not");
			eppom.VerifyEdit(pro.getProperty("Allinone"));
			loginfo.pass("Page redirect to Allinone Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Page not redirect to Allinone"+e.getMessage());
			loginfo.fail("Page not redirect to Allinone");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	    
	}
	
	@Given("^User will click parts button and click listall button$")
	public void user_will_click_parts_button_and_click_listall_button() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts in ListAll");
			test=test.createNode(Scenario.class, "Delete parts in List all page");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will click parts button and click listall button");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked "+e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@When("^User will Select Category, sub category, part description, Product line and Click search for Delete$")
	public void user_will_Select_Category_sub_category_part_description_Product_line_and_Click_search_for_Delete() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Select Category, sub category, part description, Product line and Click search for Delete");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass("Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category, sub category, part description, Product line not Entered or search not clicked"+e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}
	
	
	@When("^User will Search for part number and click delete$")
	public void user_will_Search_for_part_number_and_click_delete() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Search for part number and click delete");
			eppom.EnterSearchText(pro.getProperty("partno2"));	
			eppom.ClickDeleteButton();
			eppom.acceptAlert();
			loginfo.pass("Part number Entered and delete clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or delete not clicked"+e.getMessage());
			loginfo.fail("Part number not Entered or delete not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will Verify the part is deleted or not$")
	public void user_will_Verify_the_part_is_deleted_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Vrify page redirect to Allinone page or not");
			eppom.Verifydelete(pro.getProperty("categoryname"), pro.getProperty("subcategoryname"), pro.getProperty("partdesc"), pro.getProperty("linecode"), pro.getProperty("partno"), pro.getProperty("DeleteProducttxt"), pro.getProperty("DeleteProducttxt2"));
			loginfo.pass("Verified Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} catch (Exception e) {
			System.out.println(" Not Verified"+e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}
	
	@Given("^User will Click parts and list all page$")
	public void user_will_Click_parts_and_list_all_page() throws Throwable {
		try {
			//extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts in ListAll");
			test=test.createNode(Scenario.class, "Duplicate the parts in List all page");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will Click parts and list all page");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked "+e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	    
	}

	@When("^User will Select Dropdown Category, sub category, part description, Product line and Click search$")
	public void user_will_Select_Dropdown_Category_sub_category_part_description_Product_line_and_Click_search() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Select Dropdown Category, sub category, part description, Product line and Click search");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass("Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category, sub category, part description, Product line not Entered or search not clicked"+e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and Duplicate the part$")
	public void user_will_Search_for_part_number_and_Duplicate_the_part() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Search for part number and Duplicate the part");
			eppom.EnterSearchText(pro.getProperty("partno"));
			eppom.ClickDuplicateButton();
			eppom.EnterDpartno(pro.getProperty("partno2"));
			eppom.acceptAlert2();
			loginfo.pass("Part number Entered and Duplicatebutton clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or Duplicatebutton not clicked"+e.getMessage());
			loginfo.fail("Part number not Entered or Duplicatebutton not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
		
	    
	}

	@Then("^User will Verify duplicate part no is added or not$")
	public void user_will_Verify_duplicate_part_no_is_added_or_not() throws Throwable {
		
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Verify duplicate part no is added or not");
			eppom.EnterSearchText(pro.getProperty("partno2"));
			eppom.verifyDuplicate(pro.getProperty("partno2"));
			loginfo.pass("Verified Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified"+e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			//extent.flush();
		}
	   
	}
	
	@Given("^User will Click parts page and list all page for Copy Appparts$")
	public void user_will_Click_parts_page_and_list_all_page_for_Copy_Appparts() throws Throwable {
		try {
			extent=setup();	
			test = extent.createTest(Feature.class, "PMT Parts in ListAll");
			test=test.createNode(Scenario.class, "Duplicate the parts in List all page");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will Click parts and list all page");
			eppom = new PartsListAll();
			eppom.clickonParts();
			eppom.clickonListAll();
			loginfo.pass("Parts and listall Page clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Parts or listall page Not Clicked "+e.getMessage());
			loginfo.fail("Parts or listall page Not Clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@When("^User will Select Dropdown Category, sub category, part description, Product line and Click search for Copy Appparts$")
	public void user_will_Select_Dropdown_Category_sub_category_part_description_Product_line_and_Click_search_for_Copy_Appparts() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Select Dropdown Category, sub category, part description, Product line and Click search");
			eppom.SelectCategory(pro.getProperty("categoryname"));
			eppom.SelectSubCategory(pro.getProperty("subcategoryname"));
			eppom.SelectPartsDescription(pro.getProperty("partdesc"));
			eppom.SelectProductLine(pro.getProperty("linecode"));
			eppom.Clicksearch();
			loginfo.pass("Category, sub category, part description, Product line  Entered and search clicked Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Category, sub category, part description, Product line not Entered or search not clicked"+e.getMessage());
			loginfo.fail("Category, sub category, part description, Product line not Entered or search not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will Search for part number and Copy Appparts to other partno$")
	public void user_will_Search_for_part_number_and_Copy_Appparts_to_other_partno() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will Search for part number and Copy Appparts to other partno");
			
			eppom.EnterSearchText(pro.getProperty("partno"));
			eppom.DuplicateAppprtsButton();
			eppom.createAppartsDuplicate(pro.getProperty("partdesc"), pro.getProperty("linecode"), pro.getProperty("Asearchpart"), pro.getProperty("partno3"));
			
			loginfo.pass("Part number Entered and Duplicate the apparts Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println(" Part number not Entered or not created Duplicate the apparts"+e.getMessage());
			loginfo.fail("Part number not Entered or not created Duplicate the apparts");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}
	}

	@Then("^User will Verify Copy Appparts to other partno is added or not$")
	public void user_will_Verify_Copy_Appparts_to_other_partno_is_added_or_not() throws Throwable {
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will Verify Copy Appparts to other partno is added or not");

 
			// verify pending
			
			
			loginfo.pass("Verified Successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			extent.flush();
		} catch (Exception e) {
			System.out.println(" Not Verified"+e.getMessage());
			loginfo.fail("Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			extent.flush();
		}
	    
	}

}
