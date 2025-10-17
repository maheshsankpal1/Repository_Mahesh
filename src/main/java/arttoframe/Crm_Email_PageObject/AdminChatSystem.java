package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminChatSystem {
	private WebDriver driver;
	
	
	
	// Locating
    @FindBy(xpath  = "(//h3[@class='chats-item-title'])[1]")
    private WebElement ChatId;
    
    @FindBy(id  = "Pending_chats")
    private WebElement PendingChat;
    
    @FindBy(xpath  = "(//div[@class='emojionearea-editor'])[1]")
    private WebElement TypeAMessage;
    
    @FindBy(id  = "submit-button")
    private WebElement SendButton;
    
    @FindBy(xpath  = "(//button[@class='common-button'])[2]")
    private WebElement ClickAttachment;
    
    @FindBy(xpath  = "")
    private WebElement ClickEmoji;
    
    @FindBy(xpath  = "(//img[@class='emojioneemoji'])[12]")
    private WebElement SmileEmoji;
    
    @FindBy(xpath  = "(//img[@class='emojioneemoji'])[20]")
    private WebElement SmileEmoji2;
    
    @FindBy(id = "quick-button")
    private WebElement Reply;
    
    @FindBy(xpath = "(//a[@class='my_reply_channel'])[1]")
    private WebElement MyReply;
    
    @FindBy(xpath = "(//a[@class='my_reply_channel'])[1]")
    private WebElement SendMyReply;
    
    
   
    
 // Constructor
    public AdminChatSystem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
 
    
    
    public boolean SelectChat() throws InterruptedException, AWTException {
    	try {
    	PendingChat.click();
    	Thread.sleep(5000);  	
    	ChatId.click();
    	Thread.sleep(2000);  	
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	  System.out.println("chat from admin side started successfully");
    	  return true;
 	}
	catch(Exception e) {
          System.out.println("Error occured while start chat from admin side: " + e.getMessage());
          return false;

    	}
    }
    	
    public boolean EnterAdminTestMessage() {
    	try {
     	  	 	
    	TypeAMessage.sendKeys("This is a test message");	
    	SendButton.click();
    	System.out.println("Test message send successfully from admin side");
    	return true;
 	}
	catch(Exception e) {
          System.out.println("Test message not send from admin side: " + e.getMessage());
          return false;

    	}
    }
    
    public boolean EnterAdminTestPhone() throws InterruptedException {
    	try {   	   
    	TypeAMessage.sendKeys("9900990099");   	
    	SendButton.click();
    	System.out.println("Test phone no. send successfully from admin side");
    	return true;
 	}
	catch(Exception e) {
          System.out.println("Test phone no. not send from admin side:: " + e.getMessage());
          return false;

    	}
    }
    
    public boolean EnterAdminTestLink() throws InterruptedException {
    	try {
    	 	
    	TypeAMessage.sendKeys("https://www.arttoframe.com/login.php");    	
    	SendButton.click();
    	System.out.println("Test URL send successfully from admin side");
    	return true;
 	}
	catch(Exception e) {
          System.out.println("Test URL not send from admin side: " + e.getMessage());
          return false;

    	}
    }
    
    public boolean SendAttachment() throws InterruptedException, AWTException {
    	try {
    	Thread.sleep(2000);  
    	ClickAttachment.click();
    	Thread.sleep(2000);  
    	Robot rb = new Robot();
//    	//out path to the file in clipboard
    	StringSelection ss = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\Test.jpg");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	//CTRL v
    	rb.keyPress(KeyEvent.VK_CONTROL);
    	rb.keyPress(KeyEvent.VK_V);
    	Thread.sleep(2000);
   	
    	rb.keyRelease(KeyEvent.VK_CONTROL);
    	rb.keyRelease(KeyEvent.VK_V);
    	Thread.sleep(2000);
    	
    	rb.keyPress(KeyEvent.VK_ENTER);
    	rb.keyRelease(KeyEvent.VK_ENTER);
    	
    	
    	Thread.sleep(10000);
    	System.out.println("Test attachment send successfully from admin side");
    	return true;
 	}
	catch(Exception e) {
          System.out.println("Test attachment not send from admin side: " + e.getMessage());
          return false;

    	}
    	
    }
    
    public boolean EnterAdminEmoji() {
    	try {
    	ClickEmoji.click();	
    	SmileEmoji.click();
    	SendButton.click();
    	System.out.println("Test emoji send successfully from admin side");
    	return true;
 	}
	catch(Exception e) {
          System.out.println("Test emoji not send from admin side: " + e.getMessage());
          return false;

    	}
    }
  	 public boolean AdminReply() throws InterruptedException {
  		try {
    	Thread.sleep(2000);
    	Reply.click();
    	Thread.sleep(2000);
    	MyReply.click();
    	SendButton.click();
    	System.out.println("Test reply send successfully from admin side");
    	return true;
  	}
 	catch(Exception e) {
	          System.out.println("Test reply not send from admin side: " + e.getMessage());
	          return false;

	    	}
  	 }
     	
}
