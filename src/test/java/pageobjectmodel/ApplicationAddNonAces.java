package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;


public class ApplicationAddNonAces  extends Baseclass{
	public ApplicationAddNonAces() {
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;
	
	@FindBy(xpath ="//button[@id='MainContent_btnAdd']")
	public WebElement eAddApplication;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleTypeAdd']")
	public WebElement eSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMakeAdd']")
	public WebElement eSelectMake;
	
	@FindBy(xpath ="//select[@id='MainContent_drpModelAdd']")
	public WebElement eSelectModel;
	
	@FindBy(xpath ="//input[@id='MainContent_txtYear']")
	public WebElement eYear;
	
	@FindBy(xpath ="//input[@id='MainContent_rblist_1']")
	public WebElement eNonAces;
	
	@FindBy(id ="MainContent_txtcylinders")
	public WebElement eCylinder;
	
	@FindBy(id ="MainContent_txtcc")
	public WebElement eCc;
	
	@FindBy(id ="MainContent_txtliter")
	public WebElement eLiter;
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication2;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleType']")
	public WebElement eVSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMake1']")
	public WebElement eVSelectMake;
	
	@FindBy(xpath ="//select[@id='drpModel1']")
	public WebElement eVSelectModel;
	
	@FindBy(xpath ="//button[@id='MainContent_imgbtnsearchnew']")
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//select[@id='MainContent_ddlFilter']")
	public WebElement eSelectFilter;
	
	@FindBy(xpath ="//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox;
	
	@FindBy(xpath ="//input[@id='MainContent_btnFilterSearch']")
	public WebElement eSearchButton2;
	
	@FindBy(xpath ="//span[@id='MainContent_GVData_lblEngineBase_0']")
	public WebElement eAppverify;
	
	public void ClickApplication() {
		eApplication.click();
	}

	public void ClickAddApplication() throws InterruptedException {
		eAddApplication.click();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		
		}
	public void ApplicationYear(String EnterYear) throws InterruptedException {
		eYear.sendKeys(EnterYear);
		Thread.sleep(3000);
		}
	public void checkNonAces() throws InterruptedException {
		eNonAces.click();
		Thread.sleep(3000);
	}
	public void EngineDetails(String Cylindervalue, String Ccvalue,String litervalue ) throws InterruptedException {
		eCylinder.sendKeys(Cylindervalue);
		
		eCc.sendKeys(Ccvalue);
		eLiter.sendKeys(litervalue);
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
		}
	public void ClickApplication2() throws InterruptedException {
		eApplication2.click();
		Thread.sleep(3000);
	}
	
   public void ChooseVehiclevry(String vehicletypename) throws InterruptedException {
		
		Select Vvehicle = new Select(eVSelectVehicle);
		Vvehicle.selectByVisibleText(vehicletypename);
		Thread.sleep(5000);
	
		}

	public void ChooseMakevry(String makename ) throws InterruptedException {
	 
		Select Vmake = new Select(eVSelectMake);
		Vmake.selectByVisibleText(makename);
		Thread.sleep(5000);
		
		}
 
	public void ChooseModelvry(String modelname ) throws InterruptedException {
		
		Select Vmodel = new Select(eVSelectModel);
		Vmodel.selectByVisibleText(modelname);
		Thread.sleep(3000);
		
		}
	public void Clicksearch() throws InterruptedException {
		eSearchButton.click();
		Thread.sleep(3000);
		}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(3000);
	
		}
	public void SelectsearchTextbox(String SearchText1) throws InterruptedException {
		eSelectsearchbox.sendKeys(SearchText1);
		Thread.sleep(3000);
		
	}
	public void Clicksearch2() throws InterruptedException {
		eSearchButton2.click();
		Thread.sleep(3000);
		}
	public void verifytext1(String SearchText1)
	{
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualText= eAppverify.getText();
		System.out.println("Text"+actualText);
		if(actualText.equals(SearchText1))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
	}
}
