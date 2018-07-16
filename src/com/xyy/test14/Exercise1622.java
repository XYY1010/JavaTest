package com.xyy.test14;

import java.util.Arrays;

import com.xyy.tools.RandomGenerator;

public class Exercise1622 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = Generated.array(new String[10], new RandomGenerator.String(5));
		System.out.println(Arrays.toString(sa));
		int index = Arrays.binarySearch(sa, sa[5]);
		System.out.println("Index: " + index + "\n" + sa[index]);
	}

}
