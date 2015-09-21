package polymorphism.exercise8;

import static net.mindview.util.Print.print;

import java.util.Random;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		print("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	String what() {
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

	String what() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class RandomInstrumentGenerator {
	private Random rand = new Random(100);

	public Instrument next() {
		switch (rand.nextInt(5)) {
		default:
		case 0:
			return new Percussion();
		case 1:
			return new Stringed();
		case 2:
			return new Woodwind();
		case 3:
			return new Brass();
		case 4:
			return new Wind();
		}
	}

}

class Stringed extends Instrument {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	String what() {
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

		Instrument[] orchestra = new Instrument[15];
		RandomInstrumentGenerator generator = new RandomInstrumentGenerator();

		for (int i = 0; i < 15; i++) {
			orchestra[i] = generator.next();
		}

		tuneAll(orchestra);
	}
}
