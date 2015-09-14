package initializationandcleaning;
import static net.mindview.util.Print.*;
class Tank{
	int level=0;
	
	Tank()
	{
		level = 0;
	}
	Tank(int level){
		this.level = level;
	}
	void filled(){
		level = 10;
	}
	void emptied(){
		level = 0;
	}
	@Override
	protected void finalize(){
		if(level == 0){
			print("Tank is not empty");
		}
	}
}

public class Exercise12 {

	
	public static void main(String[] args) {
			Tank t1 = new Tank();
			t1.filled();
			System.gc();
			
			Tank t2 = new Tank();
			System.gc();
			
			
			Tank t3 = new Tank(5);
			System.gc();
			
			
	}

}
