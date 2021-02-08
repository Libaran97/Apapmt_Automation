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
	
	
	@FindBy(xpath="(//input[@class='button_search'])[2]")
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
	
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[5]/div/child::input[1]")
	private WebElement imgEdit_0;
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[5]/div/child::input[2]")
	private WebElement imgDelete_0;//input[@id='MainContent_gv_imgEdit_0']
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[4]/input")
	private WebElement eDescriptionfilter;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]")
	private WebElement	ePDverify;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td")
	private WebElement eDeleteVryText;
	
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
			if(list.get(i).getText().contains("Testpart-1 | Ignition Coil Test | Autoapa3")) {
			//if(list.get(i).getText().contains("Testpart-1 | description1 | AAA1")) {
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
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
		
	}
	public void Verifydescription(String descnotes) throws InterruptedException{
		try
		{
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			eDescriptionfilter.sendKeys(descnotes);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String actualText= ePDverify.getText();
			System.out.println("Text"+actualText);
			actualText.equals(descnotes);
			System.out.println("Both are same");
			
		}
		catch (Exception e)
		{
			System.out.println("Both are not same");
		}
	}
	
	
	
	
	public void editpartdesc(String editnotes, String notes) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		eDescriptionfilter.sendKeys(notes);
		//sdriver.switchTo().frame(0);
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgEdit_0);
		imgEdit_0.click();
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView();", txtNotes);
		txtNotes.clear();
		Thread.sleep(2000);
		txtNotes.sendKeys(editnotes);
		Thread.sleep(2000);
		
	}
	
	
	public void deletepartdesc(String editdescnotes) throws Exception {
		//driver.switchTo().frame(0);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		eDescriptionfilter.sendKeys(editdescnotes);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", imgDelete_0);
		imgDelete_0.click();
		Thread.sleep(2000);
	}
	
	
	public void VerifyDeletedescription(String descnotes, String DeleteProducttxt) throws InterruptedException{
		Thread.sleep(5000);
		eDescriptionfilter.sendKeys(descnotes);
		Thread.sleep(5000);
		String text = eDeleteVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Partdescription Deleted succesfully");

		} else {
			System.out.println("Partdescription Not Deleted succesfully");
		}

	}
	
}
