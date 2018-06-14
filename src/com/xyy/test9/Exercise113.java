package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Collection;

interface Selector {
	boolean end();
	Object current();
	void next();
}

class Sequence {
	private Collection<Object> items;
	private int next = 0;
	public Sequence() { items = new ArrayList<Object>(); }
	public void add(Object x) {
		items.add(x);
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.size(); }
		public Object current() { return ((ArrayList<Object>)items).get(i); }
		public void next() { if(i < items.size()) i++; }
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
}

public class Exercise113 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence();
		for (int i = 0; i < 100; i++) {
			sequence.add(i * i);
		}
		Selector s = sequence.selector();
		while(!s.end()) {
			printnb(s.current() + ", ");
			s.next();
		}
	}

}
