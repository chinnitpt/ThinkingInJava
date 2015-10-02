package innerclasses.exercise10;

import static net.mindview.util.Print.*;

interface A {
	public void a();
}

public class Exercise10 {
	public A getA(boolean b) {
		if (b) {
			class B implements A {

				String s="inner class implementing the interface";

				@Override
				public void a() {
					print(s);
				}
			}
			return new B();

		}
		return null;
	}

	public static void main(String[] args) {
		Exercise10 ex10 = new Exercise10();
		A a = ex10.getA(true);
		if(a != null){
			a.a();
		}
	}
}
