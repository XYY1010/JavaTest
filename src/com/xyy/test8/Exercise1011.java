package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise1011 {

	private class Inner implements Destination {
		private String label;
		public Inner(String toWhere) {
			this.label = toWhere;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
	}
	
	public Destination destination(String s) {
		Inner inner = new Inner(s);
		return inner;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1011 exercise1011 = new Exercise1011();
		print(((Inner)exercise1011.destination("qqq")).readLabel());
	}

}
