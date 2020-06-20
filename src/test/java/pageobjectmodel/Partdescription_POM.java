package pageobjectmodel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import utility.Baseclass;



public class Partdescription_POM extends Baseclass {

	
	public Partdescription_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//*[@id=\"MainContent_upAttribute\"]/div[2]/div[1]/div/span/div/input[8]")
	private WebElement btnPsearch;
	
	//div[@id='Description']
	@FindBy(xpath="//div[@id='Description']")
	private WebElement partdescclick;
	
	
	
	@FindBy(xpath="//select[@id='MainContent_drpSProductLine']")
	private WebElement drpNotesType;
	
	
	
	@FindBy(xpath="//select[@id='drpNotesType']")
	private WebElement drpNotesType1;
	
	
	@FindBy(xpath="//input[@id='txtNotes']")
	private WebElement txtNotes;
	
	
	@FindBy(xpath="//td[@class='pad_top_15']")
	private WebElement clk;
	
	@FindBy(xpath="//input[@id='btnCancel']/following-sibling::input")
	private WebElement btnSave;
	
	
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/child::input[1]")
	private WebElement imgEdit_0;
	
	
	@FindBy(xpath="//*[@id=\"DataTableViewer\"]/tbody/tr/td[5]/div/child::input[2]")
	private WebElement imgDelete_0;//input[@id='MainContent_gv_imgEdit_0']
	
	
	
	
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
			if(list.get(i).getText().contains("Testpart-1 | Ignition Test | Autoapa")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}
	
	
	public void descriptionclick() throws InterruptedException {
		Thread.sleep(3000);
		partdescclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	}
	/*
	public void descdrop1() throws InterruptedException {
		
		WebElement descnotes = drpNotesType;
		Select select = new Select(descnotes);
		select.selectByValue("1");
		Thread.sleep(2000);
	}*/
	
	
	public void descriptiondrpdownnotes() throws InterruptedException {
		//driver.switchTo().frame(0);
		WebElement descnote = drpNotesType1;
		Select select = new Select(descnote);
		select.selectByVisibleText(pro.getProperty("notestype"));
		Thread.sleep(2000);
	}
	
	
	public void descriptionadd(String notes) throws InterruptedException {
		txtNotes.sendKeys(notes);
		Thread.sleep(3000);
		
	}
	
	
	public void savebtn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.click();
		Thread.sleep(3000);
	}
	
	
	
	
	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + "Description Notes" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	
	public void acceptAlertdelete() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + "Description Notes" + alert.getText());
		alert.accept();
		Thread.sleep(1000);
				
	}
	
	
	public void editpartdesc(String editnotes) throws Exception {
		//sdriver.switchTo().frame(0);
		WebElement elementfilter1 = imgEdit_0;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);
		imgEdit_0.click();
		Thread.sleep(2000);
		txtNotes.sendKeys(editnotes);
		
	}
	
	
	public void deletepartdesc() throws Exception {
		//driver.switchTo().frame(0);
		WebElement elementfilter1 = imgDelete_0;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", elementfilter1);
		imgDelete_0.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
}
