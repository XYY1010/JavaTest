package com.xyy.test7;

interface su {
	int i = 10;
	int j = 20;
}

class ceshi implements su {
	void add() {
		//i++; 编译器报错，can not assign a value to final variable
	}
}

public class Exercise917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ceshi c = new ceshi();
		System.out.println(c.j);
		ceshi c1 = new ceshi();
		System.out.println(c1.j);	//两个输出是一样的，证明是static的
	}

}
