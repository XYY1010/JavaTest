package com.xyy.test15;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class CountingMapDataTest extends AbstractMap<Integer, String> {
	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
	public CountingMapDataTest(int size) {
		// TODO Auto-generated constructor stub
		if (size < 0) {
			this.size = 0;
		}
		this.size = size;
	}
	private static class Entry implements Map.Entry<Integer, String> {
		int index;
		public Entry(int index) {
			// TODO Auto-generated constructor stub
			this.index = index;
		}
		public boolean equals(Object o) {
			return Integer.valueOf(index).equals(o);
		}
		public Integer getKey() { return index; }
		public String getValue() {
			return chars[index % chars.length] + Integer.toString(index / chars.length);
		}
		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}
		public int hasCode() {
			return Integer.valueOf(index).hashCode();
		}
	}
	
	static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
		private int index;
		public EntrySet(int index) {
			if(index < 0) {
				this.index = 0;
			} else {
				this.index = index;
			}
		}
		public int index() { return index; }
		private class Iter implements Iterator<Map.Entry<Integer, String>> {
			private Entry entry = new Entry(-1);
			public boolean hasNext() {
				return entry.index < index - 1;
			}
			public Map.Entry<Integer, String> next() {
				entry.index++;
				return entry;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		}
		public Iterator<Map.Entry<Integer, String>> iterator() {
			return new Iter();
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return index;
		}
	}
	
	@Override
	public Set<Map.Entry<Integer, String>> entrySet() {
		// TODO Auto-generated method stub
		// LinkedHashSet retains initialization order:
		Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
		for (int i = 0; i < size; i++) {
			entries.add(new Entry(i));
		}
		return entries;
	}
}

public class Exercise1705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountingMapDataTest(60));
	}

}
