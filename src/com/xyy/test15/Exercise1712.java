package com.xyy.test15;

import static com.xyy.tools.Print.print;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1 = new HashMap<String, String>(6);
		Map<String, String> map2 = new TreeMap<String, String>();
		Map<String, String> map3 = new LinkedHashMap<String, String>(6);
		map1.put("sky", "blue");
		map1.put("grass", "green");
		map1.put("ocean", "dancing");
		map1.put("tree", "tall");
		map1.put("earth", "brown");
		map1.put("sun", "warm");
		try {
			map1.put("extra", "object");		// Past the end
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			print("Too many objects!");
		}
		print(map1);
		print(map1.get("sun"));
		map2.put("sky", "blue");
		map2.put("grass", "green");
		map2.put("ocean", "dancing");
		map2.put("tree", "tall");
		map2.put("earth", "brown");
		map2.put("sun", "warm");
		try {
			map2.put("extra", "object");		// Past the end
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			print("Too many objects!");
		}
		print(map2);
		print(map2.get("sun"));
		map3.put("sky", "blue");
		map3.put("grass", "green");
		map3.put("ocean", "dancing");
		map3.put("tree", "tall");
		map3.put("earth", "brown");
		map3.put("sun", "warm");
		try {
			map3.put("extra", "object");		// Past the end
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			print("Too many objects!");
		}
		print(map3);
		print(map3.get("sun"));
	}

}
