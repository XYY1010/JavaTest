package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Useful {
	public void f() { print("Useful.f()"); }
	public void g() { print("Useful.g()"); }
}

class MoreUseful extends Useful {
	public void f() { print("MoreUseful.f()"); }
	public void g() { print("MoreUseful.g()"); }
	public void u() { print("MoreUseful.u()"); }
	public void v() {}
	public void w() {}
}

public class RTTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		//x[1].u();  ��������u()�������޷�����
		((MoreUseful)x[1]).u();	//����ת��
		//((MoreUseful)x[0]).u();	//�׳��쳣
	}

}
