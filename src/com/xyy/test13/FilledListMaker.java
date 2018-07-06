package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

import static com.xyy.tools.Print.*;

public class FilledListMaker<T> {

	List<T> create(T t, int n) {
		List<T> result = new ArrayList<T>();
		for (int i = 0; i < n; i++) {
			result.add(t);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilledListMaker<String> stringMaker = new FilledListMaker<String>();
		List<String> list = stringMaker.create("Hello", 4);
		print(list);
	}

}
