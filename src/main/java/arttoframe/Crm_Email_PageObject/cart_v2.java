package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class cart_v2 {
	private WebDriver driver;
	
	
	@FindBy(xpath = "(//a[@id='mobile_addToCart_item_page'])[1]")
    private WebElement addtocart;
	
	@FindBy(xpath = "(//span[normalize-space()='View Cart'])[1]")
    private WebElement viewcart;
	
	@FindBy(id = "(//input[@id='qty_0'])[2]")
    private WebElement qty;


	// Constructor
	public cart_v2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	 public void AddProduct() throws AWTException {
		  driver.get("https://www.arttoframe.com/8x10-Satin-Black-picture-frame/FRBW26079");
		  addtocart.click();
		  viewcart.click();
		  
	
		 

		  
		  
		  
		  
	  }
	  public void GoToCartV2() {
		  driver.get("https://www.arttoframe.com/cart_v2.php");
	  }
	  
	 public void TestCart_v2() {
		 qty.click();
	 }
	

}
