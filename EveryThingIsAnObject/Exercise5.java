/**
 * Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ) 
 * 
 */
package EveryThingIsAnObject;

/**
 * @author Sukumar Vaddi
 * 
 */
class Exercise5 {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		Exercise5 data = new Exercise5();
		data.i = 47;
		data.d = 1.1;
		data.b = false;

		System.out.println("int value is: " + data.i);
		System.out.println("double value is: " + data.d);
		System.out.println("boolean value is: " + data.b);

	}
}
