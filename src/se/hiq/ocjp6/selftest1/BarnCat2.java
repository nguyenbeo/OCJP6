package se.hiq.ocjp6.selftest1;

class Feline {}

public class BarnCat2 extends Feline {

	public static void main(String[] args) {
		Feline ff = new Feline();
		BarnCat2 b = new BarnCat2();
		
		if (b instanceof Feline)
			System.out.print("3");
	}

}
