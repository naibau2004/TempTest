package homework;

public class Ex2 
{
	public static String[] getArray ()					//ミよ猭钡ノよ猭τぃミン(static)よ猭穦肚肈ヘ璶―皚
	{
		int numTemp = 0 ;								//ミ璸计竟ノㄓ癘魁Τ碭计穦才肈ヘ兵ン
		String [] arrayAll = new String [9999] ;		//ミ既ノ皚肈ヘ矗ㄑぇ  
		
		for ( int x = 1 ; x < 10000 ; x++ )				//ㄌ肈肈ヘ絛瞅1-9999ミ癹伴
		{
			if ( x < 10 )								//盢0001 - 0009 秈︽耞
			{
				String a = "0" ;						//絛瞅1-9盢计干0
				String b = "0" ;						//絛瞅1-9盢κ计干0
				String c = "0" ;						//絛瞅1-9盢计干0
				String d = Integer.toString( x ) ;		//盢x(1-9)锣﹃
				
				if ( a.equals(b) )						//絛瞅度1-9珿计﹚穦单κ计(0 = 0)珿1-9﹚才兵ン
				{
					arrayAll[x-1] = a + b + c + d  ;	//皚癬﹍0τx癬﹍1珿x-1τa+b+c+d = 0+0+0+[1-9]
					numTemp = numTemp + 1 ;				//–才掸计玥璸计竟碞1
				}
				
			}else if ( ( x >= 10 ) && ( x < 100 ) )		//ㄓ盢0010 - 0099 秈︽耞
			{
				String tempX = Integer.toString( x ) ;	//盢x(10-99)锣﹃
				String a = "0" ;						//絛瞅10-99盢计干0
				String b = "0" ;						//絛瞅10-99盢κ计干0
				String c = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				String d = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				
				if ( a.equals(b) )						//絛瞅度10-99珿计﹚穦单κ计(0 = 0)珿10-99﹚才兵ン
				{
					arrayAll[x-1] = a + b + c + d  ;	//皚癬﹍0τx癬﹍1珿x-1τa+b+c+d = 0+0+[1-9]+[0-9]
					numTemp = numTemp + 1 ;				//–才掸计玥璸计竟碞1
				}
						
			}else if ( ( x >= 100 ) && ( x < 1000 ) )	//ㄓ盢0100 - 0999 秈︽耞
			{
				String tempX = Integer.toString( x ) ;	//盢x(100-999)锣﹃	
				String a = "0" ;						//絛瞅100-999盢计干0
				String b = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
				String c = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				String d = tempX.substring(2,3) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				
				//絛瞅100-999珿计(0)﹚ぃ单κ计(程ぶ1)盢ㄤ緇秈︽耞
				if ( a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
				{
					arrayAll[x-1] = a + b + c + d  ;	//皚癬﹍0τx癬﹍1珿x-1τa+b+c+d = 0+[1-9]+[0-9]+[0-9]
					numTemp = numTemp + 1 ;				//–才掸计玥璸计竟碞1
				}
				
			}else if ( ( x >= 1000 ) )					//程盢1000 - 9999 秈︽耞
			{
				String tempX = Integer.toString( x ) ;	//盢x(1000-9999)锣﹃		
				String a = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				String b = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
				String c = tempX.substring(2,3) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				String d = tempX.substring(3,4) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
				
				//盢┮Τ逼舱秈︽耞
				if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
				{
					arrayAll[x-1] = a + b + c + d  ;	//皚癬﹍0τx癬﹍1珿x-1τa+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
					numTemp = numTemp + 1 ;				//–才掸计玥璸计竟碞1	
				}	
			}
		}
		
		String [] arrayFilter = new String [numTemp] ;	//ミ程沧璶眔皚(arrayFilter)皚玡璸计竟仓
		int numTemp2 = 0 ;								//ミ非称仓跑计
		
		for ( String item : arrayAll )					//盢玡9999皚ず甧
		{
			if ( ! ( item == null ) )					//耞ず甧琌(才璶―)
			{
				arrayFilter[numTemp2] = item ;			//盢ず甧峨穝皚
				numTemp2 = numTemp2 + 1 ;				//–糤皚ま璶1
			}
		}
		
		return arrayFilter ;							//盢程沧挡狦肚

}

	public static void main ( String [] args )
	{
		if ( ! (args.length == 3) ) 
		{
			System.out.println ( "叫块ま计" ) ;
			System.exit(0) ;
		}
		
		System.out.println ( "⊿Τタ盽挡" ) ;
	}
}