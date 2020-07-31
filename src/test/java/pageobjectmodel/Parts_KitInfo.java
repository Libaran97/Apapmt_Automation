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

public class Parts_KitInfo extends Baseclass {
	
	public Parts_KitInfo () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//*[@id='MainContent_upAttribute']/div[2]/div[1]/div/span/div/input[8]")
	private WebElement btnPsearch;
	
	
	@FindBy(xpath="//div[@id='kit_info']")
	private WebElement eKitinfoclick;
	
	@FindBy(xpath="//input[@id='txtCpartNumber']")
	private WebElement eCompPart;
	
	@FindBy(xpath="//*[@id='drpDescCode']")
	private WebElement eDescode;
	
	@FindBy(xpath="//*[@id='TxtMaintenance']")
	private WebElement eMType;
	
	@FindBy(xpath="//*[@id='txtqtykit']")
	private WebElement eQtyinkit;
	
	@FindBy(xpath="//*[@id='drpLanguageCode']")
	private WebElement eLangcode;
	
	@FindBy(xpath="//*[@id='drpQtyuom']")
	private WebElement eQtyUOM;
	
	@FindBy(xpath="//*[@id='txtdescription']")
	private WebElement eDes;
	
	@FindBy(xpath="//*[@id='drpSoldSeperately']")
	private WebElement eSold;
	
	@FindBy(xpath="//*[@id='btnSaveKit']")
	private WebElement ebtnSave;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVry;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[7]/div/input[1]")
	private WebElement eEdit;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[5]")
	private WebElement eVryEdit;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[7]/div/input[2]")
	private WebElement eDelete;
	
	
	
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
			if(list.get(i).getText().contains("Testpart-1 | Ignition Test | Autoapa")) {
				
				//if(list.get(i).getText().contains("Testpart-3 | Ignition Coil Test | Autoapa3")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void Kitinfoclick() throws InterruptedException {
		Thread.sleep(3000);
		eKitinfoclick.click();
		Thread.sleep(3000);
		}
	public void ComponentPart() throws InterruptedException {
		
		//driver.switchTo().frame(0);
		eCompPart.sendKeys("Testpart-3");
		Thread.sleep(3000);
	}
	
	public void FillKitDetails() throws InterruptedException {
		//Select Description code
		Select Descode = new Select(eDescode);
		Descode.selectByIndex(1);
		
		Thread.sleep(3000);
		
		//Enter Maintenance Type
		eMType.sendKeys("A");
		Thread.sleep(2000);
		
		//Enter Quantity in Kit
		eQtyinkit.sendKeys("2");
		Thread.sleep(2000);
		
		//Select Language code
		Select Langcode = new Select(eLangcode);
		Langcode.selectByIndex(1);
		Thread.sleep(2000);
		
		
	}
	public void FillKitDetails2() throws InterruptedException {
		//Select Quantity UOM
				Select QtyUOM = new Select(eQtyUOM);
				QtyUOM.selectByIndex(3);
				Thread.sleep(2000);
				
				//Enter Description
				eDes.sendKeys("Test");
				Thread.sleep(2000);
				
				//Select Sold Separately
				Select Sold = new Select(eSold);
				Sold.selectByIndex(1);
				Thread.sleep(2000);
		
		
	}
	public void saveAcceptAlert() throws InterruptedException {
		ebtnSave.click();
		Thread.sleep(3000);
		
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
	}
	public void saveAcceptAlert2() throws InterruptedException {
		ebtnSave.click();
		Thread.sleep(3000);
		
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
	}
	
	public void Verifykit() throws InterruptedException {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVry);
		String Text=eVry.getText();
		Thread.sleep(3000);
		if (Text.equals("Testpart-3")) {
			System.out.println("Both are same");
		} 
		else {
			
			System.out.println("Both are Not same");
		}
	}
	
	public void ClickEdit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		//driver.switchTo().frame(0);
		eEdit.click();
		Thread.sleep(3000);
		}
	
	public void EditQtyinkit() throws InterruptedException {
		eQtyinkit.clear();
		Thread.sleep(3000);
		eQtyinkit.sendKeys("4");
		Thread.sleep(3000);
	}
	
	public void VryEdit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVryEdit);
		String Text1=eVryEdit.getText();
		Thread.sleep(3000);
		if (Text1.equals("4")) {
			System.out.println("Both are same");
		} 
		else {
			
			System.out.println("Both are Not same");
		}
	}
	
	public void ClickDelete() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eDelete);
		//driver.switchTo().frame(0);
		eDelete.click();
		Thread.sleep(3000);

		}
	public void acceptAlert1() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);
		
	}
	public void acceptAlert2() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);
		
	}
	@SuppressWarnings("deprecation")
	public void VryDelete() throws InterruptedException {
		
		
		Thread.sleep(3000);
		Assert.assertNotNull(eVry);
		
	}
	
}
