package arttoframe.Crm_Email;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import arttoframe.Crm_Email_PageObject.Redirect;
import arttoframe.Crm_Email_PageObject.SupportTicket;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Send_mail_to_user {
	private WebDriver driver;
	ExtentReports extent;

	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Redirect page = new Redirect(driver);
		page.goToLoginPage();
		page.loginApplication("mahesh.sankpal.243@solacetechnologies.co.in", "test@123");
		Thread.sleep(2000);
		page.CrmSupportTicket();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	

	}

	@BeforeTest
	public void config() throws InterruptedException {
		String path = System.getProperty("user.dir") + "\\reports\\Send mail to user from support ticket page.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("Test Result");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");

	}

	// Support page reply to user mail.
	@Test
	public void SupportTicket() throws EmailException, InterruptedException {
		ExtentTest test1 = extent.createTest("CRM Support page Test", "This is test for CRM support page");
     	SupportTicket ticket = new SupportTicket(driver);		
		test1.log(Status.INFO, "Report page opened Successfully");
		ticket.switchToYourIframe();
		
		if (ticket.goToAccount()) {
			test1.pass("CRM TEST ACCOUNT selected successfully");
		} else {
			test1.fail("Failed to select CRM TEST ACCOUNT");
		}
		
	//	Thread.sleep(4000);
	//	ticket.GoToReportPageTicket();
		
	
		Thread.sleep(4000);
		if (ticket.openTestTicket()) {
			test1.pass("New ticket selected successfully");
		} else {
			test1.fail("Failed to select new ticket");
		}
		
		
		if (ticket.mailReplay("Hello, This is test replay...!!!")) {
			test1.pass("Test reply send successfully");
		} else {
			test1.fail("Failed to send test reply");
		}

		ticket.scrollDown();
		Thread.sleep(2000);
		
		if (ticket.attachFile("F:\\Test\\TestImage.jpg")) {
			test1.pass("Attachment send successfully for new ticket");
		} else {
			test1.fail("Failed to send attachment for new ticket");
		}
		 Thread.sleep(2000);
		ticket.button();
		Thread.sleep(2000);
		if (ticket.selectCheckbox()) {
			test1.pass("Ticket confirmation selected successfully");
		} else {
			test1.fail("Failed to select ticket confirmation");
		}
		ticket.sendClose();
		System.out.println("Mail replay succesfully from admin page");
		extent.flush();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
