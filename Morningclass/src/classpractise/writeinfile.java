package classpractise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeinfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("../Morningclass/test.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.newLine();
		bw.write("fourth line");
		bw.newLine();
		bw.write("fifth line");
		bw.newLine();
		bw.write("sixth line");
		bw.close();

	}

}
