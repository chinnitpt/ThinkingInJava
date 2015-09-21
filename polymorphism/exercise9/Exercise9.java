package polymorphism.exercise9;

import static net.mindview.util.Print.*;

class Rodent{
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

public class Exercise9 {

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[]{new Mouse(), new Gerbil(), new Hamster()};
		
		for(int i= 0; i< rodents.length; i++){
			rodents[i].a();
			rodents[i].b();
			rodents[i].c();
		}
		
	}

}
