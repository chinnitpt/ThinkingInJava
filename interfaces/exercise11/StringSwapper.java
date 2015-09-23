package interfaces.exercise11;
import static net.mindview.util.Print.*;
public class StringSwapper {
	
	public String getName(){
		return getClass().getName();
	}
	
	public void process(String s){
		char[] charArray = s.toCharArray();
		for(int i = 0; i<(charArray.length-1);i= i+2)
		{
			char temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1]= temp;
		}
		print(String.valueOf(charArray));
	}
	
	public static void main(String[] args){
		String s = "Hello World";
		StringSwapper swapper = new StringSwapper();
		swapper.process(s);
	}
	
	
}
