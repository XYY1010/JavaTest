package com.xyy.test8;

import static com.xyy.tools.Print.*;

interface U {
	void u1();
	void u2();
	void u3();
}

class A1 {
	public U a() {
		print("A1.a()");
		return new U() {

			@Override
			public void u1() {
				// TODO Auto-generated method stub
				print("A1.U.u1()");
			}

			@Override
			public void u2() {
				// TODO Auto-generated method stub
				print("A1.U.u2()");
			}

			@Override
			public void u3() {
				// TODO Auto-generated method stub
				print("A1.U.u3()");
			}
			
		};
	}
}

class B1 {
	private U[] uArray = new U[20];
	private int index = 0;
	public void setUArray(U u){
		if(index < uArray.length) {
			uArray[index++] = u;
		}
	}
	public void setNull(int position) {
		uArray[position] = null;
	}
	public void traversal() {
		for(int i = 0; i < index; i++) {
			uArray[i].u1();
			uArray[i].u2();
			uArray[i].u3();
		}
	}
}

public class Exercise1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		A1 a2 = new A1();
		A1 a3 = new A1();
		B1 b = new B1();
		b.setUArray(a1.a());
		b.setUArray(a2.a());
		b.setUArray(a3.a());
		b.traversal();
	}

}
