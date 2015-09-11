package controllingexecution;

import static net.mindview.util.Print.print;

public class Exercise7 {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			if(i ==99){
//				break;
//			}
//			print(i);
//		}
		
		for (int i = 1; i <= 100; i++) {
			if(i ==99){
				return;
			}
			print(i);
		}
	}

}
