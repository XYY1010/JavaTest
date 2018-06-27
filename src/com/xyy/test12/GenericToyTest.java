package com.xyy.test12;

public class GenericToyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<FancyToy> ftClass = FancyToy.class;
		Class<? super FancyToy> up = ftClass.getSuperclass();
		// This won't compile:
		// Class<Toy> up2 = ftClass.getSuperclass();
		// Only produces Object:
		Object obj = up.newInstance();
	}

}
