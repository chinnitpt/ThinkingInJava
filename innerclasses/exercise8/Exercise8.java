package innerclasses.exercise8;
import static net.mindview.util.Print.*;

class Outer
{
	int i = getInner().val1;
	String s = getInner().getStringValue();
	class Inner{
		private int val1 = 34;
		private String s1 ="Hello World";
		
		private String getStringValue(){
			return val1+" "+s1;
		}
	}
	
	
	public Inner getInner(){
		return new Inner();
	}
	
}

public class Exercise8 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		print(outer.i);
		print(outer.s);

	}

}
