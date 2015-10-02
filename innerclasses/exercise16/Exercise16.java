package innerclasses.exercise16;
import static net.mindview.util.Print.*;

interface Cycle {
	public int getWheelCount();
}

interface CycleFactory{
	public Cycle getCycle();
}

class Unicycle implements Cycle {
	@Override
	public int getWheelCount() {
		return 1;
	}
	public static CycleFactory factory = new CycleFactory(){
		@Override
		public Cycle getCycle(){
			return new Unicycle();
		}
	};
	
}

class Bicycle implements Cycle {
	@Override
	public int getWheelCount() {
		return 2;
	}
	public static CycleFactory factory = new CycleFactory(){
		@Override
		public Cycle getCycle(){
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle {
	@Override
	public int getWheelCount() {
		return 3;
	}
	public static CycleFactory factory = new CycleFactory(){
		@Override
		public Cycle getCycle(){
			return new Tricycle();
		}
	};
}

public class Exercise16 {
	public static void serviceConsumer(CycleFactory factory){
		Cycle  c= factory.getCycle();
		print(c.getWheelCount());
	}
	
	public static void  main(String[] args){
		serviceConsumer(Unicycle.factory);
		serviceConsumer(Bicycle.factory);
		serviceConsumer(Tricycle.factory);
	}
}
