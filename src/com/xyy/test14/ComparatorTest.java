package com.xyy.test14;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.Comparator;

class CompTypeComparator implements Comparator<CompType> {
	@Override
	public int compare(CompType o1, CompType o2) {
		// TODO Auto-generated method stub
		return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a, new CompTypeComparator());
		print("after sorting:");
		print(Arrays.toString(a));
	}

}
