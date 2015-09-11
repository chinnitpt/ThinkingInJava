package everythingisanobject.exercise16;
import static net.mindview.util.Print.*;

/**
 * initialization/Overloading.java
 * Demonstration of both constructor
 * and ordinary method overloading.
 *
 */
class Tree {
	int height;

	/**
	 * Constructor for planting seeds
	 */
	Tree() {
		print("Planting a seedling");
		height = 0;
	}
	/**
	 * Constructing for planting a tree of some height
	 */
	Tree(int initialHeight) {
		height = initialHeight;
		print("Creating new Tree that is " + height + " feet tall");
	}
	/**
	 * Displays the height of the tree on the console
	 */
	void info() {
		print("Tree is " + height + " feet tall");
	}
	/**
	 * Displays the given height on the console
	 */
	void info(String s) {
		print(s + ": Tree is " + height + " feet tall");
	}
}
/**
 * This class repeatedly initializes the Tree class with both constructors
 * @author svaddi01
 *
 */
public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		// Overloaded constructor:
		new Tree();
	}
}
