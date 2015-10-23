package exceptions;

public class Exercise3 {
	public static void main(String[] args) {
		Integer[] array = new Integer[10];
		try {
			Integer j = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
