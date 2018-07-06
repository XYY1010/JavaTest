package com.xyy.test13;

public class Manipulator2 <T extends HasF> {

	private T obj;
	public Manipulator2(T x) { obj = x; }
	public void Manipulate() { obj.f(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasF h = new HasF();
		Manipulator2<HasF> m = new Manipulator2<HasF>(h);
		m.Manipulate();
	}

}
