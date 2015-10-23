package exceptions;

class A{
	public void methodB(){
		
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		A a = null;
		try{
			a.methodB();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
