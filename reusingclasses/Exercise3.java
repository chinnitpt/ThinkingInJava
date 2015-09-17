package reusingclasses;

import static net.mindview.util.Print.*;

class A {
	A() {
		print("A initialized");
	}
}

class B extends A {
	B() {
		print("B initialized");
	}
}

class C extends B {
	C() {
		print("C initialized");
	}
}

class D extends C {
	D() {
		print("D initialized");
	}

	public static D makeD() {
		return new D();
	}

	public static void main(String[] args) {
		D d = new D();
		D d2 = makeD();
	}
}

public class Exercise3 extends D {
	Exercise3() {
		print("Exercise3 initialized");
	}

	public static void main(String[] args) {
		Exercise3 e = new Exercise3();
		D.main(args);
	}
}
