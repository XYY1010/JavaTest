package com.xyy.test8;

public class Parcel8 {

	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		}; // �˷ֺű�ǵ��Ǳ��ʽ�Ľ���
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
	}

}
