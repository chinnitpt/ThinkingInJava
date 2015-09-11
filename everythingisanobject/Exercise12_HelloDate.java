package everythingisanobject;

//: object/HelloDate.java
import java.util.*;

/**
 * The first Thinking in Java example program. Displays a string and today�s
 * date.
 * 
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class Exercise12_HelloDate {

	/**
	 * Entry point to class and application.
	 * 
	 * @param args array of string arguments
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it�s: ");
		System.out.println(new Date());
	}

}
