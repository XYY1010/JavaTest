package com.xyy.test12;

public class BoundedClassReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		// Or anything else derived from Number
	}

}
