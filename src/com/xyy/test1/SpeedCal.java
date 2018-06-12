package com.xyy.test1;

import java.util.Random;

public class SpeedCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		float dis, time;
		dis = rand.nextFloat();
		time = rand.nextFloat();
		if (time == 0){
			time = 10;
		}
		float velocity = dis / time;
		System.out.println("dis = " + dis +
				", time = " + time + ": velocity = " + velocity);
	}

}
