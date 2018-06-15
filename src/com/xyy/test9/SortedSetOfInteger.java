package com.xyy.test9;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for (int i = 0; i < 100000; i++) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}

}
