package com.xyy.test15;

import java.util.Map;

public class MapEntry<K, V> implements Map.Entry<K, V> {

	private K key;
	private V value;
	public MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public V setValue(V v) {
		V result = value;
		value = v;
		return result;
	}
	public int hashCode() {
		return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
	}
	public boolean equals(Object object) {
		if (!(object instanceof MapEntry)) {
			return false;
		}
		MapEntry me = (MapEntry) object;
		return (key == null ? me.getKey() == null : key.equals(me.getKey())) &&
				(value == null ? me.getValue() == null : value.equals(me.getValue()));
	}
	public String toString() {
		return key + " = " + value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
