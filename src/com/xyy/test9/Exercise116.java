package com.xyy.test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.xyy.tools.Print.*;

class StringGenerator {
	private static Random rand = new Random();
	private static int i = 0;
	private static char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] vowels = "aeiou".toCharArray();
	public StringGenerator(int i) {
		this.i = i;
	}
	public static String gen(){
		if(i <= 0) {
			return " ";
		}
		String str = "";
		str += capitals[rand.nextInt(capitals.length)];
		int j;
		for (j= 0; j < (i - 1) / 2; j++) {
			str += lowers[rand.nextInt(lowers.length)];
			str += vowels[rand.nextInt(vowels.length)];
		}
		if(j * 2 + 1 < i) {
			str += lowers[rand.nextInt(lowers.length)];
		}
		return str;
	}
}

class Strs {
	public static ArrayList<String> arrayList(int i) {
		Random rand = new Random();
		ArrayList<String> strs = new ArrayList<String>();
		for (int j = 0; j < i; j++) {
			strs.add((new StringGenerator(rand.nextInt(7) + 3)).gen());
		}
		return strs;
	}
}

public class Exercise116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		List<String> strs = Strs.arrayList(7);
		print("1: " + strs);
		String s = new String("Sfafa");
		strs.add(s);
		print("2: " + strs);
		print("3: " + strs.contains(s));
		strs.remove(s);
		String ss = strs.get(2);
		print("4: " + ss + " " + strs.indexOf(ss));
		String str = new String("Pgoih");
		print("5: " + strs.indexOf(str));
		print("6: " + strs.remove(str));
		print("7: " + strs.remove(ss));
		print("8: " + strs);
		strs.add(3, new String("Oads"));
		print("9: " + strs);
		List<String> sub = strs.subList(2, 6);
		print("subList: " + sub);
		print("10: " + strs.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + strs.containsAll(sub));
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: "+ strs.containsAll(sub));
		List<String> copy = new ArrayList<String>(strs);
		sub = Arrays.asList(strs.get(1), strs.get(5));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<String>(strs);
		copy.remove(2);
		print("14: " + copy);
		copy.retainAll(sub);
		print("15: " + copy);
		copy.set(1, new String("Ufasf"));
		print("16: " + copy);
		copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + strs.isEmpty());
		strs.clear();
		print("19: " + strs);
		print("20: " + strs.isEmpty());
		strs.addAll(Strs.arrayList(4));
		print("21: " + strs);
		Object[] o = strs.toArray();
		print("22: " + o[3]);
		String[] stra = strs.toArray(new String[0]);
		print("23: " + stra[2]);
	}

}
