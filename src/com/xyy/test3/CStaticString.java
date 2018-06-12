package com.xyy.test3;

class CString{
	static String str1, str2 = "Define Initialization";
	static {
		str1 = "Static Block Initialization";
	}
	
	void print(){
		System.out.println(str1 + ", " + str2);
	}
}

public class CStaticString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CString cString = new CString();
		cString.print();
	}

}
