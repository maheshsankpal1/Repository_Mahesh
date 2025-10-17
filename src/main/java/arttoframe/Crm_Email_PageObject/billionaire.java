package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.WebDriver;

public class billionaire {
    private WebDriver driver;

    // Constructor
    public billionaire(WebDriver driver) {
        this.driver = driver;
    }

    // Open a URL
    public void openUrl(String url) {
        driver.get("https://www.billionaire.com/in/home");
    }

    // You can add more page actions here
}


