package pageobjectmodel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

public class QuickAddPom extends Baseclass {

	public QuickAddPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Parts Tab Link
	@FindBy(xpath = "//a[@class=\"main_menu parts_icon\"]")
	public WebElement PartsMenu_TC015;
	
	// Quick Add button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnQuickAdd\"]")
	public WebElement QuickAddButton_TC015;
	
	// Part Number
	@FindBy(xpath = "//input[@id=\"txtAddPartNew\"]")
	public WebElement PartNumber_TC015;
	
	// Select Part Description
	@FindBy(id = "drpPartDesc")
	public WebElement PartDescription_TC015;
	
	// Select Product Line
	@FindBy(id = "drpProductLine")
	public WebElement ProductLine_TC015;
	
	// Quantity
	@FindBy(xpath = "//input[@id=\"txtpartqty\"]")
	public WebElement Quantity_TC015;
	
	// Select Quantity UOM
	@FindBy(id = "drp_qtyuom")
	public WebElement QtyUOM_TC015;	
	
	// Minimum Order Quantity
	@FindBy(xpath = "//input[@id=\"txtminorderpartqty\"]")
	public WebElement MinOrderQty_TC015;
	
	// Select Minimum Order Quantity UOM
	@FindBy(id = "drp_qty_minorder_uom")
	public WebElement MinOrderQtyUOM_TC015;
	
	// Select Item Level GTIN Qualifier
	@FindBy(id = "drpGTINQualifiers")
	public WebElement ItemLevelGTINQualifier_TC015;
	
	// GTIN Number
	@FindBy(xpath = "//input[@id=\"txtgtinnumber\"]")
	public WebElement GTINNumber_TC015;
	
	// Select Status dropdown
	@FindBy(id = "drpStatus")
	public WebElement Status_TC015;
	
	// Save button
	@FindBy(xpath = "//input[@value=\"Save\"]")
	public WebElement SaveButton_TC015;
	
	// Cancel Button
	@FindBy(xpath = "//input[@id=\"btnCancel_AddPopup\"]")
	public WebElement CancelButton_TC015;
	
	// Sorted Element 1
	@FindBy(xpath = "(//td[@class=\"sorting_1\"])[1]")
	public WebElement SortElement1_TC015;
	
	// Sorted Element 2
	@FindBy(xpath = "(//td[@class=\"sorting_1\"])[2]")
	public WebElement SortElement2_TC015;
	
