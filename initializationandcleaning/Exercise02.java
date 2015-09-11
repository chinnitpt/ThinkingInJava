package initializationandcleaning;
import static net.mindview.util.Print.print;
public class Exercise02 {
	String initialized="initialized";
	Exercise02(){
		initialized = "Initialized in the constructor";
		print("Initialized:"+initialized);
	}
	public static void main(String[] args) {
		new Exercise02();
	}

}
