package arttoframe.Crm_Email;

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
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrder {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Redirect page = new Redirect(driver);
		// page.goToHomePage();
		// page.GoToPrintOnWood();
	}

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\CommonProductPage.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("ArtToFrame");
		reporter.config().setDocumentTitle("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mahesh");
	}

	// Canvas product page
	@Test(priority = 1)
	public void TestCanvasProductPage() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Canvas Product Page Test Report",
				"This is test report of canvas product page");
		CanvasProductPage app = new CanvasProductPage(driver);
		Redirect page = new Redirect(driver);
		page.goToHomePage();
		app.gotoCanvas();
		if (app.uploadCanvasLowImage()) {
			test.pass("Low quality image uploaded successfully.");
		} else {
			test.fail("Failed to upload low quality image.");
		}

		String buttonText = app.getLowResolutionButtonText();
		test.info("Add to cart button text after uploading low quality image: " + buttonText);
		assertEquals(buttonText, "Low Resolution",
				"The button text should be 'Low Resolution' after uploading low quality image");

		if (app.EditImage()) {
			test.pass("Edit image popup is opened, image rotated and image BW working properly");
		} else {
			test.fail("Failed to edit image,image rotat and image black and whit image");
		}

		Thread.sleep(2000);
		if (app.uploadHighImage()) {
			test.pass("High quality image uploaded succesfully");
		} else {
			test.fail("Failed to upload high quality image");
		}

		String buttonText2 = app.getAddToCartButtontext();
		test.info("Add to cart button text after uploading high quality image: " + buttonText2);
		assertEquals(buttonText2, "Add to Cart", "buttonText2");

		if (app.testCanvasPage()) {
			test.pass("Size change, border options change, floating options change working");
		} else {

			if (app.enterInValidSize()) {
				test.pass("Non applicable image size entered successfully");
			} else {
				test.fail("Failed to enter non applicable image size");
			}

			boolean isDisabled = app.isAddToCartDisabled();
			System.out.println("Is Add to Cart disabled: " + isDisabled);
			if (isDisabled) {
				test.pass("The 'Add to Cart' button is disabled as expected.");
			} else {
				test.fail("The 'Add to Cart' button is NOT disabled.");
			}

			assertTrue(isDisabled, "The 'Add to Cart' button should be disabled.");
			String validationMessage = app.getValidationMessage();
			try {
				assertEquals(validationMessage, "Please enter the minimum size 8\" x 8\"",
						"Minimum size validation did not work as expected.");
				test.pass(
						"Minimum size and maximum size error message display, minimum and maximum size validation worked correctly.");
			} catch (AssertionError e) {
				test.fail("Expected validation message 'Please enter the minimum size 8\" x 8\"' but got '"
						+ validationMessage + "'");
			}

		}

		if (app.enterValidSize()) {
			test.pass("Applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		if (app.clickAddToCartButton()) {
			test.pass("Canvas product added to cart successfully");
		} else {
			test.fail("Failed to add to cart canvas product");
		}

		Thread.sleep(2000);
		// Fetch price from the Add to Cart popup
		double priceInPopup = app.getPopupPrice();
		test.info("Price in the Add to Cart popup: " + priceInPopup);
		app.ViewCartButton();

		try {
			// Fetch price from the cart page
			double cartPrice = app.getCartPrice(); // Convert cart price to a double
			test.info("Price in the Cart page: $" + cartPrice);

			// Compare the two prices
			if (priceInPopup == cartPrice) {
				test.pass("The prices in the Add to Cart popup and Cart page match.");
			} else {
				test.fail("The prices in the Add to Cart popup and Cart page do not match. Popup: $" + priceInPopup
						+ ", Cart: $" + cartPrice);
			}
		} catch (Exception e) {
			test.fail("An error occurred while comparing the prices: " + e.getMessage());
		}

	}

