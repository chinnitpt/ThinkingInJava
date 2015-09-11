package initializationandcleaning;
import static net.mindview.util.Print.*;
class Dog{
	void bark(char c){
		print("barking");
	}
	void bark(byte b){
		print("Sighing");
	}
	void bark(short s){
		print("Panting");
	}
	void bark(int i){
		print("Moaning");
	}
	void bark(long l){
		print("Whining ");
	}
	
	void bark(float f){
		print("Howling");
	}
	
	void bark(double d){
		print("Baying");
	}
	void bark(float f, double d) {
		print("Howling-Baying");

	}

	void bark(double d, float f) {
		print("Baying-Howling");
	}

}

public class Exercise05 {
	public static void main(String[] args){
		Dog d = new Dog();
		d.bark('b');
		d.bark((byte)0);
		d.bark((short)0);
		d.bark((int)0);
		d.bark((long)0);
		d.bark((float)0);
		d.bark((double)0);
	}
}
