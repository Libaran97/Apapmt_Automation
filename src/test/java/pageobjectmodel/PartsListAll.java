package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class PartsListAll extends Baseclass{
	public PartsListAll(){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
	WebElement ePartsButton;
	
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnPartsList']")
	WebElement eListAll;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	WebElement eCategoryDDBox;
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategory']")
	WebElement eSubCategoryDDBox;
	
	@FindBy(xpath ="//select[@id='MainContent_drp_PartDescription']")
	WebElement ePartsDescription;
	
	@FindBy(xpath ="//select[@id='MainContent_dropproductline']")
	WebElement eProductLine;
	
	@FindBy(xpath ="//input[@id='MainContent_btn_Search']")
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchTbox;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton1']")
	public WebElement eEditButton;
	
	@FindBy(xpath="//*[@id='parttitle_desc_heading']")
	public WebElement eTitle;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton2']")
	public WebElement eDeleteButton;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td")
	public WebElement eVerify;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton3']")
	public WebElement eDuplicateButton;
	
	@FindBy(xpath ="//input[@id='MainContent_txtPartno']")
	public WebElement epartTbox;
	
	@FindBy(xpath="//input[@id='MainContent_btnsave']")
	public WebElement eSaveButton;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton4']")
	public WebElement ecopyButton;
	
	@FindBy(xpath ="//select[@id='MainContent_drpPartDescription']")
	WebElement eCPartsDescription;
	@FindBy(xpath ="//select[@id='MainContent_drpProductLine']")
	WebElement eCProductLine;
	@FindBy(xpath ="//input[@id='MainContent_txtPartno_apparts']")
	WebElement eAsearch;
	@FindBy(xpath ="//input[@id='MainContent_btnsearch']")
	WebElement ePartsearch;
	@FindBy(xpath ="//input[@id='MainContent_GridView1_checkAllrow1']")
	WebElement eSelectallbtn;
	@FindBy(xpath ="//input[@id='MainContent_btnsaveappparts']")
	WebElement ecreateduplicatebtn;
	public void clickonParts() throws InterruptedException {
		
		ePartsButton.click();
		Thread.sleep(3000);
		
	}
	public void clickonListAll() throws Throwable {
		
	
		eListAll.click();
		Thread.sleep(3000);
	}
	
	
	public void SelectCategory(String categoryname) throws InterruptedException {
		Select Category = new Select(eCategoryDDBox);
		Category.selectByVisibleText(categoryname);
		Thread.sleep(3000);
	}
	public void SelectSubCategory(String subcategoryname) throws InterruptedException {
		Select SubCategory = new Select(eSubCategoryDDBox);
		SubCategory.selectByVisibleText(subcategoryname);
		Thread.sleep(3000);
	}
	public void SelectPartsDescription(String partdesc) throws InterruptedException {
		Select Prodes = new Select(ePartsDescription);
		Prodes.selectByVisibleText(partdesc);
		Thread.sleep(3000);
	}
	public void SelectProductLine(String linecode) throws InterruptedException {
		Select ProdLine = new Select(eProductLine);
		ProdLine.selectByVisibleText(linecode);
		Thread.sleep(3000);
	}
	public void Clicksearch() throws InterruptedException {
		eSearchButton.click();
		Thread.sleep(3000);
		}
	
	public void EnterSearchText(String partno) throws InterruptedException {
		esearchTbox.sendKeys(partno);
		Thread.sleep(3000);
	}
	public void ClickEditButton() throws InterruptedException {
		eEditButton.click();
		Thread.sleep(3000);
		
	}
	public void VerifyEdit(String Allinone) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		String title2 =eTitle.getText();
		System.out.println(title2);
		if(title2.equals(Allinone)){
			System.out.println("Both are same");
		}else
		{
			System.out.println("Both are not same");
		}
	}
	public void ClickDeleteButton() throws InterruptedException {
		eDeleteButton.click();
		Thread.sleep(3000);
		
	}
	public void acceptAlert() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println("NonAcess: " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		}
	public void Verifydelete(String DeleteProducttxt2, String DeleteProducttxt, String categoryname, String subcategoryname, String partdesc, String linecode, String partno) throws InterruptedException {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			eSearchButton.click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText1= eVerify.getText();
			System.out.println("Text"+actualText1);
			if(actualText1.equals(DeleteProducttxt2)) {
				System.out.println("Both are same"+ actualText1 + "Deleted Successfully" );
			}
			
			else {
				System.out.println("Both are not same"+ actualText1 + " Not Deleted " );
			}
			
		} catch (Exception e) {
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select Category = new Select(eCategoryDDBox);
			Category.selectByVisibleText(categoryname);
			Thread.sleep(3000);
			
			Select SubCategory = new Select(eSubCategoryDDBox);
			SubCategory.selectByVisibleText(subcategoryname);
			Thread.sleep(3000);
			
			Select Prodes = new Select(ePartsDescription);
			Prodes.selectByVisibleText(partdesc);
			Thread.sleep(3000);
			
			Select ProdLine = new Select(eProductLine);
			ProdLine.selectByVisibleText(linecode);
			Thread.sleep(3000);
			
			eSearchButton.click();
			Thread.sleep(3000);
			
			esearchTbox.sendKeys(partno);
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText= eVerify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(DeleteProducttxt);
			
			if(actualText.equals(DeleteProducttxt2)) {
				System.out.println("Both are same:"+ actualText + " -Deleted Successfully" );
			}
			
			else {
				System.out.println("Both are same:"+ actualText + " -Deleted Successfully " );
			}
		}
	}
	public void ClickDuplicateButton() throws InterruptedException {
		eDuplicateButton.click();
		Thread.sleep(3000);
		
	}
	
	public void EnterDpartno(String partno2) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		epartTbox.sendKeys(partno2);
		Thread.sleep(3000);
		eSaveButton.click();
		Thread.sleep(3000);
	}
	
	public void acceptAlert2() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
		}
	public void verifyDuplicate(String partno2)
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eVerify.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(partno2))
		{
			System.out.println("Both are same " +actualText + " Duplicate part successfully");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
	
	public void DuplicateAppprtsButton() throws InterruptedException {
		ecopyButton.click();
		Thread.sleep(3000);
		
	}
	public void createAppartsDuplicate(String partdesc, String linecode, String Asearchpart, String partno3) throws InterruptedException {
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Select Prodes1 = new Select(eCPartsDescription);
		Prodes1.selectByVisibleText(partdesc);
		Thread.sleep(3000);
		
		Select ProdLine1 = new Select(eCProductLine);
		ProdLine1.selectByVisibleText(linecode);
		Thread.sleep(3000);
		
		eAsearch.sendKeys(Asearchpart);
		System.out.println("Part no enter in Text box ");
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='MainContent_ListDivisor']/div"));
		System.out.println("total number of parts in drop down -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains(partno3)) {
				list.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		ePartsearch.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		eSelectallbtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ecreateduplicatebtn.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
			
	}
	
}