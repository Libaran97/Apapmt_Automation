package pageobjectmodel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;


public class AddIntchgName_POM extends Baseclass{
	
	public AddIntchgName_POM() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_0']")
	public WebElement eInterchangeName;
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	WebElement eAddintnameBtn;
	
	@FindBy(xpath="//input[@id='MainContent_txtCompetitorName']")
	WebElement eIntnameTBox;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtbrandname']")
	WebElement eBrandAAIAbox;
	
	
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	WebElement esearchbox;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement eInverify;
	
	public void clickonInterchangeName() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangeName.click();
		Thread.sleep(5000);
	}
	
	public void clickAdd() throws InterruptedException {
		eAddintnameBtn.click();
		Thread.sleep(3000);
		
	}
	public void EnterIntName(String InterchangeNameValue) throws InterruptedException {
		eIntnameTBox.sendKeys(InterchangeNameValue);
		Thread.sleep(3000);
	}
	
	
	public void EnterBrandAAIA(String BrandAAIAvalue) throws InterruptedException {
		System.out.println("pass1");
		eBrandAAIAbox.sendKeys(BrandAAIAvalue);
		System.out.println("pass2");
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ACBehavior_completionListElem']/li"));
		System.out.println("total number of BrandAAIA -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("ACC Climate Control")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		
	}
	public void Clicksave() throws InterruptedException {
		
		eSaveButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	
	public void SearchInterchangeName(String InterchangeNameValue) {
		esearchbox.sendKeys(InterchangeNameValue);
	}
   
	public void verifytext1(String InterchangeNameValue){
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String actualText= eInverify.getText();
	System.out.println("Text"+ actualText);
	if(actualText.equals(InterchangeNameValue))
	{
		System.out.println("Both are same");
	}
	else
	{
		System.out.println("Both are not same");
	}
	
}

}


