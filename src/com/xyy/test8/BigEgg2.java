package com.xyy.test8;

import static com.xyy.tools.Print.*;

class Egg2 {
	protected class Yolk {
		public Yolk() { print("Egg2.Yolk()"); }
		public void f() { print("Egg2.Yolk.f()"); }
	}
	private Yolk y = new Yolk();
	public Egg2() { print("New Egg2()"); }
	public void insertYolk(Yolk yy) { y = yy; }
	public void g() { y.f(); }
}

/**
 * BigEgg2.Yolkͨ��extends Egg2.Yolk��ȷ�ؼ̳��˴��ڲ��࣬���Ҹ��������еķ���
 * insertYolk()��������BigEgg2�����Լ���Yolk��������ת��ΪEgg2�е�����y�����Ե�
 * g()����y.f()ʱ�����Ǻ���°��f()��ִ�С��ڶ��ε���Egg2.Yolk()�������BigEgg2.Yolk
 * �Ĺ����������������Ĺ����������Կ����ڵ���g()��ʱ���°��f()�������ˡ�
 * @author XYY
 *
 */
public class BigEgg2 extends Egg2 {

	public class Yolk extends Egg2.Yolk {
		public Yolk() { print("BigEgg2.Yolk()"); } 
		public void f() { print("BigEgg2.Yolk.f()"); }
	}
	
	public BigEgg2() { insertYolk(new Yolk()); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Egg2 e2 = new Egg2();
		e2.g();
	}

}
