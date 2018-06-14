package com.xyy.test8;

class COuter {
	class CInner {
		public CInner(int i) {
			System.out.println("CInner()" + i);
		}
	}
}

class COuter1 {
	class CInner1 extends COuter.CInner {
		public CInner1(COuter outer, int i) {
			outer.super(i);
			System.out.println(i);
		}
	}
}

public class Exercise1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COuter1 cOuter1= new  COuter1();
		COuter1.CInner1 in = cOuter1.new CInner1(new COuter(), 100);
	}

}
