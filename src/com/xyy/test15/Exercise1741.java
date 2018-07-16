package com.xyy.test15;

import java.util.HashMap;
import java.util.HashSet;

import com.xyy.tools.CollectionData;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;
import com.xyy.tools.RandomGenerator;

class TwoString2 implements Comparable<TwoString2> {
	public String s1;
	public String s2;
	public TwoString2(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public String toString() {
		return "[ s1 = " + s1 + ", s2 = " + s2 + " ]";  
	}
	
	@Override
	public int compareTo(TwoString2 o) {
		// TODO Auto-generated method stub
		return s1.compareTo(o.s1);
	}
	private static RandomGenerator.String gen = new RandomGenerator.String();
	public static Generator<TwoString2> generator() {
		return new Generator<TwoString2>() {

			@Override
			public TwoString2 next() {
				// TODO Auto-generated method stub
				return new TwoString2(gen.next(), gen.next());
			}
			
		};
	} 
	public int hashCode() {
		// Since the comparisons are based on s1,
		// use s1's hashCode:
		return s1.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof TwoString2 &&
				((TwoString2)obj).s1.equals(s1);
	}
}

public class Exercise1741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<TwoString2> hs = new HashSet<TwoString2>();
		HashMap<TwoString2, Integer> hm = new HashMap<TwoString2, Integer>();
		Generator<TwoString2> gen = TwoString2.generator();
		hs.addAll(CollectionData.list(gen, 20));
		for (int i = 0; i < hs.size(); i++) {
			hm.put(gen.next(), i);
		}
		print("hs = " + hs);
		print("\nhm = " + hm);
	}

}
