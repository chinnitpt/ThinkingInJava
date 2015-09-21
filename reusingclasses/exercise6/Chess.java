package reusingclasses.exercise6;

import static net.mindview.util.Print.*;

class BoardGame {
	BoardGame(int i) {
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);  //comment out this line to prove what is asked in the question.
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
} 