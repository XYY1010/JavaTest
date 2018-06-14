package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		for (Integer i : c) {
			printnb(i + ", ");
		}
	}

}
