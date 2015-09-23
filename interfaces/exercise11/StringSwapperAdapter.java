package interfaces.exercise11;

public class StringSwapperAdapter implements Processor {
	private StringSwapper swapper;
	
	public StringSwapperAdapter(StringSwapper swapper){
		this.swapper = swapper;
	}
	
	@Override
	public void process(Object s) {
		
		swapper.process((String)s);
	}

	@Override
	public String getName() {
		return swapper.getName();
	}

}
