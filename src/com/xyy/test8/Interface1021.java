package com.xyy.test8;

public interface Interface1021 {
	void test();
	class InnerClass implements Interface1021 {

		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("asd");
		}
		public static void main(String[] args) {
			new InnerClass().test();
		}
	}
}
