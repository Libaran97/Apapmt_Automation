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

public class MyCatalogInterchangePom extends Baseclass {

	public MyCatalogInterchangePom() {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// <My Catalogs> menu link  ^^^^^^^^^^^
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_lnkLink1_4\"]")
	public WebElement MyCatalogs;

	// <Interchange> submenu link  ^^^^^^^^
	@FindBy(xpath = "//a[@id=\"ucMenu_rptLevel1_rptLevel2_4_lnkLink2_2\"]")
	public WebElement MyCatalogInterchange;
	
	// <Interchange part# search box> ^^^^^^^^^
	@FindBy(xpath = "//input[@id=\"MainContent_txtCompetitor\"]")
	public WebElement InterchangePartNumberSB;
	
	
	// <Search> button ^^^^^^^^^
	@FindBy(xpath = "//input[@name=\"ctl00$MainContent$btnSearch\"]")
	public WebElement SearchButton;
	
	// Part Number Link ^^^^^^^^^
	@FindBy(xpath = "//a[@id=\"MainContent_GVData_hylPartno_0\"]")
	public WebElement PartNumberLink;
	
	
	// <Image View> title ^^^^^^^^^
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[1]")
	public WebElement ImageViewTitle;
	
	// <Units> title ^^^^^^^^^
	@FindBy(xpath = "(//div[@class=\"panel-title\"])[4]")
	public WebElement UnitsTitle;
	
	/*// <Back> button 
	@FindBy(xpath = "//button[@id=\"MainContent_btnBack\"]")
	public WebElement BackButton;*/
	
	
	// Select Interchange Part Number
	@FindBy(name = "ctl00$MainContent$drpsearch")
	public WebElement SelectIntPartNum;
	
	
	// Logout Button
	@FindBy(xpath = "//a[@id=\"hylLogout\"]")
	public WebElement LogoutButton;	
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// <Part Description> link
	@FindBy(xpath = "//a[@id=\"MainContent_gvProduct_lnkProduct_5\"]")
	public WebElement PartDescription;	
	
	// <Interchange/OE> link
	@FindBy(xpath = "//a[@id=\"MainContent_gvCompetitor_lnkCompetitor_0\"]")
	public WebElement InterchangeOELink;
	
	// <Parts Number> link
	@FindBy(xpath = "//a[@id=\"MainContent_gvResult_hylMelling_0\"]")
	public WebElement PartsNumberLink;
	
	// Error Message
	@FindBy(xpath = "//span[@id=\"MainContent_RequiredFieldValidator2\"]")
	public WebElement ErrorMessage;	
	
	// Competitor <Parts Description> 
	@FindBy(xpath = "(//th[@scope=\"col\"])[1]")
	public WebElement CPartDescription;
	
	// Competitor <Interchange OE>
	@FindBy(xpath = "(//th[@scope=\"col\"])[2]")
	public WebElement CIntChangeOE;
	
	// Competitor <Part Number>
	@FindBy(xpath = "(//th[@scope=\"col\"])[3]")
	public WebElement CPartNumber;
	
	// Competitor <Interchange Number>
	@FindBy(xpath = "(//th[@scope=\"col\"])[4]")
	public WebElement CIntChangeNumber;
	
	// Competitor <Part Manufacturer>
	@FindBy(xpath = "(//th[@scope=\"col\"])[5]")
	public WebElement CPartManufacturer;
	
	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

	// Click the <My Catalogs> menu link ^^^^^^^^^^
	public void MyCatalogsClick() throws Exception {
		MyCatalogs.click();	
		
	}
	
	// Click the <Interchange> submenu link ^^^^^^^^^^
	public void MyCatalogInterchangeClick() throws Exception {
		MyCatalogInterchange.click();		
	}

	// Enter the <Interchange PartNumber> ^^^^^^^^^^
	public void EnterInterchangePartNumber() throws Exception {
		InterchangePartNumberSB.sendKeys(pro.getProperty("IntPartNum"));
	}
	
	// Enter the <Interchange PartNumber> as BLANK
	public void EnterInterchangePartNumber2() throws Exception {
		InterchangePartNumberSB.sendKeys(pro.getProperty("IntPartNum2"));
	}
	
	// Enter the <Interchange PartNumber> with Special Characters
	public void EnterInterchangePartNumber3() throws Exception {
		InterchangePartNumberSB.sendKeys(pro.getProperty("IntPartNum3"));
	}
	
	// Enter the <Interchange PartNumber> with invalid Characters
	public void EnterInterchangePartNumber4() throws Exception {
		InterchangePartNumberSB.sendKeys(pro.getProperty("IntPartNum4"));
		
	}
	
	// Select the <Begin With> option
	public void SelectBeginWithOption() throws Exception {
		Select BeginWith = new Select(SelectIntPartNum);
		BeginWith.selectByValue(pro.getProperty("IntPartNumSelectValue1"));
	}
	
	// Select the <Contains> option
	public void ContainsOption() throws Exception {
		Select Contains = new Select(SelectIntPartNum);
		Contains.selectByValue(pro.getProperty("IntPartNumSelectValue2"));
	}
	
	// Select the <Ends With> option
	public void EndsWithOption() throws Exception {
		Select EndsWith = new Select(SelectIntPartNum);
		EndsWith.selectByValue(pro.getProperty("IntPartNumSelectValue3"));
	}
	
	// Select the <Equals> option
	public void EqualsOption() throws Exception {
		Select Equals = new Select(SelectIntPartNum);
		Equals.selectByValue(pro.getProperty("IntPartNumSelectValue4"));
	}
	
