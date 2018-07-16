package com.xyy.test14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static com.xyy.tools.Print.*;

class IntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1 < o2 ? 1 : (o1 == o2 ? 0 : -1));
	}
	
}

public class Exercise1623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Integer[] a = new Integer[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a, new IntegerComparator());
		print("after sorting");
		print(Arrays.toString(a));
	}

}
