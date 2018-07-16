package com.xyy.test15;

import static com.xyy.tools.Print.print;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xyy.tools.TextFile;

class SlowMapTest<K, V> implements Map<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return keys.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return keys.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return keys.contains(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return values.contains(value);
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		if (!keys.contains(key)) {
			return null;
		} else {
			return values.get(keys.indexOf(key));
		}
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
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
	public V remove(Object key) {
		// TODO Auto-generated method stub
		if (!keys.contains(key)) {
			return null;
		} else {
			V result = values.get(keys.indexOf(key));
			values.remove(result);
			keys.remove(key);
			return result;
		}
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		keys.clear();
		values.clear();
		for (K k : m.keySet()) {
			keys.add(k);
		}
		for (V v : m.values()) {
			values.add(v);
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		keys.clear();
		values.clear();
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		if (keys.isEmpty()) {
			return null;
		} else {
			Set<K> res = new HashSet<K>();
			for (K k : keys) {
				res.add(k);
			}
			return res;
		}
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		if (values.isEmpty()) {
			return null;
		} else {
			return values;
		}
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while (ki.hasNext()) {
			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		}
		return set;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < keys.size(); i++) {
			sb.append(keys.get(i));
			sb.append(" = ");
			sb.append(values.get(i));
			sb.append(", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}

}  

public class Exercise1717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlowMapTest<String, Integer> map = new SlowMapTest<String, Integer>();
		String s = TextFile.read("/Users/xyy/Desktop/PDF/TIJ4-code-master/examples/net/mindview/util/Countries.java");
		Matcher m = Pattern.compile("\\b\\w+\\b").matcher(s);
		ArrayList<String> l = new ArrayList<String>();
		while (m.find()) {
			l.add(m.group(0));
		}
		for (String ss : l) {
			if (map.containsKey(ss)) {
				int val = map.get(ss);
				map.put(ss, val + 1);
			} else {
				map.put(ss, 1);
			}
		}
		print(map);
	}

}
