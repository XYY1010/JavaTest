package com.xyy.test14;

import static com.xyy.tools.Print.*;

public class Exercise1601 {

	public static void printArray(BerylliumSphere[] b) {
		for (int i = 0; i < b.length; i++) {
			print(b[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() });
		BerylliumSphere[] b;
		b =	new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
		printArray(b);
	}

}
