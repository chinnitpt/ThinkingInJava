package interfaces.exercise8;

import static net.mindview.util.Print.*;

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Meal {
	Meal() {
		print("Meal");
	}
}
class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch implements FastFood{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	public Meal getMeal(){
		return this;
	}
	
	public Sandwich() {
		print("Sandwich()");
	}
}
