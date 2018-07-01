package com.xyy.test12;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
	private static long counter;
	private final long id = counter++;
	public String toString() { return Long.toString(id); }
}

public class FilledList<T> {
	
	private Class<T> type;
	public FilledList(Class<T> type) { this.type = type; }
	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(189));
	}

}
