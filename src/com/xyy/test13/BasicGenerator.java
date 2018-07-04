package com.xyy.test13;

import com.xyy.tools.Generator;

public class BasicGenerator<T> implements Generator<T> {

	private Class<T> type;
	
	public BasicGenerator(Class<T> type) { this.type = type; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		// Assumes type is a public class:
		try {
			return type.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}

}
