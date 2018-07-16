package com.xyy.test15;

import static com.xyy.tools.Print.*;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class SlowMap2<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	@Override 
	public V put(K key, V value) {
		if (key == null) {
			throw new NullPointerException();
		}
		V oldValue = get(key);
		if (!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		} else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	@Override
	public V get(Object key) {
		if (key == null) {
			throw new NullPointerException();
		}
		if (!keys.contains(key)) {
			return null;
		}
		return values.get(keys.indexOf(key));
	}
	private EntrySet entrySet = new EntrySet();
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return entrySet;
	}
	//Uses the 'Flyweight' pattern
	private class EntrySet extends AbstractSet<Map.Entry<K, V>> {

		@Override
		public Iterator<Entry<K, V>> iterator() {
			// TODO Auto-generated method stub
			return new Iterator<Map.Entry<K,V>>() {
				private int index = -1;
				boolean canRemove;
				public boolean hasNext() {
					return index < keys.size() - 1;
				}
				@Override
				public Entry<K, V> next() {
					// TODO Auto-generated method stub
					canRemove = true;
					++index;
					return new MapEntry<K, V>(keys.get(index), values.get(index));
				}
				public void remove() {
					if (!canRemove) {
						throw new IllegalStateException();
					}
					canRemove = false;
					keys.remove(index);
					values.remove(index--);
				}
				
			};
		}
		@SuppressWarnings("unchecked")
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			if (o instanceof MapEntry) {
				MapEntry<K, V> e = (MapEntry<K, V>) o;
				K key = e.getKey();
				if (keys.contains(key)) {
					return e.equals(new MapEntry<K, V>(key, get(key)));
				}
			}
			return false;
		}
		@SuppressWarnings("unchecked")
		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			if (contains(o)) {
				MapEntry<K, V> e = (MapEntry<K, V>) o;
				K key = e.getKey();
				V value = e.getValue();
				keys.remove(key);
				values.remove(value);
				return true;
 			}
			return false;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return keys.size();
		}
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			keys.clear();
			values.clear();
		}
	}
}

public class Exercise1716 {
	public static void printKeys(Map<Integer, String> map) {
		printnb("Size = " + map.size() + ", ");
		printnb("Keys: ");
		print(map.keySet());
	}
	public static void test(Map<Integer, String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		map.putAll(new CountingMapData(25));
		printKeys(map);
		printnb("Values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("First key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty(): "  + map.isEmpty());
		map.putAll(new CountingMapData(25));
		map.keySet().remove(map.keySet());
		print("map.isEmpty(): "+ map.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Testing SlowMap");
		test(new SlowMap<Integer, String>());
		print("Testing SlowMap2");
		test(new SlowMap2<Integer, String>());
	}

}
