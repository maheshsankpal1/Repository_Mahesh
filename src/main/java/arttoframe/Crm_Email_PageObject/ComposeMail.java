package arttoframe.Crm_Email_PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ComposeMail {
	private static WebDriver driver;


    // Locating
    @FindBy(id  = "button_compose_mail")
    private WebElement composeButton;
   
    @FindBy(id = "compose_to_emails_auto")
    WebElement toField;

	@FindBy(id = "compose_cc_emails_auto")
	WebElement ccField;

	@FindBy(id = "compose_bcc_emails_auto")
	WebElement bccField;

	@FindBy(id = "compose_gmail_setting_details")
	WebElement fromField;

	@FindBy(id = "form_email_subject_auto")
	WebElement subjectField;

	@FindBy(xpath = "//div[@id='compose_email_auto_testng']//div[@role='textbox']")
	WebElement messageField;
	
	@FindBy(xpath  = "(//input[@id='inputGroupFileCompose01'])[1]")
	private WebElement chooseFile;

	@FindBy(id  = "compose_send_mail_auto")
	WebElement sendField;
	

    // Constructor
    public ComposeMail(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    
    public void clickHiddenButton(String buttonId) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('" + buttonId + "').click();");
    }
         
    public boolean toFieldEnter() {
    	try {
   	    toField.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");
   	    System.out.println("Compose mail popup to field email entered successfully");
   	    return true;
    	}
    	catch(Exception e) {
            System.out.println("Unable to enter to field email: " + e.getMessage());
            return false;

    	}
    }
    public boolean ccFieldEnter() {	
    	 try {
    	 ccField.sendKeys("nigar.sayyed@solacetechnologies.co.in ");
    	 System.out.println("Compose mail popup cc field email entered successfully");
    	 return true;
    	 }
    	 catch(Exception e) {
    	     System.out.println("Unable to enter cc field email on on compose mail popup: " + e.getMessage());
    	     return false;
    	 }
    }
    
   	   
    public boolean bccFieldEnter() {
    	 try {
    	bccField.sendKeys("tejashree.pawar@solacetechnologies.co.in " );
    	System.out.println("Compose mail popup bcc field email entered successfully");
    	return true;
    	 }
    	 catch(Exception e) {
	          System.out.println("Unable to enter bcc field on compose mail popup:" + e.getMessage());
	          return false;

	    	}
    }
    
 // Select value from dropdown
 	public static boolean selectColorDropdown(String dropdownLocator, String value) {
 		 try {
 		WebElement dropdownElement = driver.findElement(By.xpath("(//select[@id='compose_gmail_setting_details'])[1]"));
 		Select dropdown = new Select(dropdownElement);
 		dropdown.selectByVisibleText(value);
 		 System.out.println("Dropdown element not found with");
 		return true;
 		} catch (Exception e) {
 	        System.out.println("Dropdown element not found with locator: " + dropdownLocator);
 	        return false;
 	    }
 	}
 	
 	
    public boolean subjectFieldEnter() {
   	     try {
    	subjectField.sendKeys("test");
    	System.out.println("Compose mail popup subject entered successfully");
    	return true;
   	  }
   	  catch(Exception e) {
          System.out.println("Unable to enter subject on compose mail popup: " + e.getMessage());
          return false;

  	}
    }
    public boolean messageFieldEnter() {
    	  try {
    	messageField.sendKeys("test");
    	System.out.println("Compose mail popup message entered successfully");
    	return true;
    	  }
       	  catch(Exception e) {
       	  System.out.println("Unable to enter to message on compose mail popup: " + e.getMessage());
       	 return false;

      	}
    	  
    }  
    
    
      public boolean attachFile(String absoluteFilePath) {
    	    	try {
    	    	chooseFile.sendKeys(absoluteFilePath);
    	        System.out.println("Attachment send successfully");	
    	        return true;
    	    }catch (Exception e) {
    			System.out.println("Error occurred while sending test attachment");	
    			return false;
    	    
    	    }	  
    	
    }
    public boolean sendEmail() {
    	  try {
    	sendField.click();	  
    	System.out.println("Compose mail popup send button clicked successfully");
    	return true;
  
    	  }
    	  catch(Exception e) {
          System.out.println("unable to click send mail button on compose mail popup: " + e.getMessage());
          return false;

      	}
   	
    	
    }
}

	

