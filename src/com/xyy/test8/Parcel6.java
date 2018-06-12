package com.xyy.test8;

import static com.xyy.tools.Print.*;

// 在任意的作用域内嵌入一个内部类

public class Parcel6 {

	private void internalTracking(boolean b) {
		if (b) {
			/* TrackingSlip类被嵌入在if语句的作用域内，这并不是说该类的创建是有条件的，它其实与别的类一起编译过了。
			 * 然而，在定义TrackingSlip的作用域之外，它是不可用的；除此之外，它与普通类一样
			 * */
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() { return id; }
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			print(s);
		}
		// Can't use it here! Out of scope:
		//! TrackingSlip ts = new TrackingSlip("x");
	}
	
	public void track() { 
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel6 p = new Parcel6();
		p.track();
	}

}
