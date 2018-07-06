package com.xyy.test13;

import java.util.List;

public class SuperTypeWildcards {
	
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit());  // Error
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
