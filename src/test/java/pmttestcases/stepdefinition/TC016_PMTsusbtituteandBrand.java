package pmttestcases.stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsPackage;
import pageobjectmodel.PartsSubstitute;
import utility.Baseclass;

public class TC016_PMTsusbtituteandBrand extends Baseclass {

	ExtentTest loginfo = null;
	PartsSubstitute ppsubbrand;
	@Given("^User will go to parts page and search for partno to add subs$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_add_subs() throws Throwable {
		try {
			//extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts subs Add, Delete")
					.assignCategory("Parts Package").pass("Package add");
			test = test.createNode(Scenario.class, "Adding subs in  parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to add subs");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to substitute page and check the subs for that partno and save$")
	public void user_will_go_to_substitute_page_and_check_the_size_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to substitute page and check the subs for that partno and save");
			ppsubbrand.Substituteclick();
			ppsubbrand.Substituteclickentry(pro.getProperty("partnoenter"), pro.getProperty("Enterpartpart"), pro.getProperty("textbox"));
			ppsubbrand.save();
			ppsubbrand.AcceptAlert();
			ppsubbrand.AcceptAlert();
			loginfo.pass("Susbtitute page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Susbtitute page Not clicked Selected" + e.getMessage());
			loginfo.fail("Susbtitute page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the subs is checked and verify$")
	public void user_will_check_the_subs_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check the subs is checked and verify");
			ppsubbrand.verifysub();
			loginfo.pass("Susbtitute Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Susbtitute Not Verified" + e.getMessage());
			loginfo.fail("Susbtitute Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
	
	//Subs delete option
	@Given("^User will go to parts page and search for partno to del subs$")
	public void user_will_go_to_parts_page_and_search_for_partno_to_del_subs() throws Throwable {
		try {
		    //extent = setup();
			test = extent.createTest(Feature.class, "PMT Parts subs Add, Delete")
					.assignCategory("Parts Subs").pass("subs del");
			test = test.createNode(Scenario.class, "deleting subs in parts page");
			loginfo = test.createNode(new GherkinKeyword("Given"),
					"User will go to parts page and search for partno to del subs");
			ppsubbrand = new PartsSubstitute();
			ppsubbrand.partslanding();
			ppsubbrand.partsearch(pro.getProperty("partnoenter"));
			loginfo.pass(" PartNo search succesfully ");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("PartNo not searched " + e.getMessage());
			loginfo.fail("PartNo not searched");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@When("^User will go to substitute page and check the subsdel for that partno and save$")
	public void user_will_go_to_substitute_page_and_check_the_subsdel_for_that_partno_and_save() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("When"),
					"User will go to substitute page and check the subs for that partno and save");
			ppsubbrand.Substituteclick();
			ppsubbrand.subdel();
			ppsubbrand.AcceptAlert();
			ppsubbrand.AcceptAlert();
			loginfo.pass("Susbtitute page clicked  Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} catch (Exception e) {
			System.out.println("Susbtitute page Not clicked Selected" + e.getMessage());
			loginfo.fail("Susbtitute page Not clicked");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}
	}

	@Then("^User will check the subsdel is checked and verify$")
	public void user_will_check_the_subsdel_is_checked_and_verify() throws Throwable {
		try {
			loginfo = test.createNode(new GherkinKeyword("Then"),
					"User will check the subsdel is checked and verify");
			ppsubbrand.verifydel("DeleteProducttxt2");
			loginfo.pass("Susbtitute deleted Verified Succesfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();

		} catch (Exception e) {
			System.out.println("Susbtitute Not Verified" + e.getMessage());
			loginfo.fail("Susbtitute Not Verified");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			// extent.flush();
		}
	}
}
