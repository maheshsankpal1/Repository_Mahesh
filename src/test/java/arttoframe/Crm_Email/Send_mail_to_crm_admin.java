package arttoframe.Crm_Email;

import java.time.Duration;

import org.apache.commons.mail.EmailException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import arttoframe.Crm_Email_PageObject.Redirect;
import arttoframe.Crm_Email_PageObject.SendEmailCrm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Send_mail_to_crm_admin {
	private WebDriver driver;
	ExtentReports extent;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\CrmReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("Test Result");
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");
	}
	
	// Send mail to CRM landing page.........
	@Test
	public void CrmLandingPage() throws EmailException {
		extent.createTest("CrmLandingPage");
		SendEmailCrm emailPage = new SendEmailCrm();
		emailPage.sendEmail();
		System.out.println("Send mail successfully to the CRM test account ");
		Redirect emailpage = new Redirect(driver);
		emailpage.goToLoginPage();
		emailpage.loginApplication("mahesh.sankpal.243@solacetechnologies.co.in", "AEjHL4M303dwUj5O");
		emailpage.goCrmSupportTicket();
		extent.flush();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
