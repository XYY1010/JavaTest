package com.xyy.test8;

public class Parcel9 {

	// Argument must be final to use inside
	//anonymous inner class:
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}

}
