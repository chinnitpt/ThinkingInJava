package holdingyourobjects;

import java.util.*;

public class Exercise14 {
	private List<Integer> list = new LinkedList<Integer>();

	private void add(Integer value){
		if (list.size() == 0 || list.size()==1) {
			list.add(value);
		} else {
			int index = (int)Math.floor(list.size()/2);
			ListIterator<Integer> iterator = list.listIterator(index);
			iterator.add(value);
			iterator = null;
		}
		
	}
	
	public List<Integer> getList(){
		return list;
	}

	public static void main(String[] args) {
		Exercise14 ex14 = new Exercise14();
		for(int i= 0; i<10; i++){
			ex14.add(i);
		}
		System.out.println(ex14.getList());
	}

}
