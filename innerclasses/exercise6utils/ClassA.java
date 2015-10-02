package innerclasses.exercise6utils;
import innerclasses.exercise6.*;
import static net.mindview.util.Print.*;

public class ClassA {
	
	    public class ClassB implements A{
		
		public ClassB(){
			
		}
		
		
		@Override
		public void a(){
			print("In protected classB");
		}
	}
	
	
}
