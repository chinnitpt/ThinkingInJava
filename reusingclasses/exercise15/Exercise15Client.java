package reusingclasses.exercise15;
import reusingclasses.Exercise15;
public class Exercise15Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise15 ex15 = new Exercise15();
		//ex15.callProtected();
		Exercise15Derived.main(args);
	}
}

class Exercise15Derived extends Exercise15{
	
	public static void main(String[] args){
		Exercise15Derived derived = new Exercise15Derived();
		derived.callProtected();
	}
	
}
