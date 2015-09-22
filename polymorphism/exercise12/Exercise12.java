package polymorphism.exercise12;

import static net.mindview.util.Print.*;

class MemberClassA {
	MemberClassA(){ 
		print("MemberClassA Initialized");
	}
}

class MemberClassB {
	MemberClassB(){
		print("MemberClassB Initialized");
	}
}


class Rodent{
	private MemberClassA a = new MemberClassA();
	private MemberClassB b = new MemberClassB();
	
	public Rodent(){
		print("Rodent Initialized()");
	}
	
	public void a(){
		print("Rodent a()");
	}
	
	public void b(){
		print("Rodent b()");
	}
	
	public void c(){
		print("Rodent c()");
	}
}

class Mouse extends Rodent{
	private MemberClassA a = new MemberClassA();
	private MemberClassB b = new MemberClassB();
	public Mouse(){
		print("Mouse initialized");
	}
	public void a(){
		print("Mouse a()");
	}
	
	public void b(){
		print("Mouse b()");
	}
	
	public void c(){
		print("Mouse c()");
	}
}

class Gerbil extends Rodent{
	private MemberClassA a = new MemberClassA();
	private MemberClassB b = new MemberClassB();
	public  Gerbil(){
		print("Gerbil Initialized");
	}
	
	public void a(){
		print("Gerbil a()");
	}
	
	public void b(){
		print("Gerbil b()");
	}
	
	public void c(){
		print("Gerbil c()");
	}
}

class Hamster extends Rodent{
	private MemberClassA a = new MemberClassA();
	private MemberClassB b = new MemberClassB();
	public Hamster(){
		print("Hamster Initialized");
	}
	
	public void a(){
		print("Hamster a()");
	}
	
	public void b(){
		print("Hamster b()");
	}
	
	public void c(){
		print("Hamster c()");
	}
}
public class Exercise12 {
	Hamster ham = new Hamster();
	Gerbil ger = new Gerbil();
	Mouse mou = new Mouse();
	
	public Exercise12(){
		print("Exercise12 Initialized");
	}
	
	public static void main(String[] args){
		new Exercise12();
	}
}
