package polymorphism.exercise15;

import static net.mindview.util.Print.*;

class Glyph {

	public Glyph() {
		print("Before Construction");
		draw();
		print("After Construction");
	}

	public void draw() {
		print("Glyph.draw() method caleld");
	}
}

class RectangularGlyph extends Glyph {
	private int height = 5;
	private int length = 10;

	public RectangularGlyph(int height, int length) {
		this.length = length;
		this.height = height;
	}

	public void draw() {
		print("Rectangular Glyph Draw with Height:" + this.height + " and Length:" + this.length);
	}

}

public class PolyConstructors {
	public static void main(String[] args) {
		new RectangularGlyph(25, 35);
	}
}
