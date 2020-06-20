package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class EditApplication extends Baseclass{
	public EditApplication() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleType']")
	public WebElement eSelectVehicle;
	
	//@FindBy(xpath ="//select[@id='MainContent_drpMake']")
	@FindBy(xpath ="//select[@id='MainContent_drpMake1']")
	public WebElement eSelectMake;
	
	//@FindBy(xpath ="//select[@id='drpModel']")
	@FindBy(xpath ="//select[@id='drpModel1']")	
	public WebElement eSelectModel;
	
	//@FindBy(xpath ="//input[@id='MainContent_imgbtnsearch']")
	@FindBy(xpath ="//button[@id='MainContent_imgbtnsearchnew']")	
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//select[@id='MainContent_ddlFilter']")
	public WebElement eSelectFilter;
	
	@FindBy(xpath ="//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox;
	
	@FindBy(xpath ="//input[@id='MainContent_btnFilterSearch']")
	public WebElement eSearchButton2;
	
	@FindBy(xpath ="//input[@id='MainContent_GVData_imgEdit_0']")
	public WebElement eEditButton;
	
	@FindBy(id ="MainContent_txtcc")
	public WebElement eCc;
	
	@FindBy(xpath ="//input[@id='MainContent_btnupdate']")
	public WebElement eUpdateButton;
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication2;
	
	@FindBy(xpath ="//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox2;
	
	
	
	@FindBy(xpath ="//span[@id='MainContent_GVData_lblEngineBase_0']")
	public WebElement eAppverify;
	
	public void ClickApplication() throws InterruptedException {
		eApplication.click();
		Thread.sleep(8000);
	}
	

	public void ChooseVehicle(String vehicletypename) throws InterruptedException {
		
		Select vehicle = new Select(eSelectVehicle);
		vehicle.selectByVisibleText(vehicletypename);
		Thread.sleep(5000);
	
		}

	public void ChooseMake(String makename ) throws InterruptedException {
	 
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(makename);
		Thread.sleep(5000);
		
		}
 
	public void ChooseModel(String modelname ) throws InterruptedException {
		
		Select model = new Select(eSelectModel);
		model.selectByVisibleText(modelname);
		Thread.sleep(6000);
		
		}
	public void Clicksearch() throws InterruptedException {
		eSearchButton.click();
		Thread.sleep(5000);
		}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(3000);
	
		}
	public void SelectsearchTextbox1(String SearchText1) throws InterruptedException {
		eSelectsearchbox.sendKeys(SearchText1);
		Thread.sleep(3000);
		
	}
	public void Clicksearch2() throws InterruptedException {
		eSearchButton2.click();
		Thread.sleep(3000);
		}
	public void ClickEdit() throws InterruptedException {
		eEditButton.click();
		Thread.sleep(3000);
		}
	public void EditCc(String EditCcvalue) throws InterruptedException {
		eCc.clear();
		Thread.sleep(3000);
		
		eCc.sendKeys(EditCcvalue);
		
	}
	public void ClickUpdate() throws InterruptedException {
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eUpdateButton);
		eUpdateButton.click();
		Thread.sleep(5000);
		
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}public void ClickApplication2() throws InterruptedException {
			eApplication2.click();
			Thread.sleep(3000);
		}
		
		public void SelectsearchTextbox2(String SearchText2) throws InterruptedException {
			eSelectsearchbox2.sendKeys(SearchText2);
			Thread.sleep(3000);
			
		}
		
		
		public void verifytext1(String SearchText2) throws Exception
		{
			
			
			Thread.sleep(5000);
			String actualText= eAppverify.getText();
			System.out.println("Text"+actualText);
			if(actualText.equals(SearchText2))
			{
				System.out.println("Both are same");
			}
			else
			{
				System.out.println("Both are not same");
			}
			
		}

}
