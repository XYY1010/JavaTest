package com.xyy.test2;

public class IfElse2 {

	static int test(int testval, int target, int begin, int end){
		if(testval < target && testval <= end && testval >= begin){
			return +1;
		}else if (testval > target && testval <= end && testval >= begin) {
			return -1;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(10, 5, 1, 100));
		System.out.println(test(5, 10, 1, 100));
		System.out.println(test(5, 5, 1, 100));
	}

}
