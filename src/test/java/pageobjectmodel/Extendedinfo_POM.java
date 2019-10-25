package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;



public class Extendedinfo_POM extends Baseclass {

	
	
	public Extendedinfo_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='ExtendedInfo']")
	private WebElement clkextended;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpcodedesc']")
	private WebElement drpcodedesc;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
