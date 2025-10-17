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

import arttoframe.Crm_Email_PageObject.AdminChatSystem;
import arttoframe.Crm_Email_PageObject.ChatSystem;
import arttoframe.Crm_Email_PageObject.Redirect;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAdminChatSystem {
	private WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	
	 @BeforeClass
	  public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
	 }
		 @BeforeTest
		    public void config() {
		  	String path = System.getProperty("user.dir")+"\\reports\\Admin_Chat_System_Test_Report.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			    reporter.config().setReportName("ArtToFrame");
				reporter.config().setDocumentTitle("Test Result");
				
				extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Mahesh");
		
	}	
		
	//Accepting user chat and send messages
    @Test
	private void StartAdminChat() throws InterruptedException, AWTException {
    	ExtentTest  test1 = extent.createTest("Admin Chat System Test", "This is test for admin chat system");
    	Redirect page = new Redirect(driver);
    	AdminChatSystem ACS = new AdminChatSystem(driver);{		
		page.goToHomePage();	
		Thread.sleep(4000);
		ChatSystem CS = new ChatSystem(driver);
		Thread.sleep(4000);
		CS.startChat();
		test1.log(Status.INFO, "New Chat Started Successfully")  ;
		Thread.sleep(4000);
		  
		  if (CS.selectChatOption()) {
			    test1.pass("Chat Option selected successfully");
			} else {
			    test1.fail("Failed to select Chat Option");
			}
		  
		 
		  if ( CS.UserInformation()) {
			    test1.pass("User Information entered succesfully");
			} else {
			    test1.fail("Failed to enter User Information");
			}
		  
		
		  Thread.sleep(4000);
		  if ( CS.PlacingAnOrderForm()) {
			  test1.pass("Product type entered succesfully");
			} else {
			    test1.fail("Failed to enter Product type");
			}

		  Thread.sleep(4000);			
		  if ( CS.GiveNameAndEmail()) {
			  test1.pass("Name and Email entered for bot");
			} else {
			    test1.fail("Failed to enter Name and Email");
			}
		
//		  Thread.sleep(4000);
//	
//		  if ( CS.GiveDetails()) {
//			  test1.pass("User Details sumbitted successfully");
//			} else {
//			    test1.fail("Failed to enter User Details");
//			}
		 
		  Thread.sleep(4000);		 
		  if (  CS.enterTestMessage()) {
			  test1.pass("Test message sent successfully");
			} else {
			    test1.fail("Failed to enter Test message");
			}
 		
		  Thread.sleep(4000);
		  CS.enterTestPhone();
		  if (  CS.enterTestMessage()) {
			  test1.pass("Test phone sent successfully");
			} else {
			    test1.fail("Failed to enter Test phone");
			}
 		
		  
 		
		  Thread.sleep(4000);		
		  if (   CS.enterTestLink()) {
			  test1.pass("Test link sent successfully");
			} else {
			    test1.fail("Failed to enter Test url");
			}
 		
     	 
		  Thread.sleep(4000);		 
		  if (   CS.enterTrackingOrder()) {
			  test1.pass("Tracking an order details sent successfully");
			} else {
			    test1.fail("Failed to sent Tracking an order details");
			}
 		
		
		  Thread.sleep(4000);	  
		  if ( CS.SelectOrder()) {
			  test1.pass("Order selected successfully");
			} else {
			    test1.fail("Failed to select order");
			}
         
		  Thread.sleep(4000);
		 
		  if (  CS.IssueOrder()) {
			  test1.pass("Issue with an order received details submited sucessfully");
			} else {
			    test1.fail("Failed to submit Issue with an order received details ");
			}
		
		  Thread.sleep(4000);
		  if (   CS.Attachment()) {
			  test1.pass("Attachment sent successfully");
			} else {
			    test1.fail("Failed to sent attachment");
			}
		
	}
    	    Thread.sleep(4000);
			page.goToLoginPage();
			page.loginApplication("mahesh.sankpal.243@solacetechnologies.co.in", "test@123");
			Thread.sleep(10000);
			page.golive_chat_panel();
			Thread.sleep(4000);
		
			  if ( ACS.SelectChat()) {
				  test1.pass( " Admin accepted chat successfully")  ;
				} else {
				    test1.fail("Failed to select order");
				}
				
			Thread.sleep(4000);		 
			  if ( ACS.EnterAdminTestMessage()) {
				  test1.pass("Test message send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test message from admin side");
				}
			  
			  
			Thread.sleep(4000);	
			  if (ACS.EnterAdminTestPhone()) {
				  test1.pass("Test phone no. send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test phone no. from admin side");
				}
			  
			  
			Thread.sleep(4000);		
			 if (ACS.EnterAdminTestLink()) {
				 test1.pass("Test URL send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test URL from admin side");
				}
			 
			 
			Thread.sleep(4000);	
			 if (ACS.SendAttachment()) {
				 test1.pass("Test attachment send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test attachment from admin side");
				}
			 
			 
			Thread.sleep(4000);	
			 if (ACS.EnterAdminEmoji()) {
				 test1.pass("Test emoji send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test emoji from admin side");
				}
			 
			Thread.sleep(4000);
		 
			 if ( ACS.AdminReply()) {
				 test1.pass("Test reply send successfully from admin side");
				} else {
				    test1.fail("Failed to send Test emoji from admin side");
				}
			 extent.flush();
	
		}

    
    @AfterSuite
    public void tearDownSuite() {
        if (extent != null) {
            extent.flush(); // Ensure all logs are flushed to the report
        }

}
}	
	

