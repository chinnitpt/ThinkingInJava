package controllingexecution;
import static net.mindview.util.Print.*;
public class Exercise9 {
	static void printFibonacci(int count){
		int current = 1;
		int previous = 0;
		print(current);
		for(int i= 1; i<count; i++)
		{
			int temp = current;
			current = previous+current;
			previous = temp;
	 		print(current);
		}
	}
	public static void main(String[] args){
		printFibonacci(25);
	}
}
