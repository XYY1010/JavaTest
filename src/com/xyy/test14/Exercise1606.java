package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

public class Exercise1606 {
	
	public static void BeryArray(int m, int n) {
		BerylliumSphere[][] b;
		b = new BerylliumSphere[m][];
		for (int i = 0; i < b.length; i++) {
			b[i] = new BerylliumSphere[n];
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = new BerylliumSphere();
			}
		}
		print(Arrays.deepToString(b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeryArray(4, 3);
	}

}
