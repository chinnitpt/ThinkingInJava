package polymorphism.exercise4;

public class Shapes {

	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
			public static void main(String[] args) {
			Shape[] s = new Shape[15];
			for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
			for(Shape shp : s)
			shp.draw();
			}
}
