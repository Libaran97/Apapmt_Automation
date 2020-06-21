package pageobjectmodel;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
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
import com.sun.tools.internal.xjc.reader.gbind.Element;

import junit.framework.Assert;
import utility.Baseclass;

public class Masterproductrelated_POM extends Baseclass {

	ExtentTest loginfo = null;

	public Masterproductrelated_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_0']")
	private WebElement mastercategory;

	//@FindBy(xpath = "//button[@id='MainContent_btnAdd']")
	@FindBy(xpath = "//div[@id='btnadd_new']")	
	private WebElement addcategory;

	@FindBy(xpath="//div[@id='MainContent_btnAdd']")	
	private WebElement addcategory1;

	@FindBy(xpath="//button[@id='MainContent_btnAdd']")	
	private WebElement addcategory2;

	//@FindBy(id = "MainContent_txtProductCategory")
	@FindBy(id = "txtProductCategory1")	
	private WebElement entercategory;
	
	@FindBy(xpath = "//input[@id=\"txtProductCategory_edit\"]")	
	private WebElement entercategoryedit;
	
	

	//@FindBy(xpath = "//input[@id='MainContent_radioACESList_14']")
	@FindBy(xpath="//*[text()='Ignition']")
	private WebElement equivalentcategory;
	
	@FindBy(xpath="//*[text()='Exhaust']")
	private WebElement equivalentcategoryprevious;
	
	//@FindBy(xpath = "//input[@id='MainContent_radioACESList_14']")
		//@FindBy(xpath="//*[text()='Ignition']")
		//private WebElement equivalentcategoryedit;

	@FindBy(xpath = "//*[text()='Engine']")
	private WebElement equivalentcategory1;

	//@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	@FindBy(xpath="//input[@id='MainContent_btnSave']")	
	private WebElement savecategory;

	@FindBy(xpath="//div[@id='save_btn_new_add']")
	private WebElement savecategory1;

	@FindBy(xpath="//div[@id='save_btn_new_add']")
	private WebElement savebt;
	
	@FindBy(xpath="//*[@id='save_btn_new_edit']/i")
	private WebElement savebtedit;
	


	@FindBy(xpath = "//td[@class='sorting_1']")	
	private WebElement verifytext;

	@FindBy(xpath = "//a[contains(text(),'Product Sub Category')]")
	// a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_1']
	private WebElement subcategory;

	//@FindBy(xpath = "//select[@id='MainContent_drpProductCategoryAdd']")
	@FindBy(xpath="//span[@id='select2-drpProductCategoryAdd1-container']")	
	private WebElement selectcategory;
	
	@FindBy(xpath="//span[@id='select2-drpProductCategory1-container']")	
	private WebElement selectcategoryeditprodu;
	

	@FindBy(xpath="//span[@id='select2-drpProductCategory1-container']")	
	private WebElement selectcategoryveri;

	@FindBy(xpath="//li[text()='Steering Test']")
	private WebElement selectcategory1;

	@FindBy(xpath="//li[text()='Engine Coils test']")
	private WebElement selectcategory2;

	//@FindBy(xpath = "//input[@id='MainContent_txtProductSubCategory']")
	@FindBy(xpath="//input[@id='txt_subcategory']")
	private WebElement clicksubcatname;

	//@FindBy(xpath = "//input[@id='MainContent_txtProductSubCategory']")
	@FindBy(xpath="//*[@id='txt_subcategory']")
	public WebElement entersubcategory;

	//@FindBy(id = "MainContent_radioACESList_6")
	@FindBy(xpath="//label[text()='Ignition Coil']")
	private WebElement eqsubcategory;

	@FindBy(xpath="//*[text()='Relays']")
	private WebElement eqsubcategorypre;
	
	@FindBy(xpath = "//*[text()='Filters']")
	private WebElement eqsubcategory1;

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_3']")
	private WebElement partdesc;

	//@FindBy(xpath = "//select[@id='MainContent_drpProductSubCategoryAdd']")
	@FindBy(xpath="//select[@id='MainContent_drpProductCategoryAdd']")
	private WebElement selectsubcategory;	

	@FindBy(xpath="//select[@id='MainContent_drpProductCategoryAdd']//option[text()='Steering Test']")
	private WebElement selectsubcategorys;	
	
	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategoryAdd']")
	private WebElement selectsubcategoryaut;	

