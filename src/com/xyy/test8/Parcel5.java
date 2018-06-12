package com.xyy.test8;

import static com.xyy.tools.Print.*;

// �ڷ������������ڣ�����������������������ڣ�����һ���������࣬�ⱻ�����ֲ��ڲ���

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