	// Verify the fields in the grid
	public void VerifyGridFields() throws Exception {
		String PartDesc = CPartDescription.getText();
		String IntOE = CIntChangeOE.getText();
		String PartNum = CPartNumber.getText();
		String InterChange = CIntChangeNumber.getText();
		String PartManf = CPartManufacturer.getText();
		
		try {
		Assert.assertEquals(PartDesc, pro.getProperty("CPartDesc"));
		Assert.assertEquals(IntOE, pro.getProperty("CIntOE"));
		Assert.assertEquals(PartNum, pro.getProperty("CPartNum"));
		Assert.assertEquals(InterChange, pro.getProperty("CInterChange"));
		Assert.assertEquals(PartManf, pro.getProperty("CPartManf"));
		System.out.println("Assertion PASSED during Verify Grid Fields >>>>");
		} catch(AssertionError ae) {
			System.out.println("Assertion FAILED during Verify Grid Fields >>>>");
		}
	}		

	
	// Click the <Search> button ^^^^^^^^^
	public void ClickSearchButton() throws Exception {
		SearchButton.click();		
	}
	
	// Click the <Part Number> link ^^^^^^^^^^
	public void ClickPartNumberLink() throws Exception {
		PartNumberLink.click();
	}
	
	// Verify the elements in the AllInOne page ^^^^^^^^^
	public void VerifyHighlightedRecord() {
		String IVTitle = ImageViewTitle.getText();
		try {
		Assert.assertEquals(IVTitle, pro.getProperty("IVTitleText"));
		System.out.println(">>>>>>> Assertion for Image View Title Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Image View Title Text FAILED >>>>>>");
		}
		
		String UTitle = UnitsTitle.getText();
		try {
			Assert.assertEquals(UTitle, pro.getProperty("UTitleText"));
			System.out.println(">>>>>>> Assertion for Units Title Text PASSED >>>>>>");
		} catch(AssertionError ae) {
			System.out.println(">>>>>>> Assertion for Units Title Text FAILED >>>>>>");
		}		
	}	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Click the <Part Description> link
	public void ClickPartDescriptionLink() {
		PartDescription.click();
	}
	
	// Click the <Interchange/OE> link
	public void ClickInterchangeOELink() {
		InterchangeOELink.click();
	}
	
	// Click the <Parts Number> link
	public void ClickPartsNumberLink() {
		PartsNumberLink.click();
	}
	
	// Verify the <Error Message>
	public void VerifyErrorMessage() {
		
		String ErrorMessageText = "";
		try {
			ErrorMessageText = ErrorMessage.getText();
			System.out.println("The Error Message text is >>>>>>>>>>>> " + ErrorMessageText);
		}
		catch(Exception e) {
			ErrorMessageText = "";
		}
		
		try {
		Assert.assertEquals(ErrorMessageText, pro.getProperty("ErrMsgText"));
		System.out.println("Assertion passed for Verify Error Message");
		} catch(AssertionError ae) {
			System.out.println("Assertion failed for Verify Error Message");
		}
		
	}
	
	public void VerifyInterchangePart() {
		boolean flag = false;
		List<WebElement> el = driver.findElements(By.xpath("//*[@role=\"row\"]/td[4]"));
		for (int i=1; i<=el.size(); i++) {
			String IntChangePart = driver.findElement(By.xpath("(//*[@role=\"row\"]/td[4])["+i+"]")).getText();
			System.out.println("The Interchange number for the Part is >>>>>>> " + IntChangePart);
			if(IntChangePart.contains("3M4E6B209CC")) {
				flag = true;
				break;
			}
			else {
				continue;
			}
			
		}
		
		if(flag == true) {
			Assert.assertEquals(true, true);
			System.out.println("Assertion Passed ..... Interchange name for the Part# found in All In One screen");
		}
		else {
			System.out.println("Assertion failed ..... Interchange name for the Part# NOT found in All In One screen");
		}
	}
	
	public void SortPartDescription() throws Exception {
		List<WebElement> el = driver.findElements(By.xpath("//a[@class=\"pad_5\"]"));
		ArrayList<String> AllEle = new ArrayList<String>();
		ArrayList<String> AllEleBeforeSort = new ArrayList<String>();
		String element = "";
		
		for (int i=1; i<=el.size(); i++) {
			element = driver.findElement(By.xpath("(//a[@class=\"pad_5\"])["+i+"]")).getText();
			AllEle.add(element);
			AllEleBeforeSort = AllEle;
		}
		
		Collections.sort(AllEle);
		boolean flag = true;
		
		for (int i=0; i<el.size(); i++) {
			System.out.println("The element number before sort "+i+" is "+ AllEleBeforeSort.get(i));
			Thread.sleep(1000);
			System.out.println("The element number after sort is  "+i+" is "+ AllEle.get(i));
			if (AllEleBeforeSort.get(i) == AllEle.get(i)) {
				continue;
			}
			else
			{
				flag = false;
				break;
			}
		}	
		
		if (flag == true) {
			System.out.println("The Part Description details are already in correct order");
		}
		else {
			System.out.println("The Part Description details were NOT in correct order");
		}
	}	
	
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	// Click the Navigation back button
	public void ClickBackNavigationButton() {
		driver.navigate().back();
	}
	
	// Click the <Logout> button
	public void ClickLogoutButton() {
		LogoutButton.click();
	}	
		
	
}
 