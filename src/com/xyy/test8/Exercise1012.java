package com.xyy.test8;

import static com.xyy.tools.Print.print;

public class Exercise1012 {

private int cnt = 10;
	
	private int getCnt() {
		return cnt;
	}
	
	private void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	private void printCnt() {
		print("cnt = " + cnt);
	}
	
	interface Inner {
		void modify(Exercise1012 exercise1012);
	}
	
	public Inner getInner() {
		return new Inner() {
			public void modify (Exercise1012 exercise1012) {
				exercise1012.setCnt(500);
				exercise1012.printCnt();
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1012 exercise1012 = new Exercise1012();
		exercise1012.setCnt(19);
		exercise1012.printCnt();
		Inner inner = exercise1012.getInner();
		inner.modify(exercise1012);
	}

}
