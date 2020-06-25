package pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;

public class Applicationrelated_vehicle_make_model2 extends Baseclass {

	public Applicationrelated_vehicle_make_model2() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//*[@id=\"ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1\"]")
	@CacheLookup
	private WebElement vehicletype;

	@FindBy(xpath = "//div[@id='btnadd_new']")
	private WebElement addbutton;

	@FindBy(xpath = "//div[@id='btnAdd']")
	private WebElement addbutton1;

	@FindBy(xpath = "//input[@id='txt_vehicle_type']")
	private WebElement vehicleentertextbox;

	@FindBy(xpath = "//span[@id='select2-drpVehicleGroup1-container']")
	private WebElement eGroup;

	@FindBy(xpath = "//li[text()='Equipment']")
	private WebElement egroupoption;

	@FindBy(xpath = "//label[(text()='2-Wheel Drive Tractor')]")
	private WebElement equivalentvehicle;

	@FindBy(xpath = "//div[@id='save_btn_new_add']")
	private WebElement savebutton;

	@FindBy(xpath = "//div[@id='btnSave']")
	private WebElement savebutton1;

	@FindBy(xpath = "//*[text()='Make']")
	private WebElement clickmake;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeAdd-container']")
	private WebElement vehicletypeselect;

	@FindBy(xpath = "//li[text()='Car equipment']")
	private WebElement vehicletypesend;

	@FindBy(xpath = "//input[@id='txtMake']")
	private WebElement maketextbox;

	@FindBy(xpath = "//label[text()='John Deere']")
	private WebElement eqmakeradibutton;

	@FindBy(xpath = "//*[text()='Model']")
	private WebElement modelselect;

	@FindBy(xpath = "//span[@id='select2-drpMakeAdd-container']")
	private WebElement dropdownmakeselect;

	@FindBy(xpath = "//li[text()='make equipment']")
	private WebElement dropdownmakesend;

	@FindBy(xpath = "//input[@id='txtModel']")
	private WebElement modeltextbox;

	@FindBy(xpath = "//label[@id='1707']")
	private WebElement eqmodelradiobutton;

	@FindBy(xpath = "//i[@class='fas fa-th-large theme_txt_clr sec_lv_menu']")
	private WebElement clickdashboard;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eSearchBox;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVryText;

	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	private WebElement eselectddVehicle;

