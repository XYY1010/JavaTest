package com.xyy.test9;

import static com.xyy.tools.Print.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise1117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Gerbil> map = new HashMap<String, Gerbil>();
		map.put("Lura", new Gerbil(10));
		map.put("Sara", new Gerbil(100));
		map.put("Su", new Gerbil(50));
		map.put("Wan", new Gerbil(30));
		map.put("Xiang", new Gerbil(20));
		Set<String> nameSet = map.keySet();
		Iterator<String> it = nameSet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Gerbil g = map.get(name);
			print(name);
			g.hop();
		}
	}

}
