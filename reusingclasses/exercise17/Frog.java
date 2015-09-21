package reusingclasses.exercise17;

import static net.mindview.util.Print.print;
;
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
	
	@Override
	public void move(){
		print("Frog Moves");
	}
	@Override
	public void shout(){
		print("frog Shouts");
	}
	@Override
	public void swims(){
		print("frog Swims");
	}
	public static void main(String[] args){
		Amphibian f = new Frog();
		f.move();
		f.shout();
		f.swims();
	}
}

