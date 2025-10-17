package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redirect {

	WebDriver driver;

	public Redirect(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(id = "sbtLogin")
	WebElement submit;

	public void loginApplication(String email, String password){
		userName.sendKeys(email);
		passWord.sendKeys(password);
		submit.click();
	}

	public void goToLoginPage() {
		driver.get("https://www.arttoframe.com/login.php");
	}
	
	public void goToHomePage() {
		driver.get("https://www.arttoframe.com");
	}
	
	public void goCrmSupportTicket() {
		driver.get("https://www.arttoframe.com/admin/crm/index.php");
	}
	
	public void golive_chat_panel() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.arttoframe.com/admin/crm/live_chat_panel.php#inbox_unread");
	}
	
	public void CrmSupportTicket() {		
		driver.get("https://www.arttoframe.com/admin/crm/index.php");
	}
	
	public void GoToRegularPage() {		
		driver.get("https://www.arttoframe.com/8x10-Satin-Black-picture-frame/FRBW26079?page_type=E");
	}
	
	public void GoToPrintOnWood() {
		driver.get("https://www.arttoframe.com/product/print_on_wood");
		
	}
	
	  public void goTestMode() {
			driver.get("https://www.arttoframe.com/braintree_payment_options_test_mode.php");
		}
	  
	  public void GoToCartV2() {
		  driver.get("https://www.arttoframe.com/cart_v2.php");
	  }
	

}

	
