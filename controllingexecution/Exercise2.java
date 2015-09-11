package controllingexecution;
import static net.mindview.util.Print.*;
import java.lang.Math;
public class Exercise2 {
	static void compareValues(int value1, int value2){
		print("First Value:"+value1+" Second Value:"+value2);
		if(value1 == value2){
			print("First Value is equal to second value");
		}
		if(value1>value2){
			print("First Value is greater than second value");
		}
		if(value1<value2){
			print("First Value is less than second value");
		}
	}
	public static void main(String[] args){
		int firstValue = (int)Math.round(Math.random()*10);
		for(int i = 0; i<25; i++){
			int secondValue = (int)Math.round(Math.random()*10);
			compareValues(firstValue, secondValue);
			firstValue=secondValue;
			
		}
	}
}
