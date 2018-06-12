package com.xyy.test1;

class CFloat{
	float f;
}

public class FloatClass2 {

	static void f(CFloat y){
		y.f = 1.1f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CFloat x = new CFloat();
		x.f = 5.20f;
		System.out.println("1: x.f: " + x.f);
		f(x);
		System.out.println("2: x.f: " + x.f);
	}

}
