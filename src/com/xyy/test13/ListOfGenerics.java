package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {

	private List<T> array = new ArrayList<T>();
	
	public void add(T item) { array.add(item); }
	
	public T get(int index) { return array.get(index); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
