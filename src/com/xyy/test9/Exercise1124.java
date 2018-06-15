package com.xyy.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static com.xyy.tools.Print.*;

public class Exercise1124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		map.put("as", 11);
		map.put("pp", 12);
		map.put("saa", 87);
		map.put("uyt", 13);
		map.put("kcv", 874);
		map.put("bgb", 3);
		map.put("onf", 209);
		map.put("dw", 783);
		Set<String> setKey = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		setKey.addAll(map.keySet());
		Map<String, Integer> mapNew = new HashMap<String, Integer>();
		for(String s : setKey) {
			mapNew.put(s, map.get(s));
		}
		map.clear();
		map.putAll(mapNew);
		print(map);
	}

}
