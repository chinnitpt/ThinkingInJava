package reusingclasses.exercise16;
import static net.mindview.util.Print.*;
class Amphibian{
	
	public void move(){
		print("Amphibian Moves");
	}
	
	public void shout(){
		print("Amphibian Shouts");
	}
	
	public void swims(){
		print("Amphibian Swims");
	}
}


public class Frog extends Amphibian{
	public static void main(String[] args){
		Amphibian f = new Frog();
		f.move();
		f.shout();
		f.swims();
	}
}
