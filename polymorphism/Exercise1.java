package polymorphism;
import static net.mindview.util.Print.print;
class Cycle{
	public void ride(){
		print("Cycle ride");
	}
}
class Unicycle extends Cycle{
	public void ride(){
		print("Unicycle Ride");
	}
}

class Bicycle extends Cycle{
	public void ride(){
		print("Bicycle ride");
	}
}

class Tricycle extends Cycle{
	public void ride(){
		print("Tricycle ride");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Cycle c = new Unicycle();
		Cycle b = new Bicycle();
		Cycle t = new Tricycle();
		c.ride();
		b.ride();
		t.ride();
	}
}
