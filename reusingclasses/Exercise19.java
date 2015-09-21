package reusingclasses;

class Exercise19BaseClass{
	
}


public class Exercise19 {
	private  final Exercise19BaseClass baseClass;
	
	public Exercise19()
	{
		baseClass = new Exercise19BaseClass();
	}
	
	public void modifyBaseClass(){
//		this.baseClass =new Exercise19BaseClass();
	}
	
	public Exercise19BaseClass getBaseClass(){
		return baseClass;
	}
	
	public static void main(String[] args) {
		

	}

}
