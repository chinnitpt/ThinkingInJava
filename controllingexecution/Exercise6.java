package controllingexecution;
import static net.mindview.util.Print.*;
public class Exercise6 {
	static int test(int testValue, int begin, int end){
		if(testValue>=begin  && testValue<=end){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args){
		int testValue = 23;
		int begin = 10;
		int end = 25;
		if(test(testValue, begin, end) ==1){
			print(testValue+" is in between "+begin+" and "+end);
		}
		else
		{
			print(testValue+" is outside of "+begin+" and "+end);
		}
	}
}
