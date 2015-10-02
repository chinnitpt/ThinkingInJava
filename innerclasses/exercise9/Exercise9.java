package innerclasses.exercise9;

import static net.mindview.util.Print.*;

interface A {
	public void a();
}

public class Exercise9 {
	public A getA(String str) {
		class B implements A {
			String s;
			B(String str){
				s = str;
			}
			@Override
			public void a() {
				print(s);
			}
		}

		return new B(str);
	}

	public static void main(String[] args) {
		Exercise9 ex9 = new Exercise9();
		A a = ex9.getA("Hello World");
		a.a();
	}
}
