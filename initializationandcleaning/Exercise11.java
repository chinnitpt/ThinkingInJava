package initializationandcleaning;

import static net.mindview.util.Print.*;
public class Exercise11 {
	
	int i = 0;
	
	protected void finalize()
	{
		if(i==0){
			print("Finalize called");
		}
		
	}
	
	public static void main(String[] args) {
		new Exercise11();
		System.gc();
	}

}
