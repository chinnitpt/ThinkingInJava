package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise08 {
	Exercise08(){
		firstMethod();
	}
	
	void firstMethod(){
		secondMethod("Calling the second method without \'this\'");
		this.secondMethod("Calling the second method with \'this\'");
	}
	void secondMethod(String s){
		print(s);
	}
	
	
	public static void main(String[] args) {
		new Exercise08();
	}

}
