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

public class PartsSubstitute extends Baseclass {


	
	public PartsSubstitute() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="(//input[@class='button_search'])[1]")
	private WebElement btnPsearch;
	
	@FindBy(xpath="//div[@id='Substitute']")
	private WebElement esubsclick;
	
	@FindBy(xpath="//input[@id=\"txtSubstituteno\"]")
	private WebElement esubpartno;
	
	@FindBy(xpath="//input[@id=\"txtDescription\"]")
	private WebElement esubdesc;
	@FindBy(xpath="(//*[@id=\"btnSave\"])[2]")
	private WebElement esubsave;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;
	
	@FindBy(xpath = "//input[@placeholder=\"Substitute Part #\"]")
	private WebElement everifysub;
	
	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[2]")
	private WebElement everifygettext;
	
	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td[4]/div/input")
	private WebElement esubdel;
	@FindBy(xpath = "//*[@id=\"DataTableViewer\"]/tbody/tr/td")
	private WebElement edelget;
	
	
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

	public void Substituteclick() throws InterruptedException {
		esubsclick.click();
		Thread.sleep(3000);
		}
	
	public void subdel() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",esubdel);
		esubdel.click();
		Thread.sleep(3000);
	}
	
	public void Substituteclickentry(String partnoenter,String Enterpartpart,String textbox) throws Exception {
		esubpartno.sendKeys(partnoenter);
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(Enterpartpart)) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);		
		esubdesc.sendKeys(textbox);
		Thread.sleep(3000);
	}
	public void save() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].scrollIntoView();",esubsave);
		esubsave.click();
		Thread.sleep(3000);
	}
	public void AcceptAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);*/
	
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(5000);
	}
	
	public void verifysub() throws Exception {
		everifysub.sendKeys(pro.getProperty("Enterpartpart"));
		Thread.sleep(3000);
		String Text=everifygettext.getText();
		System.out.println(Text);
		if(Text.equals(pro.getProperty("Enterpartpart")))
		{
			System.out.println("Both are same");
			
		}else
		{
			System.out.println("Both are not same");
		}
	}
	
	public void verifydel(String DeleteProducttxt2) throws Exception
	{
		everifysub.sendKeys(pro.getProperty("Enterpartpart"));
		Thread.sleep(3000);
		
		String text= edelget.getText();
		System.out.println(text);
		if(text.equals(pro.getProperty("DeleteProducttxt2")))
		{
			System.out.println("Deleted success");
		}
		else
		{
			System.out.println("Deleted not success");
		}
	}
	
}
