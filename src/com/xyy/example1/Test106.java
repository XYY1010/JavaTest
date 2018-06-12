package com.xyy.example1;

import com.xyy.test8.Exercise106;

public class Test106 extends Exercise106{

	public CAchievement getAchievement() {
		Exercise106 exercise106 = new Exercise106();
		return exercise106.getAch();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise106 exercise106 = new Exercise106();
		exercise106.getAch().listener();
	}

}
