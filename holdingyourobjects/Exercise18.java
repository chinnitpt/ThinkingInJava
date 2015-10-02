package holdingyourobjects;
import static net.mindview.util.Print.*;
import java.util.*;
public class Exercise18 {
	public static void main(String[] args){
		Map<Integer, String> integerMap = new HashMap<Integer, String>();
		Random rand = new Random(25);
		for(int i = 0; i<10 ; i++){
			int r = rand.nextInt();
			integerMap.put(r+Integer.valueOf(i), Integer.toString(i));
		}
		print(integerMap);
		
		Set<Integer> integerSet = new TreeSet<Integer>(integerMap.keySet());
		print(integerSet);
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		for(Integer i : integerSet){
			linkedHashMap.put(i, integerMap.get(i));
		}
		
		print(linkedHashMap);
		
	}

}
