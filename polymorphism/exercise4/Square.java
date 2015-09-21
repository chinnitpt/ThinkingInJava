package polymorphism.exercise4;

import static net.mindview.util.Print.*;

public class Square extends Shape {
	@Override
	public void draw() {
		print("Square.draw()");
	}
	@Override
	public void erase() {
		print("Square.erase()");
	}
	
	@Override
	public void message(){
		print("square message");
	}
}
