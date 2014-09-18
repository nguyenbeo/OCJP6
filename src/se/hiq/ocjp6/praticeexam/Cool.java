package se.hiq.ocjp6.praticeexam;

class SuperCool {
	static String os = "";
	void doStuff() { os += "super "; }
}

public class Cool extends SuperCool {
	public static void main (String[] args){
		new Cool().go();
	}
	
	void go() {
		SuperCool s = new Cool();
		Cool c = (Cool)s;
		
		c.doStuff();
	}
	
	void doStuff() { os += "cool "; }
}