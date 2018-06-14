package com.xyy.test9;

import java.util.Iterator;

class Sequence1 {
	private Object[] items;
	private int next = 0;
	public Sequence1(int size) { items = new Object[size]; }
	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	
	private class SequenceSelector implements Iterator<Object> {
		private int i = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i != items.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (i < items.length) {
				return items[i++];
			}else {
				return null;
			}
		}
	}
	
	public Iterator<Object> iteratorS() {
		return new SequenceSelector();
	}
}

public class Exercise119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence1 sequence = new Sequence1(10);
	    for(int i = 0; i < 10; i++)
	      sequence.add(Integer.toString(i));
	    Iterator<Object> it = sequence.iteratorS();
	    while(it.hasNext()) {
	      System.out.print(it.next() + " ");
	    }
	}

}
