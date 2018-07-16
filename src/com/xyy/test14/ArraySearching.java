package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;

import com.xyy.tools.ConvertTo;
import com.xyy.tools.Generator;
import com.xyy.tools.RandomGenerator;

public class ArraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
		Arrays.sort(a);
		print("Sorted array: " + Arrays.toString(a));
		while (true) {
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if (location >= 0) {
				print("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
				break;	// Out of while loop
			}
		}
	}

}
