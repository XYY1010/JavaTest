package com.xyy.test13;

import static com.xyy.tools.Print.*;

public class Exercise1503 {

	static TwoTuple<String, Integer> f() {
		// AutoBoxing converts the int to Integer:
		return new TwoTuple<String, Integer>("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g() {
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h() {
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}
	
	static SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean> l() {
		return new SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean>(new Vehicle(), new Amphibian(), "hi", 47, 11.1, false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(f());
		print(g());
		print(h());
		print(k());
		print(l());
	}

}
