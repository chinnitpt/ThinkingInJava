package polymorphism.exercise10;

import static net.mindview.util.Print.*;

class Base {
	public void aMethod() {
		b();
	}

	public void b() {
		print("Base Class b()");
	}
}

class Extended extends Base {
	@Override
	public void b() {
		print("Extended class b()");
	}
}

public class Exercise10 {
	public static void main(String[] args) {
		Base baseclass = new Extended();
		baseclass.aMethod();
	}
}
