package com.xyy.test14;

import java.util.Arrays;

import static com.xyy.tools.Print.*;

public class ComparingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		Arrays.fill(a1, 47);
		Arrays.fill(a2, 47);
		print(Arrays.equals(a1, a2));
		a2[3] = 11;
		print(Arrays.equals(a1, a2));
		String[] s1 = new String[4];
		Arrays.fill(s1, "Hi");
		String[] s2 = { new String("Hi"), new String("Hi"), new String("Hi"), new String("Hi") };
		print(Arrays.equals(s1, s2));
	} 

}