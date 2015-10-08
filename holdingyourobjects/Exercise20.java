package holdingyourobjects;
import java.util.*;
import net.mindview.util.TextFile;

public class Exercise20 {
	public static List<Character> list  = new ArrayList<Character>( Arrays.asList('a', 'e', 'i', 'o', 'u'));
	public static Map<Character, Integer> vowelsCount(Collection<String> c){
		Map<Character, Integer> vowelsmap = new HashMap<Character, Integer>();
		for(String s:c){
			char[] chars = s.toCharArray();
			for(char ch : chars){
				if(list.contains(Character.toLowerCase(ch))){
					if(vowelsmap.containsKey(Character.toLowerCase(ch))){
						Integer newValue = vowelsmap.get(Character.toLowerCase(ch))+1;;
						vowelsmap.put(Character.toLowerCase(ch), newValue);
					}
					else
					{
						vowelsmap.put(Character.toLowerCase(ch), 1);
					}
				}
				
			}
			
		}
		return vowelsmap;
	}
	
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java", "\\W+"));
		Map<Character, Integer> map =vowelsCount(new TreeSet<String>(words));
		
		for(Character c:map.keySet()){
			System.out.println(Character.toString(c)+ " appeared "+ map.get(c)+ " times in the whole sentence");
		}

	}

}
