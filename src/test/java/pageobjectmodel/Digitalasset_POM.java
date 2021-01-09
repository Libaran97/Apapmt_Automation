package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class Digitalasset_POM extends Baseclass{

	public Digitalasset_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='DigitalAsset']")
	private WebElement clkasset;
	
	
	@FindBy(xpath="//input[@id='fuImage']")
	private WebElement imageselect;
	
	
	@FindBy(xpath="//input[@id='txtSortBy']")
	private WebElement txtSortBy;
	
	
	@FindBy(xpath="//div[@id='btnSave_new']")
	private WebElement btnSave;
	
	@FindBy(xpath="//div[@id='btnEdit_new']")
	private WebElement btnEditSave;
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[10]/div/input")
	private WebElement imgDelete;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eFilter;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVerifyText;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement eVerifytextdelete;
	
	
	
	/*
	 * 
	 * image add and delete
	 */
	
	public void clickasset() throws InterruptedException {
		clkasset.click();
		Thread.sleep(3000);
	}
	
	
	public void imagesselect() throws Exception {
		//driver.switchTo().frame(0);
		imageselect.sendKeys("E:\\apapmt_automation\\Store\\Parttest.jpg");
		//imageselect.sendKeys("./Store/Parttest.jpg");
		//imageselect.sendKeys("C:\\Users\\kavin\\git\\apapmt_automation\\apapmt_automation\\Store\\Parttest.jpg");
		txtSortBy.sendKeys("1");
		Thread.sleep(2000);
	}
	
	
	public void savebutton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		btnSave.click();
		Thread.sleep(3000);
	}
	
	
	public void assetAlert() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	
	
	public void deleteimg() throws InterruptedException {
		//driver.switchTo().frame(0);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete);
		Thread.sleep(1000);
		imgDelete.click();
		Thread.sleep(1000);
	}
	
	
	public void assetAlertdelete() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	public void verifyImageadd (String Imagefilename) throws InterruptedException {
		try
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eFilter);
		eFilter.sendKeys(Imagefilename);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eVerifyText .getText();
		System.out.println("Text"+actualText);
		actualText.equals(Imagefilename);
		System.out.println("Both are same");
		
	}
	catch (Exception e)
	{
		System.out.println("Both are not same");
	}
}
		
	public void verifyDelete (String Imagefilename, String Deleteverifytext) throws InterruptedException {
		try
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eFilter);
		eFilter.sendKeys(Imagefilename);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eVerifytextdelete
				
				
				.getText();
		System.out.println("Text"+actualText);
		actualText.equals(Deleteverifytext);
		System.out.println("Deleted");
		
	}
	catch (Exception e)
	{
		System.out.println("Not deleted");
	}
}
		
}
