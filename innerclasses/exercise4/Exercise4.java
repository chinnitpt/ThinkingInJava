package innerclasses.exercise4;

import static net.mindview.util.Print.*;

interface Selector {
	public boolean end();

	public void next();

	Object current();
}

class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int itemsSize) {
		items = new Object[itemsSize];
	}

	public void add(Object o) {
		items[next++] = o;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public void next() {
			if (i < items.length) {
				i++;
			}
		}

		public Object current() {
			return items[i];
		}

		public Sequence getSequence() {
			return Sequence.this;
		}

	}

	public Selector getSelector() {
		return new SequenceSelector();
	}
}

class StringHolder {
	private String s = "String Holder";

	public StringHolder(String str) {
		s = str;
	}

	@Override
	public String toString() {
		return s;
	}

}

public class Exercise4 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)

		{
			sequence.add(new StringHolder(Integer.toString(i)));
		}

		Selector selector = sequence.getSelector();

		while (!selector.end())

		{
			print(selector.current());
			selector.next();
		}
	}
}
