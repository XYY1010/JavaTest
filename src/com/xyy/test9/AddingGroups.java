package com.xyy.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Integer[] moreInts = { 7, 8, 9, 10, 11, 12 };
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 13, 14, 15, 16, 17, 18);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(19, 20, 21, 22, 23, 24);
		list.set(1,  99);
		//list.add(21); // Runtime error because the underlying array cannot be resized;
	}

}
