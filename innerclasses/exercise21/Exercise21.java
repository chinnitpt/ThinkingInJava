package innerclasses.exercise21;

interface  Exercise21 {
	void f();
	
	class A {
		public static void a(Exercise21 ex){
		System.out.println("Static method in a nested class of an interface");
		ex.f();
		}
	}
}
