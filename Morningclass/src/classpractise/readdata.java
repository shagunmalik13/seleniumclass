package classpractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("../Morningclass/test.txt");
		
			
		
		
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1) {
			System.out.println((char)a);
			
		}

	}

}
