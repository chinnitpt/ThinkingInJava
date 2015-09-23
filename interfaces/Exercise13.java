package interfaces;


interface A{
	void f();
}

interface B extends A{
	void g();
}

interface C extends A
{
	void h();
}

interface D extends B, C{
	void i();
}

class DImpl implements D{
	public void f(){
		
	}
	public void g(){
		
	}
	
	public void h(){
		
	}
	
	public void i(){
		
	}
	
}
public class Exercise13 {
	public static void main(String[] args){
		DImpl dimpl = new DImpl();
		((A)dimpl).f();
		((B)dimpl).g();
		((C)dimpl).h();
		((D)dimpl).i();
	}
}
