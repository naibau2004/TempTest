package testTemp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	public static void main(String[] args) {
		String a = "c:" ;
		String b = "Java-Test" ;
		String c = "yyy.txt" ;
		
		Path test = Paths.get( a , b , c ) ;
		
		try {
			Files.createFile(test) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
