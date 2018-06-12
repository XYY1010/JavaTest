package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Parcel10 {
	public Destination destination(final String dest, final float price) {	
		// ����������final�ģ���Ϊ���������������ڲ�ʹ�õ�
		return new Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				// ��δ��벻����Ϊ�ֶγ�ʼ��������һ������ִ�� 
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
