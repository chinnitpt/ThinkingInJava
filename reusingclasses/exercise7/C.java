package reusingclasses.exercise7;

import static net.mindview.util.Print.print;

class A
{
	A(int i){
		print("A Initialized:"+ i);
	}
}

class B 
{
	B(int j){
		print("B Initialized:"+j);
	}
}
public class C extends A {
	C(int j){
		super(j);
		new B(j+1);
		
		
		print("C Initialized:"+j);
	}
	public static void main(String[] args){
		new C(0);
	}
}
