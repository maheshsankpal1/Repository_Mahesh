package arttoframe.Crm_Email_PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmLandinPlus {
	private WebDriver driver;

	public void CrmLandinPlus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id  = "button_compose_mail")
	private WebElement composeButton;
	

//	@FindBy(xpath = "(//ul)[27]")
//	WebElement To;

//	@FindBy(xpath = "(//ul)[28]")
//	WebElement Cc;
//
//	@FindBy(xpath = "(//ul)[29]")
//	WebElement Bcc;
//
//	@FindBy(xpath = "(//select[@id='compose_gmail_setting_details'])[1]")
//	WebElement From;
//
//	@FindBy(xpath = "(//input[@id='form_email_subject'])[1]")
//	WebElement Subject;
//
//	@FindBy(xpath = "(//div[@role='textbox'])[1]")
//	WebElement Message;
//
//	@FindBy(xpath = "(//input[@id='compose_send_mail'])[1]")
//	WebElement Submit;
	
	

	    public void clickBtn() {
		composeButton.click();
		
	}

//	public void ComposeEmail(String email, String emailcc, String emailBcc, String emailF, String s, String M) {
//		To.sendKeys(email);
//		Cc.sendKeys(emailcc);
//		Bcc.sendKeys(emailBcc);
//		From.sendKeys(emailF);
//		Subject.sendKeys(s);
//		Message.sendKeys(M);
//
//	}
//
//	public void ComposeSend() {
//		Submit.click();
//	}
	

}
