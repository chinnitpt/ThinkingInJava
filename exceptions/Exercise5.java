package exceptions;

public class Exercise5 {

	public static void main(String[] args) {
		boolean has_exception= true;
		int i = 0;
		while(has_exception){
			try{
				if(i<10){
					i++;
					throw new Exception();
				}
				has_exception = false;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("Finally Exception Resolved");

	}

}
