package com.xyy.test3;

class Test{
	void f1(){
		f2();
		this.f2();
	}
	
	void f2(){
		System.out.println("uuu");
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.f1();
	}

}
