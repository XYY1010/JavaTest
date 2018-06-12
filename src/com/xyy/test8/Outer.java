package com.xyy.test8;

import static com.xyy.tools.Print.*;

public class Outer {

	private String str;
	
	public Outer(String str) {
		this.str = str;
	}
	
	class Inner {
		private String str;
		Inner(String str) {
			this.str = str;
		}
		public String toString() {
			return str;
		}
	}
	
	public Inner getInner(String s){
		return new Inner(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer("asd");
		 Inner in = outer.getInner(outer.str);
		print(in.toString());
	}

}
