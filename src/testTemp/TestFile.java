package testTemp;

import java.io.File;
import java.io.IOException;

public class TestFile {
	
	public static void main ( String [] args ){
		
		String fileName = "123.log";
		
		//建立一個File物件，參數為存取檔案的路徑+名稱
		File f = new File ("C:\\Java-Test\\" + fileName ) ;
		
		//嚐試建立File,建立成功會回傳成功，檔案已存在或無建立則回傳false
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f.exists());				//測試是否存在
		System.out.println(f.getParent());			//取得檔案路徑
		System.out.println(f.getName());			//取得檔名
		System.out.println(f.getPath());			//取得完整路徑
		System.out.println(f.length());				//取得檔案大小
		System.out.println (f.canRead()) ;			//測試讀取
		System.out.println(f.canWrite());			//測試寫入
		System.out.println(f.canExecute());			//測試執行
		System.out.println(f.delete());				//刪除，成功回傳true
	}

}
