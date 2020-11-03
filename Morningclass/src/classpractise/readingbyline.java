package classpractise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingbyline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("../Morningclass/test.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
			
		}
		

	}

}
