package com.xyy.test11;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNext())
			System.out.println(scanner.next());
	}

}
