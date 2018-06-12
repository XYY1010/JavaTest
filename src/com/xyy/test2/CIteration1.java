package com.xyy.test2;

public class CIteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=1; i<=100; i++){
			boolean flag = false;
			for(j=2; j<=Math.sqrt(i); j++){
				if(i % j == 0){
					flag = true;
					break;
				}
			}
			if(flag){
				System.out.println(i + " 不是素数");
			}else{
				System.out.println(i + " 是素数");
			}
		}
	}

}
