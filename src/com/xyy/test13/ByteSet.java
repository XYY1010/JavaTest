package com.xyy.test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ByteSet {

	static Byte[] possibles = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
	// But you can't do this:
	// Set<Byte> mySet2 = new HashSet<Byte>(Arrays.<Byte>asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Byte b : mySet) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println(mySet);
	}

}
