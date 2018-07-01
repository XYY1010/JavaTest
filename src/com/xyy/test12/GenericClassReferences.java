package com.xyy.test12;

public class GenericClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;	// Same thing
		intClass = double.class;
		// genericIntClass = double.class; // Illegal
	}

}
