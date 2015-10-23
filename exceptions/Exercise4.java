package exceptions;

class MyOwnException extends Exception{
	private String s;
	
	public MyOwnException(String s){
		super(s);
		this.s = s;
	}
	
	public void displayString(){
		System.out.println(s);
	}
	
}

public class Exercise4 {
	
	
	
	public static void main(String[] args) {
		try{
			throw new MyOwnException("My Own Exception thrown");
		}catch(MyOwnException moe){
			moe.printStackTrace();
			moe.displayString();
		}
	}

}
