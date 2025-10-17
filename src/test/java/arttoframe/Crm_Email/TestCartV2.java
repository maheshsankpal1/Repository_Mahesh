package arttoframe.Crm_Email;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
import com.aventstack.extentreports.util.Assert;

import arttoframe.Crm_Email_PageObject.CanvasProductPage;
import arttoframe.Crm_Email_PageObject.PrintOnMetal;
import arttoframe.Crm_Email_PageObject.PrintOnWood;
import arttoframe.Crm_Email_PageObject.AcrylicFloatingProductPage;
import arttoframe.Crm_Email_PageObject.AcrylicPrintsProductPage;
import arttoframe.Crm_Email_PageObject.CanvasProductPage;
import arttoframe.Crm_Email_PageObject.Redirect;
import arttoframe.Crm_Email_PageObject.TestOrder;
import arttoframe.Crm_Email_PageObject.cart_v2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCartV2 {
	private WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeClass
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\CartV2Page.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("CartV2 Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");

	}

	@Test
	public void TestCartV2Page() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Cartv2 Page Test Report", "This is test report of CartV2 page");
		cart_v2 c = new cart_v2(driver);
		c.AddProduct();
		c.GoToCartV2();
		c.TestCart_v2();

	}
}
