package com.xyy.test13;

import java.util.ArrayList;

public class ErasedTypeEquivalence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}

}
