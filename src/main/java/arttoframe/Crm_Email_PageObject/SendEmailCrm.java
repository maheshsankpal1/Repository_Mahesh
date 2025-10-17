package arttoframe.Crm_Email_PageObject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendEmailCrm {
	public void sendEmail() throws EmailException {
		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("F:\\\\Test\\\\TestImage.jpg");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Test attachment Picture");
		attachment.setName("TestImage.jpg");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("mahesh.sankpal.243@solacetechnologies.co.in", "AEjHL4M303dwUj5O"));
		email.setSSLOnConnect(true);
		email.setFrom("mahesh.sankpal.243@solacetechnologies.co.in");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail for today");
		email.addTo("crmtesting@arttoframes.com");

		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();

	}

}
