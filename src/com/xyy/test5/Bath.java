package com.xyy.test5;

import static com.xyy.tools.Print.*;

class Soap{
	private String s;
	Soap(){
		print("Soap()");
		s = "Constructed";
	}
	public String toString() {return s;}
}

public class Bath {
	private String s1 = "Happy", // Initializing at point of defination:(�ڶ����崦��ʼ��) 
				   s2 = "Happy",
				   s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath(){
		print("Inside Bath()");//���๹�����г�ʼ��
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	// Instance initialization:(ʵ����ʼ��)
	{ i = 47; }
	public String toString(){
		if(s4 == null)	// Delayed initialization:(���Գ�ʼ��)
			s4 = "Joy";
		return 
			"s1 = " + s1 + "\n" + 
			"s2 = " + s2 + "\n" +
			"s3 = " + s3 + "\n" +
			"s4 = " + s4 + "\n" +
			"i = " + i + "\n" +
			"toy = " + toy + "\n" +
			"castille = " + castille;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bath b = new Bath();
		print(b);
	}

}
