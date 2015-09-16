package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise15 {
	String str;
	{
		str = "String1";
		print("Exercise15 initialized");
	}
	
	public static void main(String[] args) {
		print("Inside main()");
		new Exercise15();
	}

}
