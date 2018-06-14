package com.xyy.test8;

import static com.xyy.tools.Print.*;

class Egg {
	private Yolk y;
	protected class Yolk {
		public Yolk() { print("Egg.Yolk()"); }
	}
	public Egg() {
		print("New Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg {

	public class Yolk {
		public Yolk() { print("BigEgg.Yolk()"); }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BigEgg();
	}

} /* Output:
New Egg()
Egg.Yolk()
*///:~
// ����BigEgg���󣬣���ʹ�õĲ����Ǹ��Ǻ��Yolk()�汾