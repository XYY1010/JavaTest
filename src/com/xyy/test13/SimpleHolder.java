package com.xyy.test13;

import static com.xyy.tools.Print.*;

public class SimpleHolder {

	private Object object;
	public void set(Object obj) { object = obj; }
	public Object get() { return object; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String) holder.get();
		print(s);
	}

}
