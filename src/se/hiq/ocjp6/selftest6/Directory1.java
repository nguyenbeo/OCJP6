package se.hiq.ocjp6.selftest6;

import java.io.File;

public class Directory1 {

	public static void main(String[] args) {
		File existingDir = new File("existingDir");
		existingDir.mkdir();
		System.out.println(existingDir.isDirectory());
		
		File existingDirFile = new File(existingDir, "existingDirFile.txt");
		System.out.println(existingDirFile.isFile());
	}

}
