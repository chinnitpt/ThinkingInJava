package innerclasses.exercise15;
import static net.mindview.util.Print.*;
class A{
	private String str;
	
	A(){
		print("Default Base class constructor");
	}
	A(String str){
		this.str = str;
		print(str);
	}
}

class B{
	
	public A getClassA(String str){
		return new A(str){
			
		};
	}
	
	class C extends A{
		C(){
			
		}
		C(String s){
//			super(s);
//			print("Extended Class C");
		}
	}
	
	public A getClassC(String s){
		return new C(s){
			
		};
	}
}



public class Exercise15 {
	public static void main(String[] args){
		B b = new B();
		b.getClassA("Hello World");
		b.getClassC("Hello Java");
	}
}


