package com.xyy.test14;

import java.util.Arrays;

public class AssemblingMutidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] a;
		a = new Integer[3][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer[3];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i * j;	// Autoboxing
			}
		}
		System.out.println(Arrays.deepToString(a));
	}

}
