package interfaces.exercise7;

import static net.mindview.util.Print.*;

class Mouse implements Rodent {
	public void a() {
		print("Mouse.a()");
	}

	public void b() {
		print("Mouse.b()");
	}

	public void c() {
		print("Mouse.c()");
	}
}

class Gerbil implements Rodent {
	public void a() {
		print("Gerbil.a()");
	}

	public void b() {
		print("Gerbil.b()");
	}

	public void c() {
		print("Gerbil.c()");
	}
}

class Hamster implements Rodent {
	public void a() {
		print("Hamster a()");
	}

	public void b() {
		print("Hamster b()");
	}

	public void c() {
		print("Hamster c()");
	}
}

public class RodentImpl {
	public static void callRodentMethods(Rodent r) {
		r.a();
		r.b();
		r.c();
	}

	public static void main(String[] args) {
		callRodentMethods(new Mouse());
		callRodentMethods(new Gerbil());
		callRodentMethods(new Hamster());
	}

}
