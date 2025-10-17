package arttoframe.Crm_Email;



import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import arttoframe.Crm_Email_PageObject.ChatSystem;
import arttoframe.Crm_Email_PageObject.Redirect;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChat {
	
private WebDriver driver;
ExtentReports extent;
//ExtentTest test;

   @BeforeClass
  public void setUp() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();	
	driver.manage().window().maximize();

	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
//	test.log(Status.INFO, "Starting chat system test case");
	Redirect page = new Redirect(driver);
	page.goToHomePage();

}



    @BeforeTest
    public void config() {
  	String path = System.getProperty("user.dir")+"\\reports\\CrmChatSystem.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");
		
		
    }

	@Test
	public void startChat() throws InterruptedException, AWTException {
	ExtentTest  test1 = extent.createTest("Chat System Test", "This is test for chat system");
		ChatSystem chat = new ChatSystem(driver); {
			
			  Thread.sleep(4000);
			  chat.startChat();
    		  test1.log(Status.INFO, "New Chat Started Successfully")  ;
			  Thread.sleep(4000);
			  
			  if (chat.selectChatOption()) {
				    test1.pass("Chat Option selected successfully");
				} else {
				    test1.fail("Failed to select Chat Option");
				}
			  
			 
			  if ( chat.UserInformation()) {
				    test1.pass("User Information entered succesfully");
				} else {
				    test1.fail("Failed to enter User Information");
				}
			  
			
			  Thread.sleep(4000);
			  if ( chat.PlacingAnOrderForm()) {
				  test1.pass("Product type entered succesfully");
				} else {
				    test1.fail("Failed to enter Product type");
				}

			  Thread.sleep(4000);			
			  if ( chat.GiveNameAndEmail()) {
				  test1.pass("Name and Email entered for bot");
				} else {
				    test1.fail("Failed to enter Name and Email");
				}
			
//			  Thread.sleep(2000);
//		
//			  if ( chat.GiveDetails()) {
//				  test1.pass("User Details sumbitted successfully");
//				} else {
//				    test1.fail("Failed to enter User Details");
//				}
			 
			  Thread.sleep(4000);		 
			  if (  chat.enterTestMessage()) {
				  test1.pass("Test message sent successfully");
				} else {
				    test1.fail("Failed to enter Test message");
				}
     		
			  Thread.sleep(4000);
			  chat.enterTestPhone();
			  if (  chat.enterTestMessage()) {
				  test1.pass("Test phone sent successfully");
				} else {
				    test1.fail("Failed to enter Test phone");
				}
     		
			  
     		
			  Thread.sleep(4000);		
			  if (   chat.enterTestLink()) {
				  test1.pass("Test link sent successfully");
				} else {
				    test1.fail("Failed to enter Test url");
				}
     		
	     	 
			  Thread.sleep(4000);		 
			  if (   chat.enterTrackingOrder()) {
				  test1.pass("Tracking an order details sent successfully");
				} else {
				    test1.fail("Failed to sent Tracking an order details");
				}
     		
			
			  Thread.sleep(4000);	  
			  if ( chat.SelectOrder()) {
				  test1.pass("Order selected successfully");
				} else {
				    test1.fail("Failed to select order");
				}
	         
			  Thread.sleep(4000);
			 
			  if (  chat.IssueOrder()) {
				  test1.pass("Issue with an order received details submited sucessfully");
				} else {
				    test1.fail("Failed to submit Issue with an order received details ");
				}
    		
			  Thread.sleep(4000);
			  if (   chat.Attachment()) {
				  test1.pass("Attachment sent successfully");
				} else {
				    test1.fail("Failed to sent attachment");
				}
			
			  extent.flush();
			  
			  
			 
			
		}
		
	}
	 @AfterSuite
	    public void tearDownSuite() {
	        if (extent != null) {
	            extent.flush(); // Ensure all logs are flushed to the report
	        }
	


	 }
}