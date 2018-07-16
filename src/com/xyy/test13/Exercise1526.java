package com.xyy.test13;

public class Exercise1526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number[] num = new Integer[10];
		for (int i = 0; i < 10; i++) {
			num[i] = new Integer(i * i);
		}
		for (Number number : num) {
			System.out.print(number + " ");
		}
		
	}

}
