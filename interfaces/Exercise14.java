package interfaces;
import static net.mindview.util.Print.*;
interface One
{
	void a();
	void b();
}

interface Two{
	void c();
	void d();
}

interface Three{
	void e();
	void f();
}

interface  Four extends One, Two, Three{
	void g();
}

class ConcreteBaseClass {
	
	public void h(){
		print("ConcreteClass.h()");
	}
}



public class Exercise14 extends ConcreteBaseClass implements Four{
	public static void i(One one){
		
	}
	
	public static void j(Two two){
		
	}
	
	public static void k(Three three){
		
	}
	
	public static void l(Four four){
		
	}
	
	@Override
	public void a(){
		
	}
	
	@Override
	public void b(){
		
	}
	
	@Override
	public void c(){
		
	}
	
	@Override
	public void d(){
		
	}
	
	@Override
	public void e(){
		
	}
	
	@Override
	public void f(){
		
	}
	
	@Override
	public void g(){
		
	}
	public static void main(String[] args) {
		Exercise14 e14 = new Exercise14();
		i(e14);
		j(e14);
		k(e14);
		l(e14);
		
	}

}
