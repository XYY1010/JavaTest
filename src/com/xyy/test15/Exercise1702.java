package com.xyy.test15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.xyy.tools.Print.*;
import static com.xyy.tools.Countries.*;

public class Exercise1702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mp = new HashMap<String, String>(capitals());
		Map<String, String> mpRes = new HashMap<String, String>();
		Set<String> stRes = new HashSet<String>();
		for (String s : mp.keySet()) {
			if (s.matches("A\\w+")) {
				mpRes.put(s, mp.get(s));
				stRes.add(s);
			}
		}
		print(mpRes);
		print(stRes);
	}

}
