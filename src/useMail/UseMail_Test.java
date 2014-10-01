package useMail;

import java.util.ArrayList ;

public class UseMail_Test 
{
	public static void main ( String [] args )
	{
		UseMail a = new UseMail_SMTP () ;
		ArrayList<String> toList = new ArrayList () ;
		ArrayList<String> mailText = new ArrayList () ;
		
		a.setMailServer("172.16.200.27");
		a.setFrom("chichun_yu@syscom.com.tw") ;
		
		toList.add( "naibau2004@gmail.com" ) ;
		toList.add( "chichun_yu@syscom.com.tw" ) ;
		a.setTo( toList ) ;
		
		a.setSubJect("This is the Test for Java OO" ) ;
		
		mailText.add("Test 測試 测试 テスト のテスト 実験 테스트 !@#$%^&*()_+") ;
		mailText.add("象徵性的第二行") ;
		a.setMailText( mailText ) ;
		
		a.sendMail_SMTP();
		
	}

}
