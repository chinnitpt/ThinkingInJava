package reusingclasses.exercise2;

import static net.mindview.util.Print.print;


class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}
}

public class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); 
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Sterilizer.main(args);
	}
}

class Sterilizer extends Detergent {
	public void scrub(){
		append(" DetergentSubClass.scrub()");
	}
	
	public void sterilize(){
		append(" sterilize()");
	}
	public static void main(String[] args){
		Sterilizer s = new Sterilizer();
		s.dilute();
		s.apply();
		s.scrub();
		s.sterilize();
		print(s);
		
		
	}
	
}
