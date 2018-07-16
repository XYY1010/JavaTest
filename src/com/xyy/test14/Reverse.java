package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		print("after sorting");
		print(Arrays.toString(a));
	}

}
