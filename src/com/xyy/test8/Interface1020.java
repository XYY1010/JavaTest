package com.xyy.test8;

public interface Interface1020 {
	void InterfaceContain();
	class TestInInterface implements Interface1020 {
		public static void printTest() {
			System.out.println("printTest()");
		}
		public static void main(String[] args) {
			new TestInInterface().printTest();
		}
		@Override
		public void InterfaceContain() {
			// TODO Auto-generated method stub
			System.out.println("InterfaceContain()");
		}
	}
}
