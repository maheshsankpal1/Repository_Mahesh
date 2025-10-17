package arttoframe.Crm_Email_PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportTicket {
	WebDriver driver;
	private JavascriptExecutor jsExecutor;

	public SupportTicket(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.jsExecutor = (JavascriptExecutor) driver;
	}
	
	@FindBy(id = "myIframe")
	private WebElement SupportIframe;
	
	@FindBy(xpath = "(//td[@class='sorting_1'])[4]")
	private WebElement TicketId;

	@FindBy(id = "crmtesting_inbox")
	private WebElement goToAccount;
	

	@FindBy(id = "pending_closed")
	private WebElement sendAndCLose;

	@FindBy(xpath = "(//div[@role='textbox'])[1]")
	private WebElement replayToMail;

	@FindBy(id = "inputGroupFile01")
	private WebElement fileInput;

	@FindBy(name = "btn_send_mail")
	private WebElement sendBtn;

	@FindBy(xpath = "(//label[@class='btn btn-outline-secondary'])[4]")
	private WebElement checkbox;

	@FindBy(id = "pending_closed")
	private WebElement sendClose;
	
	@FindBy(id = "inputGroupFile01")
	private WebElement chooseFiles;

	public void switchToYourIframe() {
		driver.switchTo().frame(SupportIframe);
	}
	
	public boolean goToAccount() {
		try {
		goToAccount.click();
		System.out.println("CRM TEST ACCOUNT selected successfully");
		return true;
		}catch (Exception e) {
			System.out.println("Error occurred while selecting CRM TEST ACCOUNT");	
			return false;
			
		}
	
	}
	
	 public void GoToReportPageTicket() throws InterruptedException {
		
       
	      String Id = TicketId.getText(); // Assuming the ID is represented as text on the page
	      String url = "https://www.arttoframe.com/admin/crm/single_ticket.php?gmail_setting_id=108&tkt_status=inbox_unread&tkt_id=" + Id;
	  	  driver.switchTo().newWindow(WindowType.TAB);
	   	Thread.sleep(4000);
	      driver.get(url);
	        
	    }

	public boolean openTestTicket() {
		try {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.arttoframe.com/admin/crm/single_ticket.php?gmail_setting_id=108&tkt_status=inbox_unread&tkt_id=713565&do_not_proceed=1");
		System.out.println("New ticktet selected sucessfully");	
		return true;
		}catch (Exception e) {
			System.out.println("Error occurred while selecting test new ticket");	
			return false;
		}
		
	}

	public boolean mailReplay(String message) {
		try {
		replayToMail.sendKeys(message);
		System.out.println("Test reply send successfully");
		return true;
		}catch (Exception e) {
			System.out.println("Error occurred while entering test message");	
			return false;
			
		}
	}
//
	public void scrollDown() {
		// Scroll down the web page using JavaScriptExecutor
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
	}


    public boolean attachFile(String absoluteFilePath) {
    	try {
        fileInput.sendKeys(absoluteFilePath);
        System.out.println("Attachment send successfully for new ticket");	
        return true;
    }catch (Exception e) {
		System.out.println("Error occurred while sending test attachment");	
		return false;
    }
    }

	public void button() {
		sendBtn.click();
		
	}


	public boolean selectCheckbox() {
		try {
		if (!checkbox.isSelected()) 
			checkbox.click();
		System.out.println("Ticket confirmation selected successfully");	
		
			return true;
		}catch (Exception e) {
			System.out.println("Error occurred while selecting confimation");	
			return false;
	}
	}
	public void sendClose() {
		sendAndCLose.click();
	}

}
