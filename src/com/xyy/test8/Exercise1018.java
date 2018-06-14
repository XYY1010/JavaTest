package com.xyy.test8;

public class Exercise1018 {

	private static class Contain {
		private int i = 11;
		public int value() { return i; }
	}
	
	public static Contain contains () {
		return new Contain();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contain c = contains();
		System.out.println(c.value());
	}

}