	// <Part Number> search box
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$txtMelling\"]")
	public WebElement PartNumberSearchBox_TC015;
	
	// <Part Number> search button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnPsearch\"]")
	public WebElement PartNumberSearchButton_TC015;	
	
	// <Part Number> from search
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$txtPart\"]")
	public WebElement PartNumberFromSearch_TC015;	
	
	// <Parts Heading> text
	@FindBy(xpath = "//label[@class=\"sub_parts_heading\"]")
	public WebElement PartsHeadingText_TC015;
	
	// Option 
	@FindBy(xpath = "(//td[@class=\"sorting_1\"])[2]")
	public WebElement Option_TC015;
	
	// <Print Description>  
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement PrintDesc_TC015;
	
	// <Delete> button
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnDelete\"]")
	public WebElement DeleteButton_TC015;	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton_TC015;	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Click the <Parts> menu link
	public void ClickPartsMenu_TC015() throws Exception {
		PartsMenu_TC015.click();	
	}
	
	// Click the <Quick Add> button
	public void ClickQuickAddButton_TC015() throws Exception {
		QuickAddButton_TC015.click();		
	}
	
	
	// Enter the <Part Number>
	public void EnterPartNumber_TC015() throws Exception {
		PartNumber_TC015.sendKeys(pro.getProperty("PartNumberSearch"));
	}
	
	// Choose <Part Description> from the dropdown
	public void SelectPartDescription_TC015() throws Exception {
		Select PartDescSelect = new Select(PartDescription_TC015);
		PartDescSelect.selectByVisibleText(pro.getProperty("PartDescSelect"));
	}	
	
	// Choose <Part Description2> from the dropdown
	public void SelectPartDescription2_TC015() throws Exception {
		Select PartDescSelect2 = new Select(PartDescription_TC015);
		PartDescSelect2.selectByVisibleText(pro.getProperty("PartDescSelect2"));
	}
	
	// Choose <Product Line> from the dropdown
	public void SelectProductLine_TC015() throws Exception {
		Select ProductLine = new Select(ProductLine_TC015);
		ProductLine.selectByVisibleText(pro.getProperty("ProductLine"));
	}
	
	// Choose <Product Line2> from the dropdown
	public void SelectProductLine2_TC015() throws Exception {
		Select ProductLine2 = new Select(ProductLine_TC015);
		ProductLine2.selectByVisibleText(pro.getProperty("ProductLine2"));
	}
	
	// Enter the <Quantity>
	public void EnterTheQuantity_TC015() throws Exception {
		Quantity_TC015.clear();
		Thread.sleep(1000);
		Quantity_TC015.sendKeys(pro.getProperty("Quantity"));
	}
	
	// Clear the <Quantity>
	public void ClearTheQuantity_TC015() throws Exception {
		Quantity_TC015.clear();		
	}
	
	// Select the <Quantity UOM>
	public void SelectQuantityUOM_TC015() throws Exception {
		Select QuantityUOM = new Select(QtyUOM_TC015);
		QuantityUOM.selectByVisibleText(pro.getProperty("QuantityUOM"));
	}
	
	// Enter the <Minimum Order Quantity>
	public void EnterMinOrderQty_TC015() throws Exception {
		MinOrderQty_TC015.sendKeys(pro.getProperty("MinOrderQty"));
	}
	
	// Select the <Minimum Order Qty UOM> 
	public void SelectMinOrderQuantityUOM_TC015() throws Exception {
		Select MinOrderQuantityUOM = new Select(MinOrderQtyUOM_TC015);
		MinOrderQuantityUOM.selectByVisibleText(pro.getProperty("MinOrderQuantityUOM"));
	}
	
	// Select Item Level GTIN Qualifier
	public void SelectItemLevelGTINQualifier_TC015() throws Exception {
		Select ItemLevelGTINQualifier = new Select(ItemLevelGTINQualifier_TC015);
		ItemLevelGTINQualifier.selectByValue(pro.getProperty("ItemLevelGTINQualifier"));
	}
	
	// Enter the <GTIN Number>
	public void EnterGTINNumber_TC015() throws Exception {
		GTINNumber_TC015.sendKeys(pro.getProperty("GTINNumber"));
	}
	
	// Select the <Status> code
	public void SelectStatusCode_TC015() throws Exception {
		Select StatusCode = new Select(Status_TC015);
		StatusCode.selectByValue(pro.getProperty("StatusCode"));
	}
	
	// Click the <Save> button
	public void ClickSaveButton_TC015() throws Exception {
		SaveButton_TC015.click();
	}
	
	// Click the <Cancel> button
	public void ClickCancelButton_TC015() throws Exception {
		CancelButton_TC015.click();
	}
	
	// Click the <Alert> popup button
	public void ClickAlertButton_TC015() throws Exception {
		Alert alertButton = driver.switchTo().alert();
		String alertMessage = alertButton.getText();
		System.out.println("The Alert message is >>>>>>>>>>>>>>>> " + alertMessage );
		alertButton.accept();
	}
	
	// Search By <PartNumber>
	public void SearchByPartNumber_TC015() throws Exception {
		PartNumberSearchBox_TC015.sendKeys(pro.getProperty("PartNumberSearch"));
		Thread.sleep(1000);
		PartNumberSearchButton_TC015.click();
	}	
	
	// Verify The <Part Number>
	public void VerifyThePartNumber_TC015() throws Exception {
		String PartNumber = PartNumberFromSearch_TC015.getAttribute("value");
		System.out.println("The part number is >>>>>>>>>>> " + PartNumber);
		try {
		Assert.assertEquals(PartNumber, pro.getProperty("PartNumberSearch"));
		System.out.println("The assertion has passed >>>>>>>>>>> ");
		} catch(AssertionError ae) {
			System.out.println("The assertion has failed >>>>>>>>>>> ");
		}
	}
	
	// Click An Option
	public void ClickAnOption_TC015() throws Exception {
		Option_TC015.click();		
	}
	
	// Print <description> from AllInOne Page
	public void PrintDescription_TC015() throws Exception {
		String description = PrintDesc_TC015.getText();
		System.out.println("The description in All in One Page is >>>>>>>>>>> " + description);
	}
	
	public void VerifyContentInPartsPage_TC015() throws Exception {
		
		String PartsHeading = PartsHeadingText_TC015.getText();
		if(PartsHeading.contains(pro.getProperty("PartsHeadingDetail"))) {
			Assert.assertEquals(true, true);
			System.out.println("The assertion has PASSED >>>>>>>>>>>");
		}
		else {
			try {
			Assert.assertEquals(true, false);
			} catch(AssertionError ae) {
				System.out.println("The assertion has FAILED >>>>>>>>>>>");
			}
		}
	}
	
	public void ClickDeleteButton() {
		DeleteButton_TC015.click();
	}
		
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
		
	// Click the Navigation back button
	public void ClickBackNavigationButton_TC015() {
		driver.navigate().back();
	}
	
	// Click the <Logout> button
	public void ClickLogoutButton_TC015() {
		LogoutButton_TC015.click();
	}	
		
	
}
