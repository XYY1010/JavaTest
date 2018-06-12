package com.xyy.test8;

public class DotNew {

	public class Inner {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}

}
