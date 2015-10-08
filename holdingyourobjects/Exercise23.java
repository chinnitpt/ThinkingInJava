package holdingyourobjects;


import java.util.*;

public class Exercise23 {
	
	private static int number = 0;
	private static int count = 0;
	public static void makemap(){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		for(Integer i: m.keySet()){
		  if(m.get(i)>count){
			  count = m.get(i);
			  number = i;
		  }
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<2000; i++){
			makemap();
		}
		System.out.println("Number:"+number);
		System.out.println("Count:"+count);
	}
} 