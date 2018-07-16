package com.xyy.test15;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import static com.xyy.tools.Print.*;

class SimpleHashMapModify<K, V> extends AbstractMap<K, V> {
	static final int SIZE = 997;
	@SuppressWarnings("unchecked")
	ArrayList<MapEntry<K, V>>[] buckets = new ArrayList[SIZE];
	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null) {
			buckets[index] = new ArrayList<MapEntry<K, V>>();
		}
		ArrayList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
		boolean found = false;
		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
		while (it.hasNext()) {
			MapEntry<K, V> iPair = it.next();
			if (iPair.getKey().equals(key)) {
				oldValue = iPair.getValue();
				it.set(pair);
				found = true;
				break;
			}
		}
		if (!found) {
			buckets[index].add(pair);
		}
		return oldValue;	
	}
	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null) {
			return null;
		}
		for (MapEntry<K, V> iPair : buckets[index]) {
			if (iPair.getKey().equals(key)) {
				return iPair.getValue();
			}
		}
		return null;
	}
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		for (ArrayList<MapEntry<K, V>> bucket : buckets) {
			if (bucket == null) {
				continue;
			}
			for (MapEntry<K, V> mpair : bucket) {
				set.add(mpair);
			}
		}
		return set;
	}
	
}

public class Exercise1737 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			Tester.defaultParams = TestParam.array(args);
		}
		Tester.fieldWidth = 10;
		Tester.run(new SimpleHashMap<Integer, Integer>(), MapPerformance.tests);
		Tester.run(new SimpleHashMapModify<Integer, Integer>(), MapPerformance.tests);
	}

}
