package reusingclasses;

public class Exercise1 {
	private SimpleClass simpleClass;
	
	public SimpleClass getSimpleClass()
	{
		if (simpleClass==null){
			simpleClass = new SimpleClass();
		}
		return simpleClass;
	}

}

class SimpleClass
{
	
}
