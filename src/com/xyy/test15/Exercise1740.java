package com.xyy.test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.xyy.test14.Generated;
import com.xyy.tools.CollectionData;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;
import com.xyy.tools.RandomGenerator;

class TwoString implements Comparable<TwoString> {
	public String s1;
	public String s2;
	public TwoString(String s1, String s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	public String toString() {
		return "[ s1 = " + s1 + ", s2 = " + s2 + " ]"; 
	}
	@Override
	public int compareTo(TwoString o) {
		// TODO Auto-generated method stub
		return s1.compareTo(o.s1);
	}
	private static RandomGenerator.String gen = new RandomGenerator.String();
	public static Generator<TwoString> generator() {
		return new Generator<TwoString>() {
			
			@Override
			public TwoString next() {
				// TODO Auto-generated method stub
				return new TwoString(gen.next(), gen.next());
			}
		};
	}
}

class CompareSecond implements Comparator<TwoString> {
	public int compare(TwoString sc1, TwoString sc2) {
		return sc1.s2.compareTo(sc2.s2);
	}
}

public class Exercise1740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoString[] array = new TwoString[10];
		Generated.array(array, TwoString.generator());
		print("before sorting, array = " + Arrays.asList(array));
		Arrays.sort(array);
		print("\nafter sorting, array = " + Arrays.asList(array));
		Arrays.sort(array, new CompareSecond());
		print("\nafter sorting with CompareSecond, array = " + Arrays.asList(array));
		ArrayList<TwoString> list = new ArrayList<TwoString>(CollectionData.list(TwoString.generator(), 10));
		TwoString zeroth = list.get(0);
		print("\nbefore sorting, list = " + list);
		Collections.sort(list);
		print("\nafter sorting, list = " + list);
		Comparator<TwoString> comp = new CompareSecond();
		Collections.sort(list, comp);
		print("\nafter sorting with CompareSecond, list = " + list);
		int index = Collections.binarySearch(list, zeroth, comp);
		print("\nFormer zeroth element " + zeroth + " now located at " + index);
	}

}
