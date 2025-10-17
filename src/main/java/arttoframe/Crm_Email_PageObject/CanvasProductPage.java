package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CanvasProductPage {
	private WebDriver driver;

	// Locating

	@FindBy(xpath = "(//img[@id='15'])[1]")
	private WebElement selectCanvasPrints;

	@FindBy(xpath = "(//img[@id='11'])[1]")
	private WebElement selectAcrylicFloating;

	@FindBy(xpath = "(//img[@alt='8'])[1]")
	private WebElement selectSearchAcrylicFloating;

	@FindBy(xpath = "(//span[@class='shop_blue'])[1]")
	private WebElement canvasShopNow;

	@FindBy(xpath = "(//span[@id='imageUploadNameText'])[1]")
	private WebElement UploadImage;

	@FindBy(xpath = "(//button[@class='uploadbtn_common'])[1]")
	private WebElement UploadImagePopup1;

	@FindBy(id = "qualitylowResolution")
	WebElement lowResolutionButton;

	@FindBy(xpath = "(//button[@class='uploadbtn_common'])[1]")
	private WebElement UploadImagePopup;

	@FindBy(xpath = "(//button[@class='confirmBtns confirmBtns_desktop'])[1]")
	private WebElement UploadPopupConfirm;

	@FindBy(id = "imageUploadNameText")
	private WebElement EditClick;

	@FindBy(xpath = "(//img[@id='rotateImage'])[1]")
	private WebElement Rotate;

	@FindBy(id = "bwimg")
	private WebElement BWImage;

	@FindBy(xpath = "(//img[@id='deleteImage'])[1]")
	private WebElement deleteImageClick;

	@FindBy(xpath = "(//div[@class='col-xs-4 opt_size'])[10]")
	private WebElement SizeChange;

	@FindBy(xpath = "(//span[@class='slider-cnv round-cnv'])[1]")
	private WebElement AspectRatio;

	@FindBy(xpath = "(//a[normalize-space()='Custom size'])[1]")
	private WebElement CustomSize;

	@FindBy(xpath = "(//input[@id='customWidth'])[1]")
	private WebElement customWidth;

	@FindBy(xpath = "(//input[@id='customHeight'])[1]")
	private WebElement customHeight;

	@FindBy(id = "btnApply")
	private WebElement CustomOk;

	@FindBy(xpath = "(//span[@class='sizeErrorTxt'])[1]")
	private WebElement sizeErrorTxt;

	@FindBy(xpath = "(//a[normalize-space()='Custom size'])[1]")
	private WebElement customsizetab;

	@FindBy(id = "myStandoff_1")
	private WebElement StandoffHardwareChange;

	@FindBy(xpath = "(//img[@id='myStandoff_4'])[1]")
	private WebElement FrenchCleatHardwareChange;

	@FindBy(id = "mobile_addToCart_item_page")
	private WebElement AcrylicAddToCart;

	@FindBy(xpath = "(//div[normalize-space()='16x12'])[1]")
	private WebElement sizeChange;

	@FindBy(xpath = "(//img[@class='applyBorderColor'])[1]")
	private WebElement BorderChange;

	@FindBy(xpath = "(//img[@title='canvas'])[5]")
	private WebElement SelectFloatingFrame;

	@FindBy(xpath = "//span[@class='price-txt']")
	private WebElement productPagePrice;

	// Locate the main price part using XPath
	@FindBy(xpath = "//span[@class='price-txt']")
	WebElement mainPriceElement;

	@FindBy(css = "div.addtocartbtnwithquality")
	WebElement addToCartDiv;

	@FindBy(xpath = "(//span[normalize-space()='View Cart'])[1]")
	private WebElement ViewCart;

	@FindBy(xpath = "//span[@class='price-txt']/sup")
	WebElement centsElement;

	@FindBy(xpath = "//span[@class='price-txt']")
	private WebElement popupPrice;

	@FindBy(xpath = "//tr[@class='clsTR']//td[3]")
	private WebElement CartPrice;

	@FindBy(xpath = "//div[@class='col-md-12 viewcartbtn']//span")
	private WebElement AcrylicViewCart;

	// Constructor
	public CanvasProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void Zoomout(int zoomout) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("document.body.style.zoom='50%';");
	}

	public void gotoCanvas() {
		selectCanvasPrints.click();
		canvasShopNow.click();
	}

	public boolean gotoAcrylicFloating() throws InterruptedException {
		try {
			selectAcrylicFloating.click();
			selectSearchAcrylicFloating.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean enterInValidSize() throws InterruptedException {
		try {
			CustomSize.click();
			customWidth.clear();
			customWidth.sendKeys("2");
			customHeight.clear();
			customHeight.sendKeys("2");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean enterValidSize() throws InterruptedException {
		try {
			customWidth.clear();
			customWidth.sendKeys("25");
			customHeight.clear();
			customHeight.sendKeys("30");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getValidationMessage() {
		return sizeErrorTxt.getText();
	}

	public boolean isAddToCartDisabled() {
		// Check if the 'disabled' class is present in the add to cart div
		String classAttribute = addToCartDiv.getAttribute("class");
		return classAttribute.contains("disabled");
	}

	public boolean uploadCanvasLowImage() throws InterruptedException, AWTException {
		try {
			UploadImagePopup1.click();
			uploadLowUsingRobot();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean uploadLowImage() throws InterruptedException, AWTException {
		try {
			UploadImage.click();
			Thread.sleep(2000);
			UploadImagePopup1.click();
			uploadLowUsingRobot();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean uploadHighImage() throws InterruptedException, AWTException {
		try {
			UploadImage.click();
			Thread.sleep(2000);
			UploadImagePopup1.click();
			uploadHighUsingRobot();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	private void uploadLowUsingRobot() throws InterruptedException, AWTException {
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\Test2.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(2000);
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		UploadPopupConfirm.click();
		
	}

	private void uploadHighUsingRobot() throws InterruptedException, AWTException {

		StringSelection ss = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\Test.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(2000);
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		UploadPopupConfirm.click();

	}

	public String getAddToCartButtonText() {
		return AcrylicAddToCart.getText();

	}

	public String getLowResolutionButtonText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lowResolutionButton));
		return lowResolutionButton.getText();
	}

	public String getAddToCartButtontext() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElement(AcrylicAddToCart, "Add to Cart"));
		return AcrylicAddToCart.getText();
	}

	public boolean EditImage() throws InterruptedException {
		try {
			Thread.sleep(2000);
			EditClick.click();
			Thread.sleep(2000);
			Rotate.click();
			Rotate.click();
			Rotate.click();
			Rotate.click();
			BWImage.click();
			Thread.sleep(2000);
			BWImage.click();
			deleteImageClick.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean testCanvasPage() throws InterruptedException {
		try {

			BorderChange.click();
			SelectFloatingFrame.click();
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean TestAcrylicPrints() throws InterruptedException {
		try {
			SizeChange.click();
			StandoffHardwareChange.click();
			FrenchCleatHardwareChange.click();
			customsizetab.click();
			AspectRatio.click();
			customWidth.clear();
			customWidth.sendKeys("2");
			customHeight.clear();
			customHeight.sendKeys("2");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public double getPopupPrice() {
		// Extract the text from the price element
		String priceText = popupPrice.getText(); // "$ 13898"

		// Remove the currency symbol and spaces
		priceText = priceText.replaceAll("[^\\d.]", ""); // "13898"

		// Split into dollars and cents if necessary
		String[] parts = priceText.split("(?<=\\d)(?=\\d{2}$)");

		// Format the price correctly
		double price = Double.parseDouble(parts[0] + "." + parts[1]); // 138.98

		return price;
	}

	public double getCartPrice() {
		// Extract the text from the cart price element
		String priceText = CartPrice.getText(); // e.g., "$ 13898"

		// Remove currency symbol and other non-numeric characters
		priceText = priceText.replaceAll("[^\\d.]", ""); // "13898"

		// Convert the text into a double
		return Double.parseDouble(priceText); // 13898.00
	}

	public boolean clickAddToCartButton() throws InterruptedException {
		try {
			AcrylicAddToCart.click();
			return true;
		} catch (Exception e) {
		return false;
	}
	}
	public void ViewCartButton() {
		ViewCart.click();
	}

}
