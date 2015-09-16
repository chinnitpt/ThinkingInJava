package initializationandcleaning;

import static net.mindview.util.Print.print;
//import initializationandcleaning.Exercise21.*;

public class Exercise22 {
	Currency cur;

	Exercise22(Currency cur) {
		this.cur = cur;
	}

	void describe(Currency cur) {
		switch (cur) {
		case KWACHA:
			print("Traded at 5194 Zambian Kwacha for a Dollar");
			break;

		case RUPIAH:
			print("Traded at 13150 Indonesian Rupiah for a Dollar");
			break;

		case KIP:
			print("Traded at 8100 Lao kips for a Dollar");
			break;

		case RUBLE:
			print("Traded at 14300 Belarusian Rubles for a Dollar");
			break;

		case DONG:
			print("Traded at 21710 Vietnamese Dongs for a Dollar");
			break;

		case RIALS:
			print("Traded at 3000 Iria Rials for a Dollar");
		}
	}

	public static void main(String[] args) {

		for (Currency cur : Currency.values()) {
			print("Currency:" + cur + " Ordinal:" + cur.ordinal());
			Exercise22 ex22 = new Exercise22(cur);
			ex22.describe(cur);

		}

	}
}
