package com.xyy.test13;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TupleList<Vehicle, Amphibian, String, Integer> tl = new TupleList<Vehicle, Amphibian, String, Integer>();
		tl.add(TupleTest.h());
		tl.add(TupleTest.h());
		for (FourTuple<Vehicle, Amphibian, String, Integer> fourTuple : tl) {
			System.out.println(fourTuple);
		}
	}

}
