package com.xyy.test10;

public class Exercise1227 {
	
	public static void main(String[] args) throws RuntimeException {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[15];
			for (int i = 0; i < 16; i++) {
				arr[i] = i * i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

}
