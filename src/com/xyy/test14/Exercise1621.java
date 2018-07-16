package com.xyy.test14;

import static com.xyy.tools.Print.print;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class BerylliumSphereComparator implements Comparator<BerylliumSphere> {

	@Override
	public int compare(BerylliumSphere o1, BerylliumSphere o2) {
		// TODO Auto-generated method stub
		return (o1.getId() < o2.getId() ? 1 : (o1.getId() == o2.getId() ? 0 : -1));
	}
	
}

public class Exercise1621 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] b = new BerylliumSphere[10];
		for (int i = 0; i < 10; i++) {
			b[i] = new BerylliumSphere();
		}
		print("before sorting:");
		print(Arrays.toString(b));
		Arrays.sort(b, new BerylliumSphereComparator());
		print("after sorting:");
		print(Arrays.toString(b));
	}

}
