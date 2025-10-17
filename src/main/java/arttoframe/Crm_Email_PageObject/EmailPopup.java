package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPopup {
	WebDriver driver;

	public EmailPopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='by7 T-I'])[1]")
	private WebElement gmailpopup;

	public void clickPopup() {
		gmailpopup.click();
	}

}
