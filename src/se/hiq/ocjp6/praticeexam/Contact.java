package se.hiq.ocjp6.praticeexam;

public class Contact {
	private String name;
	private String city;
	String getName(){ return name; }
	void setName(String n){ name = n; }
	void setCity(String c) {
		if (c == null) throw new NullPointerException();
		city = c;
	}
	String getCity() { return city; }
}