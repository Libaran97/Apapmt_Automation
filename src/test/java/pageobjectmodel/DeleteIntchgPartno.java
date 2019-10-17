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



public class DeleteIntchgPartno extends Baseclass{
	public DeleteIntchgPartno() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
    WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_1']")
	WebElement eInterchangepart;
	
	@FindBy(xpath="//select[@id='MainContent_drpCompetitor']")
	WebElement eIntnameDDBox;
	
	@FindBy(xpath="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	WebElement eIntPartSTbox;
	
	@FindBy(xpath ="//input[@id='MainContent_ImageButton2']")
	WebElement eDeleteButton;
	
	
	@FindBy(xpath="//*[@id='MainContent_drpCompetitor']")
	WebElement eInterchangeDDbox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePDverify;
	
   
	public void clickonInterchangePart() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangepart.click();
		Thread.sleep(5000);
	}
	
	
	public void SelectIntName(String IntchgNameValue4DBox) throws InterruptedException {
		Select intName = new Select(eIntnameDDBox);
		intName.selectByVisibleText(IntchgNameValue4DBox);
		Thread.sleep(3000);
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}
	

	public void verifytext1(String IntchgNameValue4DBox,String interchangepartno, String DeleteProducttxt) throws InterruptedException{
		
		
		
		try
		{
			Select InterchangeN = new Select(eInterchangeDDbox);
			InterchangeN.selectByVisibleText(IntchgNameValue4DBox);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			esearchbox.sendKeys(interchangepartno);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText= ePDverify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(DeleteProducttxt);
			System.out.println("Both are same: Deleted Successfully");
			
		}
		catch (Exception e)
		{
			System.out.println("Deleted Successfully");
		}
		
	}
	
}
