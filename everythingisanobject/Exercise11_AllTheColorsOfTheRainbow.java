package everythingisanobject;

public class Exercise11_AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	// ...
	public static void main(String[] args) {
		Exercise11_AllTheColorsOfTheRainbow rainbowColors = new Exercise11_AllTheColorsOfTheRainbow();
		rainbowColors.changeTheHueOfTheColor(5);
	}

}
