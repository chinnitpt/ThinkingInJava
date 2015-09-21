package reusingclasses;
import static net.mindview.util.Print.*;

class BaseClass {
	BaseClass(int i){
		print("Base Class state is Initialized:"+ i);
	}
}

public class Exercise9 extends BaseClass{

	Exercise9(){
		super(0);
		print("Default constructor in extended class called");
	}
	Exercise9(int j){
		super(j);
		print("Non default constructor in extended class called");
	}
	public static void main(String[] args) {
		new Exercise9();
		new Exercise9(5);

	}

}
