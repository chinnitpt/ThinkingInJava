package operators;
import static net.mindview.util.Print.*;


class FloatAliasingDemo{
	float f;
}

public class Exercise2 {
	public static void main(String[] args)
	{
		FloatAliasingDemo f1 = new FloatAliasingDemo();
		f1.f = 24.4f;
		
		FloatAliasingDemo f2 = new FloatAliasingDemo();
		f2.f = 25.7f;
		
		print("f1.f:"+f1.f);
		print("f2.f:"+f2.f);
		
		f1= f2;
		
		print("f1.f:"+f1.f);
		print("f2.f:"+f2.f);
		
		f2.f = 26.5f;
		
		print("f1.f:"+f1.f);
		print("f2.f:"+f2.f);
		
		
				
		
		
	}
}
