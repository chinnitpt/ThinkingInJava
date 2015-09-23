package interfaces;
import static net.mindview.util.Print.*;
abstract class AbstractClassWithNoMethods{
	
}

class ConcreteClassForAbstractClassWithNoMethods extends AbstractClassWithNoMethods{
	
	public void a(){
		print("ConcreteClassForAbstractClassWithNoMethods.a()");
	}
}


public class Exercise4 {
	public static void  b(AbstractClassWithNoMethods acwnm){
		ConcreteClassForAbstractClassWithNoMethods concreteClass = (ConcreteClassForAbstractClassWithNoMethods)acwnm;
		concreteClass.a();
	}
	
	public static void main(String[] args){
		AbstractClassWithNoMethods abstractClass = new ConcreteClassForAbstractClassWithNoMethods();
		b(abstractClass);
	}
}
