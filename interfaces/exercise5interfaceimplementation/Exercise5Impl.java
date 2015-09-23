package interfaces.exercise5interfaceimplementation;
import static net.mindview.util.Print.*;

import accesscontrol.Exercise6;
import interfaces.Exercise5;
public class Exercise5Impl implements Exercise5 {

	@Override
	public void a(){
		print("Exercise5Impl.a()");
	}
	
	@Override
	public void b(){
		print("Exercise5Impl.b()");
	}
	
	@Override
	public void c(){
		print("Exercise5Impl.c()");
	}
	
	public static void main(String[] args) {
		Exercise5 exercise5 = new Exercise5Impl();
		exercise5.a();
		exercise5.b();
		exercise5.c();
		
	}

}
