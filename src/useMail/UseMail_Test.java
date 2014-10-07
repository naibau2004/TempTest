package useMail;

import java.util.ArrayList ;

public class UseMail_Test 
{
	public static void main ( String [] args )
	{
		UseMail a = new UseMail_SMTP () ;
		ArrayList<String> toList = new ArrayList<String> () ;
		ArrayList<String> ccList = new ArrayList<String> () ;
		ArrayList<String> bccList = new ArrayList<String> () ;
		ArrayList<String> mailText = new ArrayList<String> () ;
		ArrayList<String> fdsList = new ArrayList<String> () ;
		
		
		a.setMailServer("172.16.200.27");
		a.setFrom("chichun_yu@syscom.com.tw") ;
		
		toList.add( "naibau2004@gmail.com" ) ;
		a.setTo( toList ) ;
		
		ccList.add( "chichun_yu@syscom.com.tw" ) ;
		a.setCC( ccList ) ;
		
		bccList.add("naibau2004@hotmail.com" ) ;
		a.setBCC( bccList ) ;
		
		a.setSubJect( "This is the Test for Java OO" ) ;
		
		mailText.add( "Test 測試 测试 テスト のテスト 実験 테스트 !@#$%^&*()_+" ) ;
		mailText.add( "象徵性的第二行" ) ;
		a.setMailText( mailText ) ;	
		a.sendMail_SMTP();
		
	}

}
