package se.hiq.ocjp6.praticeexam;
import java.util.*;

public class Vinegar {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<Integer>();
		do1(mySet, "0"); do1(mySet, "0");
		do2(mySet, "0"); do2(mySet, "0");
	}
	
	public static void do1(Set s, String st) {
		//s.add(st);
		s.add(Integer.parseInt(st));
	}
	
	public static void do2(Set<Integer> s, String st) {
		//s.add(st);
		s.add(Integer.parseInt(st));
	}
}