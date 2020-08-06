package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utility.Baseclass;

public class Productattribute_POM extends Baseclass{

	
	public Productattribute_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='Attribute']")
	private WebElement attrlanding;
	

	@FindBy(xpath="//input[@id='chkSelectAll']")
	private WebElement chklstattr;
	
	
	@FindBy(xpath="//input[@id='btnSaveData']")
	private WebElement btnSave;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement eAcceptalert;
	
	@FindBy(xpath = "//table[@id=\"Tbl_Attribute\"]/tbody/tr/td[3] //input[@type='text']")
	private WebElement attrvalue;
	
	@FindBy(xpath = "//*[@id='img_delete']/img")
	private WebElement deleattru;
	
	
	
	/*
	 *partsize check and uncheck 
	 */
	
	public void partattrlanding() throws InterruptedException {
		attrlanding.click();
		Thread.sleep(3000);
	}
	
	
	public void attrbut() throws InterruptedException {			
		driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();		
		Thread.sleep(3000);
		attrvalue.sendKeys(pro.getProperty("newpartnos"));
		Thread.sleep(3000);
		
	}
	public void attrbutedit() throws InterruptedException {			
		driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();		
		Thread.sleep(3000);
		attrvalue.sendKeys(pro.getProperty("newpartno"));
		Thread.sleep(3000);
		
	}
	public void saveattr() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnSave);
		btnSave.click();		
		Thread.sleep(3000);
	}
	
	
	public void acceptalert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Size" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	public void acceptAlert1() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eAcceptalert);
		eAcceptalert.click();
		Thread.sleep(5000);
	}
	
	
	public void delattr() throws Exception {
		
		deleattru.click();
		attrvalue.sendKeys(pro.getProperty("newpartnos"));
		Thread.sleep(3000);
			
	}
	
	
	
	public void verifyattr() {

		if (chklstattr.isSelected()) {
			String Valus = attrvalue.getAttribute("value");
			System.out.println("Part attr are checked verified " + Valus);	

		} else {
			System.out.println("Attr is not verified");
		}

	}
	public void verifyattr1() throws Throwable {
		
		chklstattr.click();
		Thread.sleep(3000);
		
		if (chklstattr.isSelected()) {			
			System.out.println("Attr is not wrong");

		} else {			
			String Valus = attrvalue.getAttribute("value");
			System.out.println("Part attr are deleted verified " + Valus);	
		}

	}
	
	
	
	/*public void verifysizeremove(String givensize) {
		driver.switchTo().frame(0);
		String size = chklstsize.getText();
		System.out.println("Checked size are ---->" +size);
		if(size==givensize)
		{
			chklstsize.isSelected();
			System.out.println("Size is Unchecked");
		}else
		{
			System.out.println("Size is still checked");
		}
	}*/
	
}
