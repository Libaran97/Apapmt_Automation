package pageobjectmodel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utility.Baseclass;

public class AcesInvalid extends Baseclass {


	
	public AcesInvalid() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;
	
	
	@FindBy(xpath="//div[@id='BuyersGuid1']")
	private WebElement BuyersGuid1click;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpVehicleType']")
	private WebElement drpVehicleType;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpMake']")
	private WebElement drpMake;
	
	
	
	@FindBy(xpath="//select[@id='MainContent_drpModel']")
	private WebElement drpModel;
	
	
	@FindBy(xpath="//input[@id='MainContent_searchbtn']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_1']")
	private WebElement selectappln;
	
	@FindBy(xpath="//input[@id='MainContent_btnacesattibues']")
	private WebElement showAttribute;
	
	@FindBy(xpath="//input[@id='MainContent_dlDisplayColumnList_chkList_1_0_1']")
	private WebElement checkBase;
	
	@FindBy(xpath="//input[@id='MainContent_dlDisplayColumnList_chkList_19_0_19']")
	private WebElement BodyNo2;
	
	@FindBy(xpath="//input[@id='MainContent_imgSave']")
	private WebElement btnSave;
	
	@FindBy(xpath="//tr[@id='tr_2']/td[7]/a")
	private WebElement validate;
	
	@FindBy(xpath="//tr[@id='tr_2']/td[7]/label")
	private WebElement validateResult;
	
	//reports AcesInvalid
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_5']")
	private WebElement eReports;
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_5_rptLevel3_0_lnkLink3_4']")
	private WebElement eAcesInvalid;
	
	@FindBy(xpath="//select[@id='MainContent_drpVersionDate']")
	private WebElement eVersion;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSearch']")
	private WebElement eSearch;
	
	@FindBy(xpath="//a[@id='MainContent_GVData1_lnkAcesDataForInvalids_0']")
	private WebElement eGetAcesValue;
	
	@FindBy(xpath="//span[@id='MainContent_GVData1_lblAcesDataForInvalids_0']")
	private WebElement eAcesValue;
	
	@FindBy(xpath="//input[@id='MainContent_GVData1_imgEdit_0']")
	private WebElement eEdit;
	
	@FindBy(xpath="//input[@id='MainContent_dlDisplayColumnList_chkList_19_1_19']")
	private WebElement BodyNo4;
	
	@FindBy(xpath="//input[@id='MainContent_imgupdate']")
	private WebElement eUpdate;
	
	
	
	
	public void partslanding() {
		partspageheaderclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void partsearch(String partnoenter) throws InterruptedException {
		txtpartsearch.sendKeys(partnoenter);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Testpart-3 | Ignition Test | Autoapa")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}
	


	public void buyerguideclick() throws InterruptedException {
	BuyersGuid1click.click();
	Thread.sleep(3000);
	}



	public void apppartsvehicldropdown() throws InterruptedException {
	driver.switchTo().frame(0);
	WebElement vehiclesselect = drpVehicleType ;
	Select select = new Select(vehiclesselect);
	select.selectByVisibleText(pro.getProperty("vehicletypename"));
	//select.selectByValue("2");
	Thread.sleep(2000);
	}
	
	public void apppartsvehicldropdown1() throws InterruptedException {
		//driver.switchTo().frame(0);
		WebElement vehiclesselect = drpVehicleType ;
		Select select = new Select(vehiclesselect);
		select.selectByVisibleText(pro.getProperty("vehicletypename"));
		//select.selectByValue("2");
		Thread.sleep(2000);
		}



	public void apppartsmakedropdown() throws InterruptedException {
	//driver.switchTo().frame(0);
	WebElement makeselect = drpMake ;
	Select select = new Select(makeselect);
	select.selectByVisibleText(pro.getProperty("makename"));
	//select.selectByValue("163");
	Thread.sleep(2000);

	}





	public void apppartsmodeldropdown() throws InterruptedException {
	WebElement modelselect = drpModel ;
	Select select = new Select(modelselect);
	select.selectByVisibleText(pro.getProperty("modelname"));
	//select.selectByValue("1103");
	Thread.sleep(2000);

	}





	public void apppartsearch() throws InterruptedException {
	searchbtn.click();
	Thread.sleep(2000);

	}


	public void apppartsenginebase() throws InterruptedException {
	selectappln.click();
	Thread.sleep(3000);

	}


	public void SelectAttributes() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", showAttribute);
		showAttribute.click();
		Thread.sleep(3000);
		checkBase.click();
		Thread.sleep(3000);
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("arguments[0].scrollIntoView();", BodyNo2);
		BodyNo2.click();
		Thread.sleep(3000);

	}


	public void savebtn() throws InterruptedException {
		
	btnSave.click();
	Thread.sleep(8000);

	}


	public void acceptAlert() throws InterruptedException{
	Alert alert = driver.switchTo().alert();
	//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
	System.out.println("Parts Related " + "application added " + alert.getText());
	alert.accept();
	Thread.sleep(3000);

	}


	@SuppressWarnings("deprecation")
	public void validate() throws InterruptedException {
	
	validate.click();
	Thread.sleep(8000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(3000);

	String Text = validateResult.getText();
	System.out.println(Text);
	
	Assert.assertEquals("InValid", Text);
	
	}
	
	public void Reports() throws InterruptedException {
		eReports.click();
		Thread.sleep(3000);
		eAcesInvalid.click();
		Thread.sleep(3000);
	}
	
	public void Versiondd() throws InterruptedException {
		Select version= new Select(eVersion);
		version.selectByVisibleText("All");
		Thread.sleep(2000);
	}
	
	public void Invalidappsearch() throws InterruptedException {
		eSearch.click();
		Thread.sleep(2000);

		}
	
	public void AcesValue() throws InterruptedException {
		eGetAcesValue.click();
		Thread.sleep(2000);
		
		String Acesdata = eAcesValue.getText();
		System.out.println("AcesValue is "+Acesdata);
		
		if (Acesdata.equals("Year : 2002 - { [ BodyNumDoors : 4 ] }")) {
			System.out.println("Both are same "+ Acesdata);
		}
		else {
			System.out.println("Both are not same "+ Acesdata);
		}
		}
	public void Edit() throws InterruptedException {
		eEdit.click();
		Thread.sleep(3000);
		
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
        
        while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
        
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		showAttribute.click();
		Thread.sleep(3000);
		BodyNo4.click();
		Thread.sleep(3000);
		eUpdate.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
        

		}
		// Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
        }
        
	}
	
	
	@SuppressWarnings("deprecation")
	public void validate2() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		validate.click();
	Thread.sleep(5000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(3000);

	String Text = validateResult.getText();
	System.out.println(Text);
	
	Assert.assertEquals("Valid", Text);
	
	}

}
