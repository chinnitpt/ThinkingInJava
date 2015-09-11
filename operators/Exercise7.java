package operators;

import java.util.Random;
import static net.mindview.util.Print.*;
public class Exercise7 {
	public static void main(String args[]){
		Random rand = new Random();
		int i = rand.nextInt(2);
		if(i==0){
			print("HEAD it is");
		}
		if(i==1){
			print("TAIL it is");
		}
	}
}
