package se.hiq.ocjp6.praticeexam;

class Horse {
	String hands = "15";
}

class GaitedPony extends Horse {
	static String hands = "14";
	public static void main(String[] args) {
		String hands = "13.2";
		String result = new GaitedPony().getSize(hands);
		System.out.println(" " + result);
	}
	String getSize(String s) {
		System.out.print("hands: " + s);
		return hands;
	}
}