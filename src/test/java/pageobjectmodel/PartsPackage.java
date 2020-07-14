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
	
	
	@FindBy(xpath="(//input[@class='button_search'])[1]")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//div[@id='Package']")
	private WebElement ePackageclick;
	
	@FindBy(xpath="//select[@id='drpPackageUom']")
	private WebElement ePackageUom;
	
	@FindBy(xpath="//input[@id='txtQtyPackage']")
	private WebElement eUomQty;
	
	@FindBy(xpath="//input[@id=\"txtHeight\"]")
	private WebElement eHeight;
	
	@FindBy(xpath="//input[@id=\"txtWidth\"]")
	private WebElement eWidth;
	
	@FindBy(xpath="//input[@id='txtLength']")
	private WebElement eLength;
	
	@FindBy(xpath="(//input[@id=\"btnSave\"])[2]")
	private WebElement btnSave;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[12]")
	private WebElement Vrfy;
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td")
	private WebElement Vrfy1;
	

	@FindBy(xpath="//input[@placeholder='Package Qty / UOM']")
	private WebElement searchuom;
	
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[1]")
	private WebElement ebtnEdit;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tbody/tr/td[16]/div/input[2]")
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
			if(list.get(i).getText().contains("Testpart-1 | Ignition Coil Test | Autoapa3")) {
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
		//driver.switchTo().frame(0);
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
		Thread.sleep(4000);
	}
	public void SaveAcceptAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",btnSave);
		btnSave.click();
		Thread.sleep(3000);
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
	
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(6000);
	}
	
	@SuppressWarnings("deprecation")
	public void Verify() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		searchuom.sendKeys("2 - CA");
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains("2 - CA"))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	public void Verifyedit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		searchuom.sendKeys("4 - CA");
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains("4 - CA"))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	public void EditUomQty() throws InterruptedException {
		eUomQty.clear();
		Thread.sleep(2000);	
		eUomQty.sendKeys(pro.getProperty("UomQtyEdit"));
		Thread.sleep(2000);	
	}
	public void ClickEditButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnEdit);
		ebtnEdit.click();
		Thread.sleep(3000);
	}
	
	public void ClickDeleteButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnDelete);
		ebtnDelete.click();
		Thread.sleep(3000);
		/*Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/

		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(3000);
	}
		
	@SuppressWarnings("deprecation")
	public void DeleteVerify(String DeleteProducttxt,String DeleteProducttxt2) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchuom);
		searchuom.sendKeys("4 - CA");
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy1);
		String Text=Vrfy1.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("DeleteProducttxt")))
		{
			System.out.println("Package deleted success");
		}
		if (Text.contains(pro.getProperty("DeleteProducttxt2")))
				{
					System.out.println("Package deleted successs");
				}
		else
		{
			System.out.println("Both are not same");
		}
	
	}
	
	
}
