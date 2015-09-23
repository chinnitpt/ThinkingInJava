package interfaces;

import static net.mindview.util.Print.*;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
class RandomChars implements Readable{
	private static Random rand = new Random();
	private int count;
	
	public RandomChars(int c){
		this.count = c;
	}
	public char next(){
		return (char)rand.nextInt(128);
	}
	
	@Override
	public int read(CharBuffer cb){
		if(count-- == 0){
			return -1;
		}
		cb.append(next());
		return cb.length();
	}
}

public class Exercise16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomChars(10));
		while(s.hasNext()){
			print(s.next());
		}
		
	}

}
