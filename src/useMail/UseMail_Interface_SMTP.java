package useMail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class UseMail_Interface_SMTP implements UseMail_Interface
{
	String toList = null ;
	String mailText = null  ;
	
	@Override
	public void sendMail() 
	{
//		下列為建立Mail傳送的session 
		Properties props = System.getProperties() ;
		props.put("mail.smtp.host", UseMail.mailServer ) ;
		Session mailSession = Session.getDefaultInstance( props , null ) ;
		Message MailMessage = new MimeMessage (mailSession) ;

		for ( String item : UseMail.to )
		{
			if ( toList == null )
			{
				toList = item ;
			}else
			{
				toList = toList + "," + item ;
			}
		}
		
		for ( String item : UseMail.mailText )
		{
			if ( mailText == null )
			{
				mailText = item ;
			}else
			{
				mailText = mailText + "\n" + item ;
			}
		}

		try
		{
			MailMessage.setFrom( new InternetAddress( UseMail.from )) ;
			MailMessage.setRecipients( Message.RecipientType.TO, InternetAddress.parse( toList )) ;	
			MailMessage.setSubject( UseMail.subJect ) ;
			MailMessage.setText ( mailText );
			Transport.send( MailMessage );
			System.out.println ("Mail was sent successfully !\n" ) ;
			
			
		}catch ( Exception e)
		{
			System.out.println ( e.getMessage() ) ;
		}
	}
}
