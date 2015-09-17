package reusingclasses.exercise5;
import static net.mindview.util.Print.print;

class A
{
	A(){
		print("A Initialized");
	}
}

class B 
{
	B(){
		print("B Initialized");
	}
}
public class C extends A {
	private B b = new B();
	public static void main(String[] args){
		new C();
	}
}
