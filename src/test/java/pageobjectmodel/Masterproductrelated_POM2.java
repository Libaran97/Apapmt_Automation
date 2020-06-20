	package pageobjectmodel;
	
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.aventstack.extentreports.ExtentTest;
	import utility.Baseclass;
	
	public class Masterproductrelated_POM2 extends Baseclass {
	
		ExtentTest loginfo = null;
	
		public Masterproductrelated_POM2() {
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
		@CacheLookup
		private WebElement master;
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_7']")
		private WebElement mastercategory;
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_4']")
		private WebElement mastercategorybrand;
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_9']")
		private WebElement mastercategoryck31;
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_10']")
		private WebElement mastercategoryckass32;
	
		@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_11']")
		private WebElement mastercategoryckass33;
	
		@FindBy(xpath = "//div[@id='btnadd_new']")
		private WebElement eaddproductgroup;
	
		@FindBy(xpath = "//input[@id='txt_productcategory']")
		private WebElement eaddproductcategory;
	
		@FindBy(xpath = "//input[@id='txt_productorder']")
		private WebElement eaddproductorder;
	
		@FindBy(xpath = "(//div[@class='edit_icon_ver'])[1]")
		private WebElement eeditproductorder;
	
		@FindBy(xpath = "//div[@id='save_btn_new_add']")
		private WebElement esave;
	
		@FindBy(xpath = "//div[@id='save_btn_new_edit']")
		private WebElement esaveedit;
	
		@FindBy(xpath = "(//button[@type='button'])[2]")
		private WebElement eAcceptalert;
		
		@FindBy(xpath = "//input[@id='txtbrandmaster']")
		private WebElement brandsearchbox;
		
		@FindBy(xpath = "//li[text()='Daimler']")
		private WebElement brandsearchboxdrop;
		
		
		@FindBy(xpath = "//input[@id='btnsearch_html']")
		private WebElement brandsearch;
		
		@FindBy(xpath = "//input[@placeholder='Brand ID']")
		private WebElement ebrandid;		
		
		@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td")
		private WebElement invaliddata;
		
		@FindBy(xpath = "//*[@id='swal2-title']")
		private WebElement emptypop;	
		
		@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[3]")
		private WebElement validgrid;		
		
		@FindBy(xpath = "//input[@placeholder='Product Category']")
		private WebElement searchfilter1;
	
		@FindBy(xpath = "//input[@placeholder='Description']")
		private WebElement searchfilter2;
	
		@FindBy(xpath = "//input[@placeholder='CK31 Name']")
		private WebElement searchfilter3;
		@FindBy(xpath = "//input[@placeholder='CK32 Name']")
		private WebElement searchfilter4;
		@FindBy(xpath = "//input[@placeholder='CK33 Name']")
		private WebElement searchfilter5;
	
		@FindBy(xpath = "//input[@placeholder='PartsType']")
		private WebElement searchfilter6;
	
		@FindBy(xpath = "//div[@id=\"diveditbutton_'3'\"]")
		private WebElement compedit;
	
		@FindBy(xpath = "//label[text()='Alternator']")
		private WebElement ePartype;
		@FindBy(xpath = "//label[text()='Engine oil test']")
		private WebElement ePartypeagain;
	
		@FindBy(xpath = "//div[@id='save_btn_new_edit']")
		private WebElement ecompsave;
	
		@FindBy(xpath = "//span[@id='select2-drpCK32-container']")
		private WebElement eselectsystem;
	
		@FindBy(xpath = "//span[@id='select2-drpCK31Component-container']")
		private WebElement eselectsystems;
	
		@FindBy(xpath = "//li[text()='000 | Cab, Climate Control, Instrumentation, & Aerodynamic Devices Group']")
		private WebElement eselectedsystem;
	
		@FindBy(xpath = "//li[text()='001 | Air Conditioning, Heating & Ventilating System']")
		private WebElement eselectedsystemSEL;
	
		@FindBy(xpath = "//td[@class='sorting_1']")
		private WebElement verifytext;
	
		@FindBy(xpath = "//*[@id='DataTableViewer']/tbody/tr/td[2]")
		private WebElement verifytextsec;
	
		public void clickonproductcategory() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Thread.sleep(3000);
			mastercategory.click();
			Thread.sleep(8000);
		}
	
		public void clickonBrandmaster() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Thread.sleep(3000);
			mastercategorybrand.click();
			Thread.sleep(8000);
		}
		
	
	
		public void clickonsystemck31() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Thread.sleep(3000);
			mastercategoryck31.click();
			Thread.sleep(8000);
		}
	
		public void clickonassembly32() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Thread.sleep(3000);
			mastercategoryckass32.click();
			Thread.sleep(8000);
		}
	
		public void clickonassembly33() throws Throwable {
			Actions action = new Actions(driver);
			action.moveToElement(master).build().perform();
			Thread.sleep(3000);
			mastercategoryckass33.click();
			Thread.sleep(8000);
		}
	
		public void clicksystemck31search(String ck31, String ck31description) throws Throwable {
			searchfilter3.sendKeys(ck31);
			Thread.sleep(5000);
			searchfilter2.sendKeys(ck31description);
			Thread.sleep(5000);
		}
	
		public void clickassemblyck32search(String systemvalue, String ck31) throws Throwable {
			eselectsystem.click();
			Thread.sleep(5000);
			eselectedsystem.click();
			Thread.sleep(5000);
			searchfilter4.sendKeys(systemvalue);
			Thread.sleep(5000);
			searchfilter2.sendKeys(ck31);
			Thread.sleep(5000);
		}
	
		public void clickcomponentck33search(String Compnenentvalue) throws Throwable {
			eselectsystems.click();
			Thread.sleep(5000);
			eselectedsystemSEL.click();
			Thread.sleep(5000);
			searchfilter5.sendKeys(Compnenentvalue);
			Thread.sleep(5000);
			compedit.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 120);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_edit']")));
			ePartype.click();
			Thread.sleep(8000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", esaveedit);
			esaveedit.click();
			Thread.sleep(5000);
	
		}
	
		public void addproductgroup(String Productcategory, String qtydata) throws Throwable {
			eaddproductgroup.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 120);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
			eaddproductcategory.sendKeys(Productcategory);
			Thread.sleep(2000);
			eaddproductorder.sendKeys(qtydata);
			Thread.sleep(2000);
			esave.click();
			Thread.sleep(5000);
		}
	
		public void editproductgroup(String Productcategory, String Equchose, String Length) throws Throwable {
			searchfilter1.sendKeys(Productcategory);
			Thread.sleep(5000);
			eeditproductorder.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 120);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_add']")));
			eaddproductcategory.clear();
			Thread.sleep(2000);
			eaddproductcategory.sendKeys(Equchose);
			Thread.sleep(2000);
			eaddproductorder.clear();
			Thread.sleep(2000);
			eaddproductorder.sendKeys(Length);
			Thread.sleep(2000);
			esave.click();
			Thread.sleep(6000);
	
		}
	
		public void invalidbrandsearchmaster(String linename) throws Throwable {
			brandsearchbox.sendKeys(linename);
			Thread.sleep(3000);
			brandsearch.click();
			Thread.sleep(6000);
			
			String invalid= invaliddata.getText();
			if(invalid.equals("No data available in table"))
			{
				System.out.println("Invalid text Both are same");
			}
			else
			{
				System.out.println("Invalid text Both are not same");
			}			
		}
		
		public void emptybrandsearchmaster() throws Throwable {
			brandsearchbox.clear();
			Thread.sleep(3000);
			brandsearch.click();
			Thread.sleep(6000);
			String eemptypop= emptypop.getText();
			if(eemptypop.equals("Please enter few characters"))
			{
				System.out.println("empty text Both are same");
			}
			else
			{
				System.out.println("empty text Both are not same");
			}	
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
			eAcceptalert.click();
			Thread.sleep(8000);
			
			
		}
		
		public void validbrandsearchmaster(String brandvalue,String Brandid) throws Throwable {
			brandsearchbox.clear();
			Thread.sleep(3000);			
			brandsearchbox.sendKeys(brandvalue);
			Thread.sleep(3000);	
			brandsearchboxdrop.click();
			Thread.sleep(3000);	
			brandsearch.click();
			Thread.sleep(6000);			
			ebrandid.sendKeys(Brandid);
			Thread.sleep(3000);			
			
			String eemptypop= validgrid.getText();
			if(eemptypop.equals(Brandid))
			{
				System.out.println("valid text Both are same");
			}
			else
			{
				System.out.println("valid text Both are not same");
			}				
			
		}
		
		public void acceptAlert() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
			eAcceptalert.click();
			Thread.sleep(8000);
		}
	
		public void verifyingtext(String Productcategory) throws Exception {
			Thread.sleep(8000);
			searchfilter1.sendKeys(Productcategory);
			String actualtext = verifytext.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(Productcategory)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
		}
	
		public void verifyingck31(String ck31) throws Exception {
			String actualtext = verifytext.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(pro.getProperty("ck31"))) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
		}
	
		public void verifyingck32(String systemvalue) throws Exception {
			String actualtext = verifytext.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(pro.getProperty("systemvalue"))) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
		}
	
		public void verifyingck33(String Partype) throws Exception {
			eselectsystems.click();
			Thread.sleep(5000);
			eselectedsystemSEL.click();
			Thread.sleep(5000);
			searchfilter6.sendKeys(Partype);
			Thread.sleep(5000);
	
			String actualtext = verifytextsec.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(pro.getProperty("Partype"))) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
			Thread.sleep(5000);
		}
	
		public void Editagain() throws Exception {
	
			eeditproductorder.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='save_btn_new_edit']")));
			ePartypeagain.click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", esaveedit);
			esaveedit.click();
			Thread.sleep(5000);
		}
	
		public void verifyEditagain(String subcategoryname1) throws Exception {
			eselectsystems.click();
			Thread.sleep(5000);
			eselectedsystemSEL.click();
			Thread.sleep(5000);
			searchfilter6.sendKeys(subcategoryname1);
			Thread.sleep(5000);
	
			String actualtext = verifytextsec.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.contains(pro.getProperty("subcategoryname1"))) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
	
		}
	
		public void verifyingtextedit(String Equchose) throws Exception {
			Thread.sleep(8000);
			searchfilter1.sendKeys(Equchose);
			String actualtext = verifytext.getText();
			System.out.println("Text present as " + actualtext);
			if (actualtext.equals(Equchose)) {
				System.out.println("Both are same");
			} else {
				System.out.println("Both are not same");
			}
		}
	
	}
