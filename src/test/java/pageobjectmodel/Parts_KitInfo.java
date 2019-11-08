package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;
	
	
	@FindBy(xpath="//div[@id='kit_info']")
	private WebElement eKitinfoclick;
	
	@FindBy(xpath="//input[@id='MainContent_txtCpartNumber']")
	private WebElement eCompPart;
	
	@FindBy(xpath="//select[@id='MainContent_drpDescCode']")
	private WebElement eDescode;
	
	@FindBy(xpath="//input[@id='MainContent_TxtMaintenance']")
	private WebElement eMType;
	
	@FindBy(xpath="//input[@id='MainContent_txtqtykit']")
	private WebElement eQtyinkit;
	
	@FindBy(xpath="//select[@id='MainContent_drpLanguageCode']")
	private WebElement eLangcode;
	
	@FindBy(xpath="//select[@id='MainContent_drpQtyuom']")
	private WebElement eQtyUOM;
	
	@FindBy(xpath="//input[@id='MainContent_txtdescription']")
	private WebElement eDes;
	
	@FindBy(xpath="//select[@id='MainContent_drpSoldSeperately']")
	private WebElement eSold;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement ebtnSave;
	
	@FindBy(xpath="//table[@id='MainContent_GVKitinfo']/tbody/tr[2]/td[1]")
	private WebElement eVry;
	
	@FindBy(xpath="//input[@id='MainContent_GVKitinfo_imgEdit_0']")
	private WebElement eEdit;
	
	@FindBy(xpath="//table[@id='MainContent_GVKitinfo']/tbody/tr[2]/td[5]")
	private WebElement eVryEdit;
	
	@FindBy(xpath="//input[@id='MainContent_GVKitinfo_imgDelete_0']")
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
			if(list.get(i).getText().contains("Testpart-3 | Ignition Test | Autoapa")) {
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
		
		driver.switchTo().frame(0);
		eCompPart.sendKeys("Testpart-3 | Ignition Test");
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
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	public void Verifykit() throws InterruptedException {
	
		String Text=eVry.getText();
		Thread.sleep(3000);
		if (Text.equals("Testpart-3 | Ignition Test")) {
			System.out.println("Both are same");
		} 
		else {
			
			System.out.println("Both are Not same");
		}
	}
	
	public void ClickEdit() throws InterruptedException {
		driver.switchTo().frame(0);
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
		driver.switchTo().frame(0);
		eDelete.click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		}
	@SuppressWarnings("deprecation")
	public void VryDelete() throws InterruptedException {
		
		
		Thread.sleep(3000);
		Assert.assertNotNull(eVry);
		
	}
	
}
