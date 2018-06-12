package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Exercise107 {

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
	
	class Inner {
		public void modify(Exercise107 exercise107) {
			exercise107.setCnt(500);
			exercise107.printCnt();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise107 exercise107 = new Exercise107();
		exercise107.printCnt();
		Inner inner = exercise107.new Inner();
		inner.modify(exercise107);
		exercise107.printCnt();
	}

}
