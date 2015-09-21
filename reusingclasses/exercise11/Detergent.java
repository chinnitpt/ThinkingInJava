package reusingclasses.exercise11;
import static net.mindview.util.Print.*;

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

public class Detergent  {
	private Cleanser cleanser = new Cleanser();
	public void scrub() {
		append(" Detergent.scrub()");
		cleanser.scrub(); 
	}

	public void foam() {
		append(" foam()");
	}
	public void dilute(){
		cleanser.dilute();
	}
	public void apply(){
		cleanser.apply();
	}
	public String toString(){
		return cleanser.toString();
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		
		
	}
	private void append(String s){
		cleanser.append(s);
	}
} 