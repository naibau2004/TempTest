package testHomework;

public class TestHash 
{
	public static String[] getArray ()					//�m��1����k�A����k�|�^�ǽm��1�n�D���}�C
	{
		int numTemp = 0 ;								//�إߤ@�ӭp�ƾ��A�ΨӰO���@���X�ӼƦr�|�ŦX�D�ر���
		String [] arrayAll = new String [9999] ;		//�إߤ@�ӼȦs�ΰ}�C�A�j�p���D�ش��Ѥ��j�p  
		
		for ( int x = 1 ; x < 10000 ; x++ )				//���D�D�ؽd��1-9999�إ߰j��
		{
			if ( x < 10 )								//�����N0001 - 0009 ���X�i��P�_
			{
				String a = "0" ;						//�]�d��1-9�A�N�d��Ƹ�0
				String b = "0" ;						//�]�d��1-9�A�N�ʦ�Ƹ�0
				String c = "0" ;						//�]�d��1-9�A�N�Q��Ƹ�0
				String d = Integer.toString( x ) ;		//�Nx(1-9)�ର�r��
				
				if ( a.equals(b) )						//�]�d��Ȭ�1-9�A�G�d��Ƥ@�w�|����ʦ��(0 = 0)�A�G1-9�@�w�ŦX����
				{
					arrayAll[x-1] = a + b + c + d  ;	//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = 0+0+0+[1-9]
					numTemp = numTemp + 1 ;				//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1
				}
				
			}else if ( ( x >= 10 ) && ( x < 100 ) )		//�A�ӱN0010 - 0099 ���X�i��P�_
			{
				String tempX = Integer.toString( x ) ;	//�Nx(10-99)�ର�r��
				String a = "0" ;						//�]�d��10-99�A�N�d��Ƹ�0
				String b = "0" ;						//�]�d��10-99�A�N�ʦ�Ƹ�0
				String c = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
				String d = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
				
				if ( a.equals(b) )						//�]�d��Ȭ�10-99�A�G�d��Ƥ@�w�|����ʦ��(0 = 0)�A�G10-99�@�w�ŦX����
				{
					arrayAll[x-1] = a + b + c + d  ;	//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = 0+0+[1-9]+[0-9]
					numTemp = numTemp + 1 ;				//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1
				}
						
			}else if ( ( x >= 100 ) && ( x < 1000 ) )	//�A�ӱN0100 - 0999 ���X�i��P�_
			{
				String tempX = Integer.toString( x ) ;	//�Nx(100-999)�ର�r��	
				String a = "0" ;						//�]�d��100-999�A�N�d��Ƹ�0
				String b = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
				String c = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
				String d = tempX.substring(2,3) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
				
				//�]���d��100-999�A�G�d���(0)�A�@�w������ʦ��(�̤֬�1)�A�N��l�i��i��P�_
				if ( a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
				{
					arrayAll[x-1] = a + b + c + d  ;	//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = 0+[1-9]+[0-9]+[0-9]
					numTemp = numTemp + 1 ;				//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1
				}
				
			}else if ( ( x >= 1000 ) )					//�̫�N1000 - 9999 ���X�i��P�_
			{
				String tempX = Integer.toString( x ) ;	//�Nx(1000-9999)�ର�r��		
				String a = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�d��ƪ��r��
				String b = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
				String c = tempX.substring(2,3) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
				String d = tempX.substring(3,4) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
				
				//�N�Ҧ��ƦC�զX�i��P�_
				if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
				{
					arrayAll[x-1] = a + b + c + d  ;	//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
					numTemp = numTemp + 1 ;				//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1	
				}	
			}
		}
		
		String [] arrayFilter = new String [numTemp] ;	//�إߤ@�ӳ̲׭n���o���}�C(arrayFilter)�A�}�C�j�p�����e�p�ƾ����֥[�j�p
		int numTemp2 = 0 ;								//�إߤ@�ӷǳƲ֥[���ܼ�
		
		for ( String item : arrayAll )					//�N���e9999�j�p���}�C���e���X
		{
			if ( ! ( item == null ) )					//�P�_���X�����e�O�_�t��(�ŦX�n�D)
			{
				arrayFilter[numTemp2] = item ;			//�N�Ȫ����e��J�s�}�C
				numTemp2 = numTemp2 + 1 ;				//�C�W�[�@�ӭȡA�}�C���ޭȭn�[1
			}
		}
		
		return arrayFilter ;							//�N�̲׵��G�^��

}

	public static String [] intChangeFourString ( int x )
	{
		if ( x < 10 )
		{
			String []  tempArray = new String [4] ;
			String a = "0" ;						//�]�d��1-9�A�N�d��Ƹ�0
			String b = "0" ;						//�]�d��1-9�A�N�ʦ�Ƹ�0
			String c = "0" ;						//�]�d��1-9�A�N�Q��Ƹ�0
			String d = Integer.toString( x ) ;		//�Nx(1-9)�ର�r��
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
			
		}else if ( (x >= 10) && (x <100) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//�Nx(10-99)�ର�r��
			String a = "0" ;						//�]�d��10-99�A�N�d��Ƹ�0
			String b = "0" ;						//�]�d��10-99�A�N�ʦ�Ƹ�0
			String c = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
		}else if ( (x >= 100) && (x < 100) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//�Nx(100-999)�ର�r��	
			String a = "0" ;						//�]�d��100-999�A�N�d��Ƹ�0
			String b = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String c = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(2,3) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = a ;
			tempArray[1] = b ;
			tempArray[2] = c ;
			tempArray[3] = d ;
			
			return tempArray ;
			
		}else if ( (x >= 1000) && ( x < 10000) )
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;	//�Nx(1000-9999)�ର�r��		
			String a = tempX.substring(0,1) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�d��ƪ��r��
			String b = tempX.substring(1,2) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String c = tempX.substring(2,3) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(3,4) ;		//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
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
	
	
	public static String[] newArray ()					//�Q�νm��1����k�A���o�m��1�ҨS�����ơA�|�^�Ǥ@�Ӱ}�C
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
			System.out.println ( "�п�J�T�ӰѼ�" ) ;
			System.exit(0) ;
			 
		}else if ( ! (args[0].length() == 4) )
		{
			System.out.println ( "�Ĥ@�ӰѼƽп�J�|���" ) ;
			System.exit(0) ;	
		}
		
		String a = args[0].substring(0,1) ;
		String b = args[0].substring(1,2) ;
		String c = args[0].substring(2,3) ;
		String d = args[0].substring(3,4) ;
		
		if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
		{
			System.out.println ( "�Ĥ@��ѼƤ��|�ӼƦr���঳�ۦP��" ) ;
			System.exit(0) ;
		}
		
		try
		{
			Integer.parseInt( args[1] ) ;	
			Integer.parseInt( args[2] ) ;
			
		}catch ( Exception e )
		{
			System.out.println ( "�ĤG�βĤT�Ѽƽп�J�Ʀr" ) ;
			System.exit(0) ;
		}
		
		if ( ! (args[1].length() == 1) || ! (args[2].length() == 1 ) )
		{
			System.out.println ( "�ĤG�βĤT�Ѽƽп�J1�쥿���" ) ;
			System.exit(0) ;
		}
		
		int tempX = Integer.parseInt( args[1] ) ;
		int tempY = Integer.parseInt( args[2] ) ;
		int total = tempX + tempY ; 
		
		if ( ! (total <=4) )
		{
			System.out.println ( "�ĤG�βĤT�ѼƬۥ[���ݤp��ε���4" ) ;
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