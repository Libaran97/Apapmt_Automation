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



public class DeleteSubProductCatagory extends Baseclass{
	public DeleteSubProductCatagory() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_0_lnkLink3_1']")
	private WebElement emastersubcategory;
	
	@FindBy(xpath="//select[@id='MainContent_drpProductCategory']")
	WebElement eCategoryDDBox;
	
	@FindBy(xpath ="//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	public WebElement esearchbox;
	
	@FindBy(xpath ="//input[@id='MainContent_ImageButton2']")
	public WebElement eDeleteButton;
	
	@FindBy(xpath ="//*[@id='DataTableViewer']/tbody/tr/td")
	public WebElement ePscverify;
	
	
	public void clickonSubproductcategory() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		emastersubcategory.click();
		Thread.sleep(3000);
	}
	public void SelectCategory(String CategoryValue4DBox) throws InterruptedException {
		Select Category = new Select(eCategoryDDBox);
		Category.selectByVisibleText(CategoryValue4DBox);
		Thread.sleep(5000);
	}
	
	public void SelectsearchTextbox(String EnterSsubproductCatagory) throws InterruptedException {
		esearchbox.sendKeys(EnterSsubproductCatagory);
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
		Thread.sleep(3000);
		}
	public void verifytext1(String DeleteProducttxt)
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= ePscverify.getText();
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
