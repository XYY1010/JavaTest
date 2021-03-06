package com.xyy.test13;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken<T> {

	private T[] array;
	@SuppressWarnings("unchecked")

	public GenericArrayWithTypeToken(Class<T> type, int sz) {
		array = (T[]) Array.newInstance(type, sz);
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return array[index];
	}
	// Expose the underlying representation
	public T[] rep() {
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		Integer[] ia = gai.rep();
	}

}
