package com.xyy.test3;

public class Constrution {

	static class Class1{
		String str;
	}
	
	static class Class2{
		String str = "Initialization";
		Class2(){
			String str1 = "Initialize Construction";
			System.out.println(str1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 class1 = new Class1();
		System.out.println(class1.str);
		
		Class2 class2 = new Class2();
		System.out.println(class2.str);
	}

}
