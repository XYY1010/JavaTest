package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public long getId() { return id; }
	public String toString() { return "Sphere " + id; }
}

public class ContainerComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i = 0; i < 5; i++) {
			spheres[i] = new BerylliumSphere();
		}
		print(Arrays.toString(spheres));
		print(spheres[4]);
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for (int i = 0; i < 5; i++) {
			sphereList.add(new BerylliumSphere());
		}
		print(sphereList);
		print(sphereList.get(4));
		
		int[] integers = { 0, 1, 2, 3, 4, 5 };
		print(Arrays.toString(integers));
		print(integers[4]);
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		intList.add(99);
		print(intList);
		print(intList.get(4));
	}

}
