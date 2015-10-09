package holdingyourobjects.exercise31;
import typeinfo.pets.*;
import java.util.*;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
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
	
	public Iterable<Pet> reverse(){
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					private int index = pets.length-1;
					@Override
					public Pet next() {
						return pets[index--];
					}
					
					@Override
					public boolean hasNext() {
						return index>=0;
					}
					@Override
					public void remove() { // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<Pet>random(){
		return new Iterable<Pet>() {
			@Override
			public Iterator<Pet> iterator(){
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random());
				return shuffled.iterator();
			}
			
		};
	}
	

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		for(Pet pet: nc){
			System.out.println(pet.id()+ ":" + pet + " ");
		}
		
		for(Pet pet:nc.reverse()){
			System.out.println(pet.id()+ ":" + pet + " ");
		}
		for(Pet pet:nc.random()){
			System.out.println(pet.id()+ ":" + pet + " ");
		}
	}
} 