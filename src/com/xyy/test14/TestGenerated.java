package com.xyy.test14;

import java.util.Arrays;

import com.xyy.tools.CountingGenerator;

public class TestGenerated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 9, 8, 7, 6 };
		System.out.println(Arrays.toString(a));
		a= Generated.array(a, new CountingGenerator.Integer());
		System.out.println(Arrays.toString(a));
		Integer[] b = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
		System.out.println(Arrays.toString(b));
	}

}
