package innerclasses.exercise5;

class Outer{
	class Inner{
		
	}
}


public class Exercise5 {
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner();
}
