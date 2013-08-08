/**
 * Program that includes and calls the storage( ) method defined as a code fragment in 
 * this chapter.
 * 
 */
package EveryThingIsAnObject;

/**
 * @author Sukumar Vaddi
 * 
 */
class Exercise6 {
	int storage(String s) {
		return s.length() * 2;
	}

	public static void main(String[] args) {
		String s = new String("A Random String");
		Exercise6 ex6 = new Exercise6();
		ex6.storage(s);
	}
}
