package se.hiq.ocjp6.selftest6;

import java.io.*;

public class Writer2 {

	public static void main(String[] args) {
		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File("fileWriter2.txt"); // just and object
			
			FileWriter fw = new FileWriter(file); // create an actual file
			
			fw.write("howdy\nfolks\n");
			
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			
			size = fr.read(in);
			System.out.print(size + " ");
			
			for (char c : in) 
				System.out.print(c);
			
			fr.close();
		}catch(IOException e) {}
	}

}
