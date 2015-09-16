package initializationandcleaning;
import static net.mindview.util.Print.*;

enum Currency{
	KWACHA, KIP, RUPIAH, RUBLE, DONG, RIALS
}

public class Exercise21 {
	
	
	public static void main(String[] args) {
		for(Currency cur: Currency.values()){
			print("Currency:"+cur+" Ordinal:"+cur.ordinal());
		}

	}

}
