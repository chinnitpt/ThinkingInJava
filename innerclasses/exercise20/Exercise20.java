package innerclasses.exercise20;
import static net.mindview.util.Print.*;
public interface Exercise20{
	void f();
	class Test implements Exercise20{
		@Override
		public void f()
		{
			print("Inner class in an interface");
		}
		public static void  main(String[] args){
			new Test().f();
		}
	}
}
