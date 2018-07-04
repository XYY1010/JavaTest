package com.xyy.test13;

import static com.xyy.tools.Tuple.*;

import static com.xyy.tools.Print.*;

public class TupleTest2 {

	static TwoTuple<String, Integer> f() {
		return tuple("hi", 47);
	}
	
	static TwoTuple f2() {
		return tuple("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 1.1);
	}
	
	static SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean> l() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47, 1.1, false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String, Integer> ttsi = f();
		print(ttsi);
		print(f2());
		print(g());
		print(h());
		print(k());
		print(l());
	}

}
