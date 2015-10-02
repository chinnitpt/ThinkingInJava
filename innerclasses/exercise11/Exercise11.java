package innerclasses.exercise11;

class A{
	private class B implements IExercise11{
		@Override
		public void a(){
			
		}
	}
	
	public IExercise11 getInnerClass(){
		return new B();
	}
	
	
}


public class Exercise11 {
	public static void main(String[] args){
		A a = new A();
		IExercise11 ex11 =a.getInnerClass();
		//((A.B)ex11).a();
		
	}

}
