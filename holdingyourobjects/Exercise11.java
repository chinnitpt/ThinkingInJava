package holdingyourobjects;
import java.util.*;
public class Exercise11 {
	public static void printCollection(Collection<Object> c){
		Iterator<Object> iterator = c.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(1,2,3,4,5,6));
		printCollection(arrayList);
		LinkedList<Object> linkedList = new LinkedList<Object>(Arrays.asList(7,8,9,10,11));
		printCollection(linkedList);
		
		HashSet<Object> hashSet= new HashSet<Object>(Arrays.asList(12,13,14,15,15,16));
		printCollection(hashSet);
		TreeSet<Object> treeSet = new TreeSet<Object>(Arrays.asList(20,19,18,17,22,25,23,26));
		printCollection(treeSet);
		LinkedHashSet<Object> linkedHashSet =new LinkedHashSet<Object>(Arrays.asList(27,27,27));
		printCollection(linkedHashSet);
		
		
	}

}
