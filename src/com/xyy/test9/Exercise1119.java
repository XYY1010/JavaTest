package com.xyy.test9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static com.xyy.tools.Print.*;

public class Exercise1119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new HashSet<String>();
		Collections.addAll(st, "Bryant", "Lebron", "Jordan", "Bird", "Johnson");
		print(st);
		String[] str = st.toArray(new String[0]);
		print("Before sorting: " + Arrays.toString(str));
		Arrays.sort(str);
		print("After sorting: " + Arrays.toString(str));
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(st);
		print(lhs);
	}

}
