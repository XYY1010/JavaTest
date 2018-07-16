package com.xyy.test14;

public class ArrayOfGenericType<T> {

	T[] array; // OK
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
		//! array = new T[size]; // Illegal
		array = (T[]) new Object[size]; // "unchecked" Warning
	}
	//! Illegal:
	// public <U> U[] makeArray() { return new U[10]; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
