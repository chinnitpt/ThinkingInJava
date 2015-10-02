package holdingyourobjects;

import java.util.*;

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int no) {
		gerbilNumber = no;
	}

	public void hop() {
		System.out.println("Gerbil Number:" + gerbilNumber + " is hopping");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i + 1));
		}
		for(Gerbil gerbil:gerbils){
			gerbil.hop();
		}
	}

}
