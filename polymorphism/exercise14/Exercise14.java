package polymorphism.exercise14;

import static net.mindview.util.Print.print;

class MemberClassA {
	MemberClassA(String s) {
		print("MemberClass" + s + " Initialized");
	}
}

class MemberClassB {
	MemberClassB(String s) {
		print("MemberClass" + s + " Initialized");
	}
}

class Shared {

	private int refCount = 0;
	private static int counter = 0;
	private final int id = counter++;

	public void addRef() {
		refCount++;
	}

	public int getRefCount() {
		return refCount;
	}

	public String toString() {
		return "SharedObject:" + id;
	}

}

class Rodent {
	private MemberClassA a = new MemberClassA("A Rodent");
	private MemberClassB b = new MemberClassB("B Rodent");
	private Shared s;

	public Rodent(Shared s) {
		this.s = s;
		this.s.addRef();
		print("Rodent Initialized()");
	}

	public void a() {
		print("Rodent a()");
	}

	public void b() {
		print("Rodent b()");
	}

	public void c() {
		print("Rodent c()");
	}
}

class Mouse extends Rodent {
	private MemberClassA a = new MemberClassA("A Mouse");
	private MemberClassB b = new MemberClassB("B Mouse");

	public Mouse(Shared s) {
		super(s);
		print("Mouse initialized");
	}

	public void a() {
		print("Mouse a()");
	}

	public void b() {
		print("Mouse b()");
	}

	public void c() {
		print("Mouse c()");
	}
}

class Gerbil extends Rodent {
	private MemberClassA a = new MemberClassA("A Gerbil");
	private MemberClassB b = new MemberClassB("B Gerbil");

	public Gerbil(Shared s) {
		super(s);
		print("Gerbil Initialized");
	}

	public void a() {
		print("Gerbil a()");
	}

	public void b() {
		print("Gerbil b()");
	}

	public void c() {
		print("Gerbil c()");
	}
}

class Hamster extends Rodent {
	private MemberClassA a = new MemberClassA("A Hamster");
	private MemberClassB b = new MemberClassB("B Hamster");

	public Hamster(Shared s) {
		super(s);
		print("Hamster Initialized");
	}

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

public class Exercise14 {
	public static void main(String[] args) {
		Shared s = new Shared();
		Rodent[] r = new Rodent[] { new Mouse(s), new Gerbil(s), new Hamster(s) };
		print("Total References to Shared Object:" + s.getRefCount());
	}
}
