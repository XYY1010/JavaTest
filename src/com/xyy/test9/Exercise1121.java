package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.xyy.tools.TextFile;

public class Exercise1121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		print(words);
		Map<String, Integer> map = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		for (String s : words) {
			if (map.containsKey(s)) {
				int val = map.get(s);
				map.put(s, val + 1);
			} else {
				map.put(s, 1);
			}
		}
		print(map);
	}

}
