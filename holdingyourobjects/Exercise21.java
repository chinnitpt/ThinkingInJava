package holdingyourobjects;

import java.util.*;

import net.mindview.util.TextFile;

public class Exercise21 {
	
	public static void calculateWordCount(Collection<String> c){
		Map<String, Integer> wordmap = new LinkedHashMap<String, Integer>();
		
		for(String s:c){
			if(wordmap.containsKey(s)){
				Integer newValue = wordmap.get(s)+1;
				wordmap.put(s, newValue);
			}
			else
			{
				wordmap.put(s, 1);
			}
		}
		for(String s: wordmap.keySet()){
			System.out.println(s+":"+wordmap.get(s));
		}
	}
	
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		calculateWordCount(words);
	}

}
