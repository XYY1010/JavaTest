package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Parcel2 {
	
	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() { return label; }
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		print(d.readLabel());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
		print(d.readLabel());
	}

}
