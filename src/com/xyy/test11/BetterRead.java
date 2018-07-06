package com.xyy.test11;

import static com.xyy.tools.Print.*;
import java.util.Scanner;

public class BetterRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(SimpleRead.input);
		print("What's your name?");
		String name = stdin.nextLine();
		print(name);
		print("How old are you? What is your favorite double?");
		print("(input: <age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		print(age);
		print(favorite);
		System.out.format("Hi %s\n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.", favorite / 2);
	}

}
