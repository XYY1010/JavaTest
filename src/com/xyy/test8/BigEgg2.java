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
 * BigEgg2.Yolk通过extends Egg2.Yolk明确地继承了此内部类，并且覆盖了其中的方法
 * insertYolk()方法允许BigEgg2将它自己的Yolk对象向上转型为Egg2中的引用y。所以当
 * g()调用y.f()时，覆盖后的新版的f()被执行。第二次调用Egg2.Yolk()，结果是BigEgg2.Yolk
 * 的构造器调用了其基类的构造器。可以看到在调用g()的时候，新版的f()被调用了。
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
