package reusingclasses;

import static net.mindview.util.Print.*;

class Exercise13BaseClass {
	public void shout(Integer i) {
		print("Shouting Integer");
	}

	public void shout(Float f) {
		print("Shouting Float");
	}

	public String shout() {
		return "Shouting String";
	}

}

public class Exercise13 extends Exercise13BaseClass {

	public void shout(Boolean b){
		print("Shouting Boolean");
	}
	
	public static void main(String[] s){
		Exercise13 ex13 = new Exercise13();
		ex13.shout((int)5);
		ex13.shout((float)6);
		print(ex13.shout());
		ex13.shout(true);
	}
}
