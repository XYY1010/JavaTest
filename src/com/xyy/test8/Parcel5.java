package com.xyy.test8;

import static com.xyy.tools.Print.*;

// 在方法的作用域内（而不是在其他类的作用域内）创建一个完整的类，这被称作局部内部类

public class Parcel5 {

	public Destination destination (String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public String readLabel() { return label; }
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
		print(d.readLabel());
	}

}
