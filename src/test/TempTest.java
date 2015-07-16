package test;

import java.util.Calendar;
import java.util.Date;

/*
 *Last update :2015/07/02 PM 10:45
 *User Story：
 *  
 *
 */

public class TempTest {
	
	public static void main (String [] args ){
	
	    Calendar cal = Calendar.getInstance();
	    
	    System.out.println(cal.get(Calendar.YEAR));
	    System.out.println(cal.get(Calendar.MONTH) + 1);       //日期要加1
	    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	    
	    

	         
	}
}