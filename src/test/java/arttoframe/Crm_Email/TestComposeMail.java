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

public class TestComposeMail {
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
		Redirect page = new Redirect(driver);
		page.goToLoginPage();
		Thread.sleep(2000);
		page.loginApplication("mahesh.sankpal.243@solacetechnologies.co.in", "test@123");
		Thread.sleep(2000);
		page.goCrmSupportTicket();

	}

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\TestComposeMail.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");
	}

	// Send email from Compose Email Popup
	@Test
	public void ClickCompose() throws InterruptedException, AWTException {
		ExtentTest test1 = extent.createTest("Compose Mail Popup Test", "This is test for compose mail popup");
		ComposeMail emailPopup = new ComposeMail(driver);
		emailPopup.clickHiddenButton("button_compose_mail_auto");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		if (emailPopup.toFieldEnter()) {
			test1.pass("Compose mail popup to field email entered successfully");
		} else {
			test1.fail("Unable to enter cc field email on on compose mail popup");
		}

		if (emailPopup.ccFieldEnter()) {
			test1.pass("Compose mail popup bcc field email entered successfully");
		} else {
			test1.fail("Unable to enter bcc field on compose mail popup");
		}

		if (emailPopup.bccFieldEnter()) {
			test1.pass("Chat Option selected successfully");
		} else {
			test1.fail("Failed to select Chat Option");
		}

		if (emailPopup.subjectFieldEnter()) {
			test1.pass("Compose mail popup subject entered successfully");
		} else {
			test1.fail("Unable to enter subject on compose mail popup");
		}

		if (emailPopup.messageFieldEnter()) {
			test1.pass("Compose mail popup message entered successfully");
		} else {
			test1.fail("Unable to enter to message on compose mail popup");
		}

		if (emailPopup.attachFile("F:\\Test\\TestImage.jpg")) {
			test1.pass("Attachment send successfully");
		} else {
			test1.fail("Unable to send Attachment ");
		}

//		 Thread.sleep(2000);
//		 if (emailPopup.selectColorDropdown("dropdownLocator", "crmtesting@arttoframes.com")) {
//			    test1.pass("Attachment send successfully");
//			} else {
//			    test1.fail("Unable to send Attachment ");
//			}
//		 

		if (emailPopup.sendEmail()) {
			test1.pass("Compose mail popup send button clicked successfully");
		} else {
			test1.fail("unable to click send mail button on compose mail popup");
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



