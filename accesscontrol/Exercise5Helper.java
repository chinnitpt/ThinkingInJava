package accesscontrol;

import static net.mindview.util.Print.print;

public class Exercise5Helper {
	int packageAcess = 55;
	private int privateInt=25;
	public int publicInt=35;
	protected int protectedInt =45;
	
	private void privateMethod(){
		print("Private Integer Value:"+ privateInt);
	}
	
	public void publicMethod(){
		print("Public Integer Value:"+publicInt);
	}
	
	protected void protectedMethod(){
		print("Protected Integer Value:"+protectedInt);
	}
	
	void packageMethod(){
		print("Package access Integer Value:"+packageAcess);
	}
}
