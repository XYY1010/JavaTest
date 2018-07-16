package com.xyy.test13;

import static com.xyy.tools.Tuple.tuple;

interface ColoredInf {
	String getColored();
}

class ColoredTest implements ColoredInf {
	public String getColored() { return "Colored"; }
}

public class Exercise1539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object mixin = MixinProxy.newInstance(tuple(new BasicImp(), Basic.class), tuple(new TimeStampedImp(), TimeStamped.class), tuple(new SerialNumberedImp(), SerialNumbered.class), tuple(new ColoredTest(), ColoredInf.class));
		Basic b = (Basic) mixin;
		TimeStamped t = (TimeStamped) mixin;
		SerialNumbered s = (SerialNumbered) mixin;
		ColoredInf c = (ColoredInf) mixin;
		b.set("Hello");
		System.out.println(b.get());
		System.out.println(t.getStamp());
		System.out.println(s.getSerialNumber());
		System.out.println(c.getColored());
	}

}
