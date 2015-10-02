package innerclasses.exercise7;

import static net.mindview.util.Print.*;

class A {
	private String str = "Hello World";
	private int no = 78;

	class B {
		public B() {

		}

		public void modifyA() {
			str = "Inner Class";
			no = 78 * 2;
			outerCallFieldValues();
		}
	}

	public void outerCallFieldValues() {
		print(str);
		print(no);
	}

	public B getB() {
		return new B();
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		A a = new A();
		a.outerCallFieldValues();
		A.B b = a.getB();
		b.modifyA();
		a.outerCallFieldValues();

	}

}
