package com.xyy.test8;

public class Parcel3 {

	class Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) { label = whereTo; }
		String readLabel() { return label; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
	}

}
