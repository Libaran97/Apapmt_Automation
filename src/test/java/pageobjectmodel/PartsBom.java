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

public class PartsBom extends Baseclass {


	
	public PartsBom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;	
	
	@FindBy(xpath="(//input[@class='button_search'])[1]")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//div[@id='BOM']")
	private WebElement ebomclick;
	
	@FindBy(xpath="//input[@id='txtBomPartno']")
	private WebElement ebompart;
	
	@FindBy(xpath="//input[@id=\"txtqty\"]")
	private WebElement ebomqty;
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[8]/div/input[2]")
	private WebElement ebomdel;
	
	@FindBy(xpath="(//input[@id=\"btnSave\"])[2]")
	private WebElement btnSave;
	@FindBy(xpath="(//button[@type=\"button\"])[2]")
	private WebElement btnSavedel;
	
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;
	
	@FindBy(xpath = "//input[@placeholder='BOM-Part']")
	private WebElement searchbompart;
	@FindBy(xpath = "//input[@placeholder='Qty']")
	private WebElement searchbomqtytedit;
	
	
	@FindBy(xpath = "//table[@id=\"DataTableViewer\"]/tbody/tr/td[8]/div/input[1]")
	private WebElement eBOMEditbt;
	
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement Vrfy;
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[3]")
	private WebElement Vrfy1;	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td")
	private WebElement eVrfydel;
	
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

	public void bomclick() throws InterruptedException {
		ebomclick.click();
		Thread.sleep(3000);
		}
	public void BOMEditbt() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",eBOMEditbt);
		eBOMEditbt.click();
		Thread.sleep(3000);
		}
	
	
	public void bompartandqty(String partnoenter,String bompart) throws Exception
	{
		ebompart.sendKeys(partnoenter);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(bompart)) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		/*ebompart.sendKeys(pro.getProperty("bompart"));
		Thread.sleep(3000);*/
		ebomqty.sendKeys(pro.getProperty("qtydata"));
		Thread.sleep(3000);
	}
	public void bompartandqtyedit() throws Exception{
		ebomqty.clear();
		Thread.sleep(2000);
		ebomqty.sendKeys(pro.getProperty("UomQtyEdit"));
		Thread.sleep(3000);
	}
	public void bomdelbt() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",ebomdel);
		ebomdel.click();
		Thread.sleep(3000);
		
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
	public void SaveAcceptAlertdel() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",btnSavedel);
		btnSavedel.click();
		Thread.sleep(3000);
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
		js.executeScript("arguments[0].scrollIntoView();",btnSavedel);
		btnSavedel.click();
		Thread.sleep(3000);
	
	}
	
	@SuppressWarnings("deprecation")
	public void Verify() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchbompart);
		searchbompart.sendKeys(pro.getProperty("bompart"));
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy);
		String Text=Vrfy.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("bompart")))
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
		js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
		searchbomqtytedit.sendKeys(pro.getProperty("UomQtyEdit"));
		
		js.executeScript("arguments[0].scrollIntoView();", Vrfy1);
		String Text=Vrfy1.getText();
		
		System.out.println(Text);
		
		if (Text.contains(pro.getProperty("UomQtyEdit")))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	
		
	}
	
	
	public void ClickEditButton() throws InterruptedException {
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ebtnEdit);
		ebtnEdit.click();
		Thread.sleep(3000);
	}
	
			
	@SuppressWarnings("deprecation")
	public void DeleteVerifybom() throws InterruptedException {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", searchbomqtytedit);
			searchbomqtytedit.sendKeys(pro.getProperty("UomQtyEdit"));
			
			js.executeScript("arguments[0].scrollIntoView();", eVrfydel);
			String Text=eVrfydel.getText();
			
			System.out.println(Text);
			
			if (Text.contains(pro.getProperty("DeleteProducttxt")))
			{
				System.out.println("bom deleted success");
			}
			if (Text.contains(pro.getProperty("DeleteProducttxt2")))
					{
						System.out.println("bom deleted successs");
					}
			else
			{
				System.out.println("Both are not same");
			}
		} catch (Exception e) {
			System.out.println("bom deleted success");
		}
	
	}
	
	
}
