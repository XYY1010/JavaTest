package com.xyy.test13;

import static com.xyy.tools.Print.*;

import java.lang.reflect.Method;

class Mime {
	public void walkAgainstTheWind() {}
	public void sit() { print("Pretending to sit"); }
	public void pushInvisibleWalls() {}
	public String toString() { return "Mime"; }
}

class SmartDog {
	public void speak() { print("Woof!"); }
	public void sit() { print("Sitting"); }
	public void reproduce() {}
}

class CommunicateReflectively {
	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch (NoSuchMethodException e) {
				// TODO: handle exception
				print(speaker + " cannot speak");
			}
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch (NoSuchMethodException e) {
				// TODO: handle exception
				print(speaker + "cannot sit");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}

public class LatentReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}

}
