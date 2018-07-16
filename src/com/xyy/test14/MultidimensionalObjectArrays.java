package com.xyy.test14;

import java.util.Arrays;

public class MultidimensionalObjectArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[][] spheres = {
			{ new BerylliumSphere(), new BerylliumSphere() }, 
			{ new BerylliumSphere(), new BerylliumSphere(),
			  new BerylliumSphere(), new BerylliumSphere() },
			{ new BerylliumSphere(), new BerylliumSphere(),
			  new BerylliumSphere(), new BerylliumSphere(),
			  new BerylliumSphere(), new BerylliumSphere() }
		};
		System.out.println(Arrays.deepToString(spheres));
	}

}
