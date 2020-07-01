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

public class Applicationrelated_vehicle_make_model extends Baseclass {

	public Applicationrelated_vehicle_make_model() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;

	// @FindBy(xpath="(//*[text()='Vehicle Type'])[1]")
	@FindBy(xpath = "//*[@id=\"ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1\"]")
	@CacheLookup
	private WebElement vehicletype;

	//@FindBy(xpath = "//button[@id='MainContent_btnAdd']")
	@FindBy(xpath="//div[@id='btnadd_new']")
	private WebElement addbutton;
	
	@FindBy(xpath="//div[@id='btnAdd']")
	private WebElement addbutton1;
	

	//@FindBy(xpath = "//input[@id='MainContent_txtVehicleType']")
	@FindBy(xpath="//input[@id='txt_vehicle_type']")
	private WebElement vehicleentertextbox;

	// @FindBy(xpath="//*[@id=\"MainContent_checkACESList_0\"]")
	@FindBy(xpath = "//label[(text()='Car')]")
	private WebElement equivalentvehicle;

	//@FindBy(xpath = "//input[@id='MainContent_btnSave']")
	@FindBy(xpath="//div[@id='save_btn_new_add']")
	private WebElement savebutton;
	@FindBy(xpath="//div[@id='btnSave']")
	private WebElement savebutton1;
	
	
	@FindBy(xpath="//div[@id='save_btn_new_edit']")
	private WebElement savebutton2;

	@FindBy(xpath = "//*[text()='Make']")
	private WebElement clickmake;

	//@FindBy(xpath = "//select[@id='MainContent_drpVehicleTypeAdd']")
	@FindBy(xpath="//span[@id='select2-drpVehicleTypeAdd-container']")
	
	private WebElement vehicletypeselect;
	
	@FindBy(xpath="//li[text()='Car Test01']")
	private WebElement vehicletypesend;
	

	//@FindBy(xpath = "//input[@id='MainContent_txtMake']")
	@FindBy(xpath="//input[@id='txtMake']")
	private WebElement maketextbox;

	//@FindBy(xpath = "//input[@id='MainContent_checkACESList_42']")
	@FindBy(xpath="//label[text()='Chevrolet']")
	private WebElement eqmakeradibutton;

	@FindBy(xpath = "//*[text()='Model']")
	private WebElement modelselect;

	//@FindBy(xpath = "//select[@id='MainContent_drpMakeAdd']")
	
	@FindBy(xpath="//span[@id='select2-drpMakeAdd-container']")
	private WebElement dropdownmakeselect;
	
	@FindBy(xpath="//li[text()='Test Chevrolet01']")
	private WebElement dropdownmakesend;

	//@FindBy(xpath = "//input[@id='MainContent_txtModel']")
	@FindBy(xpath = "//input[@id='txtModel']")	
	private WebElement modeltextbox;

	//@FindBy(xpath = "//input[@id='MainContent_checkACESList_1']")
	//@FindBy(xpath = "//label[text()='Astra']")	
	@FindBy(xpath = "//label[@id='6641']")
	private WebElement eqmodelradiobutton;

	@FindBy(xpath = "//i[@class='fas fa-th-large theme_txt_clr sec_lv_menu']")
	private WebElement clickdashboard;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tfoot/tr/th[1]/input")
	private WebElement eSearchBox;

	@FindBy(xpath = "//table[@id='DataTableViewer']/tbody/tr/td[1]")
	private WebElement eVryText;

	//@FindBy(xpath = "//select[@id='MainContent_drpVehicleType']")
	@FindBy(xpath="//span[@id='select2-drpVehicleType-container']")
	private WebElement eselectddVehicle;
	
	

