package innerclasses.exercise6client;

import innerclasses.exercise6utils.*;
import innerclasses.exercise6.*;
public class Exercise6 extends ClassA {
	
	public A getA(){
		return new ClassB() ;
	}
	
	public static void main(String[] args){
		Exercise6 ex6 = new Exercise6();
		
		A a = ex6.getA();
		a.a();
		
	}
	
}
