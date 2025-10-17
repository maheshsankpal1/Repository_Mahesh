package arttoframe.Crm_Email;

import org.testng.annotations.Test;

import arttoframe.Crm_Email_PageObject.billionaire;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Testbillionaire {
	
	  @Test
	    public void openbillionaire() {
	        // Setup ChromeDriver automatically
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	       

	        // Maximize window
	        driver.manage().window().maximize();

	        // Open URL using billionaire class
	        billionaire page = new billionaire(driver);
	        page.openUrl("https://www.billionaire.com/in/home");

	        // Optional: wait a few seconds to see the browser
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close browser
	        driver.quit();
	    }
	}
	


