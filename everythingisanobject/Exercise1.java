/**
 * Create a class containing an int and a char that are not initialized, and print their values to verify that Java 
 * performs default initialization.
 */
package everythingisanobject;

/**
 * @author Sukumar Vaddi
 * 
 */
class Exercise1 {

	int x;
	char y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 ex1 = new Exercise1();
		System.out.println("Default value for an integer primitive type: "
				+ ex1.x);
		System.out.println("Default value for a char primitive type: " + ex1.y);
	}

}
