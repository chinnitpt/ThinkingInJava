package holdingyourobjects.exercise31;

import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape> {
	private List<Shape> shapes ;
	public RandomShapeGenerator(int size){
		shapes = new ArrayList<Shape>(size);
		for(int i = 0; i<size; i++){
			shapes.add(next(i));
		}
	}
	
	public Iterator<Shape> iterator(){
		return new Iterator<Shape>() {
			Iterator<Shape> shapeIterator = shapes.iterator();
			@Override
			public Shape next() {
				return shapeIterator.next();
			}
			
			@Override
			public boolean hasNext() {
				return shapeIterator.hasNext();
			}
			
			@Override
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Shape next(int i) {
		switch (i%3) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
	
	public static void main(String[] args){
		for(Shape s: new RandomShapeGenerator(10)){
			s.draw();
			
		}
	}
} 
