package com.xyy.test13;

public class GenericHolder<T> {

	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericHolder<String> holder = new GenericHolder<String>();
		holder.set("Item");
		String s = holder.get();
		System.out.println(s);
	}

}
