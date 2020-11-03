package classpractise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readingdatawithlinenumber {
	
	public void readdata(int row) throws IOException {
		File f=new File("../Morningclass/test.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		
		for(int i=1;i<=row;i++) {
			line=br.readLine();
			if(i==row){
				System.out.println(line);
			}
			
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readingdatawithlinenumber r=new readingdatawithlinenumber();
		r.readdata(4);
		
		

	}

}
