package h20141103_ex1;

public class Ex1
{
	public static String [] intChangeFourString ( int x )		//�إߤ@�Ӥ�k�A���Ʀr�ର4��Ʀr��
	{
		if ( x < 10 )											//��J���Ʀr���Ӧ��
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			String a = "0" ;									//�]�d��1-9�A�N�d��Ƹ�0
			String b = "0" ;									//�]�d��1-9�A�N�ʦ�Ƹ�0
			String c = "0" ;									//�]�d��1-9�A�N�Q��Ƹ�0
			String d = Integer.toString( x ) ;					//�Nx(1-9)�ର�r��
			
			tempArray[0] = a ;									//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = b ;									//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = c ;									//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = d ;									//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�ǭӦ�ƪ��}�C
			
			
		}else if ( (x >= 10) && (x <100) )						//��J���Ʀr���Q���
		{
			String []  tempArray = new String [4] ;
			
			String tempX = Integer.toString( x ) ;				//�Nx(10-99)�ର�r��
			String a = "0" ;									//�]�d��10-99�A�N�d��Ƹ�0
			String b = "0" ;									//�]�d��10-99�A�N�ʦ�Ƹ�0
			String c = tempX.substring(0,1) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(1,2) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = a ;									//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = b ;									//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = c ;									//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = d ;									//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�ǤQ��ƪ��}�C
			
		}else if ( (x >= 100) && (x < 1000) )					//��J���Ʀr���ʦ��
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			
			String tempX = Integer.toString( x ) ;				//�Nx(100-999)�ର�r��	
			String a = "0" ;									//�]�d��100-999�A�N�d��Ƹ�0
			String b = tempX.substring(0,1) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String c = tempX.substring(1,2) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(2,3) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = a ;									//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = b ;									//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = c ;									//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = d ;									//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�Ǧʦ�ƪ��}�C
			
		}else if ( (x >= 1000) && ( x < 10000) )				//��J���Ʀr���d���		
		{
			String []  tempArray = new String [4] ;				//�إߤ@�Ӱ}�C�A�Ψөӱ��d�B�ʡB�Q�B�Ӧ�ƪ��Ʀr
			
			String tempX = Integer.toString( x ) ;				//�Nx(1000-9999)�ର�r��		
			String a = tempX.substring(0,1) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�d��ƪ��r��
			String b = tempX.substring(1,2) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�ʦ�ƪ��r��
			String c = tempX.substring(2,3) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Q��ƪ��r��
			String d = tempX.substring(3,4) ;					//�o��ϥ�java�r�ꤺ�ت���k(substing)�A�ΨӨ��X�Ӧ�ƪ��r��
			
			tempArray[0] = a ;									//�ϥΰ}�C�ӱ��d��Ʀr��
			tempArray[1] = b ;									//�ϥΰ}�C�ӱ��ʦ�Ʀr��							
			tempArray[2] = c ;									//�ϥΰ}�C�ӱ����Ʀr��
			tempArray[3] = d ;									//�ϥΰ}�C�ӱ��Ӧ�Ʀr��
			
			return tempArray ;									//�^�Ǥd��ƪ��}�C
			
		}else
		{
			return null ;										//�����ŦX�N�^��null�A���C���|�������p
		}
	}
	
	public static String[] getArray ()							//�m��1����k�A����k�|�^�ǽm��1�n�D���}�C
	{
		int counter = 0 ;										//�إߤ@�ӭp�ƾ��A�ΨӰO���@���X�ӼƦr�|�ŦX�D�ر���
		String [] arrayAll = new String [9999] ;				//�إߤ@�ӼȦs�ΰ}�C�A�j�p���D�ش��Ѥ��j�p  
		
		for ( int x = 1 ; x < 10000 ; x++ )						//���D�D�ؽd��1-9999�إ߰j��
		{
			String [] temp = intChangeFourString(x) ;			//�Nx�ȵ���intChangeForString��k�A�������ͥ|��ƪ��}�C
			
			String a = temp[0] ;								//�N���ͪ��}�C[0](�d���)�A�����ܼ�a
			String b = temp[1] ;								//�N���ͪ��}�C[1](�ʦ��)�A�����ܼ�b
			String c = temp[2] ;								//�N���ͪ��}�C[2](�Q���)�A�����ܼ�c
			String d = temp[3] ;								//�N���ͪ��}�C[3](�Ӧ��)�A�����ܼ�d
			
			//�N�Ҧ��ƦC�զX�i��P�_
			if ( a.equals(b) || a.equals(c) || a.equals(d) || b.equals(c) || b.equals(d) || c.equals(d) )
			{
				arrayAll[x-1] = a + b + c + d  ;				//�}�C�_�l�Ȭ�0�A��x�_�l�Ȭ�1�A�Gx-1�A��a+b+c+d = [1-9]+[0-9]+[0-9]+[0-9]
				counter = counter + 1 ;							//�C�ŦX�@���Ʀr�A�h�p�ƾ��N�[1	
			}	
		}
		
		String [] arrayFilter = new String [counter] ;			//�إߤ@�ӳ̲׭n���o���}�C(arrayFilter)�A�}�C�j�p�����e�p�ƾ����֥[�j�p
		int counter2 = 0 ;										//�إߤ@�ӷǳƲ֥[���ܼ�
		
		for ( String item : arrayAll )							//�N���e9999�j�p���}�C���e���X
		{
			if ( ! ( item == null ) )							//�P�_���X�����e�O�_�t��(�ŦX�n�D)
			{
				arrayFilter[counter2] = item ;					//�N�Ȫ����e��J�s�}�C
				counter2 = counter2 + 1 ;						//�C�W�[�@�ӭȡA�}�C���ޭȭn�[1
			}
		}
		
		return arrayFilter ;									//�N�̲׵��G�^��

	}

	public static void main ( String [] args )
	{
		for ( String item : Ex1.getArray() )					//���ҳ̲׵��G���e
		{
			System.out.println ( item ) ;
		}
	}
	
}