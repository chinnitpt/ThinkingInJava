package holdingyourobjects.exercise30;
import holding.InterfaceVsIterator;
import typeinfo.pets.*;

import java.util.*;

public class CollectionSequence implements Collection<Pet> {
	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	public boolean remove(Object pet)
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean removeAll(Collection<?> pets){
		throw new UnsupportedOperationException();
	}
	
	public boolean containsAll(Collection<?> pets){
		throw new UnsupportedOperationException();
	}
	
	public boolean add(Pet o){
		throw new UnsupportedOperationException();
	}
	
	public boolean isEmpty(){
		throw new UnsupportedOperationException();
	}
	
	public Pet[] toArray(){
		throw new UnsupportedOperationException();
	}
	
	public <T> T[] toArray(T[] array){
		throw new UnsupportedOperationException();
	}
	public void clear() { 
		if(this.size() != 0)
		for(Pet p : pets)
			p = null;
	}
	
	public boolean addAll(Collection<? extends Pet> c) { 
		throw new UnsupportedOperationException();
	}
	public boolean retainAll(Collection<?> c) { 
		throw new UnsupportedOperationException();
	}
	public boolean contains(Object o) {	
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
} 
