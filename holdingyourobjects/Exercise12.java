package holdingyourobjects;

import java.util.*;

public class Exercise12 {
	public static void main(String[] args){
		List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<Integer> reverseIntegerList = new ArrayList<Integer>(integerList.size());
		ListIterator<Integer> iterator = integerList.listIterator(integerList.size()-1);
		while(iterator.hasPrevious()){
			reverseIntegerList.add(integerList.get(iterator.previousIndex()));
			iterator.previous();
		}
		System.out.println(reverseIntegerList);
		
	}

}
