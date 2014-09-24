package se.hiq.ocjp6.selftest6;
import java.util.regex.*;

class RegexSmall {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abaaaba");
		
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
	}
}