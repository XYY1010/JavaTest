package com.xyy.test13;

import java.util.Date;

interface TimeStamped { long getStamp(); }

class TimeStampedImp implements TimeStamped {
	private final long timeStamp;
	public TimeStampedImp() {
		// TODO Auto-generated constructor stub
		timeStamp = new Date().getTime();
	}
	@Override
	public long getStamp() {
		// TODO Auto-generated method stub
		return timeStamp;
	}
}

interface SerialNumbered { long getSerialNumber(); }
class SerialNumberedImp implements SerialNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;
	@Override
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}
}

interface Basic {
	public void set(String val);
	public String get();
}
class BasicImp implements Basic {

	private String value;
	
	@Override
	public void set(String val) {
		// TODO Auto-generated method stub
		value = val;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return value;
	}
	
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumbered = new SerialNumberedImp();
	
	@Override
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumbered.getSerialNumber();
	}

	@Override
	public long getStamp() {
		// TODO Auto-generated method stub
		return timeStamp.getStamp();
	}
	
}

public class Mixins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
	}

}
