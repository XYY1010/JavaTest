package com.xyy.test15;

import static com.xyy.tools.Print.print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountedStringModify2 {
	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;
	private char c;
	public CountedStringModify2(String str, char c) {
		s = str;
		this.c = c;
		created.add(s);
		// id is the total number of instances
		// of this string in use by CountedString:
		for (String s2 : created) {
			if (s2.equals(s)) {
				id++;
			}
		}
	}
	public String toString() {
		return "String: " + s +" c: " + c + " id: " + id + " hashCode(): " + hashCode();
	}
	public int hashCode() {
		// The very simple approach:
		// return s.hashCode() * id:
		// Using Joshua Bloch's recipe:
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + c;
		return result;
	}
	public boolean equals(Object o) {
		return o instanceof CountedStringModify2 && 
				s.equals(((CountedStringModify2)o).s) &&
				id == ((CountedStringModify2)o).id &&
				c == ((CountedStringModify2)o).c;
	}
}

public class Exercise1727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<CountedStringModify2, Integer> map = new HashMap<CountedStringModify2, Integer>();
		CountedStringModify2[] cs = new CountedStringModify2[5];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = new CountedStringModify2("hi", 'a');
			map.put(cs[i], i);		// Autobox int --> Integer
		}
		print(map);
		for (CountedStringModify2 countedString : cs) {
			print("Looking up " + countedString);
			print(map.get(countedString));
		}
	}

}