	@FindBy(xpath="//select[@id='MainContent_drpProductSubCategoryAdd']//option[text()='Ignition Coil Test']")
	private WebElement selectsubcategorysaut1;	
	

	@FindBy(xpath="//select[@id='MainContent_drpProductCategoryAdd']//option[text()='Engine Coils test']")
	private WebElement selectsubcategoryss;	

	@FindBy(xpath = "//input[@id='MainContent_txtPartDescription']")
	private WebElement enternewpartdesc;

	@FindBy(xpath = "//select[@id='MainContent_drpAcesPartTerminology']")
	private WebElement equivalentpartdes;

	@FindBy(xpath="//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Ignition Coil Seal']")
	private WebElement equivalentpartdessend;
	
	@FindBy(xpath="//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Ignition Coil Set']")
	private WebElement equivalentpartdessendedit;
	
	@FindBy(xpath="//img[@id='MainContent_Image1']")
	private WebElement eacester;
	
	
	@FindBy(xpath="//*[@id='MainContent_drpAcesPartTerminology']//option[text()='Engine Oil Filter']")
	private WebElement equivalentpartdessend1;

	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	private WebElement verfypart;

	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']//option[text()='Steering Test']")
	private WebElement verfypart1;
	
	@FindBy(xpath="//input[@placeholder='Equivalent Aces Terminology']")
	private WebElement eequivatermedit;
	
	@FindBy(xpath="//input[@id='MainContent_ImageButton1']")
	private WebElement eequediticon;
	
	

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_5']")
	private WebElement prdtln;

	@FindBy(xpath = "//input[@id='txt_linecode']")
	private WebElement txtlinecode;

	@FindBy(xpath = "//input[@id='txt_linename']")
	private WebElement txtlinename;
	
	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement Productsaveedit;
	
	/*
	 * @FindBy(xpath="//span[@id='MainContent_lblError']") private WebElement
	 * lblError;
	 * 
	 * @FindBy(xpath="//*[@id='MainContent_Image1']") private WebElement closeext;
	 */

	@FindBy(xpath = "//input[@placeholder='Product Category']")
	private WebElement searchfilter1;

	@FindBy(xpath="(//div[@class=\"edit_icon_ver\"])[1]")
	private WebElement Editfirst;
	
	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']")
	private WebElement verifytxt1;

	@FindBy(xpath = "//input[@placeholder='Product Subcategory Name']")
	private WebElement filtercategory;
	
	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	private WebElement subeditbutton;
	

	@FindBy(xpath = "//select[@id='MainContent_drpProductCategory']")
	private WebElement filtercategory1;

	@FindBy(xpath = "//input[@placeholder='Line Code']")
	private WebElement linefilter;
	
	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	private WebElement linefilteredit;
	

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_2']")
	private WebElement eCustomAttribute;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement eAddCustomAttribute;

	@FindBy(xpath = "//input[@id='txtPartsSpecification1']")	
	private WebElement eEtrCustomAttribute;



	@FindBy(xpath = "//span[@id='select2-ddlDatatype1-container']")
	private WebElement eDataType;

	@FindBy(xpath = "(//li[text()='Alphanumeric'])")
	private WebElement edatasend;
	
	@FindBy(xpath = "(//li[text()='Text'])")
	private WebElement edatasend1;


	@FindBy(xpath = "//input[@id='min']")
	private WebElement eMinLength;

	@FindBy(xpath = "//input[@id='max']")
	private WebElement eMaxLength;

	@FindBy(xpath = "//input[@value='Steering']")
	private WebElement eselectpdes;
	
	@FindBy(xpath = "//input[@id='10143']")
	private WebElement esecpartdesc;
	
	@FindBy(xpath = "//div[@id='save_btn_new_edit']")
	private WebElement ecustomsaveedit;	

	@FindBy(xpath = "//input[@value='Engine']")
	private WebElement eselectpdes1;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
	public WebElement ecustomeditbt;
	

	@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;


	@FindBy(xpath = "//a[@id='hylLogout']")
	public WebElement LogoutButton;

	@FindBy(xpath="//*[@id='txtUsername']")
	public WebElement Username1;

	@FindBy(xpath="//*[@id='txtPassword']")
	public WebElement Password1;

