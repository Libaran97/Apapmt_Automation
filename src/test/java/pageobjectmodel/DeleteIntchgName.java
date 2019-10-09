package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class DeleteIntchgName extends Baseclass{
	public DeleteIntchgName() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_0']")
	public WebElement eInterchangeName;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	WebElement eIntnameSTbox;
	
	@FindBy(xpath ="//input[@id='MainContent_ImageButton2']")
	WebElement eDeleteButton;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;
	
 
	public void clickonInterchangeName() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangeName.click();
		Thread.sleep(5000);
	}
	public void SearchIntchgNameValue(String InterchangeNameValue) throws InterruptedException {
		eIntnameSTbox.sendKeys(InterchangeNameValue);
		Thread.sleep(3000);
	}
	public void ClickDelete() throws InterruptedException {
		eDeleteButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}
public void verifytext1(String InterchangeNameValue, String DeleteProducttxt) throws InterruptedException{
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	esearchbox.sendKeys(InterchangeNameValue);
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String actualText= ePDverify.getText();
	System.out.println("Text"+actualText);
	if(actualText.equals(DeleteProducttxt))
	{
		System.out.println("Both are same");
	}
	else
	{
		System.out.println("Both are not same");
	}
			
		
	}

}
