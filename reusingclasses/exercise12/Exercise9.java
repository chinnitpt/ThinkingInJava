package reusingclasses.exercise12;

import static net.mindview.util.Print.print;


class BaseClass {
	int j;
	BaseClass(int i){
		j=i;
		print("Base Class state is Initialized:"+ i);
	}
	public void dispose()
	{
		j = 0;
	}
}

public class Exercise9 extends BaseClass{

	Exercise9(){
		super(9);
		print("Default constructor in extended class called");
	}
	Exercise9(int j){
		super(j);
		print("Non default constructor in extended class called");
	}
	
	public void dispose(){
		super.dispose();
	}
	
	public static void main(String[] args) {
		Exercise9 ex9_1 = null;
		Exercise9 ex9_2 = null;
		try{
			 ex9_1 = new Exercise9();
			 ex9_2 = new Exercise9(5);
		}
		finally{
			ex9_1.dispose();
			ex9_2.dispose();
		}

	}

}
