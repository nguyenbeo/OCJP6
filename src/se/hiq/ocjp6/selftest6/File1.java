package se.hiq.ocjp6.selftest6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File1 {

	public static void main(String[] args) {
		try {
			File file = new File("foo.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Testing ...");
			pw.flush();
			pw.close();
			
			System.out.println("File exist: " + file.getAbsolutePath());
		} catch (IOException e) {
			//
		}
	}

}
