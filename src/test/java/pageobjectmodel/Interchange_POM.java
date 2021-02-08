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



public class Interchange_POM extends Baseclass{

		
		public Interchange_POM() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_3']")
		private WebElement partspageheaderclick;
		
		
		
		@FindBy(xpath="//input[@id='MainContent_txtMelling']")
		private WebElement txtpartsearch;
		
		
		@FindBy(xpath="(//input[@class='button_search'])[2]")
		private WebElement btnPsearch;
		
		
		@FindBy(xpath="//div[@id='interchange']")
		private WebElement interchangeclick;
		
		
		@FindBy(xpath="//select[@id='drpCompetitorName']")
		private WebElement drpCompetitorName;
		
		
		@FindBy(xpath="//input[@id='txtCompetitorPartno1']")
		private WebElement txtCompetitorPartno1;
		
		
		
		@FindBy(xpath="(//input[@id='btnSave'])[2]")
		private WebElement btnSave;
		
		
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[1]")
		private WebElement imgEdit_0;
		
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[2]")
		private WebElement imgDelete_0;
		
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tfoot/tr/th[2]/input")
		private WebElement eIntpartfilter;
		
		@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[2]")
		private WebElement	ePDverify;
		
		
		@FindBy(xpath="//*[@class='dataTables_empty']")
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
		
		
		public void interchangesclick() throws InterruptedException {
			interchangeclick.click();
			Thread.sleep(2000);
		}
		
		
		
		public void interchangedrpdownnotes() throws InterruptedException {
			//driver.switchTo().frame(0);
			WebElement intnotesselect = drpCompetitorName ;
			Select select = new Select(intnotesselect);
			select.selectByVisibleText("Test IntName 1");
			//select.selectByValue("2");
			Thread.sleep(2000);
		}
		
		
		public void Competitorpartno(String Enterpartpart) throws InterruptedException {
			txtCompetitorPartno1.sendKeys(Enterpartpart);
			Thread.sleep(2000);
		}
		
		
		public void savebtn() throws InterruptedException {
			btnSave.click();
			Thread.sleep(2000);
		}
		
		
		
		
		/*
		 * alert accept & fetching text
		 */
		public void acceptAlert() throws InterruptedException{
			WebElement pop=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
			Thread.sleep(5000);                         
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			pop.click();
			Thread.sleep(5000);
		}
		
		
		
		
		public void editinterchange(String partno3) throws InterruptedException {
			//driver.switchTo().frame(0);
			JavascriptExecutor js = (JavascriptExecutor) driver;
     		js.executeScript("arguments[0].scrollIntoView();", imgEdit_0);
			imgEdit_0.click();
			Thread.sleep(2000);
			txtCompetitorPartno1.clear();
			txtCompetitorPartno1.sendKeys(partno3);
			
		}
		
		
		public void deletepartinter() throws InterruptedException {
			//driver.switchTo().frame(0);
			JavascriptExecutor js = (JavascriptExecutor) driver;
     		js.executeScript("arguments[0].scrollIntoView();", imgDelete_0);
			imgDelete_0.click();
			Thread.sleep(2000);
		}
		
		
		public void VerifyInterchange(String Enterpartpart) throws InterruptedException{
			try
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         		JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].scrollIntoView();", eIntpartfilter);
				eIntpartfilter.sendKeys(Enterpartpart);
				Thread.sleep(10000);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				js.executeScript("arguments[0].scrollIntoView();", ePDverify);
				String actualText= ePDverify.getText();
				System.out.println("Text"+actualText);
				actualText.equals(Enterpartpart);
				System.out.println("Both are same");
				
			}
			catch (Exception e)
			{
				System.out.println("Both are not same");
			}
		}
		
	
		public void VerifyDeleteIntchange(String partno3, String DeleteProducttxt) throws InterruptedException{
			Thread.sleep(5000);
			eIntpartfilter.sendKeys(partno3);
			Thread.sleep(5000);
			String text = eDeleteVryText.getText();
			if (text.equals(DeleteProducttxt)) {
				System.out.println("Partdescription Deleted succesfully");

			} else {
				System.out.println("Partdescription Not Deleted succesfully");
			}

		}
		public void acceptDeleteAlert() throws InterruptedException{
			WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
			Thread.sleep(5000);                         

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", pop);
			pop.click();
			Thread.sleep(5000);
			
			
		}
		
		public void acceptDeleteAlert2() throws InterruptedException{
			WebElement pop1=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]"));
			Thread.sleep(5000);      
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("arguments[0].scrollIntoView();", pop1);
			pop1.click();
			Thread.sleep(5000);
		}
		
		
}

