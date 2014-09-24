package se.hiq.ocjp6.selftest6;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Locale1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 14);
		Date d2 = c.getTime();
		
		Locale locBR = new Locale("pt", "BR");
		Locale locSE = new Locale("da", "DK");
		Locale locIT = new Locale("it", "IT");
		
		System.out.println("def " + locBR.getDisplayCountry());
		System.out.println("def " + locBR.getDisplayCountry(locBR));
		
		System.out.println("def " + locSE.getDisplayCountry());
		System.out.println("def " + locSE.getDisplayCountry(locSE));
		System.out.println("def " + locSE.getDisplayCountry(locIT));
	}

}
