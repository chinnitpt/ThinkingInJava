package innerclasses;

class Outer{
	class Inner{
		
	}
	
	public Inner getInner(){
		return new Inner();
	}
}



public class Exercise1 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().getInner();
		
	}

}
