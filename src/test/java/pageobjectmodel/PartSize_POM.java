package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class PartSize_POM extends Baseclass{

	
	public PartSize_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='Size']")
	private WebElement Sizelanding;
	
	//input[@id='MainContent_chklstsizes_0']//following::label
	//input[@type='checkbox']//following::label
	@FindBy(xpath="//input[@id='MainContent_chklstsizes_0']/following::label[2]")
	private WebElement chklstsize;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	
	public void partsizelanding() throws InterruptedException {
		Sizelanding.click();
		Thread.sleep(3000);
	}
	
	
	public void addsize() {
		driver.switchTo().frame(0);
		List<WebElement> sizes = driver.findElements(By.xpath("//input[@id='MainContent_chklstsizes_0']/following::label"));
		//String sizes =
		System.out.println("Available size are ---->" + sizes.size());
		for(int i=0; i<sizes.size(); i++) {
			System.out.println("List of sizes are----->"+sizes.get(i).getText());
		if(sizes.get(i).getText().contains(pro.getProperty("partsize")))
		{
			chklstsize.click();
			System.out.println("Part Size are checked");
			break;
		}else
		{
			System.out.println("Size is not available");
		}
	}
	}
	
	public void savesize() throws InterruptedException {
		btnSave.click();
		Thread.sleep(3000);
	}
	
	
	public void acceptalert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts" + "Size" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}
	
	
	
	public void unchecksize() {
		//String size = chklstsize.getText();
		//System.out.println("Available size are ---->" +size);
			driver.switchTo().frame(0);
			boolean ischecked = false;
			ischecked = chklstsize.isSelected();
			if(ischecked = true) {
				chklstsize.click();
				System.out.println("Size is Unchecked");
			}else {
				System.out.println("Size is not unchecked");
			}
			
	}
	
	
	public void verifysize(String givensize) {
		//driver.switchTo().frame(0);
		//List<WebElement> sizes = driver.findElements(By.xpath("//input[@id='MainContent_chklstsizes_0']/following::label"));
		//System.out.println("Available size are ---->" + sizes.size());
		//for(int i=0; i<sizes.size(); i++) {
			//System.out.println("List of sizes are----->"+sizes.get(i).getText());
			if(chklstsize.isSelected())
			{
				//chklstsize.isSelected();
				System.out.println("Part Size are checked verified");
				
			}else
			{
				System.out.println("Size is unchecked verified");
			}
		
	}
	
	
	/*public void verifysizeremove(String givensize) {
		driver.switchTo().frame(0);
		String size = chklstsize.getText();
		System.out.println("Checked size are ---->" +size);
		if(size==givensize)
		{
			chklstsize.isSelected();
			System.out.println("Size is Unchecked");
		}else
		{
			System.out.println("Size is still checked");
		}
	}*/
	
}
