package com.xyy.test15;

import java.util.Map;
import java.util.Properties;

import static com.xyy.tools.Print.*;

public class Exercise1714 {
	public static void printKeys(Map<Integer, String> map) {
		printnb("Size = " + map.size() + ", ");
		printnb("Keys: ");
		print(map.keySet());	// Produce a Set of the key
	}
	public static void printKeys2(Map<Object, Object> map) {
		printnb("Size = " + map.size() + ", ");
		printnb("Keys: ");
		print(map.keySet());	// Produce a Set of the key
	}
	public static void test(Map<Integer, String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		map.putAll(new CountingMapData(25));
		printKeys(map);
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.countainKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty: " + map.isEmpty());
		map.putAll(new CountingMapData(25));
		// Operations on the Set change the Map"
		map.keySet().remove(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
	}
	public static void test2(Map<Object, Object> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		map.putAll(new CountingMapData(25));
		printKeys2(map);
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.countainKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Object key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys2(map);
		map.clear();
		print("map.isEmpty: " + map.isEmpty());
		map.putAll(new CountingMapData(25));
		// Operations on the Set change the Map"
		map.keySet().remove(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> moop = new Properties();
		test2(new Properties());
	}

}
