package useMail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class UseMail_Interface_SMTP implements UseMail_Interface
{
	@Override
	public void sendMail() 
	{
		UseMail mail = new UseMail() ;
		Properties props = System.getProperties() ;
		props.put("mail.smtp.host", mail.getMailServer() ) ;
		Session mailSession = Session.getDefaultInstance( props , null ) ;
		Message MailMessage = new MimeMessage (mailSession) ;
		
		try
		{
			MailMessage.setRecipients( Message.RecipientType.TO, InternetAddress.parse("")) ;
		
		}catch ( Exception e)
		{
			System.out.println ( e.getMessage() ) ;
		}
	}
}
