package com.xyy.test14;

import java.util.Arrays;
import java.util.Iterator;

public class Exercise1602 {

	public static BerylliumSphere[] f(int n) {
		BerylliumSphere[] b = new BerylliumSphere[n];
		for (int i = 0; i < n; i++) {
			b[i] = new BerylliumSphere();
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(f(10)));
	}

}