// Check Acrylic prints product page
	@Test(priority = 2)
	public void TestAcrylicPrintsProductPage() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Acrylic Prints Product Page Test Report",
				"This is test of Acrylic product page");

		AcrylicPrintsProductPage app = new AcrylicPrintsProductPage(driver);
		Redirect page = new Redirect(driver);
		page.goToHomePage();
		app.gotoAcrylicPrints();
		if (app.uploadLowImage()) {
			test.pass("Low quality image uploaded successfully.");
		} else {
			test.fail("Failed to upload low quality image.");
		}

		String buttonText = app.getLowResolutionButtonText();
		test.info("Add to cart button text after uploading low quality image: " + buttonText);
		assertEquals(buttonText, "Low Resolution", "The button text should be 'Low Resolution' after uploading low quality image");

		if (app.EditImage()) {
			test.pass("Edit image popup is opened, image rotated and image BW working properly");
		} else {
			test.fail("Failed to edit image,image rotat and image black and whit image");
		}

		Thread.sleep(2000);
		if (app.uploadHighImage()) {
			test.pass("High quality image uploaded succesfully");
		} else {
			test.fail("Failed to upload high quality image");
		}

		String buttonText2 = app.getAddToCartButtontext();
		test.info("Add to cart button text after uploading high quality image: " + buttonText2);
		assertEquals(buttonText2, "Add to Cart", "buttonText2");

		if (app.ChangeHardware()) {
			test.pass("Standoff Hardware changed successfully");
		} else {
			test.fail("Failed to change Standoff Hardware");
		}

		if (app.ChangePaperType()) {
			test.pass("Paper Type changed successfully");
		} else {
			test.fail("Failed to change Paper Type");
		}

		if (app.enterInValidSize()) {
			test.pass("Non applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		boolean isDisabled = app.isAddToCartDisabled();
		System.out.println("Is Add to Cart disabled: " + isDisabled);
		if (isDisabled) {
			test.pass("The 'Add to Cart' button is disabled as expected.");
		} else {
			test.fail("The 'Add to Cart' button is NOT disabled.");
		}

		// Verify if the Add to Cart button is disabled and fail the test if it's not
		assertTrue(isDisabled, "The 'Add to Cart' button should be disabled.");

		String validationMessage = app.getValidationMessage();
		try {
			assertEquals(validationMessage, "Please enter the minimum size 3\" x 3\"",
					"Minimum size validation did not work as expected.");
			test.pass(
					"Minimum size and maximum size error message display, minimum and maximum size validation worked correctly.");
		} catch (AssertionError e) {
			test.fail("Expected validation message 'Please enter the minimum size 8\" x 8\"' but got '"
					+ validationMessage + "'");
		}

		if (app.enterValidSize()) {
			test.pass("Applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		if (app.clickAddToCartButton()) {
			test.pass("Acrylic prints product added to cart successfully");
		} else {
			test.fail("Failed to add to cart Acrylic prints product");
		}
		Thread.sleep(2000);
		// Fetch price from the Add to Cart popup
		double priceInPopup = app.getPopupPrice();
		test.info("Price in the Add to Cart popup: " + priceInPopup);
		app.ViewCartButton();

		try {
			// Fetch price from the cart page
			double cartPrice = app.getCartPrice(); // Convert cart price to a double
			test.info("Price in the Cart page: $" + cartPrice);

			// Compare the two prices
			if (priceInPopup == cartPrice) {
				test.pass("The prices in the Add to Cart popup and Cart page match.");
			} else {
				test.fail("The prices in the Add to Cart popup and Cart page do not match. Popup: $" + priceInPopup
						+ ", Cart: $" + cartPrice);
			}
		} catch (Exception e) {
			test.fail("An error occurred while comparing the prices: " + e.getMessage());
		}

	}

	@Test(priority = 3)
	public void TestAcrylicFlaotingProductPage() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Acrylic Floating product page Test Report",
				"This is test report of Acrylic Floating product page");
		
		AcrylicFloatingProductPage app = new AcrylicFloatingProductPage(driver);
		Redirect page = new Redirect(driver);
		page.goToHomePage();
		app.gotoFloating();
		if (app.uploadLowImage()) {
			test.pass("Low quality image uploaded successfully.");
		} else {
			test.fail("Failed to upload low quality image.");
		}

		String buttonText = app.getLowResolutionButtonText();
		test.info("Add to cart button text after uploading low quality image: " + buttonText);
		assertEquals(buttonText, "Low Resolution", "The button text should be 'Low Resolution' after uploading low quality image");

		if (app.EditImage()) {
			test.pass("Edit image popup is opened, image rotated and image BW working properly");
		} else {
			test.fail("Failed to edit image,image rotat and image black and whit image");
		}

		Thread.sleep(2000);
		if (app.uploadHighImage()) {
			test.pass("High quality image uploaded succesfully");
		} else {
			test.fail("Failed to upload high quality image");
		}

		String buttonText2 = app.getAddToCartButtontext();
		test.info("Add to cart button text after uploading high quality image: " + buttonText2);
		assertEquals(buttonText2, "Add to Cart", "buttonText2");

		if (app.ChangeHardware()) {
			test.pass("Standoff Hardware changed successfully");
		} else {
			test.fail("Failed to change Standoff Hardware");
		}

		if (app.ChangeGlass()) {
			test.pass("Top Acrylic Material changed successfully");
		} else {
			test.fail("Failed to change Top Acrylic Material");
		}

		if (app.enterInValidSize()) {
			test.pass("Non applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		boolean isDisabled = app.isAddToCartDisabled();
		System.out.println("Is Add to Cart disabled: " + isDisabled);
		if (isDisabled) {
			test.pass("The 'Add to Cart' button is disabled as expected.");
		} else {
			test.fail("The 'Add to Cart' button is NOT disabled.");
		}

		// Verify if the Add to Cart button is disabled and fail the test if it's not
		assertTrue(isDisabled, "The 'Add to Cart' button should be disabled.");

		String validationMessage = app.getValidationMessage();
		try {
			assertEquals(validationMessage, "Please enter the minimum size 3\" x 3\"",
					"Minimum size validation did not work as expected.");
			test.pass(
					"Minimum size and maximum size error message display, minimum and maximum size validation worked correctly.");
		} catch (AssertionError e) {
			test.fail("Expected validation message 'Please enter the minimum size 8\" x 8\"' but got '"
					+ validationMessage + "'");
		}

		if (app.enterValidSize()) {
			test.pass("Applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		if (app.clickAddToCartButton()) {
			test.pass("Acrylic floating frame product added to cart successfully");
		} else {
			test.fail("Failed to add to cart Acrylic floating frame product");
		}
		Thread.sleep(2000);
		// Fetch price from the Add to Cart popup
		double priceInPopup = app.getPopupPrice();
		test.info("Price in the Add to Cart popup: " + priceInPopup);
		app.ViewCartButton();

		try {
			// Fetch price from the cart page
			double cartPrice = app.getCartPrice(); // Convert cart price to a double
			test.info("Price in the Cart page: $" + cartPrice);

			// Compare the two prices
			if (priceInPopup == cartPrice) {
				test.pass("The prices in the Add to Cart popup and Cart page match.");
			} else {
				test.fail("The prices in the Add to Cart popup and Cart page do not match. Popup: $" + priceInPopup
						+ ", Cart: $" + cartPrice);
			}
		} catch (Exception e) {
			test.fail("An error occurred while comparing the prices: " + e.getMessage());
		}

	}

	@Test(priority = 4)
	public void TestPrintOnWood() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Print on wood product page Test Report",
				"This is test report of Print on wood product page");
		PrintOnWood app = new PrintOnWood(driver);
		Redirect page = new Redirect(driver);
		page.goToHomePage();
		app.gotoAcrylicPrints();
		Thread.sleep(2000);
		app.selectPrintOnWood();
		if (app.uploadLowImage()) {
			test.pass("Low quality image uploaded successfully.");
		} else {
			test.fail("Failed to upload low quality image.");
		}

		String buttonText = app.getLowResolutionButtonText();
		test.info("Add to cart button text after uploading low quality image: " + buttonText);
		assertEquals(buttonText, "Low Resolution", "The button text should be 'Low Resolution' after uploading low quality image");

		if (app.EditImage()) {
			test.pass("Edit image popup is opened, image rotated and image BW working properly");
		} else {
			test.fail("Failed to edit image,image rotat and image black and whit image");
		}

		Thread.sleep(2000);
		if (app.uploadHighImage()) {
			test.pass("High quality image uploaded succesfully");
		} else {
			test.fail("Failed to upload high quality image");
		}

		String buttonText2 = app.getAddToCartButtontext();
		test.info("Add to cart button text after uploading high quality image:" + buttonText2);
		assertEquals(buttonText2, "Add to Cart", "buttonText2");

		if (app.enterInValidSize()) {
			test.pass("Non applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		boolean isDisabled = app.isAddToCartDisabled();
		System.out.println("Is Add to Cart disabled: " + isDisabled);
		if (isDisabled) {
			test.pass("The 'Add to Cart' button is disabled as expected.");
		} else {
			test.fail("The 'Add to Cart' button is NOT disabled.");
		}

		// Verify if the Add to Cart button is disabled and fail the test if it's not
		assertTrue(isDisabled, "The 'Add to Cart' button should be disabled.");

		String validationMessage = app.getValidationMessage();
		try {
			assertEquals(validationMessage, "Please enter the minimum size 3\" x 3\"",
					"Minimum size validation did not work as expected.");
			test.pass(
					"Minimum size and maximum size error message display, minimum and maximum size validation worked correctly.");
		} catch (AssertionError e) {
			test.fail("Expected validation message 'Please enter the minimum size 8\" x 8\"' but got '"
					+ validationMessage + "'");
		}

		if (app.enterValidSize()) {
			test.pass("Applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		if (app.clickAddToCartButton()) {
			test.pass("Print on wood product added to cart successfully");
		} else {
			test.fail("Failed to add to cart print on wood product");
		}
		Thread.sleep(2000);
		// Fetch price from the Add to Cart popup
		double priceInPopup = app.getPopupPrice();
		test.info("Price in the Add to Cart popup: " + priceInPopup);
		app.ViewCartButton();

		try {
			// Fetch price from the cart page
			double cartPrice = app.getCartPrice(); // Convert cart price to a double
			test.info("Price in the Cart page: $" + cartPrice);

			// Compare the two prices
			if (priceInPopup == cartPrice) {
				test.pass("The prices in the Add to Cart popup and Cart page match.");
			} else {
				test.fail("The prices in the Add to Cart popup and Cart page do not match. Popup: $" + priceInPopup
						+ ", Cart: $" + cartPrice);
			}
		} catch (Exception e) {
			test.fail("An error occurred while comparing the prices: " + e.getMessage());
		}

	}

	@Test(priority = 5)
	public void TestPrintOnMetal() throws InterruptedException, AWTException {
		ExtentTest test = extent.createTest("Print on metal product page Test Report",
				"Test Print on metal product page");
		PrintOnMetal app = new PrintOnMetal(driver);
		Redirect page = new Redirect(driver);
		page.goToHomePage();
		app.gotoAcrylicPrints();
		app.selectPrintOnMetal();
		if (app.uploadLowImage()) {
			test.pass("Low quality image uploaded successfully.");
		} else {
			test.fail("Failed to upload low quality image.");
		}

		String buttonText = app.getLowResolutionButtonText();
		test.info("Add to cart button text after uploading low quality image: " + buttonText);
		assertEquals(buttonText, "Low Resolution", "The button text should be 'Low Resolution' after uploading low quality image");

		if (app.EditImage()) {
			test.pass("Edit image popup is opened, image rotated and image BW working properly");
		} else {
			test.fail("Failed to edit image,image rotat and image black and whit image");
		}

		Thread.sleep(2000);
		if (app.uploadHighImage()) {
			test.pass("High quality image uploaded succesfully");
		} else {
			test.fail("Failed to upload high quality image");
		}

		String buttonText2 = app.getAddToCartButtontext();
		test.info("Add to cart button text after uploading high quality image: " + buttonText2);
		assertEquals(buttonText2, "Add to Cart", "buttonText2");

		if (app.enterInValidSize()) {
			test.pass("Non applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		boolean isDisabled = app.isAddToCartDisabled();
		System.out.println("Is Add to Cart disabled: " + isDisabled);
		if (isDisabled) {
			test.pass("The 'Add to Cart' button is disabled as expected.");
		} else {
			test.fail("The 'Add to Cart' button is NOT disabled.");
		}

		// Verify if the Add to Cart button is disabled and fail the test if it's not
		assertTrue(isDisabled, "The 'Add to Cart' button should be disabled.");

		String validationMessage = app.getValidationMessage();
		try {
			assertEquals(validationMessage, "Please enter the minimum size 3\" x 3\"",
					"Minimum size validation did not work as expected.");
			test.pass(
					"Minimum size and maximum size error message display, minimum and maximum size validation worked correctly.");
		} catch (AssertionError e) {
			test.fail("Expected validation message 'Please enter the minimum size 8\" x 8\"' but got '"
					+ validationMessage + "'");
		}

		if (app.enterValidSize()) {
			test.pass("Applicable image size entered successfully");
		} else {
			test.fail("Failed to enter non applicable image size");
		}

		if (app.clickAddToCartButton()) {
			test.pass("Print on metal product added to cart successfully");
		} else {
			test.fail("Failed to add to cart print on metal product");
		}
		Thread.sleep(2000);
		// Fetch price from the Add to Cart popup
		double priceInPopup = app.getPopupPrice();
		test.info("Price in the Add to Cart popup: " + priceInPopup);
		app.ViewCartButton();

		try {
			// Fetch price from the cart page
			double cartPrice = app.getCartPrice(); // Convert cart price to a double
			test.info("Price in the Cart page: $" + cartPrice);

			// Compare the two prices
			if (priceInPopup == cartPrice) {
				test.pass("The prices in the Add to Cart popup and Cart page match.");
			} else {
				test.fail("The prices in the Add to Cart popup and Cart page do not match. Popup: $" + priceInPopup
						+ ", Cart: $" + cartPrice);
			}
		} catch (Exception e) {
			test.fail("An error occurred while comparing the prices: " + e.getMessage());
		}

	}

	@AfterSuite
	public void tearDownSuite() {
		if (extent != null) {
			extent.flush(); // Ensure all logs are flushed to the report
		}

	}

}
