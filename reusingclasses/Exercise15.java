package reusingclasses;
import static net.mindview.util.Print.*;
class Exercise15BaseClass{
	public Exercise15BaseClass(){
		print("Base Class constructor");
	}
	
	
	protected void callProtected(){
		print("Protected method called");
	}
}



public class Exercise15 extends Exercise15BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise15 ex15 = new Exercise15();
		ex15.callProtected();
		
	}

}
