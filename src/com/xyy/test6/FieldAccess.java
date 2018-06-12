package com.xyy.test6;

import static com.xyy.tools.Print.*;

class Super {
	public int field = 0;
	public int getField() { return field; }
}

class Sub extends Super {
	public int field = 1;
	public int getField() { return field; }
	public int getSuperField() { return super.field; }
}

public class FieldAccess {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub();
		print("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		print("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());
		
		
	}

}
