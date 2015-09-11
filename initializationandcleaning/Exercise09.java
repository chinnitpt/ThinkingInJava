package initializationandcleaning;
import static net.mindview.util.Print.*;
public class Exercise09 {
	int count;
	String items;
	Exercise09(int i, String s){
		this(s);
		this.count = i;
	}
	Exercise09(String s){
		this.items = s;
	}
	
	void printClassInfo(){
		print("count:"+count+" items:"+items);
	}
	
	public static void main(String[] args) {
		Exercise09 ex9 = new Exercise09(9, "flowers");
		ex9.printClassInfo();
		
	}

}
