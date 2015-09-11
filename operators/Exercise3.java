package operators;
import static net.mindview.util.Print.*;
class FloatHolder{
	float f1;
}

public class Exercise3 {
	
	public static void modifyFloatHolderValues(FloatHolder f)
	{
		f.f1 = 25.5f;
	}
	
	public static void main(String[] args){
		FloatHolder f = new FloatHolder();
		f.f1 = 23.1f;
		print("f.f1:"+f.f1);
		modifyFloatHolderValues(f);
		print("f.f1:"+f.f1);
	}
	
}
