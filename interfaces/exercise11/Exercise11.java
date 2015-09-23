package interfaces.exercise11;

public class Exercise11 {

	public static void process(Processor p , Object o){
		p.process(o);
	}
	
	public static void main(String[] args) {
		 String s = "Hello World!!!";
		 StringSwapperAdapter swapper = new StringSwapperAdapter(new StringSwapper());
		 process(swapper, s);
	}

}
