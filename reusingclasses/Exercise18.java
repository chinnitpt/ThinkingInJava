package reusingclasses;
import java.util.Random;

import static net.mindview.util.Print.*;
public class Exercise18 {
	
	private static Random random = new Random(45);
	private static final int VALUE = random.nextInt(20); 
	
	private final int val = random.nextInt(70); 
	
	public String toString()
	{
	
		return "val:"+val +" VALUE:"+VALUE;
	}
	public static void main(String[] args) {
		Exercise18 ex18 =new Exercise18();
		print(ex18);
		print(new Exercise18());
		
	}

}
