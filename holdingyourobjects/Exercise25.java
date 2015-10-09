package holdingyourobjects;
import java.util.*;
import net.mindview.util.TextFile;
public class Exercise25 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		Map<String, List<Integer>> wordLocation = new LinkedHashMap<String, List<Integer>>();
		Iterator<String> iter = words.iterator();
		int count = 1;
		while(iter.hasNext()){
			String word = iter.next();
			if(wordLocation.containsKey(word)){
				wordLocation.get(word).add(count);
			}
			else{
				List<Integer> wordOrder = new ArrayList<Integer>();
				wordOrder.add(count);
				wordLocation.put(word,	 wordOrder);
			}
			count++;
		}
		System.out.println(wordLocation);
		
		//Exercise 26 Solution;
		
		Map<Integer, String> replayMap = new TreeMap<Integer, String>();
		
		Set<Map.Entry<String, List<Integer>>> entrySet = wordLocation.entrySet();
		Iterator<Map.Entry<String, List<Integer>>> iterator = entrySet.iterator(); 
		while(iterator.hasNext()){
			Map.Entry<String, List<Integer>> entry = iterator.next();
			for(int i= 0; i< entry.getValue().size(); i++){
				replayMap.put(entry.getValue().get(i), entry.getKey());
			}
		}
		System.out.println(replayMap);

	}

}
