package testHomework;

public class TestHash 
{
	public static String[] getArray ()					//絤策1よ猭よ猭穦肚絤策1璶―皚
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

	public static String [] intChangeFourString ( int x )
	{
		if ( x < 10 )
		{
			String []  tempArray = new String [4] ;
			String a = "0" ;						//絛瞅1-9盢计干0
			String b = "0" ;						//絛瞅1-9盢κ计干0
			String c = "0" ;						//絛瞅1-9盢计干0
			String d = Integer.toString( x ) ;		//盢x(1-9)锣﹃
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
			
		}else if ( (x >= 10) && (x <100) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//盢x(10-99)锣﹃
			String a = "0" ;						//絛瞅10-99盢计干0
			String b = "0" ;						//絛瞅10-99盢κ计干0
			String c = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
		}else if ( (x >= 100) && (x < 100) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//盢x(100-999)锣﹃	
			String a = "0" ;						//絛瞅100-999盢计干0
			String b = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
			String c = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(2,3) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
		}else if ( (x >= 1000) && ( x < 10000) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//盢x(1000-9999)锣﹃		
			String a = tempX.substring(0,1) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String b = tempX.substring(1,2) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓκ计じ
			String c = tempX.substring(2,3) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			String d = tempX.substring(3,4) ;		//硂娩ㄏノjava﹃ずよ猭(substing)ノㄓ计じ
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
		}else
		{
			return null ;
		}
	}
	
	
	public static String[] newArray ()					//ノ絤策1よ猭眔絤策1┮⊿Τ计穦肚皚
	{
		String [] oldArray = TestHash.getArray() ;
		int newArraySize = 9999 - oldArray.length ;
		String [] newArray = new String [newArraySize] ;
		
		


		return null ;
	}
	
	public static void main ( String [] args )
	{
		TestHash.newArray() ;
	
		if ( ! (args.length == 3) ) 
		{
			System.out.println ( "叫块把计" ) ;
			System.exit(0) ;
			 
		}else if ( ! (args[0].length() == 4) )
		{
			System.out.println ( "材把计叫块计" ) ;
			System.exit(0) ;	
		}
		
		String a = args[0].substring(0,1) ;
		String b = args[0].substring(1,2) ;
		String c = args[0].substring(2,3) ;
		String d = args[0].substring(3,4) ;
		
		if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
		{
			System.out.println ( "材把计ぇ计ぃΤ计" ) ;
			System.exit(0) ;
		}
		
		try
		{
			Integer.parseInt( args[1] ) ;	
			Integer.parseInt( args[2] ) ;
			
		}catch ( Exception e )
		{
			System.out.println ( "材の材把计叫块计" ) ;
			System.exit(0) ;
		}
		
		if ( ! (args[1].length() == 1) || ! (args[2].length() == 1 ) )
		{
			System.out.println ( "材の材把计叫块1タ俱计" ) ;
			System.exit(0) ;
		}
		
		int tempX = Integer.parseInt( args[1] ) ;
		int tempY = Integer.parseInt( args[2] ) ;
		int total = tempX + tempY ; 
		
		if ( ! (total <=4) )
		{
			System.out.println ( "材の材把计ゲ惠┪单4" ) ;
			System.exit(0) ;
		}
		
		String [] sampleArray = TestHash.getArray() ;
		String userNum1 = args[0].substring(0,1) ;
		String userNum2 = args[0].substring(1,2) ;
		String userNum3 = args[0].substring(2,3) ;
		String userNum4 = args[0].substring(3,4) ;
		int userA = Integer.parseInt( args[1] ) ;
		int userB = Integer.parseInt( args[2] ) ;

		
		for ( String arrayNum : sampleArray )
		{
			String arrayNum1 = arrayNum.substring(0,1) ;
			String arrayNum2 = arrayNum.substring(1,2) ;
			String arrayNum3 = arrayNum.substring(2,3) ;
			String arrayNum4 = arrayNum.substring(3,4) ;		
			int counterA = 0 ;
			int counterB = 0 ;
			
			if ( userNum1.equals(arrayNum1) )
				counterA = counterA + 1 ;

			if ( userNum2.equals(arrayNum2) )
				counterA = counterA + 1 ;
			
			if ( userNum3.equals(arrayNum3) )
				counterA = counterA + 1 ;
			
			if ( userNum4.equals(arrayNum4) )
				counterA = counterA + 1 ;
				
			if ( ! (userNum1.equals(arrayNum1)) )
			{
				if ( userNum1.equals(arrayNum2) || userNum1.equals(arrayNum3) || userNum1.equals(arrayNum4) )
				{
					counterB = counterB + 1 ;
				}	
			}
			
			if ( ! (userNum2.equals(arrayNum2)) )
			{
				if ( userNum2.equals(arrayNum1) || userNum2.equals(arrayNum3) || userNum2.equals(arrayNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (userNum3.equals(arrayNum3)) )
			{
				if ( userNum3.equals(arrayNum1) || userNum3.equals(arrayNum2) || userNum3.equals(arrayNum4) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( ! (userNum4.equals(arrayNum4)) )
			{
				if ( userNum4.equals(arrayNum1) || userNum4.equals(arrayNum2) || userNum4.equals(arrayNum3) )
				{
					counterB = counterB + 1 ;
				}
			}
			
			if ( (counterA >= userA) && (counterB >= userB) )
			{
				System.out.println ( arrayNum ) ;
			}	
		}
	}
}