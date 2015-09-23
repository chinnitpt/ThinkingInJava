package interfaces.exercise10;

import static net.mindview.util.Print.print;




enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:


	void adjust();
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable{
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}
public class Music {

	static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}

}
