package se.hiq.ocjp6.selftest6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		System.out.println("Pattern is " + m.pattern());
		
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}

}
