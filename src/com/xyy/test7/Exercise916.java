package com.xyy.test7;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
import static com.xyy.tools.Print.*;

class CharSequenceGenerator implements Readable {
	
	private Random rand = new Random();
	private char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] vowels = "aeiou".toCharArray();
	private int count;
	public CharSequenceGenerator(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;
	}
	public int read(CharBuffer cb) {
		if(count-- == 0) {
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0; i < 4; i++) {
			cb.append(lowers[rand.nextInt(lowers.length)]);
			cb.append(vowels[rand.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 10;
	}
}

public class Exercise916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharSequenceGenerator ch = new CharSequenceGenerator(10);
		Scanner s = new Scanner(ch);
		while(s.hasNext()) {
			print(s.next());
		}
	}

}
