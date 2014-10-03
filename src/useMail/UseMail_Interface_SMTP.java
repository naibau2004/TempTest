package useMail;

import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;


public class UseMail_Interface_SMTP implements UseMail_Interface
{
	
	String toList = null ;
	String mailText = null  ;
	String ccList = null ;
	String bccList = null ;
	Multipart mp = new MimeMultipart () ;
	
	@Override
	public void sendMail()
	{
//		下列為建立Mail傳送的session 
		Properties props = System.getProperties() ;
		props.put("mail.smtp.host", UseMail.mailServer ) ;
		Session mailSession = Session.getDefaultInstance( props , null ) ;
		Message MailMessage = new MimeMessage (mailSession) ;
		BodyPart [] mbpName = new BodyPart [ UseMail.fds.size() ] ;

		
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
		
		for ( String item : UseMail.cc )
		{
			if ( ccList == null )
			{
				ccList = item ;
			}else
			{
				ccList = ccList + "\n" + item ;
			}
		}
		
		for ( String item : UseMail.bcc )
		{
			if ( bccList == null )
			{
				bccList = item ;
			}else
			{
				bccList = bccList + "\n" + item ;
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

			for ( int i=0 ; i < UseMail.fds.size() ; i++ )
			{
				FileDataSource fds = new FileDataSource( UseMail.fds.get(i) ) ;
				mbpName[i].setDataHandler ( new DataHandler(fds) ) ;
				mbpName[i].setFileName( fds.getName() );
				mp.addBodyPart( mbpName[i] );

			}
		}catch ( Exception e )
		{
			System.out.println ( mbpName[0].getFileName() ) ;
			System.out.println ( e.getMessage() ) ;
		}

		try
		{
			MailMessage.setFrom( new InternetAddress( UseMail.from )) ;
			MailMessage.setRecipients( Message.RecipientType.TO, InternetAddress.parse( toList )) ;
			MailMessage.setRecipients( Message.RecipientType.CC, InternetAddress.parse( ccList )) ;
			MailMessage.setRecipients( Message.RecipientType.BCC, InternetAddress.parse( bccList )) ;
			MailMessage.setSubject( UseMail.subJect ) ;
			MailMessage.setText ( mailText );
			MailMessage.setContent(mp);
			Transport.send( MailMessage );
			System.out.println ("Mail was sent successfully !\n" ) ;

			
		}catch ( Exception e)
		{
			System.out.println ( e.getMessage() ) ;
		}
	}
}
