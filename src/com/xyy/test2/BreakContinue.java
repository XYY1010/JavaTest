package com.xyy.test2;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i = 1; i <= 100; i++){
			System.out.println(i);
			if(i == 99){
				break;
			}
		}
		
		print();
	}
	
	public static void print() {
		for(int i = 1; i <= 100; i++){
			System.out.println(i);
			if (i == 99) {
				return;
			}
		}
	}
}
