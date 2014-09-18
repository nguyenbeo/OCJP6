package se.hiq.ocjp6.praticeexam;
import java.io.*;

public class Finder {
	public static void main(String[] args) {
		String[] files = new String[100];
		File dir = new File(args[0]);
		files = dir.list();
		System.out.println(files.length);
	}
}