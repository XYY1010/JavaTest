package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Iterator;

public class Exercise1618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BerylliumSphere[] b = new BerylliumSphere[10];
		for (int i = 0; i < 10; i++) {
			b[i] = new BerylliumSphere();
		}
		print("b = " + Arrays.toString(b));
		BerylliumSphere[] bc = new BerylliumSphere[b.length];
		System.arraycopy(b, 0, bc, 0, b.length);
		print("bc = " + Arrays.toString(bc));
		for (int i = 0; i < 10; i++) {
			b[i] = new BerylliumSphere();
		}
		print("b = " + Arrays.toString(b));
		print("bc = " + Arrays.toString(bc));
	}

}
