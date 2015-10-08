package holdingyourobjects;

import java.util.*;
public class Exercise24 {
	public static void main(String[] args){
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("Eight", 8);
		map.put("Nine", 9);
		map.put("Ten", 10);
		map.put("Eleven", 11);
		map.put("Twelve", 12);
		map.put("thirteen", 13);
		map.put("Fourteen", 14);
		
		
		Set<String>treeSet = new TreeSet<String>(map.keySet());
		
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		
		for(String s: treeSet){
			map2.put(s, map.get(s));
			map.remove(s);
		}
		for(String s:treeSet){
			map.put(s, map2.get(s));
		}
		map2 = null;
		System.out.println(map);
	}
}
