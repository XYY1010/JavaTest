package com.xyy.test14;

import com.xyy.tools.Generator;
import com.xyy.tools.RandomGenerator;

public class Exercise1611 {
	
	static class FArray {
		public static <T> T[] fill(T[] a, Generator<T> gen) {
			for (int i = 0; i < a.length; i++) {
				a[i] = gen.next();
			}
			return a;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
		for (String string : strings) {
			System.out.println(string);
		}
		Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer());
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		// int[] b = FArray.fill(new int[7], new RandomGenerator.Integer());
		// 不能正常运行，因为 java 虽然可以将 Integer 替换为 int，但是自动包装机制不能用于数组
	}

}
