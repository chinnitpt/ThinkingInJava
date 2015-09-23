package interfaces;
abstract class AbstractPrintClass
{
	AbstractPrintClass(){
		print();
	}
	
	protected abstract void print();
}

class ConcretePrintClass extends AbstractPrintClass{
	private int i = 5;
	public void print(){
		System.out.println(i);
	}
}


public class Exercise3 {

	public static void main(String[] args) {
		ConcretePrintClass p = new ConcretePrintClass();
		p.print();
	}

}
