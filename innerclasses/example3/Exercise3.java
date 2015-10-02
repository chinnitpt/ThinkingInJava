package innerclasses.example3;
import static net.mindview.util.Print.*;

class Outer{
	private String str ;
	
	public Outer(String s){
		str = s;
	}
	
	class Inner{
		@Override
		public String toString(){
			return str;
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
}

public class Exercise3 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer("hello").getInner();
		print(inner);
	}

}
