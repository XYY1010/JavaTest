package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise115 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(47);
		List<Integer> ints = new ArrayList<Integer>(7);
		for (int i = 0; i < 7; i++) {
			ints.add(random.nextInt(100));
		}
		print("1: " + ints);
		Integer i1 = new Integer(71);
		ints.add(i1);
		print("2: " + ints);
		print("3: " + ints.contains(i1));
		ints.remove(i1);
		Integer i2 = ints.get(2);
		print("4: " + i2 + " " + ints.indexOf(i2));
		Integer i3 = new Integer(13);
		print("5: " + ints.indexOf(i3));
		print("6: " + ints.remove(i3));
		print("7: " + ints.remove(i2));
		print("8: " + ints);
		ints.add(3, new Integer(23));
		print("9: " + ints);
		List<Integer> sub = ints.subList(1,  4);
		print("subList: " + sub);
		print("10: " + ints.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, random);
		print("shuffled subList: " + sub);
		print("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Integer>(ints);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(1, new Integer(87));
		print("16: " + copy);
		copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + ints.isEmpty());
		ints.clear();
		print("19: " + ints);
		print("20: " + ints.isEmpty());
		List<Integer> ints1 = new ArrayList<Integer>(4);
		for (int i = 0; i < 4; i++) {
			ints1.add(random.nextInt(100));
		}
		ints.addAll(ints1);
		print("21: " + ints);
		Object[] o = ints.toArray();
		print("22: " + o[3]);
		Integer[] in = ints.toArray(new Integer[0]);
		print("23: " + in[3]);
	
	}

}
