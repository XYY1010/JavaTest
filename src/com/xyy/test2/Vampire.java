package com.xyy.test2;

import java.util.Arrays;

public class Vampire {

	private static boolean judge(int n){
		int i;
		int a1[] = new int[4];
		int cnt = 0;
		int a2[] = new int[4];
		int n1 = n;
		while(n1 > 0){
			a1[cnt++] = n1 % 10;
			n1 /= 10;
		}
		Arrays.sort(a1);
		boolean flag = false;
		for(i=10; i<100; i++){
			if (n % i == 0){
				int n2 = n / i;
				if(n2 % 10 == 0 && i % 10 == 0){
					continue;
				}else{
					a2[0] = n2 % 10;
					a2[1] = n2 / 10;
					a2[2] = i % 10;
					a2[3] = i / 10;
					Arrays.sort(a2);
					if(Arrays.equals(a1, a2)){
						flag = true;
						break;
					}
				}
			}
		}
		if(flag){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i = 1000; i<10000; i++){
			if(judge(i)){
				System.out.println(i);
			}
		}
	}

}
