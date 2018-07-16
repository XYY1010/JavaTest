package com.xyy.test14;

import java.util.Arrays;

import com.xyy.tools.CountingGenerator;

public class Exercise1612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 11;
		double[] res = new double[size];
		Double[] a = Generated.array(Double.class, new CountingGenerator.Double(), size);
		for (int i = 0; i < size; i++) {
			res[i] = a[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
