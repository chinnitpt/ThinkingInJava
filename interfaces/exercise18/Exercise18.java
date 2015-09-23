package interfaces.exercise18;
import static net.mindview.util.Print.*;
public class Exercise18 {
	
	static void getCount(CycleFactory cycleFactory){
		
		Cycle c = cycleFactory.getCycle();
		print(c.getWheelCount());
	}
	
	public static void main(String[] args) {
		getCount(new UniCycleFactory());
		getCount(new BicycleFactory());
		getCount(new TricycleFactory());
	}

}
