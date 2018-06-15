package com.xyy.test9;

import static com.xyy.tools.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		print("Before shuffling: " + list1);
		Collections.shuffle(list1, rand);
		print("After shuffling: " + list1);
		print("array: " + Arrays.toString(ia));
		
		List<Integer> list2 = Arrays.asList(ia);
		print("Before shuffling: " + list2);
		Collections.shuffle(list2, rand);
		print("After shuffling: " + list2);
		print("arrays: " + Arrays.toString(ia));
	}

}
