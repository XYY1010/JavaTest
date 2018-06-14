package com.xyy.test9;

import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList apples = new ArrayList();		//·ºÐÍÈÝÆ÷ArrayList
		for(int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple)apples.get(i)).id();
		}
	}

}
