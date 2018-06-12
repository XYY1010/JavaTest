package com.xyy.test2;

public class IfElse {

	static int result = 0;
	static void test(int testval, int target, int begin, int end){
		if(testval < target && testval <= end && testval >= begin){
			result = +1;
		}else if (testval > target && testval <= end && testval >= begin) {
			result = -1;
		}else{
			if(testval == target && testval <= end && testval >= begin){
				result = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10, 5, 1, 100);
		System.out.println(result);
		test(5, 10, 1, 100);
		System.out.println(result);
		test(5, 5, 1, 100);
		System.out.println(result);
	}

}
