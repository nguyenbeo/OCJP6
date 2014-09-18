package se.hiq.ocjp6.praticeexam;

public class Fellowship {
	public static void main(String[] args){
		int h0 = Numinor.Members.HOBBITS.getHeight();
	}
}

class Numinor {
	enum Members {
		HOBBITS(48), ELVES(74), DWARVES(50);
		int height;
		
		Members (int h) { height = h; }
		
		int getHeight() { return height; }
	}
}