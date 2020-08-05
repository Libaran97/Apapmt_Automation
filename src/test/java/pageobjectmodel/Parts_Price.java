package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.Baseclass;

public class Parts_Price extends Baseclass {
	public Parts_Price() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//*[@id='MainContent_upAttribute']/div[2]/div[1]/div/span/div/input[8]")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//*[@id='Price']/img")
	private WebElement ePricepage;
	
	@FindBy(xpath="//*[@id='drpPriceType']")
	private WebElement ePriceType;
	
	@FindBy(xpath="//*[@id='txtPriceSheet']")
	private WebElement ePricesheet;
	
	@FindBy(xpath="//*[@id='txtPrice']")
	private WebElement ePrice;
	
	@FindBy(xpath="//*[@id='drpPriceUOM']")
	private WebElement ePriceUOM;
	
	@FindBy(xpath="(//*[@id='btnSave'])[2]")
	private WebElement ebtnSave;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr[1]/td[6]")
	private WebElement eVerifyprice;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[10]/div/input[1]")
	private WebElement eEdit;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[10]/div/input[2]")
	private WebElement eDelete;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVry;
	
	
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
			//if(list.get(i).getText().contains("Testpart-1 | Ignition Test | Autoapa")) {
				
				if(list.get(i).getText().contains("Testpart-3 | Ignition Coil Test | Autoapa3")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}

	public void ClickPricepage() throws InterruptedException {
		Thread.sleep(3000);
		ePricepage.click();
		Thread.sleep(3000);
		}
	

	public void Selectpricetype() throws InterruptedException {
	
		
		Select PriceType = new Select(ePriceType);
		PriceType.selectByIndex(3);
		Thread.sleep(2000);
	}



	public void PriceDetails() throws InterruptedException {
	
		
		Select PriceUOM = new Select(ePriceUOM);
		PriceUOM.selectByIndex(4);
		Thread.sleep(2000);
		
		ePricesheet.sendKeys("2");
		Thread.sleep(2000);
		
		ePrice.sendKeys("20");
		Thread.sleep(2000);
	}
	
	public void saveAcceptAlert() throws InterruptedException {
		Thread.sleep(3000);
		ebtnSave.click();
		Thread.sleep(3000);
		
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
	}
	
	public void Verifyprice() throws InterruptedException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", eVerifyprice);
			String Text=eVerifyprice.getText();
			Thread.sleep(3000);
			if (Text.equals("20")) {
				System.out.println("Both are same");
			} 
			else {
				
				System.out.println("Both are Not same");
			}
	}
	
	public void ClickEdit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		
		eEdit.click();
		Thread.sleep(3000);
		}
	public void Editprice() throws InterruptedException {
		ePrice.clear();
		Thread.sleep(3000);
		ePrice.sendKeys("30");
		Thread.sleep(3000);
	}
	
	public void EditVerifyprice() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eVerifyprice);
		String Text=eVerifyprice.getText();
		Thread.sleep(3000);
		if (Text.equals("30")) {
			System.out.println("Both are same");
		} 
		else {
			
			System.out.println("Both are Not same");
			}
		}
	public void ClickDelete() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eEdit);
		
		eDelete.click();
		Thread.sleep(3000);
		}
	public void acceptAlert1() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(5000);
		
	}
	public void acceptAlert2() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
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
