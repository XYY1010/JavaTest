package com.xyy.test16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1821 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = stdin.readLine()) != null && s.length() != 0) {
			System.out.println(s.toUpperCase());
		}
	}

}
