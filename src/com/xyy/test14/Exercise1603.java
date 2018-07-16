package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Random;

public class Exercise1603 {

	public static double[][] doubleDimension(int m, int n) {
		Random rand = new Random();
		double[][] a;
		a = new double[m][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new double[n];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = m + ((int)(rand.nextDouble() * 100)) * 1.0 / 100;
			}
		}
		return a;
	}
	
	public static void printDoubleDimension(double[][] a) {
		print(Arrays.deepToString(a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDoubleDimension(doubleDimension(5, 6));
	}

}
