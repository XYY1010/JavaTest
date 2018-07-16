package com.xyy.test13;

import static com.xyy.tools.Print.*;

class CExercise {
	private int i;
	public CExercise() {}
	public CExercise(int i) { this.i = i; }
}

public class Exercise1522 {

	public static Class<?> getclass(String typename) throws InstantiationException, IllegalAccessException {
		try {
			Class<?> c = Class.forName(typename);
			return c.newInstance().getClass();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			print("Not found such class" + e);
		}
		return null; 
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		print(getclass("com.xyy.test13.Exercise1522"));
	}
	
}
