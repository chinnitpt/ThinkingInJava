package holdingyourobjects;

import java.util.*;

import net.mindview.util.TextFile;

class WordCount {
	private String word;
	private int count;

	public WordCount(String word, int count) {
		this.word = word;
		this.count = count;
	}

	

	public String toString() {
		return this.word + ":" + this.count;
	}
	
	
	
}

public class Exercise22 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		Set<WordCount> wordCounts = new HashSet<WordCount>();		
		for(String s: words) {
			int count = 0;			
			for(String word: words) {
				if(s.equals(word)){ 
					count++;
				}
			}
			WordCount w = new WordCount(s, count);
			wordCounts.add(w);
		}		
		System.out.println("Word count: " + wordCounts);
	}

}
