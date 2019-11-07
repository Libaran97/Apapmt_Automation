package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class Extendedinfo_POM extends Baseclass {

	
	
	public Extendedinfo_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='ExtendedInfo']")
	private WebElement clkextended;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpcodedesc']")
	private WebElement drpcodedesc;
	
	
	@FindBy(xpath="//select[@id='MainContent_Drplanguage']")
	private WebElement Drplanguage;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	@FindBy(xpath="//input[@id='MainContent_GVextended_imgDelete_0']")
	private WebElement imgDelete;
	
	
	@FindBy(xpath="//input[@id='MainContent_drpEXPIDATAtxt']")
	private WebElement drpEXPIDATAtxt;
	
	
	@FindBy(xpath="//table[@id='MainContent_GVextended']//preceding-sibling::td[2]")
	private WebElement Vextended;
	
	//table[@id='MainContent_GVextended']//preceding-sibling::td[2]
	
	
	/*
	 * 
	 * extendedinfo add and delete
	 */
	
	public void extendframe() throws InterruptedException {
		clkextended.click();
		Thread.sleep(2000);
	}
	
	
	
	public void selectextenddrop() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement codedesc = drpcodedesc ;
		Select select = new Select(codedesc);
		select.selectByValue("CGR");
		Thread.sleep(2000);
	}
	
	
	public void entertextextend() throws InterruptedException {
		drpEXPIDATAtxt.sendKeys(pro.getProperty("EXPIDATA"));
		Thread.sleep(1000);
	}
	
	
	
	public void selectlanguage() throws InterruptedException {
		//driver.switchTo().frame(0);
		WebElement language = Drplanguage ;
		Select select = new Select(language);
		select.selectByValue("EN");
		Thread.sleep(2000);
	}
	
	
	
	public void btsave1() throws InterruptedException {
		btnSave.click();
		Thread.sleep(1000);
	}
	
	
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Extended Info " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	
	
	public void deleteinfo() throws InterruptedException {
		driver.switchTo().frame(0);
		imgDelete.click();
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
