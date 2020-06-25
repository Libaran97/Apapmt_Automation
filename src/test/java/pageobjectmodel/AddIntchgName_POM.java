package pageobjectmodel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//*[@id=\"btnadd_new\"]")
	WebElement eAddintnameBtn;
	
	@FindBy(xpath="//*[@id=\"txt_CompetitorName\"]")
	WebElement eIntnameTBox;
	
	
	
	@FindBy(xpath="//*[@id=\"txt_brandname\"]")
	WebElement eBrandAAIAbox;
	
	
	
	@FindBy(xpath ="//*[@id=\"save_btn_new_add\"]")
	public WebElement eSaveButton;
	
	@FindBy(xpath ="//*[@id=\"save_btn_new_edit\"]")
	public WebElement eEditSaveButton;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	WebElement esearchbox;
	
	@FindBy(xpath="//div[@Class='edit_icon_ver'][1]")
	public WebElement eEditint;
	@FindBy(xpath="//span[@Class='select2-selection__rendered']")
	public WebElement eEditcode;
	
	@FindBy(xpath="//*[@id=\"select2-drpInterchangeTypeCode-results\"]")
	public WebElement eEditcodedbox;
	
	
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement eInverify;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr[1]/td[4]")
	public WebElement eInverifycode;
	
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
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li[1]"));
		System.out.println("total number of BrandAAIA -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("AAA Associates")) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		
	}
	public void ClickEditInt(String InterchangeNameValue) throws InterruptedException {
		eEditint.click();
		Thread.sleep(3000);
		eIntnameTBox.clear();
		eIntnameTBox.sendKeys(InterchangeNameValue);
		Thread.sleep(3000);
		
	}
	
	public void Editcode() throws InterruptedException {
		
		eEditcode.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='select2-drpInterchangeTypeCode-results']"));
		System.out.println("total number of code -->" + list.size());
		Thread.sleep(3000);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("OE")) {
				list.get(i).click();
				break;
			}
		}
	}
	
	public void Clicksave() throws InterruptedException {
		Thread.sleep(3000);
		eSaveButton.click();
		Thread.sleep(3000);
		}
	
	public void ClickEditsave() throws InterruptedException {
		Thread.sleep(3000);
		eEditSaveButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	
	public void acceptEditAlert() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	
	public void SearchInterchangeName(String InterchangeNameValue) throws InterruptedException {
		esearchbox.sendKeys(InterchangeNameValue);
		Thread.sleep(3000);
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
	public void verifyIntcodetext(){
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eInverifycode.getText();
		System.out.println("Text"+ actualText);
		if(actualText.equals("S"))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}

}


