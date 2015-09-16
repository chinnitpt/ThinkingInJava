package accesscontrol;
public class Exercise5 {
	public static void main(String[] args){
		Exercise5Helper helper = new Exercise5Helper();
		
//		helper.privateMethod();
		helper.publicMethod();
		helper.protectedMethod();
		helper.packageMethod();
	}
}

