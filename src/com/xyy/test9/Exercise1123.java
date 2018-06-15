package com.xyy.test9;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import static com.xyy.tools.Print.*;

public class Exercise1123 {
	
	public static Map<Integer, Integer> Max(Map<Integer, Integer> mp) {
		if (mp == null) {
			return null;
		}
		Iterator<Integer> it = mp.keySet().iterator();
		int maxValue = 0;
		int maxKey;
		Map<Integer, Integer> max = new HashMap<Integer, Integer>();
		while (it.hasNext()) {
			int key = it.next();
			int val = mp.get(key);
			if (val >= maxValue) {
				maxValue = val;
				max.clear();
				max.put(key, val);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 0;
		while (times < 100) {
			times++;
			Random rand = new Random();
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < 1000; i++) {
				int num = rand.nextInt(101);
				if(map.keySet().contains(num)) {
					int cnt = map.get(num);
					map.put(num, cnt+1);
				} else {
					map.put(num, 1);
				}
			}
			Map<Integer, Integer> max = Max(map);
			print(map);
			print("出现最多次数：" + max);
		}
	}

}
