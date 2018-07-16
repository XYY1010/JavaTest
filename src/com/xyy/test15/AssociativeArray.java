package com.xyy.test15;

import static com.xyy.tools.Print.*;

public class AssociativeArray<K, V> {
	private Object[][] pairs;
	private int index;
	public AssociativeArray(int length) {
		pairs = new Object[length][2];
	}
	public void put(K key, V value) {
		if (index >= pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (getIndex(key) != -1) {
			pairs[getIndex(key)] = new Object[]{ key, value };
		} else {
			pairs[index++] = new Object[]{ key, value };
		}
	}
	@SuppressWarnings("unchecked")
	public V get(K key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(pairs[i][0])) {
				return (V) pairs[i][1];
			}
		}
		return null;	// Did not find key
	}
	public int getIndex(K key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(pairs[i][0])) {
				return i;
			}
		}
		return -1;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(" : ");
			result.append(pairs[i][1].toString());
			if (i < index - 1) {
				result.append("\n");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssociativeArray<String, String> map = new AssociativeArray<String, String>(6);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		try {
			map.put("extra", "object");		// Past the end
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			print("Too many objects!");
		}
		print(map);
		print(map.get("sun"));
	}

}
