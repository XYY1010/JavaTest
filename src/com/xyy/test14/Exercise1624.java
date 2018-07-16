package com.xyy.test14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static com.xyy.tools.Print.*;

class CTestComparator implements Comparator<CTest> {

	@Override
	public int compare(CTest o1, CTest o2) {
		// TODO Auto-generated method stub
		return (o1.getNum() < o2.getNum() ? -1 : (o1.getNum() == o2.getNum() ? 0 : 1));
	}
	
}

public class Exercise1624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		CTest[] c = new CTest[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new CTest(rand.nextInt(100));
		}
		print("before sorting");
		print(Arrays.toString(c));
		Arrays.sort(c, new CTestComparator());
		print("after sorting");
		print(Arrays.toString(c));
		int index = Arrays.binarySearch(c, c[1], new CTestComparator());
		print("Location " + index + ": " + c[index]);
	}

}
