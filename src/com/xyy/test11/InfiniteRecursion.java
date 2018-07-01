package com.xyy.test11;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {

	public String toString() {
		return "InfiniteRecursion address: " + super.toString() + "\n"; //此处不应用this，会发生递归调用，应用super.toString()
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();;
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}

}
