package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class MyList {
	public static List<Integer> getReversed(List<Integer> aList) {
		Collections.reverse(aList);
		return aList;
	}
}

public class Exercise1625 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		print(Arrays.toString(a));
		List<Integer> aList = Arrays.asList(1, 2, 3, 4, 5);
		print(MyList.getReversed(aList));
	}

}
