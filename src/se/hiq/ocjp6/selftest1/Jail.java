package se.hiq.ocjp6.selftest1;
public class Jail {
	private int x = 4;
	public static void main(String[] args) {
		int x = 6;
		new Jail().new Cell().slam();
	}
	class Cell {
		void slam () {System.out.println("throw away key: " + x); }
	}
}
