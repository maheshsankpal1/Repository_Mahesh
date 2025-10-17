package arttoframe.Crm_Email;


import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import arttoframe.Crm_Email_PageObject.ComposeMail;
import arttoframe.Crm_Email_PageObject.Redirect;
import arttoframe.Crm_Email_PageObject.TicketPopup;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestTicketPopup {
		private WebDriver driver;
		private ComposeMail page;
		ExtentReports extent;
		ExtentTest test;

		@BeforeClass
		public void setUp() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Redirect page = new Redirect(driver);
			page.goToLoginPage();
			Thread.sleep(2000);
			page.loginApplication("mahesh.sankpal.243@solacetechnologies.co.in", "test@123");
			Thread.sleep(3000);
			page.CrmSupportTicket();

		}

		@BeforeTest
		public void config() {
			String path = System.getProperty("user.dir") + "\\reports\\TestTicketPopupReport.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("ArtToFrame");
			reporter.config().setDocumentTitle("Test Result");

			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Mahesh");
		}

		//CRM Ticket Popup mail send
		@Test
		public void TickectPopup() throws InterruptedException {
			ExtentTest test1 = extent.createTest("Ticket Popup", "Ticket Poup mail send ");
			TicketPopup TP = new TicketPopup(driver);
			Thread.sleep(4000);

			if (TP.SelectIssue("Listing Issues")) {
				test1.pass("Listing Issue Type selected successfully from ticket popup");
			} else {
				test1.fail("Failed to Listing Issue Type from ticket popup");
			}

			if (TP.TicketDescriptionEnter()) {
				test1.pass("Ticket Description entered successfully from ticket popup");
			} else {
				test1.fail("Failed to send Ticket Description from ticket popup");
			}

			if (TP.NotifyIssueSelect()) {
				test1.pass("Select notify admin");
			} else {
				test1.fail("Failed to Select notify admin");
			}
		
			if (TP.IssueVideoEnter()) {
				test1.pass("Video description entered successfully from ticket popup");
			} else {
				test1.fail("Failed to send Video description from ticket popup");
			}

			if (TP.IssueURLEnter()) {
				test1.pass("Issue URL entered successfully from ticket popup");
			} else {
				test1.fail("Failed to enter issue URL for new ticket");
			}

			if (TP.TestMessageEnter()) {
				test1.pass("Test message entered successfully from ticket popup");
			} else {
				test1.fail("Failed to enter Test message from ticket popup");
			}

			if (TP.attachFile("F:\\Test\\TestImage.jpg")) {
				test1.pass("Attachment send successfully from ticket popup");
			} else {
				test1.fail("Failed to send attachment from ticket popup");
			}
			
			if (TP.attachFile("F:\\Test\\TestImage2.jpg")) {
				test1.pass("Attachment2 send successfully from ticket popup");
			} else {
				test1.fail("Failed to send attachment2 from ticket popup");
			}
			
			
			if (TP.attachFile("F:\\Test\\TestImage3.jpg")) {
				test1.pass("Attachment3 send successfully from ticket popup");
			} else {
				test1.fail("Failed to send attachment3 from ticket popup");
			}
			
			if (TP.attachFile("F:\\Test\\TestImage4.jpg")) {
				test1.pass("Attachment4 send successfully from ticket popup");
			} else {
				test1.fail("Failed to send attachment4 from ticket popup");
			}
			

			  if ( TP.TicketSend()) {
				  test1.pass("Send button selected successfully from ticket popup"); }
			  else {
				  test1.fail("Failed click Send button new ticket"); 
			  
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



