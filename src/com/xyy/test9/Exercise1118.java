package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer> ();
		map.put("Bryant", 24);
		map.put("Lebron", 23);
		map.put("Jordan", 45);
		map.put("Bird", 33);
		map.put("Johnson", 32);
		print(map);
		String[] str = map.keySet().toArray(new String[0]);
		print("Before sorting: " + Arrays.toString(str));
		Arrays.sort(str);
		print("After sorting: " + Arrays.toString(str));
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		for (String s : str) {
			lhm.put(s, map.get(s));
		}
		print(lhm);
	}

}
