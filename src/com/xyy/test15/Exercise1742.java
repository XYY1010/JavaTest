package com.xyy.test15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xyy.tools.CollectionData;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;
import com.xyy.tools.RandomGenerator;

class TwoStringAlphabetize implements Comparable<TwoStringAlphabetize> {
	public String s1;
	public String s2;
	public TwoStringAlphabetize(String s1, String s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	public String toString() {
		return "[ s1 = " + s1 + ", s2 = " + s2 + " ]" ;
	}
	
	@Override
	public int compareTo(TwoStringAlphabetize o) {
		// TODO Auto-generated method stub
		return s1.toLowerCase().compareTo(o.s1.toLowerCase());
	}
	
	public static RandomGenerator.String gen = new RandomGenerator.String();
	public static Generator<TwoStringAlphabetize> generator() {
		return new Generator<TwoStringAlphabetize>() {
			
			@Override
			public TwoStringAlphabetize next() {
				// TODO Auto-generated method stub
				return new TwoStringAlphabetize(gen.next(), gen.next());
			}
		};
	}
}

public class Exercise1742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TwoStringAlphabetize> list = new ArrayList<TwoStringAlphabetize>(CollectionData.list(TwoStringAlphabetize.generator(), 10));
		print("before sorting, list = " + list);
		Collections.sort(list);
		print("\nafter sorting with alphabetization, list = " + list);
	}

}
