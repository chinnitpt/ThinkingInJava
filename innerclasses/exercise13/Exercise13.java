package innerclasses.exercise13;
import static net.mindview.util.Print.*;

interface A {
	public void a();
}

public class Exercise13 {
	public A getA(){
		return new A(){
			@Override
			public void a(){
				print("Anonymous inner class");
			}
		};
	}
	
	
public static void main(String[] args){
	Exercise13 ex13 = new Exercise13();
	A a = ex13.getA();
	a.a();
}
}
