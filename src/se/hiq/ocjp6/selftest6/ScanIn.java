package se.hiq.ocjp6.selftest6;

import java.util.Scanner;

public class ScanIn {

	public static void main(String[] args) {
		System.out.print("input: ");
		System.out.flush();
		
		try {
			Scanner s = new Scanner(System.in);
			String token;
			do {
				token = s.findInLine(args[0]);
				System.out.println("found " + token);
			}while (token != null);
		}catch (Exception e) { System.out.println("scan exc"); }
	}

}
