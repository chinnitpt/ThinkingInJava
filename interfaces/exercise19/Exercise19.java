package interfaces.exercise19;
import static net.mindview.util.Print.*;
public class Exercise19 {
	static void result(TossableFactory tf){
		Tossable t = tf.getTossable();
		print(t.toss());
	}
	public static void main(String[] args) {
		result(new CoinTossableFactory());
		result(new DiceTossableFactory());
	}

}
