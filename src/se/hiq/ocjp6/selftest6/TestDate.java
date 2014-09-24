package se.hiq.ocjp6.selftest6;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		
		d1.setTime(d1.getTime() + 3600000);
		System.out.println("new time " + d1.toString());
	}

}
