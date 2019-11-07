package testlink_integration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class Testlink {
    public static WebDriver dr;
    public static String DEV_KEY = "66054f85491c1bc676a8755a8363f169"; //Your API 


//Key
    
    public static String SERVER_URL = "https://www.apagreen.com/testlink/login.php"; //your testlink server url
    public static String PROJECT_NAME = "PMT"; 
    public static String PLAN_NAME = "PMTAutomationTestPlan";
    public static String BUILD_NAME = "TestBuild";

    
    public void TestOne() throws Exception
    {
        String result = "";
        String exception = null;
        try{
                   dr = new FirefoxDriver();
dr.get("https://accounts.google.com/ServiceLogin?     continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
                  dr.manage().window().maximize();
                  result = TestLinkAPIResults.TEST_PASSED;
                  updateTestLinkResult("Test-1", null, result);
        } 
        catch (Exception e){
                       result = TestLinkAPIResults.TEST_FAILED;
                       exception = e.getMessage();
                       updateTestLinkResult("Test-1", exception, result);
        }
        try {
            dr.findElement(By.id("Email")).sendKeys("your gmail login id");
            Thread.sleep(2000);
            dr.findElement(By.id("next")).click();
            Thread.sleep(1000);
            dr.findElement(By.id("Passwd")).sendKeys("*********");
            Thread.sleep(1000);
            dr.findElement(By.id("signIn")).click();
            result = TestLinkAPIResults.TEST_PASSED;
            updateTestLinkResult("Test-2", null, result);
        } 
        catch (Exception e) {
            result = TestLinkAPIResults.TEST_FAILED;
            exception = e.getMessage();
            updateTestLinkResult("Test-2", exception, result);
        }
        
        
    }

    public void updateTestLinkResult(String testCase, String exception, String result) throws TestLinkAPIException{
        TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(DEV_KEY, SERVER_URL);
        testlinkAPIClient.reportTestCaseResult(PROJECT_NAME, PLAN_NAME, testCase, BUILD_NAME, exception, result);
        
    }
}




