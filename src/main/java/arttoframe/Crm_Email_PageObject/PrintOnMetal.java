package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PrintOnMetal extends CanvasProductPage
	{

	private WebDriver driver;
	@FindBy(id = "selectionDrpdown")
	WebElement productTypeDropdown;

	@FindBy(xpath = "(//img[@id='17'])[1]")
	private WebElement selectAcrylicPrints;

	@FindBy(xpath = "(//span[@class='shop_btn uploadimage'])[1]")
	private WebElement AcrylicShopNow;

	public PrintOnMetal(WebDriver driver) {
		super(driver);
	}

	public void gotoAcrylicPrints() {
		selectAcrylicPrints.click();
		AcrylicShopNow.click();

	}

	// Method to select "Print On Wood" option from dropdown
	public void selectPrintOnMetal() {
		Select select = new Select(productTypeDropdown); // Initialize Select class with the dropdown WebElement
		select.selectByVisibleText("Print On Metal"); // Select option by visible text
	}
}