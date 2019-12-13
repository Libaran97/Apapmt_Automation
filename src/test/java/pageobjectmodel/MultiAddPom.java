package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class MultiAddPom extends Baseclass {

	public MultiAddPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	public WebElement eApplication;

	@FindBy(xpath = "//button[@id='MainContent_Button1']")
	public WebElement eMultiaddbt;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")

	public WebElement eVehicle1;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	public WebElement eMake1;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	public WebElement eModel1;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	public WebElement eVehicle2;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	public WebElement eMake2;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	public WebElement eModel2;

	@FindBy(xpath = "//*[@id='MainContent_btnSearch']")
	public WebElement eSearch;
////////////////////////////////////////////////////////////
	@FindBy(id = "MainContent_GVData_chkActivee1_0")
	public WebElement eChk1;
	@FindBy(id = "MainContent_GVData_chkActivee1_2")
	public WebElement eChk2;
	@FindBy(id = "MainContent_GVData_checkAllrow1")
	public WebElement eChkall;

////////////////////////////////////////////////////////////

	@FindBy(xpath = "//select[@id='MainContent_ddlpline']")
	public WebElement eSelectProduct;

	@FindBy(xpath = "//select[@id='MainContent_ddlpdesc']")
	public WebElement eSelectdesc;

	@FindBy(xpath = "//select[@id='MainContent_ddlpartno']")
	public WebElement eSelectPartno;

	@FindBy(xpath = "//input[@id='MainContent_btnPadd']")
	public WebElement eSelectaddbt;

	@FindBy(xpath = "//input[@id='MainContent_imgSave']")
	public WebElement eSelectsave;

	@FindBy(xpath = "//input[@id= 'MainContent_imgCancel']")
	public WebElement eSelectCancel;

	@FindBy(xpath = "//input[@id='MainContent_gvpartlist_imgDelete_0']")
	public WebElement eSelectDelete;

	// *****Attributes page *****//
	@FindBy(xpath = "//input[@id='MainContent_btnacesattibues']")
	public WebElement eshowattribt;
	// *****Attributes page start *****//
	@FindBy(xpath = "//input[@id='MainContent_dlDisplayColumnList_chkselectAll1_0']")
	public WebElement eshowattribt1;

	@FindBy(xpath = "//input[@id='MainContent_dlDisplayColumnList_chkselectAll1_1']")
	public WebElement eshowattribt2;

	@FindBy(xpath = "//input[@id='MainContent_dlDisplayColumnList_chkselectAll1_2']")
	public WebElement eshowattribt3;

	@FindBy(xpath = "//input[@id='MainContent_dlDisplayColumnList_chkselectAll1_3']")
	public WebElement eshowattribt4;

	// *****Attributes page ACes End*****//

	// *****Attributes non aces page *****//
	@FindBy(xpath = "//input[@id='MainContent_btnnonacesattributes']")
	public WebElement eshowattribt10;

	// *****Attributes page Non-ACes Start*****//

	@FindBy(xpath = "//input[@id='MainContent_dlNonACESattribute_txtNonACES_0']")
	WebElement eshowattribt11;

	// *****Attributes page Non-ACes End*****//`
/////////////////////////////////////////////////////////
	@FindBy(id = "ucMenu_rptLevel1_lnkLink1_2")
	WebElement ePart;

	@FindBy(xpath = "//input[@id='MainContent_txtMelling']")
	private WebElement epartsearch;

	@FindBy(xpath = "//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;

	@FindBy(xpath = "//*[@id=\"BuyersGuid1\"]/img")
	WebElement ebuyerguide;

	@FindBy(xpath = "(//input[@placeholder='Year Range'])[1]")
	WebElement efilter;

	/*
	 * @FindBy(xpath = "(//input[@placeholder='Vehicle Type'])[1]") WebElement
	 * efilter;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Vehicle Type'])[1]") WebElement
	 * efilter1;
	 */

	// (//*[@placeholder='Year Range'])

	@FindBy(xpath = "(//input[@placeholder='Engine Details'])[1]")
	WebElement efilter2;

	@FindBy(xpath = "(//input[@placeholder='Vehicle Type'])[1]")
	WebElement efilter1;
	/*
	 * @FindBy(xpath = "//*[@id=\"tr_1\"]/td[4]") WebElement efirst;
	 * 
	 * @FindBy(xpath = "//*[@id=\"tr_1\"]/td[5]") WebElement esec;
	 * 
	 * @FindBy(xpath = "//*[@id=\"tr_1\"]/td[7]") WebElement ethird;
	 */

	@FindBy(xpath = "//*[@id='MainContent_GVData_lblYear_0']")
	WebElement efirst1;

	@FindBy(xpath = "//*[@role='row']/td[4]")
	WebElement everifynon1ACES;

	@FindBy(xpath = "//*[@role='row']/td[6]")
	WebElement everifyposition;

	// @FindBy(xpath = "//*[@role='row']/td[8]")
	@FindBy(xpath = "//*[@id='appartsedit_btn']")
	WebElement Everifyedit;

	@FindBy(xpath = "//*[@id='MainContent_GvApplications_txtquantity_0']")
	WebElement Everifyqty;

	@FindBy(id = "MainContent_GVData_lblEngineBase_0")
	WebElement eengine;
	/*
	 * @FindBy(xpath = "//tr[@id='tr_0']//td[4]") WebElement everifynonACES;
	 */

	@FindBy(xpath = "//tr[@role='row'] //td[6]")
	WebElement Everifyattr;

	// table[@id='tbl_apppartstable'] //td[6]
	@FindBy(xpath = "//tr[@role='row'] //td[6]")
	WebElement Everifyattr1;

	@FindBy(xpath = "//*[@id='MainContent_dlDisplayColumnList_txtattr_0']")
	WebElement eatrtxtbox;

	@FindBy(xpath = "//label[@for='MainContent_dlDisplayColumnList_chkList_0_0_0']")
	WebElement eregion;

////////////////////////////////////////////////////////////

	@FindBy(xpath = "//*[@id=\"MainContent_gvpartlist\"]/tbody/tr[2]/td/label")
	WebElement edelete;

	@FindBy(xpath = "//*[@id=\"MainContent_drpVehicleType\"]/option[1]")
	WebElement ecancelverify;

////////////////////////////////////////////////////////////
	// **************start attributes**************//
	// qty,notes,position//
	@FindBy(xpath = "//input[@id='MainContent_txtqty']")
	WebElement eqty;

	@FindBy(xpath = "//*[@id='MainContent_txtposition']")
	WebElement eposition;

	@FindBy(xpath = "//input[@id='chk5_All']")
	WebElement epositionselectall;

	@FindBy(xpath = "//*[@id='MainContent_txtnotes']")
	WebElement enotes;

	@FindBy(xpath = "//table[@class='add_bulk_table']//td[6]")
	WebElement eqty1;

	@FindBy(xpath = "//table[@class='add_bulk_table']//td[7]")
	WebElement eposition1;

	@FindBy(xpath = "//table[@class='add_bulk_table']//td[5]")
	WebElement enotes1;

	// **************end attributes**************//

	// **************Strart Part**************//
	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[2]//td[2]")
	WebElement epa1;

	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[3]//td[2]")
	WebElement epa2;

	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[2]//td[3]")
	WebElement epa3;

	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[3]//td[3]")
	WebElement epa4;

	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[2]//td[4]")
	WebElement epa5;

	@FindBy(xpath = "//table[@class='add_bulk_table']//tr[3]//td[4]")
	WebElement epa6;

	@FindBy(id = "MainContent_GVData_lblPartsLinked_0")
	WebElement epartslinked;

	public void Application() throws InterruptedException {
		eApplication.click();
		Thread.sleep(8000);
	}

	public void Multiaddbt() throws InterruptedException {
		eMultiaddbt.click();
		Thread.sleep(8000);
	}

	public void Vehicledata(String vehicletypename) throws Throwable {
		Select evehicle = new Select(eVehicle1);
		evehicle.selectByVisibleText(vehicletypename);
		Thread.sleep(5000);
	}

	public void Makedata(String makename) throws Throwable {
		Select emake = new Select(eMake1);
		emake.selectByVisibleText(makename);
		Thread.sleep(5000);
	}

	public void Modeldata(String modelname) throws Throwable {
		Select emodel = new Select(eModel1);
		emodel.selectByVisibleText(modelname);
		Thread.sleep(5000);
	}

	public void searchbt() throws Exception {
		eSearch.click();
		Thread.sleep(5000);
	}

	String acesexpectedtext = "";

/*	public void Checkbox1() throws Throwable {
		eChk1.click();
		String acesexpectedtext = efirst1.getText();
		// String engine= eengine.getText();
		// System.out.println("Engine value is...."+engine);
		System.out.println("Year value is..." + acesexpectedtext);
	}*/

	public void Checkbox2(String EnterYear, String Acesvalue) {
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());

		int j = 0;
		for (int i = 1; i < list.size(); i++) {
			j = i - 1;
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblYear_" + j + "\"]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblacesnonaces_" + j + "\"]"))
					.getText();
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.contains(pro.getProperty("EnterYear"))) && (Type.contains(pro.getProperty("Acesvalue")))) {
				driver.findElement(By.xpath("(//span[@class='chkBottomItem'])[" + i + "]")).click();

			} else {
				continue;
			}

		}

		// eChk2.click();
	}

	public void Checkbox3(String EnterInvalidYear, String NonAcesvalue) {
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());

		int j = 0;
		for (int i = 1; i < list.size(); i++) {
			j = i - 1;
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblYear_" + j + "\"]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblacesnonaces_" + j + "\"]")).getText();
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.contains(pro.getProperty("EnterInvalidYear")))&& (Type.contains(pro.getProperty("NonAcesvalue")))) {
				driver.findElement(By.xpath("(//span[@class='chkBottomItem'])[" + i + "]")).click();

			} else {
				continue;
			}
		}
	}

	public void partlinkedverification(String EnterYear, String Acesvalue) {
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='chkBottomItem']"));
		System.out.println("Checkbox values..." + list.size());

		int j = 0;
		for (int i = 1; i < list.size(); i++) {
			j = i - 1;
			String Year = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblYear_" + j + "\"]")).getText();
			String Type = driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblacesnonaces_" + j + "\"]")).getText();
			System.out.println("Year value is..." + Year);
			System.out.println("Type value is..." + Type);
			if ((Year.contains(pro.getProperty("EnterInvalidYear")))&& (Type.contains(pro.getProperty("Acesvalue")))) {				
				String Text= driver.findElement(By.xpath("//*[@id=\"MainContent_GVData_lblPartsLinked_"+j+"\"]")).getText();
				System.out.println("Partlinked value is.."+Text);
				String Text1= pro.getProperty("partno");
				System.out.println("Partno values is..."+Text1);
				if(Text.contains(Text1)) {
					System.out.println("Part number same");
				}else
				{
					System.out.println("Part number not same");
				}
				//driver.findElement(By.xpath("(//span[@class='chkBottomItem'])[" + i + "]")).click();

			} else {
				continue;
			}
		}
	}

	

	public void Productline(String linecode) throws Throwable {
		Select EProduct = new Select(eSelectProduct);
		EProduct.selectByVisibleText(linecode);
		Thread.sleep(5000);
	}

	public void Productline1(String linecode1) throws Throwable {
		Select EProduct = new Select(eSelectProduct);
		EProduct.selectByVisibleText(linecode1);
		Thread.sleep(5000);
	}

	public void Partdesc(String Partdesc) throws Throwable {
		Select epart = new Select(eSelectdesc);
		epart.selectByVisibleText(Partdesc);
		Thread.sleep(5000);
	}

	public void Partdesc1(String desc1) throws Throwable {
		Select epart = new Select(eSelectdesc);
		epart.selectByVisibleText(desc1);
		Thread.sleep(5000);
	}

	public void Partnum(String partno) throws Throwable {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select epartno = new Select(eSelectPartno);
		epartno.selectByVisibleText(partno);
		Thread.sleep(5000);
	}
	
	public void Partnum1(String Enterpartpart) throws Throwable {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select epartno = new Select(eSelectPartno);
		epartno.selectByVisibleText(Enterpartpart);
		Thread.sleep(5000);
	}

	

	public void Addbutton() throws Throwable {
		eSelectaddbt.click();
		Thread.sleep(5000);
	}

	public void Savebutton() throws Throwable {
		eSelectsave.click();
		Thread.sleep(5000);
	}

	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Multiadd is..:" + alert.getText());
		alert.accept();
		Thread.sleep(10000);
	}

	public void Cancel() throws Throwable {
		eSelectCancel.click();
		Thread.sleep(3000);
	}

	public void Delete() throws Throwable {
		eSelectDelete.click();
		Thread.sleep(10000);
	}

	public void scrolldown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");

	}

	String erregion = "";
	String engine = "";

	public void attributepage() throws Throwable {
		eshowattribt.click();
		Thread.sleep(10000);
		erregion = eregion.getText();
		System.out.println("region value is.." + erregion);

	}

	public void attributepagebt() throws Throwable {
		eshowattribt1.click();
		eshowattribt2.click();
		eshowattribt3.click();
		eshowattribt4.click();
		Thread.sleep(3000);
	}

	public void attrtxtbox(String Region) throws Throwable {
		eatrtxtbox.sendKeys(pro.getProperty("Region"));
		Thread.sleep(3000);
	}

	public void attributepage10() throws Throwable {
		eshowattribt10.click();
		Thread.sleep(5000);
	}

	public void Attrvalues(String Region) {
		eshowattribt11.sendKeys(Region);
	}

	////////////// Check the parts page///////////
	public void Part() throws Throwable {
		Thread.sleep(5000);
		ePart.click();
		Thread.sleep(5000);
	}

	public void partsearch() throws InterruptedException {
		epartsearch.sendKeys(pro.getProperty("partno"));
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains(pro.getProperty("Partvalue"))) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);

	}

	public void buyerguide() throws Throwable {
		ebuyerguide.click();
		Thread.sleep(5000);
	}

	public void ACesverify(String EnterYear, String SearchTextAcesallEngine) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		efilter.sendKeys(pro.getProperty("EnterYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// String expectedtext=efirst1.getText();
		String actualText = everifynon1ACES.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(acesexpectedtext)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void NonACesverify(String EnterInvalidYear, String SearchTextAcesallEngine) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		Thread.sleep(3000);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		Thread.sleep(5000);
		// String expectedtext=efirst1.getText();
		String actualText = everifynon1ACES.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(acesexpectedtext)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void Deleteverify(String Delete) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = edelete.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(Delete)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void cancelverify(String canvalue) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = ecancelverify.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains("- SELECT -")) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void Acesattverify(String EnterYear, String SearchTextAcesallEngine) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		efilter.sendKeys(pro.getProperty("EnterYear"));
		Thread.sleep(3000);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		Thread.sleep(5000);
		// String expectedtext=eregion.getText();
		String actualText = Everifyattr1.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains(erregion)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void attrtxtverify(String EnterYear, String SearchTextAcesallEngine) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		efilter.sendKeys(pro.getProperty("EnterYear"));
		Thread.sleep(3000);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		Thread.sleep(5000);
		// String expectedtext=eregion.getText();
		String actualText = Everifyattr1.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains(pro.getProperty("textbox"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void NonAcesattverify(String EnterInvalidYear, String SearchTextAcesallEngine) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		Thread.sleep(3000);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		Thread.sleep(5000);
		// String expectedtext = pro.getProperty("Region");
		String actualText = Everifyattr.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains(pro.getProperty("Region"))) {
			System.out.println("Both are same");

		} else {
			System.out.println("Both are not same");
		}

	}

	// **********Start Atttibutes**************//
	public void qty(String qtydata) {
		eqty.clear();
		eqty.sendKeys(qtydata);
	}

	public void qtyclear() {
		eqty.clear();

	}

	public void Position() throws InterruptedException {
		eposition.click();
		Thread.sleep(3000);
		epositionselectall.click();
	}

	public void Notes(String notesdata) throws InterruptedException {
		enotes.sendKeys(notesdata);
		Thread.sleep(3000);
	}

	public void verifyattr() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = eqty1.getText();
		System.out.println("Qty is..." + actualText);
		if (actualText.contains(pro.getProperty("qtydata"))) {
			System.out.println("Both are same **Qty** ");
		} else {
			System.out.println("Both are not same");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText1 = eposition1.getText();
		System.out.println("position is..." + actualText1);
		if (actualText1.contains(pro.getProperty("postion"))) {
			System.out.println("Both are same **position** ");
		} else {
			System.out.println("Both are not same");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText2 = enotes1.getText();
		System.out.println("Notes is..." + actualText2);
		if (actualText2.contains(pro.getProperty("notesdata"))) {
			System.out.println("Both are same **Notes** ");
		} else {
			System.out.println("Both are not same");
		}
	}

	

	// **start multipart with description**//
	public void multidesc(String Partdesc1) throws InterruptedException {
		Select epart = new Select(eSelectdesc);
		epart.selectByVisibleText(Partdesc1);
		Thread.sleep(8000);
	}

	public void multipart(String Enterpartpart) throws InterruptedException {
		Select epart = new Select(eSelectPartno);
		epart.selectByVisibleText(Enterpartpart);
		Thread.sleep(8000);
	}

	// **multiple partnumber selected**//
	/*
	 * String partss =""; String partsss ="";
	 */
	public void verifymultidescandpart() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String partss = epa1.getText();
		String partsss = epa2.getText();
		System.out.println("part no # 1..." + partss);
		System.out.println("part no # 2..." + partsss);
		if (partss.contains(partsss)) {
			System.out.println("Both are not same");
		} else {
			System.out.println("Both are same");
		}

	}

	// **end multipart with description**//

	public void VerifyParslinked(String Partnum) {
		String actualText = epartslinked.getText();
		System.out.println("Parts Linked value is.." + actualText);
		if (actualText.contains(Partnum)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

	public void VerifymultipleProduct() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Prod1 = epa3.getText();
		String Prod2 = epa4.getText();
		System.out.println("Product no # 1..." + Prod1);
		System.out.println("Product no # 2..." + Prod2);
		if (Prod1.equals(Prod2)) {
			System.out.println("Both are not same");
		} else {
			System.out.println("Both are different");
		}
	}

	public void Verifymultipledesc() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String desc1 = epa5.getText();
		String desc2 = epa6.getText();
		System.out.println("Product no # 1..." + desc1);
		System.out.println("Product no # 2..." + desc2);
		if (desc1.equals(desc2)) {
			System.out.println("Both are check");
		} else {
			System.out.println("Both are different");
		}
	}

	public void Qtyverify(String EnterInvalidYear, String SearchTextAcesallEngine, String postion) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// String expectedtext=efirst1.getText();
		String actualText = everifyposition.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(pro.getProperty("postion"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}

	public void Qtyverify1(String EnterInvalidYear, String SearchTextAcesallEngine, String qtydata) throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		efilter.sendKeys(pro.getProperty("EnterInvalidYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		Thread.sleep(8000);
		// String expectedtext=efirst1.getText();
		Everifyedit.click();
		Thread.sleep(8000);
		// driver.switchTo().frame(0);
		String actualText = Everifyqty.getAttribute("value");
		System.out.println("Text.." + actualText);
		if (actualText.contains(pro.getProperty("qtydata"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
}