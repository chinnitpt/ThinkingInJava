package holdingyourobjects.exercise10;
import java.util.*;
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

public class Exercise10 {

	public static void main(String[] args) {

		List<Rodent> rodents = new ArrayList<Rodent>(Arrays.asList(new Mouse(), new Gerbil(), new Hamster()));
		
		for(Rodent rodent:rodents){
			rodent.a();
			rodent.b();
			rodent.c();
		}
		
	}

}