package pageobjectmodel;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.Baseclass;

public class Masterproductrelated_POM extends Baseclass {

	
	ExtentTest loginfo=null;
	
	public Masterproductrelated_POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_0']")
	private WebElement mastercategory;
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	private WebElement addcategory;
	
	@FindBy(id="MainContent_txtProductCategory")
	private WebElement entercategory;
	
	@FindBy(xpath="//input[@id='MainContent_radioACESList_14']")
	private WebElement equivalentcategory;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement savecategory;
	
	@FindBy(xpath = "//td[@class='sorting_1']")
	private WebElement verifytext;
	
	@FindBy(xpath = "//a[contains(text(),'Product Sub Category')]")
	//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_1']
	private WebElement subcategory;
	
	@FindBy(xpath = "//select[@id='MainContent_drpProductCategoryAdd']")
	private WebElement selectcategory;
	
	@FindBy(xpath = "//input[@id='MainContent_txtProductSubCategory']")
	private WebElement clicksubcatname;
	
	@FindBy(xpath = "//input[@id='MainContent_txtProductSubCategory']")
	public WebElement entersubcategory;
	
	@FindBy(id = "MainContent_radioACESList_6")
	private WebElement eqsubcategory;
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_3']")
	private WebElement partdesc;
	
	@FindBy(xpath = "//select[@id='MainContent_drpProductSubCategoryAdd']")
	private WebElement selectsubcategory;
	
	@FindBy(xpath = "//input[@id='MainContent_txtPartDescription']")
	private WebElement enternewpartdesc;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpAcesPartTerminology']")
	private WebElement equivalentpartdes;
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_5']")
	private WebElement prdtln;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtlinecode']")
	private WebElement txtlinecode;
	
	@FindBy(xpath="//input[@id='MainContent_txtlinename']")
	private WebElement txtlinename;
	
	/*@FindBy(xpath="//span[@id='MainContent_lblError']")
	private WebElement lblError;
	
	@FindBy(xpath="//*[@id='MainContent_Image1']")
	private WebElement closeext;*/
	
	@FindBy(xpath="//input[@placeholder='Product Category']")
	private WebElement searchfilter1;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	private WebElement verifytxt1; 
	
	@FindBy(xpath="//input[@placeholder='Product Subcategory Name']")
	private WebElement filtercategory;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	private WebElement filtercategory1;
	
	@FindBy(xpath="//input[@placeholder='Line Code']")
	private WebElement linefilter;
	
	
	
	
	public void clickonproductcategory() throws Throwable {
			
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategory.click();
		Thread.sleep(5000);
	}
	
	public void addcategory1() throws Throwable {
		addcategory.click();
		Thread.sleep(3000);
	}
	
	public void entrycategory(String categoryname) throws InterruptedException {
		entercategory.sendKeys(categoryname);
		equivalentcategory.click();
		Thread.sleep(2000);
		//loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}
	
	
	public void savingcategory() throws InterruptedException {
		savecategory.click();
		Thread.sleep(2000);
	}
	
			
	
	public void acceptAlert() throws InterruptedException, IOException{
		
		//if(savecategory.isDisplayed())
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " +pro.getProperty("categoryname") + alert.getText());
		//WebDriverWait wait = new WebDriverWait(driver, 3 /*timeout in seconds*/);
		//if(wait.until(ExpectedConditions.alertIsPresent())==null) {
		alert.accept();
		Thread.sleep(3000);	
		System.out.println("Record newly to be inserted");
		}
		
	
	
	public void verifyingtext(String vrfytxt ) throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchfilter1.sendKeys(pro.getProperty("categoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as "+ actualtext);
		if(actualtext.equals(vrfytxt))
		{
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
	}
	
	public void clicksubcategory() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(2000);
		subcategory.click();
		Thread.sleep(3000);		
		
	}
	
	public void addsubcategory() throws InterruptedException {
		
		WebElement element = selectcategory;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname"));		
		Thread.sleep(2000);
	}
	
	public void entrysubcategory(String subcategoryname) throws InterruptedException {
		clicksubcatname.click();
		entersubcategory.sendKeys(subcategoryname);
		eqsubcategory.click();
		
	}
	
	public void acceptAlertsub() throws InterruptedException{
		  //WebDriverWait wait = new WebDriverWait(driver, 15);
		  //wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Product Category" +pro.getProperty("subcategoryname") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}
	
	
	/*
	 * verification for product sub cateory
	 * 
	 */
	public void verifysubcategory(String vrfytxt1) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = verifytxt1;
		Select select = new Select(element1);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		filtercategory.sendKeys(pro.getProperty("subcategoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as "+ actualtext);
		if(actualtext.equals(vrfytxt1))
		{
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
	}
	
	public void partdesc1() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(2000);
		partdesc.click();
	}
	
	
	public void categoryselect() {
		
		WebElement element = selectsubcategory;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));
	}
	
	
	
	public void entrypartdesc(String newpartdesc) {
		
		enternewpartdesc.sendKeys(newpartdesc);
		
	}
	
	
	public void acceptAlertdesc() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " +pro.getProperty("partdesc") + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	
	public void equivalentpartdesc() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = equivalentpartdes;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("equivalentpartsdesc"));		
		Thread.sleep(2000);
		
	}

	
	public void savingpartdesc() throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/input[@id='MainContent_btnSave']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savecategory);
		savecategory.click();
		Thread.sleep(2000);
		//wait(2);
	}
	
	public void verifycategory1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = filtercategory1;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname"));		
		Thread.sleep(2000);
	}
	

	public void verifypartdesc(String vrfytxt1) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//filtercategory.sendKeys(pro.getProperty("subcategoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as "+ actualtext);
		if(actualtext.equals(vrfytxt1))
		{
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
	}
	
	
	public void clickonproductlinecode() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		prdtln.click();
		Thread.sleep(5000);
	}
	
	
	
	public void addproductline(String linecode,String linename) {
		
		txtlinecode.sendKeys(linecode);
		txtlinename.sendKeys(linename);
		
	}
	
	
	
	public void savebtn() throws InterruptedException {
		savecategory.click();
		Thread.sleep(2000);
		
	}
	
	
	
	public void acceptAlertline() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " +pro.getProperty("productline") + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
	}
	
	
	public void verifyproductline(String vrfytxt1) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		linefilter.sendKeys(pro.getProperty("productline"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as "+ actualtext);
		if(actualtext.equals(vrfytxt1))
		{
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
	}
	
	
}


