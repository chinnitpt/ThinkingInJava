package polymorphism.exercise4;

import static net.mindview.util.Print.print;

public class Hexagon extends Shape {
	@Override
	public void draw() {
		print("Hexagon.draw()");
	}
	
	@Override
	public void erase() {
		print("Hexagon.erase()");
	}
	
	@Override
	public void message(){
		print("Hexagon Message");
	}
}
