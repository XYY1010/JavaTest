package com.xyy.test2;

import java.util.Random;

public class CIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=100; i++){
			System.out.print(i);
			if(i == 100){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		
		Random rand = new Random();
		int size = 25;
		int[] randNum = new int[size];
		int[] bigNum = new int[size];
		int[] smallNum = new int[size];
		int[] eqlNum = new int[size];
		for(i=0; i<25; i++){
			randNum[i] = rand.nextInt(100);
			System.out.print(randNum[i]);
			if(i == 24){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		int cntB = 0;
		int cntE = 0;
		int cntS = 0;
		for (i = 0;  i < randNum.length-1; i++) {
			if(randNum[i] < randNum[i+1]){
				smallNum[cntS++] = randNum[i];
			}else if(randNum[i] == randNum[i+1]){
				eqlNum[cntE++] = randNum[i];
			}else{
				bigNum[cntB++] = randNum[i];
			}
		}
		eqlNum[cntE++] = randNum[randNum.length-1];
		System.out.print("Big: ");
		for(i=0; i<cntB; i++){
			System.out.print(bigNum[i]);
			if(i == cntB - 1){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		System.out.print("Equal: ");
		for(i=0; i<cntE; i++){
			System.out.print(eqlNum[i]);
			if(i == cntE - 1){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		System.out.print("Small: ");
		for(i=0; i<cntS; i++){
			System.out.print(smallNum[i]);
			if(i == cntS - 1){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		
		
		while(true){
			rand = new Random();
			size = 25;
			randNum = new int[size];
			bigNum = new int[size];
			smallNum = new int[size];
			eqlNum = new int[size];
			for(i=0; i<25; i++){
				randNum[i] = rand.nextInt(100);
				System.out.print(randNum[i]);
				if(i == 24){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
			cntB = 0;
			cntE = 0;
			cntS = 0;
			for (i = 0;  i < randNum.length-1; i++) {
				if(randNum[i] < randNum[i+1]){
					smallNum[cntS++] = randNum[i];
				}else if(randNum[i] == randNum[i+1]){
					eqlNum[cntE++] = randNum[i];
				}else{
					bigNum[cntB++] = randNum[i];
				}
			}
			eqlNum[cntE++] = randNum[randNum.length-1];
			System.out.print("Big: ");
			for(i=0; i<cntB; i++){
				System.out.print(bigNum[i]);
				if(i == cntB - 1){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("Equal: ");
			for(i=0; i<cntE; i++){
				System.out.print(eqlNum[i]);
				if(i == cntE - 1){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("Small: ");
			for(i=0; i<cntS; i++){
				System.out.print(smallNum[i]);
				if(i == cntS - 1){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
		}
	}

}
