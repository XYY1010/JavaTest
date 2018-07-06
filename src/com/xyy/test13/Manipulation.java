package com.xyy.test13;

class Manipulator<T> {
	private T obj;
	public Manipulator(T x) { obj = x; }
	// Error: cannot find symbol: method f():
	// public void mainpulate() {obj.f(); }
	public void mainpulate() {}
}

class HasF {
	public void f() { System.out.println("HasF.f()"); }
}

public class Manipulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
		manipulator.mainpulate();
	}

}
