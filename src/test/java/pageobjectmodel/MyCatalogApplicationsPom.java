package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
// import org.testng.Assert;
import org.junit.Test;

import utility.Baseclass;

public class MyCatalogApplicationsPom extends Baseclass {

	public MyCatalogApplicationsPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// <My Catalogs> menu link
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_5\"]")
	public WebElement MyCatalogs;

	// <Applications> submenu link
	//@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_0\"]")
	@FindBy(xpath="//*[@id='ucMenu_rptLevel1_rptLevel2_5_lnkLink2_0']")
	public WebElement MyCatalogApplications;
	
	// <Search> button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnSearch\"]")
	public WebElement SearchButton;
	
	// <View Application Data> button
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylAppln_0\"]")
	public WebElement ViewApplicationDataButton;
	
	
	// Highlighted Record
	@FindBy(xpath = "//tr[@style=\"background-color:#499BEA;\"]")
	public WebElement HighlightedRecord;
	
	
	// <View Part Data> button
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylPartno_0\"]")
	public WebElement ViewPartDataButton;
	
		
	// Verify part details (Attributes)
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement Attributes;
	
	// Verify part details (Interchanges)
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[6]")
	public WebElement Interchanges;
	
	// Select Make
	@FindBy(name = "ctl00$MainContent$drpMake")
	public WebElement SelectMake;
	
	// Select Model
	@FindBy(name = "ctl00$MainContent$drpModel")
	public WebElement SelectModel;	
	
	// Select Year
	@FindBy(name = "ctl00$MainContent$drpYear")
	public WebElement SelectYear;
	
	// Select Status
	@FindBy(name = "ctl00$MainContent$drpstatus")
	public WebElement SelectStatus;	
	
	// Back button
	@FindBy(xpath = "//button[@id=\"MainContent_btnBack\"]")
	public WebElement BackButton;	
	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

		// Click the <My Catalogs> menu link
	public void MyCatalogsClick() throws Exception {
		MyCatalogs.click();	
	}
	
	// Click the <Applications> submenu link
	public void MyCatalogApplicationsClick() throws Exception {
		MyCatalogApplications.click();
	}

	// Select the <make>,<model>,<year> and <status> fields
	public void SelectMakeModelYearStatus() throws Exception {
	
		try {
			Select make = new Select(SelectMake);
			make.selectByIndex(1);
			Thread.sleep(5000);
		
			Select model = new Select(SelectModel);		
			try {
			model.selectByIndex(1);
			} catch(Exception e) {
				model.selectByIndex(0);
			}
			Thread.sleep(5000);
		
			Select year = new Select(SelectYear);	
			try {
			year.selectByIndex(1);
			} catch(Exception e) {
				year.selectByIndex(0);
			}
			Thread.sleep(5000);
		
			Select status = new Select(SelectStatus);
			try {
			status.selectByIndex(1);
			} catch(Exception e) {
				status.selectByIndex(0);
			}
			Thread.sleep(5000);
			
					
		} catch(Exception e) {
			
			Select make = new Select(SelectMake);
			make.selectByIndex(1);
			Thread.sleep(5000);
		
			Select model = new Select(SelectModel);		
			model.selectByIndex(0);
			Thread.sleep(5000);
		
			Select year = new Select(SelectYear);	
			year.selectByIndex(0);
			Thread.sleep(5000);
		
			Select status = new Select(SelectStatus);
			status.selectByIndex(0);
			Thread.sleep(5000);
		}
		
	}

	
	// Click the <Search> button
	public void ClickSearchButton(){
		SearchButton.click();		
	}
	
	// Click the <View application data> button
	public void ClickViewApplicationDataButton() {
		ViewApplicationDataButton.click();
	}
	
	// Verify the Highlighted record
	public void VerifyHighlightedRecord() {
		try {
		String highlightText = HighlightedRecord.getText();
		System.out.println("The highlighted text is >>>>>>> " + highlightText);
		} catch(Exception e) {
			System.out.println("The highlighted text is not found >>>>>>> ");
		}
		
	}
	
	// Click the <Back> button
	public void ClickBackButton() {
		BackButton.click();
	
	}
	
	
	// Click the <View Part Data> button
	public void ClickViewPartDataButton() throws Exception {
		ViewPartDataButton.click();
	}
	
	// Verify the <Part Data> details
	public void VerifyPartDataDetails() {
		try {
		String AttText = Attributes.getText();
		System.out.println("The value for Attributes is >>>>>>> " + AttText);
		} catch(Exception e) {
			System.out.println("Clicking <Part Data> link does not fetch any details >>>>>>>");
		}
	}
	
	// Click the Back Navigation button
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}
	
	// Click the logout button
	public void ClickLogoutButton() {
		LogoutButton.click();
	}
	
	
	
}