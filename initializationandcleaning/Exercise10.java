package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise10 {
	int i = 0;
	
	Exercise10(int value){
		i = value;
	}
	@Override
	protected void finalize(){
		if(i==0){
			print("The state of the object is consistent when garbage collected");
		}
	}
	
	public static void main(String [] args){
		new Exercise10(30);
		new Exercise10(0);
	}

}
