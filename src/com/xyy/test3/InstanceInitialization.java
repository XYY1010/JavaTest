package com.xyy.test3;

class CStringInitialization{
	String str;
	CStringInitialization(String str){
		this.str = str;
		System.out.println("Example: " + str);
	}
}

public class InstanceInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStringInitialization cStr;
		{
			cStr = new CStringInitialization("Hug");
		}
	}

}
