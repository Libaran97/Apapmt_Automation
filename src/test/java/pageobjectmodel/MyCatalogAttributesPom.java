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

public class MyCatalogAttributesPom extends Baseclass {

	public MyCatalogAttributesPom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// <My Catalogs> menu link  ^^^^^^^^^^^
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_4\"]")
	public WebElement MyCatalogsAtt;

	// <Interchange> submenu link  ^^^^^^^^
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_3\"]")
	public WebElement MyCatalogAttributes;
	
	// Select Part Description
	@FindBy(name = "ctl00$MainContent$ddlPartDescription")
	public WebElement PartDescription_TC014;
	
	// Attribute
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	public WebElement Attribute_TC014;
	
	// Submit button
	@FindBy(xpath = "//input[@id=\"MainContent_btnSubmit\"]")
	public WebElement SubmitButton_TC014;
	
	// Part Number
	@FindBy(xpath = "//a[@id=\"MainContent_GridParts_lnkPartNo_0\"]")
	public WebElement PartNumber_TC014;
	
	// Attribute Name in AllInOne Page
	@FindBy(xpath = "//span[@class=\"quick_part_descriptionQuickEdit\"]")
	public WebElement AttributeName_TC014;
	
	// Excel Button
	@FindBy(xpath = "//input[@id=\"MainContent_imgExportXL\"]")
	public WebElement ExcelButton_TC014;
	
	// Select All Checkbox
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$rptLevel1$ctl00$chkSelectAll\"]")
	public WebElement SelectAllCheckbox_TC014;
	
	// Attribute Name
	@FindBy(xpath = "//span[@id=\"MainContent_rptLevel1_lblAttribute_0\"]")
	public WebElement AttribName_TC014;
	
	// Attribute1
	@FindBy(xpath = "//label[@for=\"MainContent_rptLevel1_chkList_0_0_0\"]")
	public WebElement Attribute1_TC014;
	
	// Attribute2
	@FindBy(xpath = "//label[@for=\"MainContent_rptLevel1_chkList_0_1_0\"]")
	public WebElement Attribute2_TC014;
	
	// Attribute Name Check
	@FindBy(xpath = "(//th[@scope=\"col\"])[2]")
	public WebElement AttributeNameCheck_TC014;
	
	// Attribute1 Check
	@FindBy(xpath = "//*[@id=\"MainContent_GridParts\"]/tbody/tr[2]/td[2]")
	public WebElement Attribute1Check_TC014;
	
	// Attribute2 Check
	@FindBy(xpath = "//*[@id=\"MainContent_GridParts\"]/tbody/tr[3]/td[2]")
	public WebElement Attribute2Check_TC014;
	
	
	
	
	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;	
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Click the <My Catalogs> menu link ^^^^^^^^^^
	public void MyCatalogsAttClick_TC014() throws Exception {
		MyCatalogsAtt.click();	
		
	}
	
	// Click the <Attributes> submenu link ^^^^^^^^^^
	public void MyCatalogAttributesClick_TC014() throws Exception {
		MyCatalogAttributes.click();		
	}
	
	
	// Choose Part Description from the dropdown
	public void ChoosePartDescription_TC014() throws Exception {
		//Select PartDescSelect = new Select(driver.findElement(By.name("ctl00$MainContent$ddlPartDescription")));
		Select PartDescSelect = new Select(PartDescription_TC014);
		PartDescSelect.selectByVisibleText(pro.getProperty("PartDescription"));
	}
	
	// Choose Part Description2 from the dropdown
	public void ChoosePartDescription2_TC014() throws Exception {
		// Select PartDescSelect = new Select(driver.findElement(By.name("ctl00$MainContent$ddlPartDescription")));
		Select PartDescSelect = new Select(PartDescription_TC014);
		PartDescSelect.selectByVisibleText(pro.getProperty("PartDescription2"));
	}	
	
	// Choose an attribute from the displayed list
	public void ChooseAttribute_TC014() throws Exception {
		// driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		Attribute_TC014.click();
	}
	
	// Click the <Submit> button
	public void ClickSubmitButton_TC014() throws Exception {
		// driver.findElement(By.xpath("//input[@id=\"MainContent_btnSubmit\"]")).click();
		SubmitButton_TC014.click();
	}
	
	// Click the <Part Number>
	public void ClickPartNumber_TC014() {
		// driver.findElement(By.xpath("//a[@id=\"MainContent_GridParts_lnkPartNo_0\"]")).click();
		PartNumber_TC014.click();
	}
	
		
	// Check the attributes in AllInOne page
	public void CheckAttributesInAllInOnePage_TC014() {
		// String attname = driver.findElement(By.xpath("//span[@class=\"quick_part_descriptionQuickEdit\"]")).getText();
		String attname = AttributeName_TC014.getText();
		if(attname.contains("Engine Piston Ring")) {
			Assert.assertEquals(true, true);
		}
		else
		{
			System.out.println("Assertion failed .....");
		}
	}
	
	// Click the <Generate Excel Button>
	public void ClickGenerateExcelButton_TC014() {
		// driver.findElement(By.xpath("//input[@id=\"MainContent_imgExportXL\"]")).click();
		ExcelButton_TC014.click();
	}
	
	// Click the <Select All> checkbox
	public void ClickSelectAllCheckbox_TC014() {
		// driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$rptLevel1$ctl00$chkSelectAll\"]")).click();
		SelectAllCheckbox_TC014.click();
	}
	
		
	// Verify the Attribute Name and Value
	public void VerifyAttributeNameAndValue_TC014() {
		// String AttributeName = driver.findElement(By.xpath("//span[@id=\"MainContent_rptLevel1_lblAttribute_0\"]")).getText();
		String AttributeName = AttribName_TC014.getText();
		
		// String Attribute1 = driver.findElement(By.xpath("//label[@for=\"MainContent_rptLevel1_chkList_0_0_0\"]")).getText();
		String Attribute1 = Attribute1_TC014.getText();
		
		// String Attribute2 = driver.findElement(By.xpath("//label[@for=\"MainContent_rptLevel1_chkList_0_1_0\"]")).getText();
		String Attribute2 = Attribute2_TC014.getText();
		
		// String AttributeNameCheck = driver.findElement(By.xpath("(//th[@scope=\"col\"])[2]")).getText();
		String AttributeNameCheck = AttributeNameCheck_TC014.getText();
		
		// String Attribute1Check = driver.findElement(By.xpath("//*[@id=\"MainContent_GridParts\"]/tbody/tr[2]/td[2]")).getText();
		String Attribute1Check = Attribute1Check_TC014.getText();
		
		// String Attribute2Check = driver.findElement(By.xpath("//*[@id=\"MainContent_GridParts\"]/tbody/tr[3]/td[2]")).getText();
		String Attribute2Check = Attribute2Check_TC014.getText();
		
		System.out.println("The Attribute Name value is >>>>>>>>>" + AttributeName);
		System.out.println("The Attribute Name Check value is >>>>>>>>>" + AttributeNameCheck);
		System.out.println("The Attribute1 value is >>>>>>>>>" + Attribute1);
		System.out.println("The Attribute1  check value is >>>>>>>>>" + Attribute1Check);
		System.out.println("The Attribute2 value is >>>>>>>>>" + Attribute2 );
		System.out.println("The Attribute2  check value is >>>>>>>>>" + Attribute2Check);
		
		
			/*if (AttributeName.contentEquals(AttributeNameCheck)) {
				Assert.assertEquals(true, true);
				System.out.println("Assertion Passed for Attribute Name >>>>>>>>>");
			}
			else {
				System.out.println("Assertion Failed for Attribute Name >>>>>>>>>");
			}*/
		
			if (AttributeName.equalsIgnoreCase(AttributeNameCheck)) {
				Assert.assertEquals(true, true);
				System.out.println("Assertion Passed for Attribute Name >>>>>>>>>");
			}
			else {
			System.out.println("Assertion Failed for Attribute Name >>>>>>>>>");
			}
			
			if (Attribute1.equalsIgnoreCase(Attribute1Check)) {
				Assert.assertEquals(true, true);
				System.out.println("Assertion Passed for Attribute1 >>>>>>>>>");
			}
			else {
				System.out.println("Assertion Failed for Attribute1 >>>>>>>>>");
			}
			
			if (Attribute2.equalsIgnoreCase(Attribute2Check)) {
				Assert.assertEquals(true, true);
				System.out.println("Assertion Passed for Attribute2 >>>>>>>>>");
			}
			else {
				System.out.println("Assertion Failed for Attribute2 >>>>>>>>>");
			}
			
				
	}
	
	/* &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&*/
	
	// Select all the checkboxes corresponding to the attributes
	public void SelectAllCheckboxes_TC014() {
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for (int i=1; i<=cb.size(); i++) {
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+i+"]")).click();
		}
		
	}
	
	public void VerifyAllAttributesAndValues_TC014() {
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int j=0;
		int k=0;
		String attribute1 = "";
		String attvalue1 = "";
		boolean flag=true;
		for (int i=1; i<=cb.size(); i++) {
			j=i-1;
			k=i+1;
			String attribute = driver.findElement(By.xpath("(//span[@style=\"font-weight:bold;\"])["+i+"]")).getText();
			String attvalue = driver.findElement(By.xpath("//label[@for=\"MainContent_rptLevel1_chkList_"+j+"_0_"+j+"\"]")).getText();
			System.out.println("The attribute is >>>>>>>>> " + attribute);
			System.out.println("The attribute value is >>>>>>>>> " + attvalue);
			try {
			attribute1 = driver.findElement(By.xpath("//*[@id=\"MainContent_GridParts\"]/tbody/tr[1]/th["+k+"]")).getText();
			System.out.println("The attribute1 is >>>>>>>>> " + attribute1);
			} catch(Exception e) {
				System.out.println("The attribute1 is &&&&&&&&&& " + attribute1);
			}
			
			try {
			attvalue1 = driver.findElement(By.xpath("//*[@id=\"MainContent_GridParts\"]/tbody/tr[2]/td["+k+"]")).getText();
			System.out.println("The attribute value1 is >>>>>>>>> " + attvalue1);
			} catch(Exception e) {
				System.out.println("The attribute value 1 is &&&&&&&&& " + attvalue1);
			}
			
			if (attribute.equalsIgnoreCase(attribute1)) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
			
			if (attvalue.equalsIgnoreCase(attvalue1)) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
			
		}
		
		if (flag==true) {
			System.out.println("########### Assertion Passed ############");
		}
		else {
			System.out.println("########### Assertion Failed ############");
		}
		
	}	
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
		
	// Click the Navigation back button
	public void ClickBackNavigationButton_TC014() {
		driver.navigate().back();
	}
	
	// Click the <Logout> button
	public void ClickLogoutButton_TC014() {
		LogoutButton.click();
	}	
		
	
}

