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

public class MyCatalogBuyersGuidePom extends Baseclass {

	public MyCatalogBuyersGuidePom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// <My Catalogs> menu link
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_4\"]")
	@CacheLookup
	public WebElement MyCatalogs;

	// <Buyers Guide> submenu link
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_1\"]")
	public WebElement BuyersGuide;

	// <Part Number> AS <DPO930019A> search box
	@FindBy(xpath = "//input[@id=\"MainContent_txtMelling\"]")
	public WebElement PartNumber;
	
	// <Search> button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnSearch\"]")
	public WebElement SearchButton;
	
	// <View Application Data> button
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylAppln_0\"]")
	public WebElement ViewApplicationDataButton;
	
	// Highlighted Record
	@FindBy(xpath = "//span[@id=\"MainContent_GVData_lblEngineBase_75\"]")
	public WebElement HighlightedRecord;
	
	// <Back> button
	@FindBy(xpath = "//button[@id=\"MainContent_btnBack\"]")
	public WebElement BackButton;
	
	// <View Part Data> button
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylPartno_0\"]")
	public WebElement ViewPartDataButton;
	
	// Verify part details (Attributes)
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[2]")
	public WebElement Attributes;
	
	// Verify part details (Interchanges)
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[6]")
	public WebElement Interchanges;
	
	
	// Generate Excel Button
	@FindBy(xpath = "//input[@value=\"Generate Excel\"]")
	public WebElement GenerateExcel;
	
	// Excel Download Button
	@FindBy(xpath = "//input[@id=\"MainContent_btngenerate\"]")
	public WebElement ExcelDownloadButton;
	
	// Excel Download Cancel Button
	@FindBy(xpath = "//input[@id=\"MainContent_imgbtnCancel\"]")
	public WebElement ExcelDownloadCancelButton;
	
	// List Item
	@FindBy(xpath = "//li[@class=\"autocomplete_listItem\"]")
	public WebElement ListItem;	
	
	// Select Excel Generation
	@FindBy(name = "ctl00$MainContent$drpProdcategory")
	public WebElement SelectExcelGen;
	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;	
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

		
	public void MyCatalogsClick() throws Exception {
		MyCatalogs.click();
		Thread.sleep(5000);
	}
	
	public void BuyersGuideClick() throws Exception {
		BuyersGuide.click();
		Thread.sleep(5000);
	}

	public void EnterPartNumber() throws Exception {
		PartNumber.sendKeys(pro.getProperty("ParttNumberr"));
		Thread.sleep(5000);
		ListItem.click();
		Thread.sleep(5000);
	}

	
	public void ClickSearchButton(){
		
		SearchButton.click();
		
	}
	
	public void ClickViewApplicationDataButton() {
		ViewApplicationDataButton.click();
	}
	
	public void VerifyHighlightedRecord() {
		String highlightText = HighlightedRecord.getText();
		try {
		Assert.assertEquals(highlightText, pro.getProperty("HLText2"));
		System.out.println(">>>>>>> Assertion for Highlight Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Highlight Text FAILED >>>>>>");
		}
	}
	
	public void ClickBackButton() {
		//BackButton.click();
		driver.navigate().back();
	}
	
	public void ClickViewPartDataButton() {
		ViewPartDataButton.click();
	}
	
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
	
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}
	
	public void ClickLogoutButton() {
		LogoutButton.click();
	}
	
	public void GenerateExcelReport() throws Exception {
		GenerateExcel.click();
		
		Select GenExcel = new Select(SelectExcelGen);
		GenExcel.selectByValue(pro.getProperty("GenExcelValue"));
		
		ExcelDownloadButton.click();
		Thread.sleep(5000);
		ExcelDownloadCancelButton.click();
		Thread.sleep(10000);
		
	}
	
}


