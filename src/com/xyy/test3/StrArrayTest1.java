package com.xyy.test3;

import java.util.Random;

class StrArr{
	String str;
	public StrArr(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
		System.out.println("str: " + str);
	}
}

public class StrArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(100);
		StrArr[] strArr = new StrArr[random.nextInt(10)];
		for(int i = 0; i < strArr.length; i++){
			strArr[i] = new StrArr("strArr" + i);
		}
	}

}
