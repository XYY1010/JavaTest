package com.xyy.test10;

import static com.xyy.tools.Print.*;

public class Exercise123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[15];
			for (int i = 0; i < 16; i++) {
				arr[i] = i * i;
			}
		} catch (Exception e) {
			// TODO: handle exception
			print(e);
		}
	}

	
}
