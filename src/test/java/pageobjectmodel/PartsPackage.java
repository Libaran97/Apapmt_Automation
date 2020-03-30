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

import junit.framework.Assert;
import utility.Baseclass;

public class PartsPackage extends Baseclass {


	
	public PartsPackage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//div[@id='Package']")
	private WebElement ePackageclick;
	
	@FindBy(xpath="//select[@id='MainContent_drpPackageUom']")
	private WebElement ePackageUom;
	
	@FindBy(xpath="//input[@id='MainContent_txtQtyPackage']")
	private WebElement eUomQty;
	
	@FindBy(xpath="//input[@id='MainContent_txtShippingHeight']")
	private WebElement eHeight;
	
	@FindBy(xpath="//input[@id='MainContent_txtShippingWidth']")
	private WebElement eWidth;
	
	@FindBy(xpath="//input[@id='MainContent_txtShippingLength']")
	private WebElement eLength;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	@FindBy(xpath="//table[@id='MainContent_GVPackageData']/tbody/tr[2]/td[12]")
	private WebElement Vrfy;
	
	@FindBy(xpath="//input[@id='MainContent_GVPackageData_imgEdit_0']")
	private WebElement ebtnEdit;
	
	@FindBy(xpath="//input[@id='MainContent_GVPackageData_imgDelete_0']")
	private WebElement ebtnDelete;
	
	
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
			if(list.get(i).getText().contains("Testpart-3 | Ignition Test | Autoapa")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void Packageclick() throws InterruptedException {
		ePackageclick.click();
		Thread.sleep(3000);
		}
	
	public void SelectPackageUom() throws InterruptedException {
		driver.switchTo().frame(0);
		Select uom = new Select(ePackageUom);
		uom.selectByIndex(1);
		Thread.sleep(2000);	
	}
	
	public void EnterUomQty() throws InterruptedException {
		
		eUomQty.sendKeys(pro.getProperty("UomQty"));
		Thread.sleep(2000);	
	}
	public void EnterHeightWidthLength() throws InterruptedException {
		eHeight.sendKeys(pro.getProperty("Height"));
		Thread.sleep(2000);	
		eWidth.sendKeys(pro.getProperty("Width"));
		Thread.sleep(2000);
		eLength.sendKeys(pro.getProperty("Length"));
		Thread.sleep(2000);
	}
	public void SaveAcceptAlert() throws InterruptedException {
		btnSave.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	@SuppressWarnings("deprecation")
	public void Verify(String Vryuom1) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		Assert.assertEquals(Vryuom1, Text);
		
	}
	
	public void EditUomQty() throws InterruptedException {
		eUomQty.clear();
		Thread.sleep(2000);	
		eUomQty.sendKeys(pro.getProperty("UomQtyEdit"));
		Thread.sleep(2000);	
	}
	public void ClickEditButton() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnEdit);
		ebtnEdit.click();
		Thread.sleep(3000);
	}
	
	public void ClickDeleteButton() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnDelete);
		ebtnDelete.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
		
	@SuppressWarnings("deprecation")
	public void DeleteVerify() throws InterruptedException {
		
		Thread.sleep(3000);
		Assert.assertNotNull(Vrfy);
	}
	
	
}
