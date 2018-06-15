package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			printnb(t + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
		// An array works in foreach, but it's not Iterable:
		//! test(strings)
		// must explicitly convert it to an Iterable
		test(Arrays.asList(strings));
	}

}
