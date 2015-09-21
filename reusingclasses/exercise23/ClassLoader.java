package reusingclasses.exercise23;

import static net.mindview.util.Print.*;

class Base1 {
	static int val = printInit("Base.val initialized");

	static int printInit(String s) {
		print(s);
		return 5;
	}

	Base1() {
		print("Base1 constructor called");
	}
}

class Extended extends Base1 {
	static int extendedVal = printInit("Extended.val initialized");

	Extended() {
		print("Extended constructor called");
	}
}

class StaticClass{
	static Base1 b = new Base1();
}

public class ClassLoader extends Extended {
	static int clv = printInit("ClassLoader.val initialized");

	ClassLoader() {
		print("ClassLoader constructor initialized");
	}

	public static void main(String[] args) {
		ClassLoader lc = new ClassLoader();
		new StaticClass();

	}
}