	//Vehicle Type Group 
	@FindBy(xpath="//*[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	private WebElement VehicleTypeGroup;
	
	//@FindBy(xpath="//*[@id='MainContent_txtVehicleType']")
	@FindBy(xpath="//input[@id='txtVehicleTypegroup']")
	private WebElement VehicleTypegroupname;
	
	//@FindBy(xpath="//select[@id='MainContent_drpVehicleTypeACesgruop']")
	@FindBy(xpath="//span[@id='select2-drpVehicleTypeACesgruop1-container']")
	private WebElement equavalentchose1;
	
	@FindBy(xpath="//li[text()='Light Duty']")
	private WebElement equavalentchosesend;
	
	
	@FindBy(xpath = "//label[(text()='Car Test01')]")
	private WebElement equivalentvehicle1;
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[3]/div/input[1]")
	WebElement eEditBtn; //Model Edit
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[1]")
	WebElement eEditMakeBtn; 
	
	@FindBy(xpath="(//div[@Class='edit_icon_ver'])[1]")
	WebElement eEditVgroupBtn; 
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[3]/div/input[2]")
	WebElement eDeleteBtn; //Model
	
	
	@FindBy(xpath="//*[@id='DataTableViewer']/tbody/tr/td[4]/div/input[2]")
	WebElement eDeleteMakeBtn;
	
	@FindBy(xpath="(//div[@Class='edit_icon_ver'])[2]")
	WebElement eDeleteVgrouBtn;
	
	/*
	 * choosing vehicle type group & add button click
	 */
	
	public void clickonvehicletypgroup() throws Throwable	
	{
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		VehicleTypeGroup.click();
		Thread.sleep(5000);
		
	}
	
	public void vehicletypegroups(String vehicletypename,String Equchose) throws Exception {
		addbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		VehicleTypegroupname.sendKeys(vehicletypename);
		Thread.sleep(5000);
		
		/*Select equavalentchose = new Select(equavalentchose1);
		equavalentchose.selectByVisibleText(Equchose);
		Thread.sleep(5000);	*/	
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
	
	
	public void VerifyVehicletypegroup(String vehiclename) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehiclename);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(vehiclename)) {
			System.out.println("Both are same vehicle type group verified");

		} else {
			System.out.println("Both are not same vehicle type group verified");
		}

	}
	
	public void SelectVehicletypegroup(String vehiclename) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehiclename);
		Thread.sleep(5000);
		
	}	
	
	public void Editvehicletypegroups(String vehicletypename) throws Exception {
		eEditVgroupBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		VehicleTypegroupname.clear();
		Thread.sleep(3000);
		
		VehicleTypegroupname.sendKeys(vehicletypename);
		Thread.sleep(5000);
		

	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		js.executeScript("arguments[0].scrollIntoView();", savebutton2);
		savebutton2.click();
		Thread.sleep(5000);
	}
	
	public void DeleteVehicleTypegroup() throws InterruptedException {
		eDeleteVgrouBtn.click();
		Thread.sleep(5000);
		
	}
	
	public void VerifyDeleteVehicletypegroup(String vehiclename, String DeleteProducttxt) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehiclename);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Vehicletypegroup Deleted succesfully");

		} else {
			System.out.println("Vehicletypegroup Not Deleted succesfully");
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
		
	}

	/*
	 * entering new vehicle type name, equivalent vehicle & save
	 */
	public void vehicletypename(String vehicletypename) throws Exception {
		addbutton.click();
		Thread.sleep(5000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehicleentertextbox.sendKeys(vehicletypename);

		
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
		/*Alert alert = driver.switchTo().alert();
		// logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related: " + pro.getProperty("vehicletypename") + alert.getText());
		alert.accept();
		Thread.sleep(2000);*/
		
		WebElement pop=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);

	}

	public void VerifyVehicle(String vehicletypename) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypename);
		Thread.sleep(3000);
		String text = eVryText.getText();
		if (text.equals(vehicletypename)) {
			System.out.println("Both are same vehicle verified");

		} else {
			System.out.println("Both are not same vehicle verified");
		}

	}
	
	
	public void SelectVehicle(String vehicletypename) throws InterruptedException {
		Thread.sleep(5000);
		eSearchBox.sendKeys(vehicletypename);
		Thread.sleep(3000);
		
	}
	
	public void Editvehicletypename(String vehicletypename) throws Exception {
		
		eEditVgroupBtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		vehicleentertextbox.clear();
		Thread.sleep(3000);
		vehicleentertextbox.sendKeys(vehicletypename);

		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", savebutton2);
		savebutton2.click();
		Thread.sleep(5000);
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
		
		
	}

	/*
	 * 
	 * vehicle type choose, make name add & equivalent make choose
	 */
	public void addmakename() throws InterruptedException {

		addbutton1.click();
		Thread.sleep(8000); 
		
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
	public void newmakename(String makename) throws InterruptedException {

		maketextbox.sendKeys(makename);
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
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);

	}

	public void VerifyMake(String makename0) throws InterruptedException {

		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);
		
	/*	Select ddvehicle = new Select(eselectddVehicle);

		ddvehicle.selectByVisibleText(vehiclename);
		Thread.sleep(5000);*/

		eSearchBox.sendKeys(makename0);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(makename0)) {
			System.out.println("Both are same Make verified");

		} else {
			System.out.println("Both are not same Make verified");
		}

	}
	
	public void SearchMake(String makename0) throws InterruptedException {

		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);
		
		eSearchBox.sendKeys(makename0);
		Thread.sleep(5000);
	}
	
	public void Editmakename(String makename) throws InterruptedException {
		

		eEditMakeBtn.click();
		Thread.sleep(3000);
		
		maketextbox.clear();
		Thread.sleep(3000);
		maketextbox.sendKeys(makename);
		Thread.sleep(8000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(2000);

	}
    public void Deletemakename() throws InterruptedException {
		

		eDeleteMakeBtn.click();
		Thread.sleep(3000);
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
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*WebElement element = vehicletypeselect;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("vehicletypename"));
		Thread.sleep(2000);*/
		
		vehicletypeselect.click();
		Thread.sleep(6000);
		
		vehicletypesend.click();
		Thread.sleep(5000);		

		/*vehicletypeselect.click();
		Thread.sleep(5000);	*/	
		
	}

	public void addmodeldrp2() throws InterruptedException {
		/*WebElement element1 = dropdownmakeselect;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("makename"));
		Thread.sleep(2000);*/
		
		dropdownmakeselect.click();
		Thread.sleep(5000);	
		dropdownmakesend.click();
		Thread.sleep(5000);	
		/*dropdownmakeselect.click();
		Thread.sleep(5000);	*/

	}

	/*
	 * 
	 * model name add,equivalent model choose & save
	 */
	public void modelnameadd(String modelname) throws InterruptedException {
		modeltextbox.sendKeys(modelname);
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
		WebElement pop=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]"));
		Thread.sleep(5000);
		System.out.println("Record newly to be inserted");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pop);
		pop.click();
		Thread.sleep(10000);
	}
	
	public void VerifyModel(String modelname0) throws InterruptedException {

		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);


		eSearchBox.sendKeys(modelname0);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(modelname0)) {
			System.out.println("Both are same Model verified");

		} else {
			System.out.println("Both are not same Model verified");
		}

	}
	
	public void clickonmodel3() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(5000);
		
		modelselect.click();
		Thread.sleep(5000);
		
		
	}
	

	public void SeletModel(String modelname0) throws InterruptedException {

		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);


		eSearchBox.sendKeys(modelname0);
		Thread.sleep(5000);
		
		
		
	}
	public void Editmodelname(String modelname) throws InterruptedException {
		eEditBtn.click();
		Thread.sleep(3000);
		modeltextbox.clear();
		Thread.sleep(8000);
		modeltextbox.sendKeys(modelname);
		Thread.sleep(8000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;		
			
		js1.executeScript("arguments[0].scrollIntoView();", savebutton1);
		savebutton1.click();
		Thread.sleep(5000);
	}
	
	
	public void DeleteModel() throws InterruptedException {
		eDeleteBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void VerifyDeleteMake(String makename, String DeleteProducttxt) throws InterruptedException {

		try {
		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);

		eSearchBox.sendKeys(makename);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Make Deleted succesfully");

		} else {
			System.out.println("Make Not Deleted succesfully");
		}
		} catch (Exception e)
		{
			System.out.println("Vehicle not found so Makel Not Deleted succesfully");
		}

	}

	
	public void VerifyModelDeleted(String modelname, String DeleteProducttxt) throws InterruptedException {
		
		try {

		eselectddVehicle.click();
		Thread.sleep(5000);
		
		vehicletypesend.click();
		Thread.sleep(5000);
		
		eselectddVehicle.click();
		Thread.sleep(5000);


		eSearchBox.sendKeys(modelname);
		Thread.sleep(5000);
		String text = eVryText.getText();
		if (text.equals(DeleteProducttxt)) {
			System.out.println("Model Deleted succesfully");

		} else {
			System.out.println("Model Not Deleted succesfully");
		}
		}	catch (Exception e)
	{
		System.out.println("Vehicle not found so Model Not Deleted succesfully");
	}

	}
}
