package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Parcel1 {

	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		String readLabel() { return label; }
	}
	
	// Using inner classes looks just like
	// using any other classes, within Parcel1:
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		print(d.readLabel());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}

}
