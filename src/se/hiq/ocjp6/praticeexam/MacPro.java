package se.hiq.ocjp6.praticeexam;
import java.io.*;

public class MacPro extends Laptop {
	public static void main(String[] args) {
		new MacPro().crunch();
	}
	
	void crunch() throws RuntimeException{}
}
class Laptop {
	void crunch() throws IOException {}
}