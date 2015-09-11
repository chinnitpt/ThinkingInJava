package operators;
import static net.mindview.util.Print.*;
public class Exercise5Dog {
	String name;
	String says;

	public static void main(String[] args) {
		Exercise5Dog d1 = new Exercise5Dog();
		d1.name = "Spot";
		d1.says = "Ruff!";

		Exercise5Dog d2 = new Exercise5Dog();
		d2.name = "Scruffy";
		d2.says = "Wurf!";
		print("Dog1 name:"+d1.name+" says:"+d1.says);
		print("Dog2 name:"+d2.name+" says:"+d2.says);

		

	}
}
