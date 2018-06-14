package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise1022 {

	public class Sequence {

		private Object[] items;
		private int next = 0;
		public Sequence(int size) { items = new Object[size]; }
		public void add(Object x) {
			if (next < items.length) {
				items[next++] = x;
			}
		}
		
		private class SequenceSelector implements Selector {
			private int i = 0;
			public boolean end() { return i == items.length; }
			public Object current() { return items[i]; }
			public void next() { if(i < items.length) i++; }
			public void reference() { 
				Sequence s = new Sequence(10);
				Sequence.SequenceSelector sqs = s.new SequenceSelector();
			}
		}
		
		public Selector selector() {
			return new SequenceSelector();
		}
		
		public Selector reverseSelector() {
			Sequence s = new Sequence(items.length);
			for(int i = 0; i < items.length; i++) {
				s.add((String)items[items.length - 1 - i]);
			}
			Selector selector = s.selector();
			return selector;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1022 e = new Exercise1022();
		Exercise1022.Sequence sequence = e.new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i * i));
		}
		Selector selector = sequence.reverseSelector();
		while (!selector.end()) {
			printnb(selector.current() + " ");
			selector.next();
		}
	}

}
