package com.xyy.test7;

interface su {
	int i = 10;
	int j = 20;
}

class ceshi implements su {
	void add() {
		//i++; ����������can not assign a value to final variable
	}
}

public class Exercise917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ceshi c = new ceshi();
		System.out.println(c.j);
		ceshi c1 = new ceshi();
		System.out.println(c1.j);	//���������һ���ģ�֤����static��
	}

}
