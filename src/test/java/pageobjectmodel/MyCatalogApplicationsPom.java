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
import org.testng.Assert;

import utility.Baseclass;

public class MyCatalogApplicationsPom extends Baseclass {

	public MyCatalogApplicationsPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// <My Catalogs> menu link  &&&&&&&&&&
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_4\"]")
	public WebElement MyCatalogs;

	// <Applications> submenu link  &&&&&&&&
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_0\"]")
	public WebElement MyCatalogApplications;
	
	// <Search> button &&&&&&&&&&&
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnSearch\"]")
	public WebElement SearchButton;
	
	// <View Application Data> button &&&&&&&
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylAppln_0\"]")
	public WebElement ViewApplicationDataButton;
	
	
	// Highlighted Record &&&&&&&&&&&
	@FindBy(xpath = "//span[@id=\"MainContent_GVData_lblEngineBase_9\"]")
	public WebElement HighlightedRecord;
	
	
	// <View Part Data> button &&&&&&&&&
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylPartno_0\"]")
	public WebElement ViewPartDataButton;
	
		
	// Verify part details (Attributes)
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[2]")
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

		// &&&&&&&&&&&
	public void MyCatalogsClick() {
		MyCatalogs.click();
		
	}
	
	// &&&&&&&&&&
	public void MyCatalogApplicationsClick() {
		MyCatalogApplications.click();
		
	}

	// &&&&&&&&&&&&&&&
	public void SelectMakeModelYearStatus() throws Exception {
		// Make => Acura
		try {
			Select make = new Select(SelectMake);
			make.selectByValue(pro.getProperty("MakeValue"));
			Thread.sleep(5000);
		
			Select model = new Select(SelectModel);		
			model.selectByValue(pro.getProperty("ModelValue"));
			Thread.sleep(5000);
		
			Select year = new Select(SelectYear);	
			year.selectByValue(pro.getProperty("YearValue"));
			Thread.sleep(5000);
		
			Select status = new Select(SelectStatus);
			status.selectByValue(pro.getProperty("StatusValue"));
			Thread.sleep(5000);
			
					
		} catch(Exception e) {
			
			Select make = new Select(SelectMake);
			make.selectByValue(pro.getProperty("MakeValue"));
			Thread.sleep(5000);
			
			Select model = new Select(SelectModel);		
			model.selectByValue(pro.getProperty("ModelValue"));
			Thread.sleep(5000);
			
			Select year = new Select(SelectYear);	
			year.selectByValue(pro.getProperty("YearValue"));
			Thread.sleep(5000);
			
			Select status = new Select(SelectStatus);
			status.selectByValue(pro.getProperty("StatusValue"));
			
			Thread.sleep(5000);
		}
		
	}

	
	// &&&&&&&&&&&&&&&&&
	public void ClickSearchButton(){
		SearchButton.click();		
	}
	
	// &&&&&&&&&&&&&
	public void ClickViewApplicationDataButton() {
		ViewApplicationDataButton.click();
	}
	
	// &&&&&&&&&&&&&&
	public void VerifyHighlightedRecord() {
		String highlightText = HighlightedRecord.getText();
		try {
		Assert.assertEquals(highlightText, pro.getProperty("HLText"));
		System.out.println(">>>>>>> Assertion for Highlight Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Highlight Text FAILED >>>>>>");
		}
	}
	
	// &&&&&&&&&&&&&&
	public void ClickBackButton() {
		BackButton.click();
	
	}
	
	
	// &&&&&&&&&&&&&&
	public void ClickViewPartDataButton() throws Exception {
		//driver.navigate().refresh();
		//Thread.sleep(5000);
		ViewPartDataButton.click();
	}
	
	// &&&&&&&&&&&&&&&&&
	public void VerifyPartDataDetails() {
		String AttText = Attributes.getText();
		System.out.println("The value for Attributes is >>>>>>> " + AttText);
		String InterText = Interchanges.getText();
		System.out.println("The value for Interchanges is >>>>>>> " + InterText);
		
		try {
		Assert.assertEquals(AttText, pro.getProperty("AttText"));
		System.out.println(">>>>>>> Assertion for Attributes Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Attributes Text FAILED >>>>>>");
		}
		
		try {
		Assert.assertEquals(InterText, pro.getProperty("IntText"));
		System.out.println(">>>>>>> Assertion for Interchanges Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Interchanges Text FAILED >>>>>>");
		}
	}
	
	// &&&&&&&&&&&&
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}
	
	// &&&&&&&&&&&
	public void ClickLogoutButton() {
		LogoutButton.click();
	}
	
	
	
}



