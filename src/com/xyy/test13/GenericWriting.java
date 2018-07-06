package com.xyy.test13;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

	static <T> void writeExact(List<T> list, T item) {
		list.add(item);
	}
	
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	static void f1() {
		writeExact(apples, new Apple());
		writeExact(fruit, new Apple());	// Error:
		// Incompatible types: found Fruit, required Apple
	}
	
	static <T> void writeWildcard(List<? super T> list, T item) {
		list.add(item);
	}
	
	static void f2() {
		writeWildcard(apples, new Apple());
		writeWildcard(fruit, new Apple());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		f2();
	}

}
