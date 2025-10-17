package arttoframe.Crm_Email_PageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Dropdown {
	private WebDriver driver;

	@FindBy(xpath = "(//select[@id='dropdown'])[1]")
	private WebElement Dropdown;

	@FindBy(xpath = "(//button[normalize-space()='Click for JS Alert'])[1]")
	private WebElement alertclick;

	// Constructor
	public Dropdown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void selectOption() {
		Select dropdown = new Select(driver.findElement(By.xpath("(//select[@id='dropdown'])[1]")));
		// dropdown.selectByVisibleText("Option 1");
		dropdown.selectByValue("2");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Dropdown));
		

	}

	public void draganddrop() {
		Actions a = new Actions(driver);
		a.dragAndDrop(Dropdown, Dropdown).build().perform();

	}

	public void alerthandling() {
		alertclick.click();
		Alert al = driver.switchTo().alert();
		al.accept();

	}

}
