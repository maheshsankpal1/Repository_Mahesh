package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleTest {
	 

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/in/");
		String samsung2 = driver.getTitle();
		System.out.println("Title is: " + samsung2);
		WebElement samsung =driver.findElement(By.xpath("(//button[@role='tab'][normalize-space()='Appliances'])[1]"));
		samsung.getSize();
		samsung.getLocation();
		String s = samsung.getText();
		System.out.println("Title is: " + s);

		
		
		
		

		
		

	}

}
