package com.xyy.test15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static com.xyy.tools.Print.*;
import static com.xyy.tools.Countries.*;

public class Exercise1703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st1 = new HashSet<String>(names(10));
		Set<String> st2 = new LinkedHashSet<String>(names(10));
		Set<String> st3 = new TreeSet<String>(names(10));
		print("st1 = " + st1);
		print("st2 = " + st2);
		print("st3 = " + st3);
		for (int i = 1; i <= 5; i++) {
			print("test " + i + (i == 1 ? " time" : " times"));
			st1 = new HashSet<String>(names(10));
			st2 = new LinkedHashSet<String>(names(10));
			st3 = new TreeSet<String>(names(10));
			print("st1 = " + st1);
			print("st2 = " + st2);
			print("st3 = " + st3);
		}
	}

}
