package com.xyy.test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1529 {

	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	public static void f(Holder<List<?>> holder) {
		System.out.println(holder.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder raw = new Holder<Integer>(1);
		List<ArrayList<Integer>> li = Arrays.asList(new ArrayList<Integer>(1));
		Holder raw1 = new Holder<List<ArrayList<Integer>>>();
		f1(raw);
		f(raw1);
	}

}
