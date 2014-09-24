package se.hiq.ocjp6.selftest6;

import java.io.File;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) {
		// Not yet making an actual file => just creating a filename
		//File file = new File("fileWriter1.txt");
		
		try {
			boolean newFile = false;
			File file = new File("fileWriter1.txt"); // only an object
			
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile);
			System.out.println(file.exists()); // look again
			
			System.out.println(file.getAbsolutePath());
		}catch (IOException e) {}
	}

}
