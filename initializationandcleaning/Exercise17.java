package initializationandcleaning;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Random;
public class Exercise17 {
	String str;
	Exercise17(String value){
		print(value);
	}
	
	public static void main(String[] args){
		Random rand = new Random(47);
		Exercise17[] ex17Array = new Exercise17[rand.nextInt(20)];
		print(Arrays.toString(ex17Array));
	}
}
