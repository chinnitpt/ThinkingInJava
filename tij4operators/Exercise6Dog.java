package tij4operators;
import static net.mindview.util.Print.*;
public class Exercise6Dog {
	String name;
	String says;
	
	public static void main(String[] args){
		Exercise6Dog dog1 = new Exercise6Dog();
		dog1.name = "Spot";
		dog1.says= "Ruff!";
		
		Exercise6Dog dog2 = new Exercise6Dog();
		
		dog1 = dog2;
		
		if(dog1.equals(dog2)){
			print("dog1 and dog2 are \"equal\" ");
		}
		if(dog1 == dog2){
			print("dog1 and dog2 are \"==\"");
		}
	}

}