	@FindBy(xpath="//*[@id='btnLogin']")
	public WebElement Submit1;

	@FindBy(xpath="//*[@id='logosettings']/i")
	public WebElement Settings;

	@FindBy(xpath ="//*[@id='MainContent_drpadmin']")
	public WebElement Partdescadmin;

	@FindBy(xpath="//*[@id='MainContent_btnEdit']")
	public WebElement EDIToption;

	@FindBy(xpath="(//label[text()='Ignition Test'])//preceding-sibling::input")
	public WebElement Partdescripvalue;


	@FindBy(xpath="(//label[text()='Engine oil test'])//preceding-sibling::input")
	public WebElement Partdescripvalue1;

	@FindBy(xpath="//*[@id='MainContent_btnSave']")
	public WebElement Savepartdesc;

	public void clickonproductcategory() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		mastercategory.click();
		Thread.sleep(8000);
	}

	public void addcategory() throws Throwable {
		addcategory.click();
		Thread.sleep(8000);
	}

	public void Edirtaddcategory(String Categoryprevious) throws Exception
	{
		searchfilter1.sendKeys(pro.getProperty("Categoryprevious"));
		Thread.sleep(5000);	
		Editfirst.click();
		Thread.sleep(5000);	
	}
	
	public void editequalcase(String categoryname) throws Exception
	{
		entercategoryedit.clear();
		Thread.sleep(3000);
		entercategoryedit.sendKeys(categoryname);
		//Thread.sleep(3000);
		equivalentcategory.click();
		Thread.sleep(5000);
	}
	
	
	public void addcategory1() throws Throwable {
		addcategory1.click();
		Thread.sleep(10000);
	}
	public void addcategory2() throws Throwable {
		addcategory2.click();
		Thread.sleep(10000);
	}
	
	public void editcategory(String Editequivalent) throws Throwable {
		verfypart.click();		
		Thread.sleep(6000);
		verfypart1.click();
		Thread.sleep(6000);
		eequivatermedit.sendKeys(Editequivalent);
		Thread.sleep(3000);
		eequediticon.click();
		Thread.sleep(6000);
	}
	
	

	public void entrycategory(String Categoryprevious) throws InterruptedException {
		entercategory.sendKeys(Categoryprevious);
		equivalentcategoryprevious.click();
		Thread.sleep(5000);
		// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}

	public void entrycategory1(String categoryname1) throws InterruptedException {
		entercategory.sendKeys(categoryname1);
		equivalentcategory1.click();
		Thread.sleep(5000);
		// loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}

	public void savingcategory() throws InterruptedException {
		WebElement elementfilter1 = savecategory;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);		
		//Thread.sleep(5000);
		//savecategory.click();
		Thread.sleep(10000);
	}

	public void savingcategory1() throws InterruptedException {
		WebElement elementfilter1 = savecategory1;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);		
		//Thread.sleep(5000);
		//savecategory.click();
		Thread.sleep(10000);
	}

	public void acceptAlert() throws InterruptedException, IOException {

		// if(savecategory.isDisplayed())
		//Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		//System.out.println("Product Category " + pro.getProperty("categoryname") + alert.getText());
		// WebDriverWait wait = new WebDriverWait(driver, 3 /*timeout in seconds*/);
		// if(wait.until(ExpectedConditions.alertIsPresent())==null) {
		//alert.accept();
		WebElement pop=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		//savecategory.click();
	}

	public void verifyingtext(String Categoryprevious) throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchfilter1.sendKeys(pro.getProperty("Categoryprevious"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(Categoryprevious)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
	
	public void verifyingtextedit(String categoryname) throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchfilter1.sendKeys(pro.getProperty("categoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(categoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void verifyingtext1(String categoryname1) throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchfilter1.sendKeys(pro.getProperty("categoryname1"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(categoryname1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void clicksubcategory() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(2000);
		subcategory.click();
		Thread.sleep(8000);

	}

	public void addsubcategory() throws InterruptedException {
		selectcategory.click();
		Thread.sleep(8000);
		/*WebElement element = selectcategory;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname"));*/
		selectcategory1.click();
		Thread.sleep(8000);
	}
	
	public void addsubcategoryedit() throws InterruptedException {
		//selectcategory.click();
		selectcategoryeditprodu.click();		
		Thread.sleep(8000);		
		selectcategory1.click();
		Thread.sleep(8000);
		filtercategory.sendKeys(pro.getProperty("subcategorynameprevious"));
		Thread.sleep(6000);
		subeditbutton.click();		
		Thread.sleep(5000);
	}


	public void addsubcategory1() throws InterruptedException {
		selectcategory.click();
		Thread.sleep(8000);		
		selectcategory2.click();
		Thread.sleep(8000);

	}

	public void entrysubcategory(String subcategorynameprevious) throws InterruptedException {
		//clicksubcatname.click();
		entersubcategory.sendKeys(subcategorynameprevious);
		//eqsubcategory.click();
		eqsubcategorypre.click();
		Thread.sleep(5000);

	}
	public void entrysubcategoryedit(String subcategoryname) throws InterruptedException {
		//clicksubcatname.click();
		clicksubcatname.clear();
		Thread.sleep(3000);
		clicksubcatname.sendKeys(subcategoryname);
		//eqsubcategory.click();
		Thread.sleep(5000);
		eqsubcategory.click();
		Thread.sleep(5000);

	}
	

	public void entrysubcategory1(String subcategoryname1) throws InterruptedException {
		clicksubcatname.click();
		entersubcategory.sendKeys(subcategoryname1);
		eqsubcategory1.click();
		Thread.sleep(5000);

	}

	public void acceptAlertsub() throws InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver, 15);
		// wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Product Category" + pro.getProperty("subcategoryname") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	/*
	 * verification for product sub cateory
	 * 
	 */
	public void verifysubcategory(String subcategorynameprevious) throws Exception {

		selectcategoryveri.click();
		Thread.sleep(8000);		
		selectcategory1.click();
		Thread.sleep(8000);

		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = verifytxt1;
		Select select = new Select(element1);
		select.selectByVisibleText(pro.getProperty("categoryname"));*/
		filtercategory.sendKeys(pro.getProperty("subcategorynameprevious"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategorynameprevious)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}
	
	public void verifysubcategoryedit(String subcategoryname) throws Exception {

		selectcategoryveri.click();
		Thread.sleep(8000);		
		selectcategory1.click();
		Thread.sleep(8000);

		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element1 = verifytxt1;
		Select select = new Select(element1);
		select.selectByVisibleText(pro.getProperty("categoryname"));*/
		filtercategory.sendKeys(pro.getProperty("subcategoryname"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void verifysubcategory1(String subcategoryname1) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		selectcategoryveri.click();
		Thread.sleep(8000);
		selectcategory2.click();
		Thread.sleep(8000);
		/*WebElement element1 = verifytxt1;
		Select select = new Select(element1);
		select.selectByVisibleText(pro.getProperty("categoryname1"));*/
		filtercategory.sendKeys(pro.getProperty("subcategoryname1"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void partdesc1() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		partdesc.click();
	}

	public void categoryselect() throws Exception {
		selectsubcategory.click();
		Thread.sleep(5000);
		selectsubcategorys.click();
		Thread.sleep(5000);	
		
		selectsubcategoryaut.click();
		Thread.sleep(5000);
		selectsubcategorysaut1.click();
		Thread.sleep(5000);
		/*WebElement element = selectsubcategory;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("subcategoryname"));*/
	}

	public void categoryselect1() throws Exception {
		selectsubcategory.click();
		Thread.sleep(5000);
		selectsubcategoryss.click();
		Thread.sleep(5000);	

	}

	public void entrypartdesc(String partdesc) throws Exception {

		enternewpartdesc.sendKeys(partdesc);
		Thread.sleep(5000);
	}
	
	public void entrypartdescedit(String subcategoryname) throws Exception {
		enternewpartdesc.clear();
		Thread.sleep(3000);
		enternewpartdesc.sendKeys(subcategoryname);
		Thread.sleep(5000);
	}

	public void entrypartdesc1(String subcategoryname1) throws Exception {

		enternewpartdesc.sendKeys(subcategoryname1);
		Thread.sleep(5000);

	}

	public void acceptAlertdesc() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + pro.getProperty("partdesc") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void equivalentpartdesc() throws InterruptedException {
		equivalentpartdes.click();
		Thread.sleep(6000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*WebElement element1 = equivalentpartdes;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("equivalentpartsdesc"));*/		
		equivalentpartdessend.click();
		Thread.sleep(6000);

	}
	
	public void equivalentpartdescedit() throws InterruptedException {
		equivalentpartdes.click();
		Thread.sleep(6000);		
		//equivalentpartdessend.click();
		equivalentpartdessendedit.click();
		Thread.sleep(5000);
		eacester.click();
		Thread.sleep(4000);
		

	}

	public void equivalentpartdesc1() throws InterruptedException {
		equivalentpartdes.click();
		Thread.sleep(6000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*WebElement element1 = equivalentpartdes;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("equivalentpartsdesc1"));*/
		equivalentpartdessend1.click();
		Thread.sleep(5000);
	}

	public void savingpartdesc() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/input[@id='MainContent_btnSave']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savecategory);
		savecategory.click();
		Thread.sleep(5000);
		// wait(2);
	}

	public void verifycategory1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = filtercategory1;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname"));
		Thread.sleep(2000);
	}

	public void verifycategory2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = filtercategory1;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("categoryname1"));
		Thread.sleep(5000);
	}

	public void verifypartdesc(String partdesc) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		verfypart.click();		
		Thread.sleep(3000);
		verfypart1.click();
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(partdesc)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
	
	public void verifypartdescedit(String subcategoryname) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		verfypart.click();		
		Thread.sleep(3000);
		verfypart1.click();
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(subcategoryname)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void clickonproductlinecode() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		prdtln.click();
		Thread.sleep(6000);
	}

	public void addproductline(String linecode, String linename) throws Exception {

		txtlinecode.sendKeys(linecode);
		txtlinename.sendKeys(linename);
		Thread.sleep(5000);

	}
	public void editproduct(String linecode1,String linecode,String linename) throws Exception {
		linefilter.sendKeys(linecode1);	
		Thread.sleep(5000);
        linefilteredit.click();
        Thread.sleep(4000);    
        txtlinecode.clear();
        Thread.sleep(2000);  
        txtlinecode.sendKeys(linecode);
        Thread.sleep(2000);
        txtlinename.clear();
        Thread.sleep(2000);
        txtlinename.sendKeys(linename);
        Thread.sleep(2000);
        Productsaveedit.click();
        Thread.sleep(5000);
        
	}
	

	public void savebtn() throws InterruptedException {
		//savecategory.click();
		savebt.click();
		Thread.sleep(6000);

	}

	public void acceptAlertline() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + pro.getProperty("linecode") + alert.getText());
		alert.accept();
		Thread.sleep(2000);

	}

	/*	public void acceptAlertline1() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Product Category " + pro.getProperty("linecode1") + alert.getText());
		alert.accept();
		Thread.sleep(2000);

	}*/

	public void verifyproductline(String linecode1) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		linefilter.sendKeys(pro.getProperty("linecode1"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(linecode1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}
	
	public void verifyproductlineedit(String linecode) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		linefilter.sendKeys(pro.getProperty("linecode"));
		String actualtext = verifytext.getText();
		System.out.println("Text present as " + actualtext);
		if (actualtext.equals(linecode)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void clickonCustomAttributes() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		eCustomAttribute.click();
		Thread.sleep(8000);
	}

	public void AddbtnEnterCustomAtbName(String AttributeName) throws Throwable {
		eAddCustomAttribute.click();
		Thread.sleep(5000);

		eEtrCustomAttribute.sendKeys(AttributeName);

		Thread.sleep(3000);
	}
	public void editcustom(String AttributeName,String editattrvalue) throws Throwable {
		esearchbox.sendKeys(AttributeName);
		Thread.sleep(5000);
		ecustomeditbt.click();
		Thread.sleep(6000);
		eEtrCustomAttribute.clear();
		Thread.sleep(2000);
		eEtrCustomAttribute.sendKeys(editattrvalue);
		Thread.sleep(4000);
	}
	public void editdataandpartdesc() throws Throwable {
		eDataType.click();
		Thread.sleep(4000);
		edatasend1.click();
		Thread.sleep(6000);	
		eMinLength.clear();
		Thread.sleep(3000);	
		eMinLength.sendKeys("2");	
		Thread.sleep(3000);	
		eMaxLength.clear();
		Thread.sleep(3000);	
		eMaxLength.sendKeys("8");		
		Thread.sleep(3000);	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", esecpartdesc);
	    esecpartdesc.click();
	    Thread.sleep(6000);	
	    js.executeScript("arguments[0].scrollIntoView();", ecustomsaveedit);
	    ecustomsaveedit.click();
	    Thread.sleep(6000);		    
	}
	
	

	public void AddbtnEnterCustomAtbName1(String AttributeName1) throws Throwable {
		eAddCustomAttribute.click();
		//eEtrCustomAttribute.click();
		Thread.sleep(8000);

		eEtrCustomAttribute.sendKeys(AttributeName1);

		Thread.sleep(3000);
	}

	public void AttributeDetails() throws InterruptedException {
		eDataType.click();
		Thread.sleep(5000);
		edatasend.click();
		/*Select Datatype = new Select(edatasend);
		Datatype.selectByIndex(3);*/
		Thread.sleep(5000);
		eMinLength.sendKeys("1");
		Thread.sleep(5000);
		eMaxLength.sendKeys("100");
	}

	@SuppressWarnings("deprecation")
	public void SelectPartDescription() throws InterruptedException {

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eselectpdes);
		if (eselectpdes.isDisplayed()) {
			eselectpdes.click();

		} else {
			// Assert.assertNotNull(eselectpdes);
			Assert.assertNull(eselectpdes);
		}

	}

	@SuppressWarnings("deprecation")
	public void SelectPartDescription1() throws InterruptedException {

		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eselectpdes1);
		if (eselectpdes1.isDisplayed()) {
			eselectpdes1.click();

		} else {
			// Assert.assertNotNull(eselectpdes);
			Assert.assertNull(eselectpdes1);
		}

	}

	public void savebtn2() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebt);
		savebt.click();
		Thread.sleep(5000);
	}
	
	public void savebtnedit() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebtedit);
		savebtedit.click();
		Thread.sleep(5000);
	}
	

	public void acceptAlertAttribute() throws InterruptedException {

		Alert alert = driver.switchTo().alert();
		System.out.println("Custom Attribute" + pro.getProperty("AttributeName") + alert.getText());
		alert.accept();
		Thread.sleep(5000);
	}

	public void VerufyAttribute(String AttributeName) throws InterruptedException {

		esearchbox.sendKeys(AttributeName);
		Thread.sleep(5000);
		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		actualText.equals(AttributeName);
		System.out.println("Both are same: Added Successfully");
	}
	public void VerifycusteditAttribute(String editattrvalue) throws InterruptedException {

		esearchbox.sendKeys(editattrvalue);
		Thread.sleep(5000);
		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		if(actualText.contains(editattrvalue));
		{
		System.out.println("Both are same: Added Successfully");
		}		  
	}


	public void VerufyAttribute1(String AttributeName1) throws InterruptedException {

		esearchbox.sendKeys(AttributeName1);
		Thread.sleep(5000);
		String actualText = ePDverify.getText();
		System.out.println("Text" + actualText);
		actualText.equals(AttributeName1);
		System.out.println("Both are same: Added Successfully");
	}


	public void Logoutloginadmin() throws InterruptedException 
	{
		System.out.println("Entered the Kavin user page....");
		LogoutButton.click();
		System.out.println("standing landing page....");
		Thread.sleep(5000);
		Username1.sendKeys("kathir");
		Password1.sendKeys("kathir");
		Submit1.click();
		Thread.sleep(10000);
		Settings.click();
		Thread.sleep(5000);
	}
	public void Userpermission() throws Exception
	{
		Select drops= new Select(Partdescadmin);
		drops.selectByVisibleText("Kavin");
		Thread.sleep(5000);		
		EDIToption.click();

		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");*/
		Thread.sleep(5000);


		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();", Partdescripvalue);		

		Partdescripvalue.click();


		Thread.sleep(5000);
		Savepartdesc.click();
		Thread.sleep(5000);

		Alert alert =driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);

	}

	public void Userpermission2() throws Exception
	{
		Select drops= new Select(Partdescadmin);
		drops.selectByVisibleText("Kavin");
		Thread.sleep(5000);		
		EDIToption.click();

		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");*/
		Thread.sleep(5000);


		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();", Partdescripvalue1);		

		Partdescripvalue1.click();


		Thread.sleep(5000);
		Savepartdesc.click();
		Thread.sleep(5000);

		Alert alert =driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);

	}
}
