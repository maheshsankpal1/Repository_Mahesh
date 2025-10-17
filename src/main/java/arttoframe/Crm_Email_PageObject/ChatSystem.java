package arttoframe.Crm_Email_PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ChatSystem {
	
	private WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	// Locating
    @FindBy(xpath  = "(//img[@class='img-responsive fun-img'])[1]")
    private WebElement chatPopup;
    
    @FindBy(xpath  = "(//img[@src='https://www.arttoframe.com/images/chat.webp'])[1]")
    private WebElement OnlineChat;
    
    @FindBy(id  = "user_name_new")
    private WebElement EnterUsername;
    
    @FindBy(id  = "user_email_new")
    private WebElement EnterUserEmail;
    
    @FindBy(id  = "start-chat")
    private WebElement StartChat;
    
    
    
   
    @FindBy(xpath  = "(//p[@class='boatSystemMessage1'])[1]")
    private WebElement PlacingAnOrder;
    
    @FindBy(id  = "bot_prodcut")
    private WebElement enterProductType;
    
    @FindBy(id  = "bot_name")
    private WebElement BotNameEnter;
    
    
    @FindBy(id  = "bot_email")
    private WebElement  BotEmailEnter;
    
    @FindBy(xpath  = "(//button[@class='btn_submit'])[1]")
    private WebElement  BotSubmit;
    
    
    @FindBy(xpath  = "(//button[@class='btn_place_order btn-primary'])[1]")
    private WebElement submitProductType;
    
    @FindBy(id  = "bot_name1")
    private WebElement enterName;
    
    @FindBy(id  = "bot_email1")
    private WebElement enterEmail;
    
    
    @FindBy(id  = "bot_comment")
    private WebElement enterComment;
    
    @FindBy(xpath  = "(//button[@class='btn_submit_close_window'])[1]")
    private WebElement submitDetails;
    
    @FindBy(id  = "live_chat_input_tbx")
    private WebElement enterMessage;
      
    @FindBy(id = "upload_camera_img")
	private WebElement clickUpload;
    
    @FindBy(xpath = "(//button[@class='btn upload-btn-wrapper_cf'])[1]")
   	private WebElement popupUpload;
    
    @FindBy(id = "btn-chat")
	private WebElement clickSubmit;
    
    @FindBy(xpath = "(//p[@class='boatSystemMessage2'])[1]")
	private WebElement clickTrackingAnOrder;
    
    @FindBy(id = "track_email")
	private WebElement enterTrackEmail;
    
    @FindBy(id = "btn-chat")
	private WebElement enterShippingZip;
    
    @FindBy(xpath = "(//button[@class='btn_track_order'])[1]")
	private WebElement tackingSubmit;
    
    @FindBy(xpath = "(//button[@id='track_order_id_btn'])[1]")
   	private WebElement orderSubmit;
    
    @FindBy(xpath = "(//p[@class='boatSystemMessage3'])[1]")
   	private WebElement issueEmailWithOrder;
    
    @FindBy(id = "issue_email")
   	private WebElement issueEmail;
    
    @FindBy(id = "issue_order")
   	private WebElement issueOrder;
    
    
    @FindBy(xpath = "(//button[@class='bot_issue_order'])[1]")
   	private WebElement submitIssuewithanorder;
    
    
    
 // Constructor
    public ChatSystem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
  
    public void goTologinPage() {
    	
		driver.get("https://www.arttoframe.com/login.php");
	}
    
    public void goToHomePage() {
		driver.get("https://www.arttoframe.com");
	}
    
    
    public void startChat()  {
    	
    	try {    
    	chatPopup.click();
    	System.out.println("Chat Popup opened succesfully");   	  	
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while Chat Popup : 1: " + e.getMessage());
	        
	         
	    	}
    	
    	
    
    	
    }	
    public boolean selectChatOption() {
        try {
            OnlineChat.click();
            System.out.println("Online Chat Option selected successfully");
            return true; // Return true if chat option selected successfully
        } catch (Exception e) {
            System.out.println("Error Occurred while selecting Online Chat Option: " + e.getMessage());
            return false; // Return false if an error occurred
        }
    }
    
    
    public boolean UserInformation() {
    	try {
	    Thread.sleep(2000);
    	EnterUsername.sendKeys("Mahesh Sankpal");
    	EnterUserEmail.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");
    	Thread.sleep(2000);
    	StartChat.click();
    	System.out.println("Chat created successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while creating chat: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    	
    }


	public boolean PlacingAnOrderForm() {	
    	try {
    	PlacingAnOrder.click();
    	enterProductType.sendKeys("regular");   	
    	submitProductType.click();
    	System.out.println("Product type entered sucesfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while entering product type  : 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    	
    	
    }
    
	public boolean GiveNameAndEmail() {	
    	try {
      	 Thread.sleep(2000);
    		BotNameEnter.sendKeys("Mahesh");
    		BotEmailEnter.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");
    		 Thread.sleep(2000);
    		BotSubmit.click();
    		
    	System.out.println("Name and Email entered for bot ");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while entering Name and Email for bot: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    	
    	
    }
    
    public boolean GiveDetails() {
    	try {
    	enterName.sendKeys("Mahesh");
    	enterEmail.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");
    	enterComment.sendKeys("Test");
    	submitDetails.click();
    	System.out.println("User Details sumbitted successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sumbitting details: 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
    	
    public boolean enterTestMessage() {   
    	try {
        enterMessage.clear();
    	enterMessage.sendKeys("This is test message from Mahesh");
    	clickSubmit.click();
    	System.out.println("Test message sent successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sending test message: 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
    	
    public boolean enterTestPhone() {  	
    	try {
    	enterMessage.clear();
    	enterMessage.sendKeys("9900990099");
    	clickSubmit.click();
    	System.out.println("Test phone sent successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sending test phone: 1: " + e.getMessage());
	          return false; // Return false if an error occurred


	    	}
    }
    public boolean enterTestLink() {  
    	try {
    	enterMessage.clear();
    	enterMessage.sendKeys("https://www.arttoframe.com/");
    	clickSubmit.click();
    	System.out.println("Test link sent successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sending test message: 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
    
    public boolean enterTrackingOrder() {  
    	try {       
    	clickTrackingAnOrder.click();  	
    	 Thread.sleep(2000);
    	
    	enterTrackEmail.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");    	
    	
    	enterShippingZip.sendKeys("90001");    
    	
    	tackingSubmit.click();
    	System.out.println("Tracking an order details sent successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sending Tracking an order details: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
    
    public boolean SelectOrder() {  
    	try {
        Thread.sleep(2000);
    	orderSubmit.click();
    	System.out.println("Order selected successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while selecting order: 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
    
    public boolean IssueOrder() {  
    	try {
    	issueEmailWithOrder.click();   
    	 Thread.sleep(2000);
    	 issueEmail.clear();
    	 issueEmail.sendKeys("mahesh.sankpal.243@solacetechnologies.co.in");
    	 issueOrder.clear();
    	 issueOrder.sendKeys("99506");
    	submitIssuewithanorder.click();
    	System.out.println("Issue with an order received details submited sucessfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while submitting Issue with an order received details: 1: " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    }
       
    public boolean Attachment() throws InterruptedException, AWTException {  
    	try {
    	
    	clickUpload.click(); 
        Thread.sleep(2000);
    	popupUpload.click();
    	Robot rb = new Robot();
    	Thread.sleep(2000);
    	//out path to the file in clipboard
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
    	
    	System.out.println("Attachment sent successfully");
    	 return true; // Return true if chat option selected successfully
    	}
    	catch(Exception e) {
	          System.out.println("Error Occured while sending attachment " + e.getMessage());
	          return false; // Return false if an error occurred

	    	}
    	
    	

    	}
    
    	
    }
    

    



