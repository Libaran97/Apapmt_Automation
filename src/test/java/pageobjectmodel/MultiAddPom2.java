package pageobjectmodel;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class MultiAddPom2 extends Baseclass {

	public MultiAddPom2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"MainContent_GVData_lblPartsLinked_0\"]")
	WebElement ePartsLinked;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[1]")
	WebElement eproductline;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[2]")
	WebElement epartdesc;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[3]")
	
	
	
	WebElement epartno;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[4]")
	WebElement eqty;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[5]")
	WebElement enotes;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tr[2]/td[6]")
	WebElement eposition;

	@FindBy(xpath = "//*[@id='GridView1_Image1_0']")
	private WebElement eedit;

	@FindBy(xpath = "//*[@id='GridView1_Image3_0']")
	private WebElement evieweditCancel;

	@FindBy(xpath = "//input[@name='GridView1$ctl02$ctl01']")
	private WebElement eeditverifynotes;

	@FindBy(xpath = "//a[@id='GridView1_UpdateButton_0']")
	private WebElement eok;

	@FindBy(xpath = "//*[@id='GridView1_Image2_0']")
	private WebElement evieweditdelete;

	@FindBy(xpath = "//*[@id='GridView1']/tbody/tr/td")
	private WebElement everifyvieweditdelete;

	public void partslinked() throws Exception {
		ePartsLinked.click();
		Thread.sleep(5000);
	}

	String actual = "";

	public void POPEdit(String vehicletypename) throws InterruptedException {
		eeditverifynotes.clear();
		eeditverifynotes.sendKeys(pro.getProperty("vehicletypename"));
		Thread.sleep(5000);
		actual = eeditverifynotes.getText();
		System.out.println("actual");
		eok.click();
		Thread.sleep(5000);

	}

	public void viewedit() throws Throwable {
		eedit.click();
		Thread.sleep(5000);
	}

	public void windowhandler() {
		// Switch between windows
		try {
			String MainWindow = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();

				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

					// Switching to Child window
					driver.switchTo().window(ChildWindow);
					Thread.sleep(3000);
					// String price =
					// driver.findElement(By.xpath("//span[@id=\"prcIsum\"]")).getText();

					// Closing the Child Window.
					// driver.close();
				}
			}

			// Switching to Parent window i.e Main Window.
			// driver.switchTo().window(MainWindow);
		} catch (Exception e) {
			driver.close();
			System.out.println("Popup is not open....");
			e.printStackTrace();
		}
	}

	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related: " + pro.getProperty("vehicletypename") + alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}

	public void verifyedit(String vehicletypename) {
		String expect = pro.getProperty("vehicletypename");
		// actual = eeditverifynotes.getText();
		assertEquals(expect, actual);
		System.out.println("NOtes is matched");
	}

	public void vieweditcancel(String vehicletypename) throws Throwable {
		eeditverifynotes.clear();
		eeditverifynotes.sendKeys(pro.getProperty("vehicletypename"));
		Thread.sleep(2000);
		evieweditCancel.click();
		Thread.sleep(5000);
		System.out.println("Passed the Cancel button");
		/*
		 * String actualText = evieweditnotes.getText(); System.out.println("Text" +
		 * actualText); if (actualText.contains(pro.getProperty("notes"))) {
		 * System.out.println("Both are same"); } else if
		 * (actualText.contains("United states")) { System.out.println("Both are same");
		 * 
		 * }
		 */
	}

	public void vieweditdelete() throws Throwable {
		evieweditdelete.click();
		Thread.sleep(3000);
	}

	public void verifyvieweditdelete() throws Throwable {

		String actualText = everifyvieweditdelete.getText();
		System.out.println("Text" + actualText);
		if (actualText.contains("No Records Found...")) {
			System.out.println("Both are same");
		} else if (actualText.contains("United states")) {
			System.out.println("Both are same");
		} else {
			System.out.println("No Records Found.");

		}
		Thread.sleep(3000);
		System.out.println("No Records Found...");
	}

	public void SortPartDescription_TC037() throws Exception {
		List<WebElement> el = driver.findElements(By.xpath("//*[@id=\"MainContent_drpVehicleType\"]/option"));
		System.out.println(el);
		int selsize = el.size();
		System.out.println("The size of the elements in the array is >>>>>>>>>>>>>>> " + selsize);
		ArrayList<String> AllEle = new ArrayList<String>();
		ArrayList<String> AllEleBeforeSort = new ArrayList<String>();
		String element = "";
		
		Select sel=new Select(driver.findElement(By.name("ctl00$MainContent$drpVehicleType")));
		List<WebElement> option1 = sel.getOptions();
		
		for (int i=1; i<=selsize-1; i++) {
			element = option1.get(i).getText();
			System.out.println("The selected element is >>>>>>> " + element);
			AllEle.add(element);
			System.out.println("The elements in the array AllEle is >>>>>>> " + AllEle);
			Thread.sleep(1000);
			try {
			AllEleBeforeSort.add(element);
			} catch(Exception e) {
				System.out.println("Cannot add to this array >>>>>>> ");
			}
			System.out.println("i am here 1 >>>>>>> ");
		}		
		System.out.println("i am here 111111 >>>>>>> ");		
		Thread.sleep(1000);
		
		System.out.println("The elements in the array AllEleBeforeSort is >>>>>>> " + AllEleBeforeSort);		
		Collections.sort(AllEle);
		System.out.println("After sort order is:::"+AllEle);
		System.out.println("before sort order is:::"+AllEleBeforeSort);
		Thread.sleep(5000);
		
		boolean flag = true;
		for (int i=0; i<selsize-2; i++) {
			String ValueBeforeSort = AllEleBeforeSort.get(i);
			System.out.println("The element number before sort " + i + " is " + ValueBeforeSort);
			Thread.sleep(1000);
			String ValueAfterSort = AllEle.get(i);
			System.out.println("The element number after sort is " + i + " is " + ValueAfterSort);
			if (ValueBeforeSort.equalsIgnoreCase(ValueAfterSort)) {
				continue;
			} else {
				flag = false;
				break;
			}
		}		
		if (flag == true) {
			System.out.println("The Vehicle details are already in correct order");
		} else {
			System.out.println("The Vehicle details were NOT in correct order");
		} 		
		}
	
	
	}
