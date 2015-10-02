package holdingyourobjects.exercise4;

import static net.mindview.util.Print.*;
import java.util.*;

public class Generator {

	private int counter;
	private String[] characterArray;

	public Generator() {
		this.characterArray = new String[] { "Evil Queen", "Iddy", "Snow white", "Biddy", "Kiddy", "Diddy", "Fiddy" };
	}

	public void fill(Collection<String> collection) {
		for (int i = 0; i < characterArray.length; i++) {
			collection.add(next());
		}
	}

	public void fill(String[] charArray) {
		for (int i = 0; i < characterArray.length; i++) {
			charArray[i] = next();
		}
	}

	public String next() {
		if (counter >= characterArray.length) {
			counter = 0;
		}
		String character = characterArray[counter];
		counter++;
		return character;

	}

	public static void main(String[] args) {
		String[] snowWhiteCharactersArray = new String[7];
		List<String> charactersArrayList = new ArrayList<String>();
		List<String> charactersLinkedList = new LinkedList<String>();
		Set<String> charactersHashSet = new HashSet<String>();
		Set<String> charactersLinkedHashSet = new LinkedHashSet<String>();
		Set<String> charactersTreeSet = new LinkedHashSet<String>();
		Generator g = new Generator();
		g.fill(snowWhiteCharactersArray);
		g.fill(charactersArrayList);
		g.fill(charactersLinkedList);
		g.fill(charactersHashSet);
		g.fill(charactersLinkedHashSet);
		g.fill(charactersTreeSet);
		print(snowWhiteCharactersArray);
		print(charactersArrayList);
		print(charactersHashSet);
		print(charactersLinkedHashSet);
		print(charactersTreeSet);
		print(charactersLinkedList);
	}
}
