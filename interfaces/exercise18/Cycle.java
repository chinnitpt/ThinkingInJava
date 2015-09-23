package interfaces.exercise18;

public interface Cycle {
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
}

class UniCycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	@Override
	public int getWheelCount() {
		return 2;
	}
}

class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	@Override
	public int getWheelCount() {
		return 3;
	}
}
class TricycleFactory implements CycleFactory{
	@Override
	public Cycle getCycle(){
		return new Tricycle();
	}
}
