package holdingyourobjects;

import java.util.*;
public class Exercise17 {

	public static void main(String[] args) {
		Map<String, Gerbil> gerbilsMap = new HashMap<String, Gerbil>();
		gerbilsMap.put("Fuzzy", new Gerbil(0));
		gerbilsMap.put("Spot", new Gerbil(1));
		gerbilsMap.put("Stain", new Gerbil(2));
		Set<String> keySet = gerbilsMap.keySet();
	
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			gerbilsMap.get(iterator.next()).hop();
		}
		
	}

}
