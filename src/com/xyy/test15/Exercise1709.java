package com.xyy.test15;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.xyy.test14.Generated;
import com.xyy.tools.RandomGenerator;
import static com.xyy.tools.Print.*;

public class Exercise1709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new TreeSet<String>();
		Collections.addAll(st, Generated.array(String.class, new RandomGenerator.String(5), 10));
		print(st);
	}

}
