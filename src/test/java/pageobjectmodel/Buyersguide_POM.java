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

public class Buyersguide_POM extends Baseclass {

	public Buyersguide_POM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;

	@FindBy(xpath = "//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;

	@FindBy(xpath = "(//input[@class='button_search'])[2]")
	private WebElement btnPsearch;

	@FindBy(xpath = "//div[@id='BuyersGuid1']")
	private WebElement BuyersGuid1click;

	@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	private WebElement drpVehicleType;

	@FindBy(xpath = "//select[@id='MainContent_drpMake']")
	private WebElement drpMake;

	@FindBy(xpath = "//select[@id='MainContent_drpModel']")
	private WebElement drpModel;

	@FindBy(xpath = "//input[@id='MainContent_searchbtn']")
	private WebElement searchbtn;

	@FindBy(xpath = "//input[@id='MainContent_GvApplications_chkActivee1_0']")
	private WebElement selectappln;

	@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	private WebElement btnSave;

	@FindBy(xpath = "//tr[@id='tr_0']//input[@id='appartsedit_btn']")
	private WebElement appartsedit_btn;

	@FindBy(xpath = "//textarea[@id='MainContent_GvApplications_txtapppartsnotes_0']")
	private WebElement apppartsnotes;

	@FindBy(xpath = "//tr[@id='tr_0']//input[@name='ctl00$MainContent$checkbox2']")
	private WebElement Delete_checkbox2;

	@FindBy(xpath = "//div[@class='dataTables_scrollHeadInner']//input[@id='apppartdelete']")
	private WebElement apppartdelete;

	@FindBy(xpath = "//input[@id='MainContent_btnUpdate']")
	private WebElement btnUpdate;

	@FindBy(xpath = "(//input[@placeholder='Year Range'])[1]")
	WebElement efilter;

	@FindBy(xpath = "(//input[@placeholder='Engine Details'])[1]")
	WebElement efilter2;
	
	

	@FindBy(xpath = "//*[@role='row']/td[4]")
	WebElement everifynon1ACES;

	@FindBy(xpath = "//table[@id=\"tbl_apppartstable\"]/tbody/tr/td")
	WebElement everifynon1ACESdel;


	public void partslanding() {
		partspageheaderclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void partsearch(String partnoenter) throws InterruptedException {
		txtpartsearch.sendKeys(partnoenter);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Testpart-1 | Ignition Coil Test | Autoapa3")) {
			//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void buyerguideclick() throws InterruptedException {
		BuyersGuid1click.click();
		Thread.sleep(2000);

	}

	public void apppartsvehicldropdown(String vehicletypename0) throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement vehiclesselect = drpVehicleType;
		Select select = new Select(vehiclesselect);
		select.selectByVisibleText(vehicletypename0);
		// select.selectByValue("2");
		Thread.sleep(2000);
	}

	public void apppartsmakedropdown(String makename) throws InterruptedException {
		// driver.switchTo().frame(0);
		WebElement makeselect = drpMake;
		Select select = new Select(makeselect);
		select.selectByVisibleText(makename);
		// select.selectByValue("163");
		Thread.sleep(2000);
	}

	public void apppartsmodeldropdown(String modelname) throws InterruptedException {
		WebElement modelselect = drpModel;
		Select select = new Select(modelselect);
		select.selectByVisibleText(modelname);
		// select.selectByValue("1103");
		Thread.sleep(2000);
	}

	public void apppartsearch() throws InterruptedException {
		searchbtn.click();
		Thread.sleep(5000);
	}

	public void apppartsenginebase() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", selectappln);
		selectappln.click();
		Thread.sleep(4000);
	}

	public void savebtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		btnSave.click();
		Thread.sleep(8000);
	}

	public void updatebtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnUpdate);
		btnUpdate.click();
		Thread.sleep(8000);
	}

	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + "application added " + alert.getText());
		alert.accept();
		Thread.sleep(4000);
	}

	public void acceptAlert1() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + "application deleted" + alert.getText());
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(3000);
	}

	public void editappparts() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", appartsedit_btn);

		appartsedit_btn.click();
		Thread.sleep(2000);

	}
	

	public void apppartsnote(String apppartnotes) {
		apppartsnotes.sendKeys(apppartnotes);

	}

	public void deletebuyerappln() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Delete_checkbox2);
		Delete_checkbox2.click();
		js.executeScript("arguments[0].scrollIntoView();", apppartdelete);
		apppartdelete.click();
		Thread.sleep(3000);

	}

	public void bguideverification() throws InterruptedException {

		// driver.switchTo().frame(0);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter.sendKeys(pro.getProperty("EnterYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String actualText = everifynon1ACES.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains(pro.getProperty("EnterYear"))) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}
	
	public void bguideverificationdel() throws InterruptedException {

		// driver.switchTo().frame(0);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter.sendKeys(pro.getProperty("EnterYear"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		efilter2.sendKeys(pro.getProperty("SearchTextAcesallEngine"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText = everifynon1ACESdel.getText();
		System.out.println("Text.." + actualText);
		if (actualText.contains("No data available in table")) {
			System.out.println("Deleted successfully");
		} else {
			System.out.println("Both are not same");
		}

	}

}
