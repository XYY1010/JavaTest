package com.xyy.test13;

import static com.xyy.tools.Print.*;

import java.util.Random;

interface Later {
	long getID();
}
class LaterImp implements Later {
	private final long IDNumber;
	private Random rand = new Random();
	public LaterImp() {
		// TODO Auto-generated constructor stub
		IDNumber = rand.nextLong();
	}
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return IDNumber;
	}
}

class MixinTest extends BasicImp implements TimeStamped, SerialNumbered, Later {
	private TimeStamped timeStamped = new TimeStampedImp();
	private SerialNumbered serialNumbered = new SerialNumberedImp();
	private Later later = new LaterImp();
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return later.getID();
	}

	@Override
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumbered.getSerialNumber();
	}

	@Override
	public long getStamp() {
		// TODO Auto-generated method stub
		return timeStamped.getStamp();
	}
	
}

public class Exercise1537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixinTest mixin1 = new MixinTest(), mixin2 = new MixinTest();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		print(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1.getID());
		print(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin2.getID());
	}

}
