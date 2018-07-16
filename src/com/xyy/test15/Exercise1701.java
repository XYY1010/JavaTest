package com.xyy.test15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static com.xyy.tools.Countries.*;
import static com.xyy.tools.Print.*;

public class Exercise1701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>(names(10));
		List<String> list2 = new LinkedList<String>(names(10));
		print("list1: " + list1);
		print("list2: " + list2);
		for (int i = 0; i < 5; i++) {
			print("Shuffle " + (i + 1) + (i + 1 == 1 ? " time" : " times"));
			Collections.shuffle(list1);
			Collections.shuffle(list2);
			print("list1: " + list1);
			print("list2: " + list2);
		}
	}

}
