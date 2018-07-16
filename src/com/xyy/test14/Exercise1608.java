package com.xyy.test14;

import java.util.Arrays;

public class Exercise1608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[10];
		strs[0] = new String("ds");
		// strs[1] = new Integer(1);
		// strs[2] = 1.1f;
		System.out.println(Arrays.toString(strs));
		Object[] objs = new Object[5];
		objs[0] = new String("ss");
		objs[1] = new Integer(11);
		objs[2] = new Double(1.1);
		objs[3] = new Float(2.2f);
		System.out.println(Arrays.toString(objs));
	}

}
