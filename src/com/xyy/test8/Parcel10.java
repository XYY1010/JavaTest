package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Parcel10 {
	public Destination destination(final String dest, final float price) {	
		// 参数必须是final的，因为它们是在匿名类内部使用的
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				// 这段代码不能作为字段初始化动作的一部分来执行 
				cost = Math.round(price);
				if(cost > 100) 
					print("Over budget!");
			}
			private String label = dest;
			public String readLabel() { return label; }
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
	}

}
