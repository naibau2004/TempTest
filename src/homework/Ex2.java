package homework;

public class Ex2 
{
	public static String[] getArray ()					//�إߤ@�Ӥ�k�A�������Τ�k�Ӥ��إߪ���(static)�A����k�|�^���D�حn�D���}�C
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

	public static void main ( String [] args )
	{
		if ( ! (args.length == 3) ) 
		{
			System.out.println ( "�п�J�T�Ӥ޼�" ) ;
			System.exit(0) ;
		}
		
		System.out.println ( "�S�����`����" ) ;
	}
}