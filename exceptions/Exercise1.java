package exceptions;

public class Exercise1 {
	public static void main(String[] args) {

		try{
			throw new Exception("Throwing an Exception");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
