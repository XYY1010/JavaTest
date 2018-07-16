package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

public class Exercise1620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a1;
		a1 = new int[2][][];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = new int[2][];
			for (int j = 0; j < a1[i].length; j++) {
				a1[i][j] = new int[2];
				for (int k = 0; k < a1[i][j].length; k++) {
					a1[i][j][k] = i + j + k;
				}
			}
		}
		print("a1 = " + Arrays.deepToString(a1));
		int[][][] a2;
		a2 = new int[2][][];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = new int[2][];
			for (int j = 0; j < a2[i].length; j++) {
				a2[i][j] = new int[2];
				for (int k = 0; k < a2[i][j].length; k++) {
					a2[i][j][k] = i + j + k;
				}
			}
		}
		print("a2 = " + Arrays.deepToString(a2));
		print("a1 == a2 ? " + Arrays.deepEquals(a1, a2));
		int[][][] a3;
		a3 = new int[2][][];
		for (int i = 0; i < a3.length; i++) {
			a3[i] = new int[2][];
			for (int j = 0; j < a3[i].length; j++) {
				a3[i][j] = new int[2];
				for (int k = 0; k < a3[i][j].length; k++) {
					a3[i][j][k] = i * j * k;
				}
			}
		}
		print("a3 = " + Arrays.deepToString(a3));
		print("a1 == a3 ? " + Arrays.deepEquals(a1, a3));
	}

}
