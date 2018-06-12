package com.xyy.test1;

class Tank{
	float level;
}

public class FloatClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 1.1f;
		t2.level = 2.1f;
		System.out.println("t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = t2.level;
		System.out.println("t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 5.20f;
		System.out.println("t1.level: " + t1.level + ", t2.level: " + t2.level);
	}

}
