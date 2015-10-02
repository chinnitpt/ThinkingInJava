package holdingyourobjects;

import java.util.*;
import net.mindview.util.*;

public class Exercise16 {
	public static List<Character> list  = new ArrayList<Character>( Arrays.asList('a', 'e', 'i', 'o', 'u'));
	public static void vowelsCount(Collection<String> c){
		int totalCount = 0;
		for(String s:c){
			int vowelsInString = 0; 
			char[] chars = s.toCharArray();
			for(char ch : chars){
				if(list.contains(Character.toLowerCase(ch))){
					vowelsInString++;
				}
				
			}
			System.out.println("Total Vowels in String \""+s+"\" are :"+vowelsInString);
			totalCount= totalCount+vowelsInString;
		}
		System.out.println("Total Vowels Count:"+ totalCount);
	}
	

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
		vowelsCount(new TreeSet<String>(words));
	}
}
