package polymorphism.exercise16;

import static net.mindview.util.Print.*;


class AlertStatus{
	public void reportStatus(){
		print("Alert Status");
	}
}

class WarningStatus extends AlertStatus{
	public void reportStatus(){
		print("Warning Status");
	}
}

class InfoStatus extends AlertStatus{
	public void reportStatus(){
		print("Information Status");
	}
}


class StarShip{
	private AlertStatus alert = new AlertStatus();
	
	public void changeStatusToWarn(){
		alert = new WarningStatus();
	}
	
	public void changeStatusToInfo(){
		alert = new InfoStatus();
	}
	
	public void printStatus(){
		alert.reportStatus();
	}
	
}

// State Pattern
public class Transmogrify {
	public static void main(String[] args) {
		StarShip ship = new StarShip();
		ship.printStatus();
		ship.changeStatusToInfo();
		ship.printStatus();
		ship.changeStatusToWarn();
		ship.printStatus();
	}

}
