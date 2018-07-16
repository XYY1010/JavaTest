package com.xyy.test13;

class CommunicateSimply {
	static void perform(Performs performer) {
		performer.speak();
		performer.sit();
	}
}

public class SimpleDogsAndRobots {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommunicateSimply.perform(new PerformingDog());
		CommunicateSimply.perform(new Robot());
	}

}
