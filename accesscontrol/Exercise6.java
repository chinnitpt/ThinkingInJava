package accesscontrol;

public class Exercise6 {

	public static void main(String[] args) {
		new ProtectedDataManipulator();
		
	}

}

class ProtectedData{
	protected int value = 56;
}

class ProtectedDataManipulator{
	ProtectedData data = new ProtectedData();
	public ProtectedDataManipulator() {
		data.value= data.value+56;
	}
}
