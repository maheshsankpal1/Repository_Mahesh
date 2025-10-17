package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AcrylicFloatingProductPage extends CanvasProductPage {
	private WebDriver driver;

	@FindBy(xpath = "(//img[@id='11'])[1]")
	private WebElement SelectFloating;

	@FindBy(xpath = "(//img[@alt='8'])[1]")
	private WebElement FloatingSearch;

	@FindBy(xpath = "(//img[@id='myStandoffcolor_72'])[1]")
	private WebElement ChangeStanoff;

	@FindBy(xpath = "(//div[@id='Non-Glare'])[1]")
	private WebElement ChangeGlassTab;

	@FindBy(xpath = "(//label[@id='select_24'])[1]")
	private WebElement ChangeGlass;

	// Constructor
	public AcrylicFloatingProductPage(WebDriver driver) {
		super(driver); // Calling the CanvasPage constructor
	}

	public void gotoFloating() throws AWTException {
		SelectFloating.click();
		FloatingSearch.click();
	    Actions action = new Actions(driver);
	    action.keyDown(Keys.SPACE).perform();
	    
	    Robot rb = new Robot();
	    rb.keyPress(KeyEvent.VK_SPACE);

	    

	}

	public boolean ChangeHardware() {
		try {
			ChangeStanoff.click();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public boolean ChangeGlass() {
		try {
			ChangeGlassTab.click();
			ChangeGlass.click();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

}
