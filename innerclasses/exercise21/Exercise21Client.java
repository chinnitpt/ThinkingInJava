package innerclasses.exercise21;

public class Exercise21Client implements Exercise21{

	@Override
	public void f(){
		System.out.println("Exercise21Implementation");
	}
	public static void main(String[] args){
		Exercise21 ex21 = new Exercise21Client();
		Exercise21.A.a(ex21);
	}
}
