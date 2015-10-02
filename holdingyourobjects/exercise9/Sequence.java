package holdingyourobjects.exercise9;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
	private ArrayList<Object>items = new ArrayList<Object>();
	private int next = 0;


	public void add(Object o){
		items.add(o);
	}

	public Iterator selector() {
		return items.iterator();
	}

	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Iterator selector = sequence.selector();
		while (selector.hasNext()) {
			System.out.print(selector.next() + " ");
			
		}
	}
}
