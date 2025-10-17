package arttoframe.Crm_Email;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArttoframeTest {
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
	//	cap.setBrowserName("chrome");
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		cap.setPlatform(Platform.WIN11);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.143.76:4444").toURL(), cap);
		driver.get("https://www.arttoframe.com/");
	
	}

	

}
