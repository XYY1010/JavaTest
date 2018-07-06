package com.xyy.test13;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? extends Fruit> fList = Arrays.asList(new Apple());
		Apple a = (Apple)fList.get(0); // No warning
		fList.contains(new Apple());   // Argument is 'Object'
		fList.indexOf(new Apple());	   // Argument is 'Object'
	}

}
