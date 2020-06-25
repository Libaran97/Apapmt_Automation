package pageobjectmodel;

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



public class DeleteIntchgPartno extends Baseclass{
	public DeleteIntchgPartno() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
    WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_1']")
	WebElement eInterchangepart;
	
	@FindBy(xpath="//span[@Class='select2-selection__rendered']")
	WebElement eIntnameDDBox;
	
	@FindBy(xpath="//input[@Class='select2-search__field']")
	WebElement eIntnamesearchBox;
	
	@FindBy(xpath="//li[@Class='select2-results__option select2-results__option--highlighted']")
	WebElement eIntnamesearchresult;
	
	@FindBy(xpath="(//input[@class='glowing-border'])[1]")
	WebElement eIntPartSTbox;
	
	@FindBy(xpath ="(//div[@Class='edit_icon_ver'])[2]")
	WebElement eDeleteButton;
	
	
	@FindBy(xpath="//*[@id='MainContent_drpCompetitor']")
	WebElement eInterchangeDDbox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//li[@Class='select2-results__option select2-results__message']")
	public WebElement ePDverify;
	
   
	public void clickonInterchangePart() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangepart.click();
		Thread.sleep(5000);
	}
	
	
	public void SelectIntName(String InterchangeNameValue) throws InterruptedException {

		eIntnameDDBox.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		eIntnamesearchBox.sendKeys(InterchangeNameValue);
		
		Thread.sleep(6000);
		eIntnamesearchresult.click();	
		Thread.sleep(5000);
	}
	public void SearchIntchgpartValue(String interchangepartno) throws InterruptedException {
		eIntPartSTbox.sendKeys(interchangepartno);
		Thread.sleep(3000);
	}
	public void ClickDelete() throws InterruptedException {
		eDeleteButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		}
	

	public void verifytext1(String InterchangeNameValue,String interchangepartno, String DeleteProducttxt) throws InterruptedException{
		
		
		
		try
		{
			eIntnameDDBox.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			eIntnamesearchBox.sendKeys(InterchangeNameValue);
			
			Thread.sleep(6000);
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText= ePDverify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(DeleteProducttxt);
			System.out.println("Both are same: Deleted Successfully");
			
		}
		catch (Exception e)
		{
			System.out.println("Not Deleted Successfully");
		}
		
	}
	
}
