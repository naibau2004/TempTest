package test;

/*
 *Last update :2015/06/23 02:43
 *User Story：
 */

public class TempTest {
	
	public static void main (String [] args ){
	
		
		StringBuffer sb1 = new StringBuffer("Hello ");    //建立一個含字串的StringBuffer物件
		
		StringBuffer sb2 = new StringBuffer();            //也可以建立一個空的StringBuffer物件
		
		sb1.append("World !") ;
		System.out.println(sb1);
		
		System.out.println(sb1.capacity());               //回傳StringBuffer的容量(不是字數)
		System.out.println(sb1.charAt(4));                //回傳第5個字元(0-4)
		System.out.println(sb1.delete(0,6));              //0-6(不包含6，所以是0-5，共6個字元)
		System.out.println(sb1.deleteCharAt(6));          //刪除第7個字元(0-6)
		System.out.println(sb1.insert(0, "Hello "));      //插入指定的索引位置
		System.out.println(sb1.replace(6, 11, "World!")); //6-11(不包含11，所以是6-10，共5個字元)
		
	}
}