package pageobjectmodel;

import org.openqa.selenium.Alert;
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
	
	
	@FindBy(xpath="//input[@id='MainContent_fuImage']")
	private WebElement imageselect;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtSortBy']")
	private WebElement txtSortBy;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	@FindBy(xpath="//input[@id='MainContent_GV_imgDelete_0']")
	private WebElement imgDelete;
	
	
	
	
	
	/*
	 * 
	 * image add and delete
	 */
	
	public void clickasset() throws InterruptedException {
		clkasset.click();
		Thread.sleep(3000);
	}
	
	
	public void imagesselect() throws Exception {
		driver.switchTo().frame(0);
		imageselect.sendKeys("C:\\Users\\arunkumar\\git\\apapmt_automation\\Store\\Partnotest.jpg");
		txtSortBy.sendKeys("1");
		Thread.sleep(2000);
	}
	
	
	public void savebutton() throws InterruptedException {
		btnSave.click();
		Thread.sleep(3000);
	}
	
	
	public void assetAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Digital asset" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	
	
	public void deleteimg() throws InterruptedException {
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete);
		Thread.sleep(1000);
		imgDelete.click();
		Thread.sleep(1000);
	}
	
	
	public void assetAlertdelete() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Digital asset " + alert.getText());
		alert.accept();
		Thread.sleep(1000);
		/*System.out.println("Digital asset " + alert.getText());
		alert.accept();
		Thread.sleep(3000); */
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
