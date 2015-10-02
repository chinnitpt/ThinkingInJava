package holdingyourobjects;

import java.util.*;

public class Exercise8 {
	public static void main(String[] args){
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i + 1));
		}
		Iterator<Gerbil> iter = gerbils.iterator();
		while(iter.hasNext()){
			iter.next().hop();
		}
	}
}
