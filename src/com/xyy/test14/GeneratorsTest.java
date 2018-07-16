package com.xyy.test14;

import com.xyy.tools.CountingGenerator;
import com.xyy.tools.Generator;

public class GeneratorsTest {
	public static int size = 10;
	public static void test(Class<?> surroundingClass) {
		for (Class<?> type : surroundingClass.getClasses()) {
			System.out.print(type.getSimpleName() + ": ");
			try {
				Generator<?> g = (Generator<?>) type.newInstance();
				for (int i = 0; i < size; i++) {
					System.out.print(g.next() + " ");
				}
				System.out.println();
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(CountingGenerator.class);
	}

}
