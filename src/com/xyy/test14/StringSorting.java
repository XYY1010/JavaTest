package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.xyy.tools.RandomGenerator;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		print("Before sorting: " + Arrays.toString(sa));
		Arrays.sort(sa);
		print("After sorting: " + Arrays.toString(sa));
		Arrays.sort(sa, Collections.reverseOrder());
		print("Reverse sorting: " + Arrays.toString(sa));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		print("Case-insensitive sort: " + Arrays.toString(sa));
	}

}
