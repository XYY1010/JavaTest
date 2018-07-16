package com.xyy.test14;

import java.util.Arrays;
import java.util.Random;

import static com.xyy.tools.Print.*;

public class Exercise1604 {

	public static Double[][][] threeDimension(int m, int n, int l) {
		Random rand = new Random();
		Double[][][] a;
		a = new Double[m][][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Double[n][];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = new Double[l];
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = m + ((float)((int)Math.round(rand.nextDouble() * 100))) / 100.0; 
				}
			}
		}
		return a;
	}
	
	public static void printD(Double[][][] a) {
		print(Arrays.deepToString(a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printD(threeDimension(4, 3, 2));
	}

}
