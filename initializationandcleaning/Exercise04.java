package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise04 {
	
	Exercise04(){
		print("Default Constructor");
	}
	Exercise04(String value){
		
		print(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise04();
		new Exercise04("Over loaded Constructor");
	}

}
