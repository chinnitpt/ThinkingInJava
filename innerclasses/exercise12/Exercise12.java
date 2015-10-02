package innerclasses.exercise12;
import static net.mindview.util.Print.*;
interface B{
	public void modifyA();
}


class A{
	private String str = "Hello World";
	private int no = 78;
	
	public B getB(){
		return new B(){
			@Override
			public void modifyA(){
				str ="Anonymous inner class modifying outer class";
				no = no*2;
			}
		};
	}
	
	public void printOuterClassVariables(){
		print(str);
		print(no);
	}
	
}

public class Exercise12 {
	public static void main(String[] args){
		A a = new A();
		a.printOuterClassVariables();
		B b = a.getB();
		b.modifyA();
		a.printOuterClassVariables();
	}
}