	// Vehicle Type Group
	@FindBy(xpath = "//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	private WebElement VehicleTypeGroup;

	@FindBy(xpath = "//input[@id='txtVehicleTypegroup']")
	private WebElement VehicleTypegroupname;

	@FindBy(xpath = "//span[@id='select2-drpVehicleGroup1-container']")
	private WebElement equivehigroup;

	@FindBy(xpath = "//span[@id='select2-drpVehicleTypeACesgruop1-container']")
	private WebElement equavalentchose1;

	@FindBy(xpath = "//li[text()='Marine']")
	private WebElement equavalentchosesend;

	@FindBy(xpath = "//label[(text()='Car equipment')]")
	private WebElement equivalentvehicle1;
	
	@FindBy(xpath = "//span[@id='select2-drpVehicleType-container']")
	private WebElement eequimentmodelvehcile;
	
	
	
	//span[@id="select2-drpVehicleType-container"]

	/*
	 * choosing vehicle type group & add button click
	 */

	public void clickonvehicletypgroup() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		VehicleTypeGroup.click();
		Thread.sleep(5000);
		addbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void vehicletypegroups(String vehicletypenameeq) throws Exception {
		Thread.sleep(5000);
		VehicleTypegroupname.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);

		equivehigroup.click();
		Thread.sleep(5000);
		egroupoption.click();
		Thread.sleep(5000);

		equavalentchose1.click();
		Thread.sleep(5000);
		equavalentchosesend.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle1);
		equivalentvehicle1.click();

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(5000);
	}

	public void VerifyequVehicletypegroup(String vehicletypenameeq) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeq)) {
			System.out.println("Both are same equipment vehicle type group verified");

		} else {
			System.out.println("Both are not same equipment vehicle type group verified");
		}

	}

	/*
	 * choosing vehicle type & add button click
	 */
	public void clickonvehicletype() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		vehicletype.click();
		Thread.sleep(5000);
		addbutton.click();
		Thread.sleep(5000);
	}

	/*
	 * entering new vehicle type name, equivalent vehicle & save
	 */
	public void vehicletypename(String vehicletypenameeq) throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehicleentertextbox.sendKeys(vehicletypenameeq);
		Thread.sleep(5000);
		eGroup.click();
		Thread.sleep(5000);
		egroupoption.click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", equivalentvehicle);
		equivalentvehicle.click();

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(5000);
	}

	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException {
		/*
		 * Alert alert = driver.switchTo().alert(); //
		 * logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		 * System.out.println("Application Related: " +
		 * pro.getProperty("vehicletypename") + alert.getText()); alert.accept();
		 * Thread.sleep(2000);
		 */

		WebElement pop = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);

	}

	public void VerifyEquipment(String vehicletypenameeq) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypenameeq);
		Thread.sleep(3000);
		String text = eVryText.getText();
		if (text.equals(vehicletypenameeq)) {
			System.out.println("Both are same vehicle verified");

		} else {
			System.out.println("Both are not same vehicle verified");
		}

	}

	/*
	 * 
	 * choosing make & clicking on the add button
	 */
	public void clickonmake() throws Throwable {
		// driver.navigate().refresh();
		// Thread.sleep(2000);
		/*
		 * boolean result = false; int attempt = 0; while(attempt<2) { try { Actions
		 * action = new Actions(driver); action.moveToElement(master).build().perform();
		 * result = true; break } }
		 */
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		clickmake.click();
		Thread.sleep(5000);

		addbutton1.click();
		Thread.sleep(8000);
	}

	/*
	 * 
	 * vehicle type choose, make name add & equivalent make choose
	 */
	public void addmakename() throws InterruptedException {

		vehicletypeselect.click();
		Thread.sleep(6000);

		vehicletypesend.click();
		Thread.sleep(6000);

		vehicletypeselect.click();
		Thread.sleep(6000);
	}

	/*
	 * 
	 * enter make name,choose equivalent aces make & save
	 */
	public void newmakename(String makenameeq) throws InterruptedException {

		maketextbox.sendKeys(makenameeq);
		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", eqmakeradibutton);
		eqmakeradibutton.click();
		Thread.sleep(6000);

		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(2000);

	}

	/*
	 * 
	 * make successfull & alert accept
	 */
	public void acceptAlertformake() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related " + pro.getProperty("makename") + alert.getText());
		alert.accept();

	}

	public void VerifyMake(String makenameeq) throws InterruptedException {

		eselectddVehicle.click();
		Thread.sleep(5000);

		vehicletypesend.click();
		Thread.sleep(5000);

		eselectddVehicle.click();
		Thread.sleep(5000);

		/*
		 * Select ddvehicle = new Select(eselectddVehicle);
		 * 
		 * ddvehicle.selectByVisibleText(vehiclename); Thread.sleep(5000);
		 */

		eSearchBox.sendKeys(makenameeq);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(makenameeq)) {
			System.out.println("Both are same Make verified");

		} else {
			System.out.println("Both are not same Make verified");
		}

	}

	/*
	 * 
	 * master mouse hover, choose model, addbuton click
	 */
	public void clickonmodel() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);

		modelselect.click();
		Thread.sleep(5000);

		addbutton1.click();
		Thread.sleep(8000);
	}

	/*
	 * 
	 * vehicle type choose, make choose, model name add & equivalent model choose
	 */
	public void addmodelname() throws InterruptedException {

		vehicletypeselect.click();
		Thread.sleep(6000);

		vehicletypesend.click();
		Thread.sleep(5000);
	}

	public void addmodeldrp2() throws InterruptedException {

		dropdownmakeselect.click();
		Thread.sleep(5000);
		dropdownmakesend.click();
		Thread.sleep(5000);

	}

	/*
	 * 
	 * model name add,equivalent model choose & save
	 */
	public void modelnameadd(String modelnameeq) throws InterruptedException {
		modeltextbox.sendKeys(modelnameeq);
		Thread.sleep(8000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", eqmodelradiobutton);
		eqmodelradiobutton.click();
		Thread.sleep(7000);

		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		savebutton1.click();
		Thread.sleep(5000);
	}

	/*
	 * 
	 * added model successfull & alert accept
	 */
	public void acceptAlertformodel() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related " + pro.getProperty("modelname") + alert.getText());
		alert.accept();
		Thread.sleep(3000);
	}

	public void Verifymodeleq(String modelnameeq) throws InterruptedException {

		eequimentmodelvehcile.click();
		Thread.sleep(6000);

		vehicletypesend.click();
		Thread.sleep(5000);
		
		eSearchBox.sendKeys(modelnameeq);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(modelnameeq)) {
			System.out.println("Both are same equipment vehicle type group verified");

		} else {
			System.out.println("Both are not same equipment vehicle type group verified");
		}

	}

}
