package com.xyy.test2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num; i++){
			System.out.print(f(i));
			if (i == num){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
	}
	
	public static int f(int n) {
		if (n == 1){
			return 1;
		}
		if (n == 2){
			return 1;
		}
		return f(n-1) + f(n-2);
	}
}
