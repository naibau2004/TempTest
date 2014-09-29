package mail_Test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail_Test 
{
	public static void main(String[] args)
	{
		try
		{
//			設定傳送基本資訊
			String host = "172.16.200.27" ;
			String from = "chichun_yu@syscom.com.tw" ;
			String to = "chichun_yu@syscom.com.tw" ;

					
//			這行不曉得幹啥用的，這行連同下面二行為建立mail連線的標準程式碼
			Properties props = System.getProperties() ;
			
//			設定SMTP Server，前面的"mail.smtp.host"固定照抄，「host」是變數
			props.put("mail.smtp.host", host ) ;
			
//			取得與SMTP Server的連線，props使用「props.put」取得mail Server
			Session mailSession = Session.getDefaultInstance( props , null ) ;
			
//			把Session餵給Message(指定寄件mail Server，而Message用來建立信件)
			Message MailMessage = new MimeMessage (mailSession) ;
			
//			設定寄件者email
			MailMessage.setFrom( new InternetAddress(from) );
			
//			設定收件者email
			MailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to) ) ;
	
//			多個收件者mail
//			MailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse("chichun_yu@syscom.com.tw,naibau2004@gmail.com"));
			
			
//			設定郵件標題
			MailMessage.setSubject( "Test 測試 测试 テスト のテスト 実験 테스트 !@#$%^&*()_+" ) ;
			
//			設定郵件內文，只能存在一個
			MailMessage.setText ( "Test 測試 测试 テスト のテスト 実験 테스트 !@#$%^&*()_+" ); 
					
//			傳送
			Transport.send( MailMessage );		
			
//			成功後顯示傳送成功
			System.out.println ("Mail was sent successfully !\n" ) ;
			
		}catch ( Exception e)
		{
			System.out.println ( e.getMessage() ) ;
		}
	}

}
