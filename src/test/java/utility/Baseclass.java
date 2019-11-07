package utility;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import pmt.reports.ExtentReport;

public class Baseclass extends ExtentReport {

	public static WebDriver driver;
	public static Properties pro;
	public static PhantomJsDriverManager drive;
	public static String DEV_KEY = "bf719946efbcf835b6e9c6d00ea90d17"; //Your API 
	public static String SERVER_URL = "https://www.apagreen.com/testlink/lib/api/xmlrpc/v1/xmlrpc.php"; //your testlink server url
	public static String PROJECT_NAME = "PMT";
	public static String PLAN_NAME = "PMTAutomationTestPlan";
	public static String TESTCASE_NAME = "Product category";
	public static String BUILD_NAME = "PMTAutomationTestBuild";

	
	
	    //String result = "";
	    //String exception = null;
	    
	
	public Baseclass() {
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\arunkumar\\git\\apapmt_automation\\Configuration\\pmtdetails.properties");
			pro.load(fis);
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	
	
	public static void browserlaunch() {
		
		String browsername = pro.getProperty("Browser");
		
		if(browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "F:\\Selenium test code\\pmt\\pmtincucumber\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
		}else if(browsername.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}else if(browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else if(browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "F:\\Selenium test code\\PMTwithoutenginecode\\apapmtautomatecode\\Drivers\\MicrosoftWebDriver.exe");
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browsername.equals("headless")) {
			//System.setProperty("phantomjs.binary.path","");
			WebDriverManager.phantomjs().setup();
		    drive = new PhantomJsDriverManager();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
			
		
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = pro.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	

	public static void logindetails() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(pro.getProperty("username"));
		//driver.findElement(By.id("txtUsername"));
		//driver.findElement(By.id("txtPassword"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
	
	  public static String getusername() { 
		 String subcategoryname = pro.getProperty("username");
	 return subcategoryname;
	 }
	 
	  public static String getpassword() { 
		  String password =pro.getProperty("password"); 
		  return password;
		  }
	
	 
	public static void teardown() {
		driver.quit();
	}
	
	public void explicitWait(ExpectedConditions cond, int seconds, By locate){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public static void updateTestLinkResult(String testCase, String exception, String result) throws TestLinkAPIException{
        TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(DEV_KEY, SERVER_URL);
        testlinkAPIClient.reportTestCaseResult(PROJECT_NAME, PLAN_NAME, testCase, BUILD_NAME, exception, result);
        
    }
	
}


