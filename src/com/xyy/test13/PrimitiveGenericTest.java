package com.xyy.test13;

import com.xyy.tools.Generator;
import com.xyy.tools.RandomGenerator;

// Fill an array using a generator:
class FArray {
	public static <T> T[] Fill(T[] a, Generator<T> gen) {
		for (int i = 0; i < a.length; i++) {
			a[i] = gen.next();
		}
		return a;
	}
}

public class PrimitiveGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = FArray.Fill(new String[7], new RandomGenerator.String(10));
		for (String string : strings) {
			System.out.println(string);
		}
		Integer[] integers = FArray.Fill(new Integer[7], new RandomGenerator.Integer());
		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}

}
