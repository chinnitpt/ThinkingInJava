package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise19 {
	
	static void printArgs(String...args)
	{
		for(String s: args){
			print(s);
		}
	}
	
	public static void main(String[] args) {
		Exercise19.printArgs("One", "Two", "Three", "Four", "Five");
		Exercise19.printArgs(new String[]{"One", "Two","Three","Four"});
	}

}
