package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Parcel7 {

	public Contents contents() {
		return new Contents(){	// Insert a class definition 
			private int i = 11;
			public int value() { return i; }
		}; // Semicolon(·ÖºÅ) required in this case
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		print(c.value());
	}

}
