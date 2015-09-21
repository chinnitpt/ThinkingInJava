package polymorphism.exercise5;
import static net.mindview.util.Print.print;
class Cycle{
	public void ride(){
		print("Cycle ride");
	}
	
	public Integer wheels(){
		return 0;
	}
}
class Unicycle extends Cycle{
	public void ride(){
		print("Unicycle Ride");
	}
	
	public Integer wheels(){
		return 1;
	}
	
}

class Bicycle extends Cycle{
	public void ride(){
		print("Bicycle ride");
	}
	@Override
	public Integer wheels(){
		return 2;
	}
}

class Tricycle extends Cycle{
	public void ride(){
		print("Tricycle ride");
	}
	
	public Integer wheels(){
		return 3;
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		Cycle c = new Unicycle();
		Cycle b = new Bicycle();
		Cycle t = new Tricycle();
		print(c.wheels()+" wheel(s)");
		print(b.wheels()+" wheel(s)");
		print(t.wheels()+" wheel(s)");

	}

}

