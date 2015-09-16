package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise14 {
	
	static{
		str2= "String2";
	}
	static void printStrings(){
		print("str1:"+str1);
		print("str2:"+str2);
	}
	static String str1 = "String1";		
	static String str2 ;
	public static void main(String[] args) {
		Exercise14.printStrings();
	}

}
