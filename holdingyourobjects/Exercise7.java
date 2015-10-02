package holdingyourobjects;
import java.util.*;
import static net.mindview.util.Print.*;
public class Exercise7 {
	private static  int count;
	private final int id=count++;
	public String toString(){
		return Integer.toString(id);
	}
	
	public static void main(String[] args){
		Exercise7[] exercises = new Exercise7[10];
		
		for(int i = 0; i<10; i++){
			exercises[i] = new Exercise7();
		}
		List<Exercise7> list = new ArrayList<Exercise7>(Arrays.asList(exercises));
		print("Complete List:"+list);
		List<Exercise7> subList = list.subList(3, 8);
		print("Sub List:"+subList);
		list.removeAll(subList);
		print("After removing sublist form main List:"+list);
	}
}
