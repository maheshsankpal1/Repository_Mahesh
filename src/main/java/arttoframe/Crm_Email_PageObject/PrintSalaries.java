package arttoframe.Crm_Email_PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintSalaries {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Mahesh/Downloads/salaries.html");
		
		List<WebElement> salaries =driver.findElements(By.cssSelector(".customer-salary"));
		for (WebElement salary : salaries) {
            System.out.println("Customer Salary: " + salary.getText());
        }
		driver.quit();
	}

}
