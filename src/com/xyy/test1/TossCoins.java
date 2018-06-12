package com.xyy.test1;

import java.util.Random;

public class TossCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		String[] strStatus = {"Õý", "·´"};
		int i = rand.nextInt(2);
		int j;
		for(j = 1; j <= 1000; j++){
			System.out.println("r" + j + " : " + strStatus[i]);
			i = rand.nextInt(2);
		}
	}

}
