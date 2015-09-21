package polymorphism.exercise7;

import static net.mindview.util.Print.print;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	public String toString() {
		return "Instrument";
	}

	void adjust() {
		print("Adjusting Instrument");
	}
}

class NewInstrument extends Instrument{
	void play(Note n){
		print("NewInstrument.play() "+n);
	}
	
	public String toString() {
		return "NewInstrument";
	}

	void adjust() {
		print("Adjusting NewInstrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

public class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new NewInstrument() };
		tuneAll(orchestra);
	}
}
