package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcrylicPrintsProductPage extends CanvasProductPage {
	private WebDriver driver;
	
	@FindBy(xpath = "(//img[@id='17'])[1]")
	private WebElement selectAcrylicPrints;
	
	@FindBy(xpath = "(//span[@class='shop_btn uploadimage'])[1]")
	private WebElement AcrylicShopNow;


	@FindBy(xpath = "(//img[@id='myStandoffcolor_70'])[1]")
	private WebElement ChangeStanoff;

	@FindBy(xpath = "(//input[@id='paper_131'])[1]")
	private WebElement ChangePaperTypeOption;

	// Constructor
	public AcrylicPrintsProductPage(WebDriver driver) {
		super(driver); // Calling the CanvasPage constructor
	}
	
	
	public void gotoAcrylicPrints() {
		selectAcrylicPrints.click();
		AcrylicShopNow.click();

	}

	public boolean ChangeHardware() {
		try {
			ChangeStanoff.click();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public boolean ChangePaperType() {
		try {
			ChangePaperTypeOption.click();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

}
