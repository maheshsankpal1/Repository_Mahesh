package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TicketPopup {
	private static  WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	private WebDriverWait wait;;
	
	
	@FindBy(xpath ="(//button[@id='button_create_ticket'])[1]")
	private WebElement ticketPopup;
	
	@FindBy(xpath ="(//select[@id='create_ticket_issue_type'])[1]")
	private WebElement IssueType;
	
	@FindBy(id  ="create_ticket_form_email_subject")
	private WebElement TicketDescription;
	
	@FindBy(id  ="create_ticket_video_desc")
	private WebElement VideoDescription;
	
	@FindBy(id  ="create_ticket_issue_url")
	private WebElement PageURL;
	
	@FindBy(xpath = "(//div[@role='textbox'])[1]")
	private WebElement TestMessage;
	
	@FindBy(id  ="create_ticket_send_mail")
	private WebElement SendTickectMail;
	
	@FindBy(id = "inputGroupFilecreate_ticket01")
	private WebElement fileInput;
	
	@FindBy(xpath = "(//input[@placeholder='Who should be notified of this issue:'])[1]")
	private WebElement notifyissue;
	
	@FindBy(id = "select2-create_ticket_who_notified-result-xzil-nigar.sayyed@solacetechnologies.co.in")
	private WebElement MailNigar;
	

	 public TicketPopup(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	
		public boolean SelectIssue( String value) throws InterruptedException {
			try {
			Thread.sleep(2000);
			ticketPopup.click();
			Select dropdown = new Select(IssueType);
			dropdown.selectByVisibleText(value);
			System.out.println("Listing Issue Type selected successfully from ticket popup\"");	
			 return true;
			}catch (Exception e) {
				System.out.println("Failed to Listing Issue Type from ticket popup");	
				return false;
		    }
		}
		
		public boolean TicketDescriptionEnter() {
			try {
			TicketDescription.sendKeys("Test Ticket Description");
			System.out.println("Ticket Description entered successfully from ticket popup");	
			 return true;
			}catch (Exception e) {
				System.out.println("Failed to send Ticket Description from ticket popup");	
				return false;
		    }
		}
		
		 public boolean NotifyIssueSelect() {
			 try {
			 notifyissue.click();
			 Thread.sleep(2000);
			 notifyissue.sendKeys(Keys.ARROW_DOWN);
			 Thread.sleep(2000);
			 notifyissue.sendKeys(Keys.ENTER);
			 System.out.println("Select notify admin");	
			  return true;
			 }catch (Exception e) {
					System.out.println("Failed to Select notify admin");	
					return false;
			    }
							
			}
		
		public boolean IssueVideoEnter() {
			try {
			VideoDescription.sendKeys("https://go.screenpal.com/watch/cZfUQLVMUlu");
			System.out.println("Video description entered successfully from ticket popup");	
			 return true;
		}catch (Exception e) {
						System.out.println("Failed to send Video description from ticket popup");	
						return false;
				    }
			
		}
		
		public boolean IssueURLEnter() {
			try {
			PageURL.sendKeys("https://www.arttoframe.com/custom_framing.php");
			System.out.println("Issue URL entered successfully from ticket popup");	
			 return true;
			}catch (Exception e) {
				System.out.println("Failed to enter issue URL for new ticket");	
				return false;
		    }
			
		}
		
		
		public boolean TestMessageEnter() {
			try {
			TestMessage.sendKeys("Test message");
			System.out.println("Test message entered successfully from ticket popup");	
			 return true;
			}catch (Exception e) {
				System.out.println("Failed to enter Test message from ticket popup");	
				return false;
		    }
			
		}
		
		public boolean TicketSend() {
			try {
			SendTickectMail.click();
			System.out.println("Send button clicked successfully from ticket popup");	
			 return true;
			}catch (Exception e) {
				System.out.println("Failed to click send button new ticket");	
				return false;
		    }
			
			
		}
		
		 public boolean attachFile(String absoluteFilePath) {
		    	try {
		        fileInput.sendKeys(absoluteFilePath);
		        System.out.println("Attachment send successfully from ticket popup");	
		        return true;
		    }catch (Exception e) {
				System.out.println("Failed to send attachment from ticket popup");	
				return false;
		    }
		    }
		 

		}
		

		
	
	


