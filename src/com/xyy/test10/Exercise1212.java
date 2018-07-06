package com.xyy.test10;

interface Selector {
	boolean end();
	Object current();
	void next();
}

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x)  throws ArrayIndexOutOfBoundsException {
		if (next < items.length) {
			items[next++] = x;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (i < items.length) {
				i++;
			}
		}
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
}

public class Exercise1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence(10);
		try {
			for (int i = 0; i < 20; i++) {
				sequence.add(Integer.toString(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

}
